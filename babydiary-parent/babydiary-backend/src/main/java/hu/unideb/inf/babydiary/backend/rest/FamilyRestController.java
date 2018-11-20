package hu.unideb.inf.babydiary.backend.rest;

import hu.unideb.inf.babydiary.commons.pojo.exceptions.BaseException;
import hu.unideb.inf.babydiary.commons.pojo.request.FamilyRequest;
import hu.unideb.inf.babydiary.service.api.domain.Family;
import hu.unideb.inf.babydiary.service.api.service.FamilyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FamilyRestController {

    private final FamilyService familyService;

    @PreAuthorize("isAuthenticated()")
    @RequestMapping(value = "/family/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity responseEntity(@RequestBody FamilyRequest familyRequest) throws Exception {
        ResponseEntity result;
        try {
            familyService.saveFamily(familyRequest);
            result = ResponseEntity.ok(familyRequest);
        } catch (Exception e) {
            result = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Caught.");
        }
        return result;
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping(path = "/family/get/{id}")
    public ResponseEntity<?> getFamilyById(@PathVariable Long id) throws Exception {
        Family family = familyService.findFamilyById(id);
        return ResponseEntity.accepted().body(family);
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping(path = "/family/get/all")
    public ResponseEntity<?> getAll() throws BaseException {
        List<Family> familyList = familyService.findAllFamilies();
        return  ResponseEntity.accepted().body(familyList);
    }
}
