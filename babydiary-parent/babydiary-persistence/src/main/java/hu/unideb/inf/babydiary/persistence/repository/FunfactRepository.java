package hu.unideb.inf.babydiary.persistence.repository;

import hu.unideb.inf.babydiary.persistence.entity.FunfactEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FunfactRepository  extends JpaRepository<FunfactEntity, Long> {

//    @Query("SELECT f FROM FuncfactEntity f where f.id = :id")
//    FunfactEntity findById(@Param("id") Long id);

    List<FunfactEntity> findByFunfactsId(@Param("id") long id);

    @Query("SELECT COUNT(f) FROM FunfactEntity f")
    Long countFunfacts();

}
