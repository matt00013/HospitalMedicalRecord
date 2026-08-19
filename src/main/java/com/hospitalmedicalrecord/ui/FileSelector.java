package com.hospitalmedicalrecord.ui;



import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.io.File;

public class FileSelector {
    private static final String CSV_FILEPATH = "C:\\Users\\Matt\\OneDrive\\Desktop\\MedicalRecordCsv\\CSV";
    public static String selectFile() {

//        FileSystemView fsv = FileSystemView.getFileSystemView();
//        JFileChooser fileChooser = new JFileChooser(fsv.getHomeDirectory(), fsv);
//        fileChooser.showSaveDialog(null);
        return CSV_FILEPATH;
    }
}
