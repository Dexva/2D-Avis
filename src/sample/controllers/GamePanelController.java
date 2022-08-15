package sample.controllers;

/**
 *
 * @author davisnicholomagpantay
 */

//--- IMPORTS ---//
import framework.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import sample.screens.GamePanel;

public class GamePanelController extends Controller implements KeyListener, MouseListener{
    
    private GamePanel panel;
    
    public GamePanelController(GamePanel gp, int id, String name) {
        super(gp, id, name);
        this.panel = gp;
    }

    //--- KEY CONTROLS ---//
    @Override
    public void keyTyped(KeyEvent e) {
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode()==KeyEvent.VK_SPACE) panel.player.jump = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode()==KeyEvent.VK_SPACE) panel.player.jump = false;
    }

    //--- MOUSE CONTROLS ---//
    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("mouse enter");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("mouse exit");
    }
    
}
