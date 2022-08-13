package framework;

/**
 *
 * @author davisnicholomagpantay
 */

//--- IMPORTS ---//
import java.awt.Rectangle;
import java.util.ArrayList;

public class Coordinate {
    
    private int trueX, trueY;
    private int firstX, firstY;
    private int renderX, renderY;
    private int width, height;
    private Rectangle hitbox;
    
    private ArrayList<Coordinate> coordinates = new ArrayList<Coordinate>();

    //--- CONSTRUCTORS ---//
    public Coordinate(int tX, int tY, int w, int h) {
        this.trueX = this.firstX = this.renderX = tX;
        this.trueY = this.firstY = this.renderY = tX;
        this.width = w;
        this.height = h;
        hitbox = new Rectangle(trueX, trueY, width, height);
        
        coordinates.add(this);
    }
    
    //--- GETTERS ---//
    public int getTrueX() {return trueX;}
    public int getTrueY() {return trueY;}
    public int getFirstX() {return firstX;}
    public int getFirstY() {return firstY;}
    public int getRenderX() {return renderX;}
    public int getRenderY() {return renderY;}
    public int getWidth() {return width;}
    public int getHeight() {return height;}
    public Rectangle getHitbox() {return hitbox;}
    public int getHitbox_X() {return hitbox.x;}
    public int getHitbox_Y() {return hitbox.y;}    
    public int getHitbox_WIDTH() {return hitbox.width;}
    public int getHitbox_HEIGHT() {return hitbox.height;}
    
    //--- FUNCTIONS/SETTERS ---//
    public void setTrueX(int newX) {trueX = newX;}
    public void setTrueY(int newY) {trueY = newY;}
    public void moveTrueX(int dX) {trueX += dX;}
    public void moveTrueY(int dY) {trueY += dY;}
    
    public void setRenderX(int newX) {renderX = newX;}
    public void setRenderY(int newY) {renderY = newY;}
    public void moveRenderX(int dX) {renderX += dX;}
    public void moveRenderY(int dY) {renderY += dY;}
    public void cameraAdjustRenderX(int cX) {renderY = trueX - cX;}
    public void cameraAdjustRenderY(int cY) {renderY = trueX - cY;}
    
    public void setHitbox(Rectangle newBox) {hitbox = newBox;}
    public void setHitbox_X(int newX) {hitbox.x = newX;}
    public void setHitbox_Y(int newY) {hitbox.y = newY;}
    
    public void moveAllX(int dX) {
        trueX += dX;
        renderX += dX;
        hitbox.x += dX;
    }
    public void moveAllY(int dY) {
        trueY += dY;
        renderY += dY;
        hitbox.y += dY;
    }
}
