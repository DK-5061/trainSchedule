package pl.example.train.schedule.model;

import lombok.Data;

import javax.json.bind.annotation.JsonbDateFormat;
import javax.ws.rs.QueryParam;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class RailConnectionQuery implements Serializable {

    @QueryParam("origin")
    private String origin;

    @QueryParam("destination")
    private String destination;

    @QueryParam("startDate")
    @JsonbDateFormat(value = "yyyy-MM-ddTHH:mm:ss")
    private LocalDateTime startDate;

    @QueryParam("endDate")
    @JsonbDateFormat(value = "yyyy-MM-ddTHH:mm:ss")
    private LocalDateTime endDate;

}
