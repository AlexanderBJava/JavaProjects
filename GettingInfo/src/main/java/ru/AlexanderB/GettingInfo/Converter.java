package ru.AlexanderB.GettingInfo;

import lombok.Data;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Base64;

@Data
public class Converter {
    String base64;
    int picNum=1;


    public String jpgToBase64() throws IOException {
        String path="E:\\Java\\CloneJavaProject\\GettingInfo\\src\\main\\resources\\static\\pic\\"+picNum+".jpg";
        File f= new File(path);
       // System.out.println(path);
        if(f.exists() && f!=null) {
            base64=Base64.getEncoder().encodeToString(Files.readAllBytes(f.toPath()));
        }
        return base64;
    }

}
