package br.com.blsoft.javabot;

import java.awt.AWTException;
import java.awt.Robot;
import br.com.blsoft.javabot.v04desligandoComputador.DesligarPC;

public class Main {
    public static void main(String[] args) {
        try {
            new DesligarPC(new Robot());
        } catch (AWTException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
