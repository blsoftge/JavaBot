/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v03printscreen;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author BLSoft
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException {
        Robot robo = new Robot();
        
        //seta um delay para cada evento que o robo executa - em milisegundos
        robo.setAutoDelay(1000);
        
        //recupero a resolução da tela
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        
        //crio um retangulo do tamanho da tela
        Rectangle retanguloDoPrint = new Rectangle(
            (int) screenSize.getWidth(),
            (int) screenSize.getHeight()
        );
        
        //mando o robo criar uma imagem da tela
        BufferedImage imageBuffer = robo.createScreenCapture(retanguloDoPrint);
        
        try {
            //crio o arquivo de imagem no filesistem do so
        	File arquivoImg = new File("/home/bruno/Imagens/tela.png");
            ImageIO.write(imageBuffer, "png", arquivoImg);
            if(arquivoImg.exists()) {
            	System.out.println(arquivoImg.getAbsolutePath());
            }
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
