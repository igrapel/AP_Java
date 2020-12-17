/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mod8;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageTest {

    private static final int HEIGHT = 250;
    private static final int WIDTH = 250;

    public static void main(String[] args) {
        double[][] data = new double[WIDTH][HEIGHT];
        Random r = new Random();
        for(int i = 0; i < WIDTH; i++) {
            for(int j = 0; j < HEIGHT; j++) {
                if(50 < i && i < 150)
                {
                    data[i][j] = .99;
                }
            }
        }

        final BufferedImage img = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = (Graphics2D)img.getGraphics();
        for(int i = 0; i < WIDTH; i++) {
            for(int j = 0; j < HEIGHT; j++) {
                float c = (float) data[i][j];
                g.setColor(new Color(c, 0, 0));
                g.fillRect(i, j, 1, 1);
                //data[i][j] = r.nextDouble();
            }
        }

         
            
            //Paints to graphic
        JFrame frame = new JFrame("Image test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel() {
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D)g;
                g2d.clearRect(0, 0, getWidth(), getHeight());
                g2d.setRenderingHint(
                        RenderingHints.KEY_INTERPOLATION,
                        RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                        // Or _BICUBIC
                g2d.scale(2, 2);
                g2d.drawImage(img, 0, 0, this);
            }
        };
        panel.setPreferredSize(new Dimension(WIDTH*2, HEIGHT*2));
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
