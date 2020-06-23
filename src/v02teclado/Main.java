package v02teclado;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Main {

	public static void main(String[] args) throws Exception {

		Robot robo = new Robot();
		robo.delay(2000);
				
//		robo.keyPress(KeyEvent.VK_SHIFT);
//		robo.keyPress(KeyEvent.VK_B);
//		robo.keyRelease(KeyEvent.VK_B);
//		robo.keyPress(KeyEvent.VK_L);
//		robo.keyRelease(KeyEvent.VK_L);
//		robo.keyPress(KeyEvent.VK_S);
//		robo.keyRelease(KeyEvent.VK_S);
//		robo.keyRelease(KeyEvent.VK_SHIFT);
//		robo.keyPress(KeyEvent.VK_O);
//		robo.keyRelease(KeyEvent.VK_O);
//		robo.keyPress(KeyEvent.VK_F);
//		robo.keyRelease(KeyEvent.VK_F);
//		robo.keyPress(KeyEvent.VK_T);
//		robo.keyRelease(KeyEvent.VK_T);
		
		RoboSoletrando roboSoletrando = new RoboSoletrando(robo);	
		roboSoletrando.escrever("BLSoft Desenvolvimento de Sistemas. A numero 1");
		
		
	}
	
}
