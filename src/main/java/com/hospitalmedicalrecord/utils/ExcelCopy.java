package com.hospitalmedicalrecord.utils;

import com.hospitalmedicalrecord.constant.AppConstants;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class ExcelCopy {
   public static final String TEMPLATE_FILEPATH = "C:\\Users\\Matt\\OneDrive\\Desktop\\MedicalRecordCsv\\Templates\\Template.xlsx";
   public static final String NEW_FOLDERPATH = "C:\\Users\\Matt\\OneDrive\\Desktop\\MedicalRecordCsv\\Results\\";
   public static void copyExcelTemplate(){
      String newFilePath = NEW_FOLDERPATH + "Hospital-Record" + DateTime.generateDateTime() + AppConstants.EXCEL_FILE_EXTENSION;
      File template = new File(TEMPLATE_FILEPATH);
      File newFile = new File(newFilePath);
       try {
           Files.copy(template.toPath(), newFile.toPath());
       } catch (IOException e) {
          System.out.println(e.getMessage());
       }
   }

}
