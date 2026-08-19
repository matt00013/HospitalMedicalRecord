package com.hospitalmedicalrecord.main;

import com.hospitalmedicalrecord.service.ExcelGenerator;
import com.hospitalmedicalrecord.ui.FileSelector;
import com.hospitalmedicalrecord.utils.ExcelCopy;

import javax.swing.filechooser.FileNameExtensionFilter;

public class HospitalRecordMain {
    public static void main(String[] args) {
        FileSelector.selectFile();
        //ExcelGenerator.generateExcel();
        ExcelCopy.copyExcelTemplate();
        //FileNameExtensionFilter filter = new FileNameExtensionFilter("c");
    }
}
