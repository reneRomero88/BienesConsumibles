package com.mx.jr.cendi.bienesconsumibles;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Locale;
import java.util.ResourceBundle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BienesConsumiblesApplication {

    public static void main(String[] args) {
        SpringApplication.run(BienesConsumiblesApplication.class, args);

        ClassLoader cl = ClassLoader.getSystemClassLoader();
        Locale locale = Locale.getDefault();
        ResourceBundle rb = null;
        // create a new ResourceBundle with specified locale
        // and SystemClassLoader
        File file = new File("C:\\Users\\usuario\\git\\BienesConsumibles\\src\\main\\");
        try {
            URL[] urls={file.toURI().toURL()};
        ClassLoader loader = new URLClassLoader(urls);
        rb = ResourceBundle.getBundle("Bundle", Locale.getDefault(), loader);
        
        } catch (MalformedURLException e) {// TODO Auto-generated catch block
            e.printStackTrace();}
//        ResourceBundle bundle = ResourceBundle.getBundle("Edit", locale, cl);

        // print the text assigned to key "hello"
//        System.out.println("" + rb.getString("ArticulosCreated"));
    }

}
    
