package com.hospitalmedicalrecord.utils;

import java.text.DecimalFormat;

public class DecFormat {
    private static DecimalFormat decFormat = new DecimalFormat("#,##0.00");
    public static String formatDecimal(double decNum){

        return decFormat.format(decNum);
    }


}
