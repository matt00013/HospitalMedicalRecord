package com.hospitalmedicalrecord.service;

import com.hospitalmedicalrecord.processor.FilterRecords;

import java.util.List;

public class ExcelWriter {
    FilterRecords filterRecords = new FilterRecords();
    public void writeExcel(String templateFilePath, List<List<String>> recordList){
        filterRecords.summarizeRecord(recordList);
    }
}
