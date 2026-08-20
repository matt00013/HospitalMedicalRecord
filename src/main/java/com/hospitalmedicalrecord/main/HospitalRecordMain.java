package com.hospitalmedicalrecord.main;

import com.hospitalmedicalrecord.reader.CsvFileReader;
import com.hospitalmedicalrecord.service.ExcelGenerator;
import com.hospitalmedicalrecord.service.ExcelWriter;
import com.hospitalmedicalrecord.ui.FileSelector;
import com.hospitalmedicalrecord.utils.ExcelCopy;

import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.List;

public class HospitalRecordMain {
    public static void main(String[] args) {
        //FileSelector.selectFile();
        //ExcelGenerator.generateExcel();

        String excelFilePath = ExcelCopy.copyExcelTemplate();
        System.out.println(excelFilePath);
        //FileNameExtensionFilter filter = new FileNameExtensionFilter("c");
        List<List<String>> records = CsvFileReader.readCsv();
        //System.out.print(records.get(0).get(0));
        ExcelWriter writer = new ExcelWriter();
        writer.writeExcel(excelFilePath, records);

    }
}
