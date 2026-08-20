package com.hospitalmedicalrecord.service;

import com.hospitalmedicalrecord.processor.FilterRecords;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ExcelWriter {
    FilterRecords filterRecords = new FilterRecords();

    public void writeExcel(String templateFilePath, List<List<String>> recordList) {

        try {
            Workbook wb = WorkbookFactory.create(new FileInputStream(templateFilePath));
            fillSummarySheet(wb, recordList, templateFilePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void fillSummarySheet(Workbook wb, List<List<String>> recordList, String templateFilePath) {
        Sheet summarySheet = wb.getSheetAt(0); filterRecords.getTotalRevenue(recordList);
        Row row = summarySheet.getRow(3);
        Cell cellTotalRevenue = row.getCell(1);
        Cell cellTotalVisits = row.getCell(2);
        cellTotalRevenue.setCellValue(filterRecords.getTotalRevenue(recordList));
        cellTotalVisits.setCellValue(filterRecords.getTotalVisits(recordList));
        try {
            FileOutputStream fos = new FileOutputStream(templateFilePath);
            wb.write(fos);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}

