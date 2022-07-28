package framework;

/**
 *
 * @author davisnicholomagpantay
 */


//--- IMPORTS ---//
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Game extends Panel{
    
    //--- CONSTRUCTOR ---//
    public Game(Screen s, int i, String n, int pX, int pY, int w, int h) {
        super(s, i, n, pX, pY, w, h);
    }
    
    //--- FEATURES ---//
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D gtd = (Graphics2D) g;
        Entity.drawAllEntities(gtd);
    }
    
}
