package br.com.blsoft.javabot.v01apresentacaoemouse;

import java.awt.Robot;
import java.awt.event.InputEvent;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		Robot robo = new Robot();
		
		robo.setAutoDelay(2000);
		
		//movi o mouse para x,y
		robo.mouseMove(3270, 40);
		
		//pressionou o botão esquerdo 1
		robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);

		//soltar o botao esquerdo 1
		robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			
		
	}
}
