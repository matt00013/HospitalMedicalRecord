package com.hospitalmedicalrecord.service;

import com.hospitalmedicalrecord.utils.DateTime;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelGenerator {

    public static void generateExcel(){
    String filePath = "C:\\Users\\Matt\\OneDrive\\Desktop\\MedicalRecordCsv\\Results\\";
    XSSFWorkbook workbook = new XSSFWorkbook();
    Sheet sheet = workbook.createSheet("new sheet");
    FileOutputStream out;
    String dateTime = DateTime.generateDateTime();

    {
        try {
            out = new FileOutputStream(new File(filePath + "newExcel" +dateTime + ".xlsx"));
            workbook.write(out);
            //System.out.println("WorkBook Created");
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }}
}
