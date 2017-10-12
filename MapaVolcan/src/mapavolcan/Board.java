/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapavolcan;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel  implements ActionListener {

       public Board() {
        initBoard();
    }

    private void initBoard() {
        setBackground(Color.WHITE);
      
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image fondo = loadImage("bg_volcano.png");
        g.drawImage(fondo, 0, 0, null);
        int j;
        
        Image piso1 = loadImage("volcano_pack_alt_03.png");
        g.drawImage(piso1, 128, 553, null);    
        
        Image piso2 = loadImage("volcano_pack_alt_07.png");
        g.drawImage(piso2, 128*8, 553, null);    
        
        for(j=128*2; j<=5*128; j=j+128){
        Image pisogen = loadImage("volcano_pack_alt_05.png");
        g.drawImage(pisogen, j, 553, null);
        }
        
        
        
        
        
        
        
        Image lava = loadImage("volcano_pack_53.png");
        for(j=0; j<=8*167; j=j+128){
        g.drawImage(lava, j, 553, null);
        }
        
        
        
        
        /*
        
        img - the specified image to be drawn. 
        This method does nothing if img is null. 
        dx1 - the x coordinate of the first corner of the destination rectangle. 
        dy1 - the y coordinate of the first corner of the destination rectangle. 
        dx2 - the x coordinate of the second corner of the destination rectangle. 
        dy2 - the y coordinate of the second corner of the destination rectangle. 
        
        sx1 - the x coordinate of the first corner of the source rectangle. 
        sy1 - the y coordinate of the first corner of the source rectangle. 
        sx2 - the x coordinate of the second corner of the source rectangle. 
        sy2 - the y coordinate of the second corner of the source rectangle. 
        observer - object to be notified as more of the image is scaled and converted.
        
        */
       
    }

   
 
    
    public Image loadImage(String imageName) {
        ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
 
    
}