package hu.unideb.inf.babydiary.backend.rest;

import hu.unideb.inf.babydiary.commons.pojo.exceptions.BaseException;
import hu.unideb.inf.babydiary.commons.pojo.request.AlbumRequest;
import hu.unideb.inf.babydiary.service.api.domain.Album;
import hu.unideb.inf.babydiary.service.api.service.AlbumService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AlbumRestController {

    private final AlbumService albumService;

    @PreAuthorize("isAuthenticated()")
    @RequestMapping(value = "/album/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity responseEntity(@RequestBody AlbumRequest albumRequest) throws Exception {
        ResponseEntity result;
        try {
            albumService.saveAlbum(albumRequest);
            result = ResponseEntity.ok(albumRequest);
        } catch (Exception e) {
            result = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Caught.");
        }
        return result;
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping(path = "/album/get/{id}")
    public ResponseEntity<?> getAlbumBy(@PathVariable Long id) throws Exception {
        Album album = albumService.findAlbumById(id);
        return ResponseEntity.accepted().body(album);
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping(path = "/album/get/all")
    public ResponseEntity<?> getAll() throws BaseException{
        List<Album> albumList = albumService.findAllAlbum();
        return  ResponseEntity.accepted().body(albumList);
    }

}
