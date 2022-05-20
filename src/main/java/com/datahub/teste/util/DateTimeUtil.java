package com.datahub.teste.util;

import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateTimeUtil {

    public int calculaIntervaloDataAno(DateTime data1, DateTime data2) {

        Period period = new Period(data1, data2);
        return period.getYears();
    }

    public DateTime stringToDateTime(String data) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern("dd-MM-yyyy");
        return dateTimeFormatter.parseDateTime(data);
    }
}
