package hu.unideb.inf.babydiary.backend.rest;

import hu.unideb.inf.babydiary.commons.pojo.exceptions.BaseException;
import hu.unideb.inf.babydiary.commons.pojo.request.AppointmentRequest;
import hu.unideb.inf.babydiary.service.api.domain.Appointment;
import hu.unideb.inf.babydiary.service.api.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static hu.unideb.inf.babydiary.commons.pojo.path.AppointmentPath.APPOINTMENT_ADD;
import static hu.unideb.inf.babydiary.commons.pojo.path.AppointmentPath.APPOINTMENT_GETALL;
import static hu.unideb.inf.babydiary.commons.pojo.path.AppointmentPath.APPOINTMENT_GETONE;

@RestController
@RequiredArgsConstructor
public class AppointmentRestController {

    private final AppointmentService appointmentService;

    @PreAuthorize("isAuthenticated()")
    @RequestMapping(value = APPOINTMENT_ADD, method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity responseEntity(@RequestBody AppointmentRequest appointmentRequest) throws Exception {
        ResponseEntity result;
        try {
            appointmentService.saveAppointment(appointmentRequest);
            result = ResponseEntity.ok(appointmentRequest);
        } catch (Exception e) {
            result = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Caught.");
        }
        return result;
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping(path = APPOINTMENT_GETONE)
    public ResponseEntity<?> getAppointmentBy(@PathVariable Long id) throws Exception {
        Appointment appointment = appointmentService.findAppointmentById(id);
        return ResponseEntity.accepted().body(appointment);
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping(path = APPOINTMENT_GETALL)
    public ResponseEntity<?> getAll() throws BaseException {
        List<Appointment> appointmentList = appointmentService.findAllAppointment();
        return  ResponseEntity.accepted().body(appointmentList);
    }

}
