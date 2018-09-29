package hu.unideb.inf.babydiary.persistence.repository;

import hu.unideb.inf.babydiary.persistence.entity.AlbumEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlbumRepository extends JpaRepository<AlbumEntity, Long> {

    @Query("SELECT a FROM AlbumEntity a WHERE a.name = :name")
    AlbumEntity findByName(@Param("name") String name);

    List<AlbumEntity> findByUsersId(@Param("id") long id);

}
