package framework;

/**
 *
 * @author davisnicholomagpantay
 */

//--- IMPORTS ---//
import java.util.ArrayList;

public class Controller{
    
    //--- INSTANCE FIELDS ---//
    protected Screen screenControlled = null;
    protected Panel panelControlled = null;
    private int controllerID;
    private String controllerName;
    
    //--- CLASS FIELDS ---//
    private static ArrayList<Controller> controllers = new ArrayList<Controller>();
    
    //--- CONSTRUCTORS ---//
    public Controller(Screen s, int i, String n) {
        this.screenControlled = s;
        this.controllerID = i;
        this.controllerName = n;
        
        controllers.add(this);
    }
    
    public Controller(Panel p, int i, String n) {
        this.panelControlled = p;
        this.controllerID = i;
        this.controllerName = n;
        
        controllers.add(this);
    }
    
    //--- INSTANCE GETTERS ---//
    public int getControllerID() {
        return controllerID;
    }
    
    public String getControllerName() {
        return controllerName;
    }
    
    //--- INSTANCE SETTERS ---//
    public void changeControllerID(int newID) {
        controllerID = newID;
    }
    
    public void changeControllerName(String newName) {
        controllerName = newName;
    }
    
    //--- CLASS GETTERS (STATIC) ---//
    public static Controller getByID(int id) {
        for (Controller i : controllers) {
            if(i.getControllerID()==id) {return i;}
        }
        return null;
    }
    
    public static Controller getByName(String name) {
        for (Controller i : controllers) {
            if(i.getControllerName().equals(name)) {return i;}
        }
        return null;
    }
    
}
