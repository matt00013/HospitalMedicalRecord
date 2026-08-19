package com.hospitalmedicalrecord.utils;

import com.hospitalmedicalrecord.constant.AppConstants;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static String generateDateTime(){
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(AppConstants.DATE_TIME_FORMAT);
        String formattedDateTime = dateTime.format(dateFormat);
        return formattedDateTime;
    };
}
