/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia_9;

/**
 *
 * @author ficdev
 */
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegistroLog { 
    private static final Logger logger = Logger.getLogger(RegistroLog.class.getName());

    public void meuMetodo() {
        // ...
        logger.log(Level.INFO, "Mensagem informativa");
        logger.log(Level.WARNING, "Mensagem de aviso");
        // ...
    }
}

