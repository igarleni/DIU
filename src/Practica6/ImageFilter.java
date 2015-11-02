/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica6;

/**
 *
 * @author Italo
 */
import java.io.File;
import javax.swing.filechooser.*;  

public class ImageFilter extends FileFilter {
        
    @Override
    public boolean accept(File f) {         
        if (f.isDirectory()) {             
            return true;
        }         
        String filename = f.getName();
        int dot = filename.lastIndexOf('.');
        String extension = filename.substring(dot + 1);
  
        if (extension != null) {             
            if( extension.equals("tiff") ||                 
                extension.equals("tif") ||                 
                extension.equals("gif") ||                 
                extension.equals("jpeg") ||                 
                extension.equals("jpg") ||                 
                extension.equals("png")) {                     
                return true;             
            } else {                 
                return false;             
            }        
        }           
        return false;     
    }       
    @Override
    public String getDescription() {         
        return "Ficheros de Imagenes";     
    } 
}