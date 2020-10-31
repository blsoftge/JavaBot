package br.com.blsoft.javabot.v04desligandoComputador;
import java.awt.Robot;
import java.awt.event.KeyEvent;
public class DesligarPC {
    
    private final short DELAY = 100;
    private Robot robo;

    public DesligarPC(Robot robot){
        this.robo = robot;
        this.desligar();
    }

    public void desligar(){
        this.abrirOExecutar();
        robo.delay(3000);
        this.executarShutdown();
    }

    private void abrirOExecutar(){
        robo.keyPress(KeyEvent.VK_WINDOWS);
        robo.keyPress(KeyEvent.VK_R);
        robo.keyRelease(KeyEvent.VK_R);
        robo.keyRelease(KeyEvent.VK_WINDOWS);
    }

    private void executarShutdown(){
        robo.keyPress(KeyEvent.VK_S);
        robo.delay(this.DELAY);
        robo.keyRelease(KeyEvent.VK_S);
        robo.delay(this.DELAY);

        robo.keyPress(KeyEvent.VK_H);
        robo.delay(this.DELAY);
        robo.keyRelease(KeyEvent.VK_H);
        robo.delay(this.DELAY);

        robo.keyPress(KeyEvent.VK_U);
        robo.delay(this.DELAY);
        robo.keyRelease(KeyEvent.VK_U);
        robo.delay(this.DELAY);

        robo.keyPress(KeyEvent.VK_T);
        robo.delay(this.DELAY);
        robo.keyRelease(KeyEvent.VK_T);
        robo.delay(this.DELAY);

        robo.keyPress(KeyEvent.VK_D);
        robo.delay(this.DELAY);
        robo.keyRelease(KeyEvent.VK_D);
        robo.delay(this.DELAY);
        
        robo.keyPress(KeyEvent.VK_O);
        robo.delay(this.DELAY);
        robo.keyRelease(KeyEvent.VK_O);
        robo.delay(this.DELAY);

        robo.keyPress(KeyEvent.VK_W);
        robo.delay(this.DELAY);
        robo.keyRelease(KeyEvent.VK_W);
        robo.delay(this.DELAY);

        robo.keyPress(KeyEvent.VK_N);
        robo.delay(this.DELAY);
        robo.keyRelease(KeyEvent.VK_N);
        robo.delay(this.DELAY);

        robo.keyPress(KeyEvent.VK_SPACE);
        robo.delay(this.DELAY);
        robo.keyRelease(KeyEvent.VK_SPACE);
        robo.delay(this.DELAY);

        robo.keyPress(KeyEvent.VK_MINUS);
        robo.delay(this.DELAY);
        robo.keyRelease(KeyEvent.VK_MINUS);
        robo.delay(this.DELAY);

        robo.keyPress(KeyEvent.VK_S);
        robo.delay(this.DELAY);
        robo.keyRelease(KeyEvent.VK_S);
        robo.delay(this.DELAY);

        robo.keyPress(KeyEvent.VK_SPACE);
        robo.delay(this.DELAY);
        robo.keyRelease(KeyEvent.VK_SPACE);
        robo.delay(this.DELAY);

        robo.keyPress(KeyEvent.VK_MINUS);
        robo.delay(this.DELAY);
        robo.keyRelease(KeyEvent.VK_MINUS);
        robo.delay(this.DELAY);

        robo.keyPress(KeyEvent.VK_T);
        robo.delay(this.DELAY);
        robo.keyRelease(KeyEvent.VK_T);
        robo.delay(this.DELAY);

        robo.keyPress(KeyEvent.VK_SPACE);
        robo.delay(this.DELAY);
        robo.keyRelease(KeyEvent.VK_SPACE);
        robo.delay(this.DELAY);

        robo.keyPress(KeyEvent.VK_0);
        robo.delay(this.DELAY);
        robo.keyRelease(KeyEvent.VK_0);
        robo.delay(this.DELAY);

        robo.keyPress(KeyEvent.VK_ENTER);
        robo.delay(this.DELAY);
        robo.keyRelease(KeyEvent.VK_ENTER);
        robo.delay(this.DELAY);

        //abrir o menu executar
        //shutdown -s -t 0 enter
    }

}
