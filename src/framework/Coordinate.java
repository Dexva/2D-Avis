package framework;

/**
 *
 * @author davisnicholomagpantay
 */

//--- IMPORTS ---//
import java.awt.Rectangle;
import java.util.ArrayList;

public class Coordinate {
    
    private double trueX, trueY;
    private double firstX, firstY;
    private double renderX, renderY;
    private int width, height;
    private Rectangle hitbox;
    
    private ArrayList<Coordinate> coordinates = new ArrayList<Coordinate>();

    //--- CONSTRUCTORS ---//
    public Coordinate(double tX, double tY, int w, int h) {
        this.trueX = this.firstX = this.renderX = tX;
        this.trueY = this.firstY = this.renderY = tY;
        this.width = w;
        this.height = h;
        hitbox = new Rectangle((int) trueX, (int) trueY, (int) width, (int) height);
        
        coordinates.add(this);
    }
    
    //--- GETTERS ---//
    public double getTrueX() {return trueX;}
    public double getTrueY() {return trueY;}
    public double getFirstX() {return firstX;}
    public double getFirstY() {return firstY;}
    public double getRenderX() {return renderX;}
    public double getRenderY() {return renderY;}
    public int getWidth() {return width;}
    public int getHeight() {return height;}
    public Rectangle getHitbox() {return hitbox;}
    public int getHitbox_X() {return hitbox.x;}
    public int getHitbox_Y() {return hitbox.y;}    
    public int getHitbox_WIDTH() {return hitbox.width;}
    public int getHitbox_HEIGHT() {return hitbox.height;}
    
    //--- FUNCTIONS/SETTERS ---//
    public void setTrueX(double newX) {trueX = newX; hitbox.x = (int) trueX;}
    public void setTrueY(double newY) {trueY = newY; hitbox.y = (int) trueY;}
    public void moveTrueX(double dX) {trueX += dX; hitbox.x = (int) trueX;}
    public void moveTrueY(double dY) {trueY += dY; hitbox.y = (int) trueY;}
    
    public void setRenderX(double newX) {renderX = newX;}
    public void setRenderY(double newY) {renderY = newY;}
    public void moveRenderX(double dX) {renderX += dX;}
    public void moveRenderY(double dY) {renderY += dY;}
    public void cameraAdjustRenderX(double cX) {renderY = trueX - cX;}
    public void cameraAdjustRenderY(double cY) {renderY = trueX - cY;}
    
    public void setHitbox(Rectangle newBox) {hitbox = newBox;}
    public void setHitbox_X(int newX) {hitbox.x = newX;}
    public void setHitbox_Y(int newY) {hitbox.y = newY;}
    
    public void moveAllX(double dX) {
        trueX += dX;
        renderX += dX;
        hitbox.x = (int) trueX;
    }
    public void moveAllY(double dY) {
        trueY += dY;
        renderY += dY;
        hitbox.y = (int) trueY;
    }
}
