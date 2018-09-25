package hu.unideb.inf.babydiary.persistence.entity;

import lombok.*;

import javax.persistence.*;

import static hu.unideb.inf.babydiary.commons.pojo.table.ColumnName.UserColumName.*;
import static hu.unideb.inf.babydiary.commons.pojo.table.TableName.TABLE_NAME_USER;
import static javax.persistence.EnumType.STRING;

@Data
@NoArgsConstructor
@EqualsAndHashCode()
@ToString()
@Entity
@Table(name = TABLE_NAME_USER, uniqueConstraints = @UniqueConstraint(columnNames = COLUMN_NAME_USERNAME))
public class UserEntity extends BaseEntity<Long>{

    @Column(name = COLUMN_NAME_USERNAME)
    private String username;

    @Column(name = COLUMN_NAME_EMAIL)
    private String email;

    @Column(name = COLUMN_NAME_PASSWORD)
    private String password;

    @Column(name = COLUMN_NAME_USER_FIRSTNAME)
    private String firstName;

    @Column(name = COLUMN_NAME_USER_LASTNAME)
    private String lastName;

    @Column(name = COLUMN_NAME_USER_SEX)
    private String sex;

    @Column(name = COLUMN_NAME_USER_ROLE)
    @Enumerated(value = STRING)
    private UserRoleEntity userRole;

    @ManyToOne
    private FamilyEntity family;

    @Builder
    public UserEntity(Long id, String username, String email, String password, String firstName, String lastName, UserRoleEntity userRoleEntity ) {
        super(id);
        this.username = username;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userRole = userRoleEntity;
    }

}
