package v02teclado;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RoboSoletrando {

	private final short DELAY = 100;
	private Robot robo;
	
	public RoboSoletrando(Robot pRobo) {
		this.robo = pRobo;
	}
	
	public void escrever(String keys) {
		char[] chars = keys.toCharArray();
	    for (char caractere : chars) {
	        int codigo = KeyEvent.getExtendedKeyCodeForChar(caractere);
	        if (KeyEvent.CHAR_UNDEFINED == codigo) {
	            throw new RuntimeException("Char não encontrado: '" + caractere + "'");
	        }
	        if(Character.isUpperCase(caractere)) {
	        	robo.keyPress(KeyEvent.VK_SHIFT);
	        	robo.delay(this.DELAY);
	        	this.escreverChar(robo, codigo);
	        	robo.keyRelease(KeyEvent.VK_SHIFT);
	        	robo.delay(this.DELAY);
	        }else {    	
	        	this.escreverChar(robo, codigo);
	        }
	    }
	}
	
	private void escreverChar(Robot pRobo, int pCodigo) {
        pRobo.keyPress(pCodigo);
        pRobo.delay(this.DELAY);
        pRobo.keyRelease(pCodigo);
        pRobo.delay(this.DELAY);
	}
		
}
