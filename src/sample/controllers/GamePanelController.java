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
        char key = e.getKeyChar();
        switch(key) {
             case 'w':
                panel.player.up = true;
                break;
            case 'a':
                panel.player.left = true;
                break;
            case 's':
                panel.player.down = true;
                break;
            case 'd':
                panel.player.right = true;
                break;
            default:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        char key = e.getKeyChar();
        switch(key) {
             case 'w':
                panel.player.up = false;
                break;
            case 'a':
                panel.player.left = false;
                break;
            case 's':
                panel.player.down = false;
                break;
            case 'd':
                panel.player.right = false;
                break;
            default:
                break;
        }
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
