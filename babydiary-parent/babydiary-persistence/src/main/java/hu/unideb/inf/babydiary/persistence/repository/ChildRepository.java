package hu.unideb.inf.babydiary.persistence.repository;

import hu.unideb.inf.babydiary.persistence.entity.ChildEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ChildRepository  extends JpaRepository<ChildEntity, Long> {

    @Query("SELECT c FROM ChildEntity c where c.familyname =:familyname")
    ChildEntity findByFamilyname(@Param("familyname") String familyname);

    @Query("select count(c) > 0 from ChildEntity c")
    boolean anyExists();
}
