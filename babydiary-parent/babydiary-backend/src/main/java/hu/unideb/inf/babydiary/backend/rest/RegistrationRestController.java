package hu.unideb.inf.babydiary.backend.rest;

import hu.unideb.inf.babydiary.commons.pojo.request.RegistrationRequest;
import hu.unideb.inf.babydiary.service.api.service.RegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import static hu.unideb.inf.babydiary.commons.path.RegistrationPath.REGISTRATION_URL;

@RestController
@RequiredArgsConstructor
public class RegistrationRestController {

    private final RegistrationService registrationService;

    @RequestMapping(value = "/register", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity responseEntity(@RequestBody RegistrationRequest registrationRequest) throws Exception {
        ResponseEntity result;
        try {
            registrationService.register(registrationRequest);
            result = ResponseEntity.ok(registrationRequest);
        } catch (Exception e) {
            result = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("400");
        }
        return result;
    }

}