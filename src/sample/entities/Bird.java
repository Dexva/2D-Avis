package sample.entities;

/**
 *
 * @author davisnicholomagpantay
 */

//--- IMPORTS ---//
import framework.Entity;

public class Bird extends Entity{
    
    public boolean left, right, up, down;
    
    //--- CONSTRUCTOR ---//
    public Bird(int x, int y) {
        super("flappy:bird", x, y, 50, 50);
        this.left = this.right = this.up = this.down = false;
    }
    
    //--- MAIN SET FUNCTION ---//
    public void set() {
        if (left) {
            coordinate.moveRenderX(-2);
        }
        if (right) {
            coordinate.moveRenderX(2);
        }
        if (up) {
            coordinate.moveRenderY(-2);
        }
        if (down) {
            coordinate.moveRenderY(2);
        }
    }
    
    //--- GETTERS ---//
    
    
}
