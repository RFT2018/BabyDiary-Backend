package hu.unideb.inf.babydiary.persistence.repository;

import hu.unideb.inf.babydiary.persistence.entity.FamilyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FamilyRepository  extends JpaRepository<FamilyEntity, Long> {

//    @Query("SELECT f FROM FamilyEntity f where f.id = :id")
//    FamilyEntity findById(@Param("id") Long id);

    @Query("SELECT f FROM FamilyEntity f WHERE f.name = :name")
    FamilyEntity findByName(@Param("name") String name);

    List<FamilyEntity> findByFamiliesId(@Param("id") long id);

    @Query("SELECT COUNT(f) FROM FamilyEntity f")
    Long countFamilies();

}
