package sample.screens;

import framework.Panel;
import framework.Screen;
import java.awt.Color;

/**
 *
 * @author davisnicholomagpantay
 */
public class GameScreen extends Screen{
    
    private GamePanel gp;
    
    public GameScreen(int s, String n, String t, int pX, int pY, boolean r) {
        super(s, n, t, pX, pY, r);
        
        gp = new GamePanel(this, 12, "Game Panel", pX, pY);
        gp.grabFocus();
        
        this.setBackground(Color.BLUE);
        
        this.addLayer(gp,0);
    }
    
    public GamePanel getGamePanel() {
        return gp;
    }
    
}
