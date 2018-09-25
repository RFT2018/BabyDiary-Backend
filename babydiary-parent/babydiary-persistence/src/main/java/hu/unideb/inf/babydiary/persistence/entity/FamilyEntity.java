package hu.unideb.inf.babydiary.persistence.entity;

import lombok.*;

import javax.persistence.*;

import java.util.List;

import static hu.unideb.inf.babydiary.commons.pojo.table.ColumnName.FamilyColumName.COLUMN_NAME_FAMILYNAME;
import static hu.unideb.inf.babydiary.commons.pojo.table.TableName.TABLE_NAME_FAMILY;

@Data
@NoArgsConstructor
@EqualsAndHashCode()
@ToString()
@Entity
@Table(name = TABLE_NAME_FAMILY)
public class FamilyEntity extends BaseEntity<Long>{

    @Column(name = COLUMN_NAME_FAMILYNAME)
    private String familyName;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = TABLE_NAME_FAMILY)
    private List<UserEntity> userList;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = TABLE_NAME_FAMILY)
    private List<ChildEntity> childList;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = TABLE_NAME_FAMILY)
    private  List<WishlistEntity> WishLists;

    @Builder
    public FamilyEntity(Long id, String familyName){
        super(id);
        this.familyName = familyName;
    }

}
