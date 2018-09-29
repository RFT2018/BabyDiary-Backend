package hu.unideb.inf.babydiary.persistence.repository;

import hu.unideb.inf.babydiary.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository  extends JpaRepository<UserEntity, Long> {

    @Query("SELECT u FROM UserEntity u where u.id = :id")
    UserEntity findById(@Param("id") Long id);

    @Query("SELECT u FROM UserEntity u WHERE u.username = :username")
    UserEntity findByUsername(@Param("username") String username);

    List<UserEntity> findByUsersId(@Param("id") long id);

    @Query("SELECT COUNT(u) FROM UserEntity u")
    Long countUsers();


}
