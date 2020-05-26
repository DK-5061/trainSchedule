package pl.example.train.schedule.converter;

import javax.enterprise.context.Dependent;
import javax.ws.rs.ext.ParamConverter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Dependent
public class LocalDateTimeConverter implements ParamConverter<LocalDateTime> {

    @Override
    public LocalDateTime fromString(String value) {
        return Optional.ofNullable(value)
                .map(text -> LocalDateTime.parse(text, DateTimeFormatter.ISO_LOCAL_DATE_TIME))
                .orElse(null);
    }

    @Override
    public String toString(LocalDateTime value) {
        return Optional.ofNullable(value)
                .map(date -> date.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME))
                .orElse(null);
    }
}
