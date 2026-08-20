package com.hospitalmedicalrecord.reader;

import com.hospitalmedicalrecord.constant.AppConstants;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CsvFileReader {
    public static List<List<String>> readCsv(){
        String csvFilePath = "C:\\Users\\Matt\\OneDrive\\Desktop\\MedicalRecordCsv\\CSV\\mock_medical_records_large.csv";
        //FileReader fileReader = new FileReader(file);
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            while ((line = br.readLine()) != null){
                String[] values = line.split(AppConstants.COMMA_DELIMITER);
                records.add(Arrays.asList(values));
            }
        } catch (RuntimeException | FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return records;
    }
}
