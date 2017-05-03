package ru.ssau.helpers;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;

@Converter(autoApply = true)
public class LocalTimeConverter implements AttributeConverter<LocalTime, Date> {
    @Override
    public Date convertToDatabaseColumn(LocalTime attribute) {
        return new Date((attribute.getHour() * 3600 + attribute.getMinute() * 60 + attribute.getSecond()) * 1000L);
    }

    @Override
    public LocalTime convertToEntityAttribute(Date dbData) {
        String formatted = new SimpleDateFormat("HH:mm:ss").format(dbData);
        return LocalTime.parse(formatted);
    }
}
