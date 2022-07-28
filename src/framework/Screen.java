package framework;

/**
 *
 * @author davisnicholomagpantay
 */

//--- IMPORTS ---//
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Screen extends JFrame{
    
    //--- INSTANCE FIELDS ---//
    private int screenID;
    private String screenName;
    private boolean visible;
    private JLayeredPane contentLayers = new JLayeredPane();
    
    //--- CLASS FIELDS ---//
    private static int visibleScreenID;
    private static ArrayList<Screen> screens = new ArrayList<Screen>();
    
    //--- CONSTRUCTOR ---//
    public Screen(int i, String n, String t, int pX, int pY, boolean r) {
        this.screenID = i;
        this.screenName = n;
        this.setTitle(t);
        this.setSize(pX, pY);
        this.setResizable(r);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.visible = false;
        this.add(contentLayers);
        
        screens.add(this);
    }
    
    //--- FUNCTIONS ---//
    public void render() {
        visible = true;
        visibleScreenID = screenID;
        this.setVisible(true);
    }
    
    public void unrender() {
        visible = false;
        this.setVisible(false);
    }
    
    public void switchScreen(int newScreenID) {
        try{
            Screen.getByID(visibleScreenID).unrender();
            Screen.getByID(newScreenID).render();
        }
        catch (NullPointerException e) {
            displayException(e, "Screen ID#"+newScreenID+" is not found.");
        }
    }
    
    public void addLayer(JPanel panel, int layerNumber) {
        this.remove(contentLayers);
        this.contentLayers.add(panel, layerNumber);
        this.add(contentLayers);
    }
    
    //--- INSTANCE GETTERS ---//
    public int getScreenID() {
        return screenID;
    }
    
    public String getScreenName() {
        return screenName;
    }
    
    //--- INSTANCE SETTERS ---//
    public void changeScreenID(int newID) {
        screenID = newID;
    }
    
    public void changeScreenName(String newName) {
        screenName = newName;
    }
    
    //--- CLASS GETTERS (STATIC) ---//
    public static Screen getByID(int id) {
        for (Screen i : screens) {
            if(i.getScreenID()==id) {return i;}
        }
        return null;
    }
    
    public static Screen getByName(String name) {
        for (Screen i : screens) {
            if(i.getScreenName().equals(name)) {return i;}
        }
        return null;
    }
    
    //--- CLASS SETTERS (STATIC) ---//
    
    //--- EXCEPTION HANDLING ---//
    public void displayException(Exception e, String m) {
        System.out.printf("[%s] %s\n", e.getClass().getCanonicalName(), m);
    }
}
