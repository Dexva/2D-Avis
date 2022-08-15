package sample.entities;

/**
 *
 * @author davisnicholomagpantay
 */

//--- IMPORTS ---//
import framework.Entity;
import java.util.ArrayList;

public class Bird extends Entity{
    
    public boolean jump;
    
    private double speedX = 0, speedY = 0;
    private final double GRAVITY = 0.1;
    
    //--- CONSTRUCTOR ---//
    public Bird(int x, int y) {
        super("flappy_bird", x, y, 50, 50);
        this.jump = false;
    }
    
    //--- MAIN SET FUNCTION ---//
    public void set() {
        
        //Initial motion
        if(jump) speedY -= 0.8;
        speedY += GRAVITY;

        
        //Collidables
        boolean colliding = false;
        for (int i=0;i<Entity.getEntitiesByType("pipe_obstacle").size();i++) { //TO-DO: adjust based on collision logic
            if(this.collidesWith(Entity.getEntitiesByType("pipe_obstacle").get(i))) {
                colliding = true;
                speedY = 0;
                break;
            } else{}
        }
        
        if (colliding && jump) speedY -= 0.8;
        System.out.println(colliding + ", " + jump);
        
        
        //Pipe Collision
        
        
//        if(!colliding) {
//            if (left) {
//                coordinate.moveAllX(-2);
//            }
//            if (right) {
//                coordinate.moveAllX(2);
//            }
//            if (up) {
//                coordinate.moveAllY(-2);
//            }
//            if (down) {
//                coordinate.moveAllY(2);
//            }
//        }
        
        coordinate.moveAllY(speedY);
    }
    
    //--- GETTERS ---//
    
    
}
