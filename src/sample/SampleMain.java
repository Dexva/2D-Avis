package sample;

import sample.screens.*;

/**
 *
 * @author davisnicholomagpantay
 */

//--- BRIEFER ---//
/*
    In this game sample, we will be recreating flappy bird using the 2D-Avis framework.
*/

public class SampleMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Initializing Screens
        // When developing using the 2D-Avis framework, you should declare all the possible screens
        // (e.g., main menu, settings, game proper, etc.) in the main() function.
        GameScreen s1 = new GameScreen(1, "game", "Flappy Bird", 400, 600, false);
        //GameScreen s2 = new GameScreen(2, "test", "testScreen", 200, 100, false);
        
        // Initializing Panels
        // You can initialize in the main() function, or in the respective constructors of its parent screen.
        
        // The first Screen you will show should be explicitly stated below:
        s1.render();
        s1.getGamePanel().grabFocus();
        /*while(true) {
             System.out.println(s1.getFocusOwner());
        }*/
       
    }
    
}
