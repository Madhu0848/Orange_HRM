package com.orangehrm.genericutility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

    public String getDataFromFile(String Key) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Qapitol QA\\IdeaProjects\\OrangeHRM\\src\\main\\resources\\commandata\\config.properties");
        Properties prop = new Properties();
        prop.load(fis);
        String data = prop.getProperty(Key);
        return data;
    }

    public void writeDataToFile(String Key, String data) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Qapitol QA\\IdeaProjects\\OrangeHRM\\src\\main\\resources\\commandata\\config.properties");
        Properties prop = new Properties();
        prop.load(fis);
        prop.setProperty(Key, data);
        fis.close();

        FileOutputStream fos = new FileOutputStream("C:\\Users\\Qapitol QA\\IdeaProjects\\OrangeHRM\\src\\main\\resources\\commandata\\config.properties");
        prop.store(fos, null);
        fos.close();
    }
}
