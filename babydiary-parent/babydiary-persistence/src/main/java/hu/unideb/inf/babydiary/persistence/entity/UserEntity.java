package hu.unideb.inf.babydiary.persistence.entity;

import hu.unideb.inf.babydiary.commons.pojo.enumeration.Sex;
import hu.unideb.inf.babydiary.commons.pojo.enumeration.UserRole;
import lombok.*;

import javax.persistence.*;

import static hu.unideb.inf.babydiary.commons.pojo.table.ColumnName.SexColomnName.COLUMN_NAME_SEX;
import static hu.unideb.inf.babydiary.commons.pojo.table.ColumnName.UserColumName.*;
import static hu.unideb.inf.babydiary.commons.pojo.table.TableName.TABLE_NAME_USER;
import static javax.persistence.EnumType.STRING;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true, exclude = "password")
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

    @Column(name = COLUMN_NAME_SEX)
    @Enumerated(value = STRING)
    private Sex sex;

    @Column(name = COLUMN_NAME_USER_ROLE)
    @Enumerated(value = STRING)
    private UserRole userRole;

//    @ManyToOne
//    @JoinColumn(name = COLUMN_NAME_FAMILY_ID)
//    private FamilyEntity familyEntity;

    @Builder
    public UserEntity(Long id, String username, String email, String password, String firstName, String lastName, Sex sex, UserRole userRole) {
        super(id);
        this.username = username;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.userRole = userRole;
    }
}
