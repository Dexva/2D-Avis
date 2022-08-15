package sample.screens;

import framework.Entity;
import framework.Panel;
import framework.Screen;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;
import sample.controllers.GamePanelController;
import sample.entities.*;

/**
 *
 * @author davisnicholomagpantay
 */

public class GamePanel extends Panel{
    
    private int width, height;
    public Bird player;
    private Timer gameTimer;
    
    public GamePanel(Screen screen, int id, String name, int widthIn, int heightIn) {
        super(screen, id, name, 0, 0, widthIn, heightIn);
        this.width = widthIn;
        this.height = heightIn;
        
        //--- AESTHETICS ---//
        this.setBackground(new Color(135, 206, 235));
        
        //--- CONTROLLER BINDING ---//
        GamePanelController gpController = new GamePanelController(this, 1, "GamePanelConntroller");
        this.addKeyListener(gpController);
        this.addMouseListener(gpController);
                
        //--- GAME PROPER ---//
        initializeGame();
        gameTimer = new Timer();
        gameTimer.schedule(new TimerTask() {
            public void run() {
                //System.out.println("running");
                player.set();
                repaint();
            }
        }, 0, 17);
        
        

    }
    
    @Override
    public void paint(Graphics g) {
        //System.out.println("paint() being called");
        super.paint(g);
        Graphics2D gtd = (Graphics2D) g;
        Entity.drawAllEntities(gtd);
    }
    
    public void initializeGame() {
        player = new Bird(250, 0);
        new Pipe(250, 500);
        new Pipe(50, 300);
    }
    
}
