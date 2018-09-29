package hu.unideb.inf.babydiary.persistence.repository;

import hu.unideb.inf.babydiary.persistence.entity.WishlistEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface WishlistRepository  extends JpaRepository<WishlistEntity, Long> {

    @Query("SELECT w FROM FamilyEntity w where w.id = :id")
    WishlistEntity findById(@Param("id") Long id);

    @Query("SELECT w FROM WishlistEntity w WHERE w.name = :name")
    WishlistEntity findByName(@Param("name") String name);

    List<WishlistEntity> findByWishlistsId(@Param("id") long id);

    @Query("SELECT COUNT(w) FROM FamilyEntity w")
    Long countWishlists();


}
