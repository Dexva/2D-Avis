package framework;

/**
 *
 * @author davisnicholomagpantay
 */

//--- IMPORTS ---//
import framework.dependencies.CollisionData;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Map.Entry;

public class Entity {
    
    public final int DRAW_MODE_RECTANGLE = 1000;
    public final int DRAW_MODE_SPRITE = 1001; //to-do: add sprite system
    
    protected String typeID;
    protected Coordinate coordinate;
    protected boolean collidable;
    
    private Color entityColor;
    private int drawMode;
    
    private int speedX = 0, speedY = 0;
    
    private static ArrayList<Entity> entities = new ArrayList<Entity>();
    
    public Entity(String id, int x, int y, int w, int h) {
        this.typeID = id;
        this.coordinate = new Coordinate(x, y, w, h);
        this.entityColor = Color.RED;
        this.drawMode = DRAW_MODE_RECTANGLE;
        this.collidable = true;
        
        entities.add(this);
    }
    
    //--- INSTANCE FUNCTIONS ---//
    public void setEntityColor(Color c) {
        entityColor = c;
    }
    
    public void drawEntity(Graphics2D gtd) {
        gtd.setColor(entityColor);
        switch(drawMode) {
            case DRAW_MODE_RECTANGLE:
                gtd.fillRect((int) coordinate.getRenderX(), (int) coordinate.getRenderY(), coordinate.getWidth(), coordinate.getHeight());
                break;
            default:
                break;
        }
    }
    
    public boolean collidesWith(Entity e) {
        CollisionData cd = new CollisionData();
        if(coordinate.getHitbox().intersects(e.getCoordinate().getHitbox())) {
            return true;
//           if(coordinate.getHitbox().y>e.getCoordinate().getHitbox().y) {
////               cd.set(true, CollisionData.NORTH);
//           }
//           else if() //TO-DO: add logic for direction collision recognition via CollisionData return type
        } 
        else {return false;}
    }
    
    
    //--- CLASS FUNCTIONS (STATIC) ---//
    public static void drawAllEntities(Graphics2D gtd) {
        for (Entity e : entities) {
            e.drawEntity(gtd);
        }
    }
    
    //--- GETTERS FUNCTIONS ---//
    public Coordinate getCoordinate() {return coordinate;}
    public String getTypeID() {return typeID;}
    
    public static ArrayList<Entity> getEntitiesByType(String id) {
        ArrayList<Entity> returnList = new ArrayList<Entity>();
        for(Entity e : entities) {
            if(e.getTypeID().equals(id)) {returnList.add(e);}
        }
        return returnList;
    }
    
    //--- SETTER FUNCTIONS ---//
    public void setColor(Color c) {entityColor = c;}
    
}
