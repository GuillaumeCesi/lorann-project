package main;

import java.sql.SQLException;
import controller.ControllerFacade;
import model.ModelFacade;
import view.Fenetre1;
import view.ViewFacade;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {
        final ControllerFacade controller = new ControllerFacade(new ViewFacade(), new ModelFacade());
     //  new Fenetre1();
       System.out.println("name");
    
        try {
        	System.out.println("name");
            controller.start();
        } catch (final SQLException exception) {
            exception.printStackTrace();
            
        }
    }

}
