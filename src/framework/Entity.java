package framework;

/**
 *
 * @author davisnicholomagpantay
 */

//--- IMPORTS ---//
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class Entity {
    
    public final int DRAW_MODE_RECTANGLE = 1000;
    public final int DRAW_MODE_SPRITE = 1001; //to-do: add sprite system
    
    protected String typeID;
    protected Coordinate coordinate;
    
    private Color entityColor;
    private int drawMode;
    
    private static ArrayList<Entity> entities = new ArrayList<Entity>();
    
    public Entity(String id, int x, int y, int w, int h) {
        this.typeID = id;
        this.coordinate = new Coordinate(x, y, w, h);
        this.entityColor = Color.RED;
        this.drawMode = DRAW_MODE_RECTANGLE;
        
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
                gtd.fillRect(coordinate.getRenderX(), coordinate.getRenderY(), coordinate.getWidth(), coordinate.getHeight());
                break;
            default:
                break;
        }
    }
    
    //--- CLASS FUNCTIONS (STATIC) ---//
    public static void drawAllEntities(Graphics2D gtd) {
        for (Entity e : entities) {
            e.drawEntity(gtd);
        }
    }
    
}
