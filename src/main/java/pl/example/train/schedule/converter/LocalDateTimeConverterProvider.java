package pl.example.train.schedule.converter;

import javax.inject.Inject;
import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.util.Objects;


@Provider
public class LocalDateTimeConverterProvider implements ParamConverterProvider {

    @Inject
    private LocalDateTimeConverter localDateTimeConverter;

    @Override
    @SuppressWarnings("unchecked")
    public <T> ParamConverter<T> getConverter(Class<T> rawType, Type genericType, Annotation[] annotations) {
        if (Objects.equals(rawType, LocalDateTime.class)) {
            return (ParamConverter<T>) localDateTimeConverter;
        }
        return null;
    }
}
