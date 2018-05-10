package com.test.pages;

import au.com.bytecode.opencsv.CSVReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

public class JavaFilesInformation {

    public static String vehicleReg = "";

    public static String getWorkingDir(String directoryName) {
        String workingDirectory = System.getProperty("user.dir");
        System.out.println("Working directory is :::" + workingDirectory);
        String dir = workingDirectory + File.separator + directoryName;
        System.out.println("Final file directory :::" + dir);
        return dir;
    }

    public static void listFiles(String directoryName) {
        File file = new File(getWorkingDir(directoryName));
        File[] files = file.listFiles();
        if (file.exists()) {
            System.out.println("Directory is Found");
            for (File eachFile : files) {
                System.out.println(eachFile.getName());
            }
        } else {
            System.out.println("Directory is not exists");
        }
    }

    public static void listFileMimeTypes(String directoryName) {
        File folder = new File(getWorkingDir(directoryName));
        File[] listOfFiles = folder.listFiles();

        System.out.println("Directory is Found");
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("File name :::" + listOfFiles[i].getName());
                try {
                    System.out.println("File type ::: " + Files.probeContentType(listOfFiles[i].toPath()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (listOfFiles[i].isDirectory()) {
                System.out.println("Directory " + listOfFiles[i].getName());
            }
        }

    }

    public static String getExtension(String directoryName) {
        String ext = null;
        File folder = new File(getWorkingDir(directoryName));
        File[] listOfFiles = folder.listFiles();
        for (File eachFile : listOfFiles) {
            String s = eachFile.getName();
            int i = s.lastIndexOf('.');
            if (i > 0 && i < s.length() - 1) {
                ext = s.substring(i + 1).toLowerCase();
                System.out.println("File Extension is ::: "+ ext);
            }
        }
        return ext;
    }

    private static long getFileSize(File file) {
        long length = file.length();
        return length;
    }


    public static void whenGetFileSize_thenCorrect(String directoryName) {
        File folder = new File(getWorkingDir(directoryName));
        File[] listOfFiles = folder.listFiles();
        for (File eachFile : listOfFiles) {
                long size = getFileSize(eachFile);
                System.out.println("File size is ::: "+ size);
            }
        }


    public static String readData() throws IOException {
        final String FILE_PATH= "C:\\Users\\HP\\Documents\\SeleniumAutomation\\vehicleregistration\\testdir\\vehicleRegdata.csv";
        CSVReader reader = new CSVReader(new FileReader(FILE_PATH));
        String [] csvCell;
        //while loop will be executed till the last line In CSV.
        while ((csvCell = reader.readNext()) != null) {
            String vRegNo = csvCell[0];
            String vMake = csvCell[1];
            String vColor = csvCell[2];
            System.out.println("Vehicle Registration No is "+vRegNo );
            System.out.println("Vehicle Manufacturer is "+vMake );
            System.out.println("Vehicle Colour is "+vColor );
            vehicleReg  = vRegNo;
            System.out.println(vehicleReg);
        }
        return vehicleReg;
    }
}
