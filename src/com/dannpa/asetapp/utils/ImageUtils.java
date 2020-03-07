/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dannpa.asetapp.utils;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author dannp
 */
public class ImageUtils {

    Class c;
    
    
    public ImageUtils(Class c) {
        this.c = c;
    }

    public ImageIcon createImageIcon(String path, int width, int height) {
        java.net.URL imgURL = c.getResource(path);

        if (imgURL != null) {
            ImageIcon icon = new ImageIcon(imgURL);
            Image img = icon.getImage();
            Image newImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            return new ImageIcon(newImg);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
}
