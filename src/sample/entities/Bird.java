package sample.entities;

/**
 *
 * @author davisnicholomagpantay
 */

//--- IMPORTS ---//
import framework.Entity;
import java.util.ArrayList;

public class Bird extends Entity{
    
    public boolean left, right, up, down;
    
    //--- CONSTRUCTOR ---//
    public Bird(int x, int y) {
        super("flappy_bird", x, y, 50, 50);
        this.left = this.right = this.up = this.down = false;
    }
    
    //--- MAIN SET FUNCTION ---//
    public void set() {
        
        //Collidables
        
        //Pipe Collision
        boolean colliding = false;
        for (int i=0;i<Entity.getEntitiesByType("pipe_obstacle").size();i++) { //TO-DO: adjust based on collision logic
            if(this.collidesWith(Entity.getEntitiesByType("pipe_obstacle").get(i))) {
                System.out.println("im colliding");
                colliding = true;
                break;
            } else{}
        }
        
        if(!colliding) {
            if (left) {
                coordinate.moveAllX(-2);
            }
            if (right) {
                coordinate.moveAllX(2);
            }
            if (up) {
                coordinate.moveAllY(-2);
            }
            if (down) {
                coordinate.moveAllY(2);
            }
        }
        
    }
    
    //--- GETTERS ---//
    
    
}
