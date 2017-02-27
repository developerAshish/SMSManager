/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.main.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ashish
 */
public class CsvReader {

    public static String Read() {
        FileInputStream inputStream= null;
          String string=null;
          byte[] bs;
        try {
            File file= new File("student.csv");
            inputStream = new FileInputStream(file);
            bs=new byte[inputStream.available()];
            inputStream.read(bs);
            string=new String(bs);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CsvReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CsvReader.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                inputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(CsvReader.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            return string;
    }
}
