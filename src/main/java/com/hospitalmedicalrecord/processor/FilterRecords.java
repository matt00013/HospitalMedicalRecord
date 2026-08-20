package com.hospitalmedicalrecord.processor;

import com.hospitalmedicalrecord.utils.DecFormat;
import org.apache.poi.hpsf.Decimal;

import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FilterRecords {
    public String getTotalRevenue(List<List<String>> records){
        double totalRevenue = 0;
        for (int i = 0; i<records.size(); i++){
            for (int j = 0; j<records.get(j).size(); j++){
                if(j == 6 && i > 0) {
                    //System.out.print(records.get(i).get(j) + " ");
                    totalRevenue += Double.parseDouble(records.get(i).get(j));
                    //System.out.println(records.get(i).get(j));
                }
            }
        }

        System.out.println("Total Revenue: $" + DecFormat.formatDecimal(totalRevenue));
        return DecFormat.formatDecimal(totalRevenue);
    }
    public int getTotalVisits(List<List<String>> records){
        int totalPatientVisits = records.size() - 1;
        return totalPatientVisits;
    }
}
