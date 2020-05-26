package pl.example.train.schedule.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class RailConnection implements Serializable {

    private String origin;

    private String destination;

    private LocalDateTime departureTime;

    private LocalDateTime arrivalTime;

}
