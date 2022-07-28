package framework;

/**
 *
 * @author davisnicholomagpantay
 */

//--- IMPORTS ---//
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Panel extends JPanel{
    
    //--- INSTANCE FIELDS ---//
    private Screen containerScreen;
    private int panelID;
    private int xCoord, yCoord;
    private int width, height;
    private String panelName;
    
    //--- CLASS FIELDS ---//
    private static ArrayList<Panel> panels = new ArrayList<Panel>();
    
    //--- CONSTRUCTOR ---//
    public Panel(Screen s, int i, String n, int pX, int pY, int w, int h) {
        this.containerScreen = s;
        this.panelID = i;
        this.panelName = n;
        this.xCoord = pX;
        this.yCoord = pY;
        this.width = w;
        this.height = h;
        
        this.setOpaque(true);
        this.setVisible(true);
        this.setFocusable(true);
        this.setBounds(pX, pY, w, h);
        
        panels.add(this);
    }
    
    //--- INSTANCE GETTERS ---//
    public int getPanelID() {
        return panelID;
    }
    
    public String getPanelName() {
        return panelName;
    }
    
    //--- INSTANCE SETTERS ---//
    public void changePanelID(int newID) {
        panelID = newID;
    }
    
    public void changePanelName(String newName) {
        panelName = newName;
    }
    
    //--- CLASS GETTERS (STATIC) ---//
    public static Panel getByID(int id) {
        for (Panel i : panels) {
            if(i.getPanelID()==id) {return i;}
        }
        return null;
    }
    
    public static Panel getByName(String name) {
        for (Panel i : panels) {
            if(i.getPanelName().equals(name)) {return i;}
        }
        return null;
    }
    
}
