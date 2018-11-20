package hu.unideb.inf.babydiary.backend.rest;

import hu.unideb.inf.babydiary.commons.pojo.request.WishlistRequest;
import hu.unideb.inf.babydiary.service.api.domain.Wishlist;
import hu.unideb.inf.babydiary.service.api.service.WishListService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class WishlistRestController {

    private final WishListService wishListService;

    @PreAuthorize("isAuthenticated()")
    @RequestMapping(value = "/wishlist/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity responseEntity(@RequestBody WishlistRequest wishlistRequest) {
        ResponseEntity result;
        try {
            wishListService.saveWishList(wishlistRequest);
            result = ResponseEntity.ok(wishlistRequest);
        } catch (Exception e) {
            result = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Caught.");
        }
        return result;
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping(path = "/wishlist/get/{id}")
    public ResponseEntity<?> getAlbumBy(@PathVariable Long id) {
        Wishlist wishlist = wishListService.findWishlistById(id);
        return ResponseEntity.accepted().body(wishlist);
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping(path = "/wishlist/get/all")
    public ResponseEntity<?> getAll() {
        List<Wishlist> wishlists = wishListService.findAll();
        return ResponseEntity.accepted().body(wishlists);
    }

}
