package hu.unideb.inf.babydiary.backend.rest;

import hu.unideb.inf.babydiary.commons.pojo.request.ChildRequest;
import hu.unideb.inf.babydiary.service.api.domain.Child;
import hu.unideb.inf.babydiary.service.api.service.ChildService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ChildRestController {

    private final ChildService childService;

    @RequestMapping(value = "/child/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity responseEntity(@RequestBody ChildRequest childRequest) {
        ResponseEntity result;
        try {
            childService.saveChild(childRequest);
            result = ResponseEntity.ok(childRequest);
        } catch (Exception e) {
            result = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Caught.");
        }
        return result;
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping(path = "/child/get/{id}")
    public ResponseEntity<?> getChildById(@PathVariable Long id) {
        Child child = childService.findChildById(id);
        return ResponseEntity.accepted().body(child);
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping(path = "/child/get/all")
    public ResponseEntity<?> getAllChildren() {
        List<Child> childList = childService.findAllChildren();
        return  ResponseEntity.accepted().body(childList);
    }
}
