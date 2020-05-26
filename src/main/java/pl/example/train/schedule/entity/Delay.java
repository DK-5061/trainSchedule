package pl.example.train.schedule.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "delay")
@Data
public class Delay implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "departure_time")
    private LocalTime departureTime;

    @OneToOne
    @JoinColumn(name = "train_id")
    private Train train;
}
