package hu.unideb.inf.babydiary.persistence.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.time.LocalDate;

import static hu.unideb.inf.babydiary.commons.pojo.table.ColumnName.AlbumColumName.*;
import static hu.unideb.inf.babydiary.commons.pojo.table.TableName.TABLE_NAME_ALBUM;

@Data
@NoArgsConstructor
@EqualsAndHashCode()
@ToString()
@Entity
@Table(name = TABLE_NAME_ALBUM)
public class AlbumEntity extends BaseEntity<Long> {

    @Column(name = COLUMN_NAME_DATE)
    private LocalDate date;

    @Column(name = COLUMN_NAME_NAME)
    private String name;

    @Column(name = COLUMN_NAME_SIZE)
    private String size;

    @Column(name = COLUMN_NAME_TYPE)
    private String type;

    @ManyToOne
    private ChildEntity childEntity;

    @Builder
    public AlbumEntity(Long id, LocalDate date, String name, String size, String type) {
        super(id);
        this.date = date;
        this.name = name;
        this.size = size;
        this.type = type;
    }
}
