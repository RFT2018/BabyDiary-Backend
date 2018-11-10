package hu.unideb.inf.babydiary.persistence.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

import static hu.unideb.inf.babydiary.commons.pojo.table.ColumnName.FunfactColumName.*;
import static hu.unideb.inf.babydiary.commons.pojo.table.TableName.TABLE_NAME_FUNFACT;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Table(name = TABLE_NAME_FUNFACT)
public class FunfactEntity extends BaseEntity<Long> {

    @Column(name = COLUMN_NAME_FOOD)
    private String food;

    @Column(name = COLUMN_NAME_MUSIC)
    private String music;

    @Column(name = COLUMN_NAME_SKILLS)
    private String skills;

    @Column(name = COLUMN_NAME_TEXT)
    private String text;

    @Column(name = COLUMN_NAME_WEEK)
    private int week;

    @ManyToMany(mappedBy = "funfacts", fetch = FetchType.LAZY)
    private List<ChildEntity> children;

    @Builder
    public FunfactEntity(Long id, String food, String music, String skills, String text, int week) {
        super(id);
        this.food = food;
        this.music = music;
        this.skills = skills;
        this.text = text;
        this.week = week;
    }
}
