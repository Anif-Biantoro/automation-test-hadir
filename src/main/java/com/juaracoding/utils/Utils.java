package com.juaracoding.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

    public static int testCount = 0;

    public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmdd").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String pathDestionation = System.getProperty("user.dir")+"/FailedTestScreenshot/"
                +screenshotName+"_"+dateName+".png";
        File destination = new File(pathDestionation);
        FileUtils.copyFile(source, destination);
        return pathDestionation;
    }
    //method get filename
    public static String getfilename(String pathName){
        // try-catch block to handle exceptions
        try {
            // Create a file object
            File f = new File(pathName);
            // Get the Name of the given file f
            String name = f.getName();
            return name;
        }
        catch (Exception e) {
            return e.getMessage();
        }
    }

}
