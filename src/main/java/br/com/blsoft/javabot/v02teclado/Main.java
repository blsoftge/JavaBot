package br.com.blsoft.javabot.v02teclado;

import java.awt.Robot;

public class Main {

	public static void main(String[] args) throws Exception {

		Robot robo = new Robot();
		robo.delay(2000);
		
		RoboSoletrando roboSoletrando = new RoboSoletrando(robo);
		roboSoletrando.escrever("BLSoft Desenvolvimento de Sistemas. A numero 1");
		
	}
	
}
