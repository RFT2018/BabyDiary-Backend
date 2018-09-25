package hu.unideb.inf.babydiary.persistence.entity;

import lombok.*;

import javax.persistence.*;

import java.util.List;

import static hu.unideb.inf.babydiary.commons.pojo.table.ColumnName.ChildColumName.*;
import static hu.unideb.inf.babydiary.commons.pojo.table.ColumnName.FunfactColumName.COLUMN_NAME_FUNFACT_ID;
import static hu.unideb.inf.babydiary.commons.pojo.table.ColumnName.ReferencedColumName.REFERENCED_COLUM_NAME_ID;
import static hu.unideb.inf.babydiary.commons.pojo.table.TableName.TABLE_NAME_CHILD;
import static hu.unideb.inf.babydiary.commons.pojo.table.TableName.TABLE_NAME_CHILD_HAS_FUNFACT;

@Data
@NoArgsConstructor
@EqualsAndHashCode()
@ToString()
@Entity
@Table(name = TABLE_NAME_CHILD)
public class ChildEntity extends BaseEntity<Long> {

    @Column(name = COLUMN_NAME_BIRTHDAY)
    private String birthday;

    @Column(name = COLUMN_NAME_CHILD_FIRSTNAME)
    private String firstName;

    @Column(name = COLUMN_NAME_CHILD_LASTNAME)
    private String lastName;

    @Column(name = COLUMN_NAME_CHILD_SEX)
    private String sex;

    @Column(name = COLUMN_NAME_CONCEPTION)
    private String conception;

    @Column(name = COLUMN_NAME_HEIGHT)
    private String height;

    @Column(name = COLUMN_NAME_WEIGHT)
    private String weight;

    @ManyToOne
    private FamilyEntity family;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = TABLE_NAME_CHILD_HAS_FUNFACT,
            joinColumns = @JoinColumn(name = COLUMN_NAME_CHILD_ID, referencedColumnName = REFERENCED_COLUM_NAME_ID),
            inverseJoinColumns = @JoinColumn(name = COLUMN_NAME_FUNFACT_ID, referencedColumnName = REFERENCED_COLUM_NAME_ID))
    private List<FunfactEntity> funfacts;

    @OneToMany
    private List<AlbumEntity> albums;

    @Builder
    public ChildEntity(Long id, String birthday, String firstName, String lastName, String sex, String conception, String height, String weight, FamilyEntity family) {
        super(id);
        this.birthday = birthday;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.conception = conception;
        this.height = height;
        this.weight = weight;
        this.family = family;
    }
}
