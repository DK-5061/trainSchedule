package pl.example.train.schedule.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "train")
@Data
public class Train implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "number")
    private String number;

    @ManyToOne
    @JoinColumn(name = "origin_id")
    private Station origin;

    @ManyToOne
    @JoinColumn(name = "destination_id")
    private Station destination;

}
