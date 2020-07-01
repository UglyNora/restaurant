package restaurant;
import java.util.*;
public class Menu {
    private ArrayList<MenuItem> items;
    private Date dateAdded;


    public Menu(ArrayList<MenuItem> aItems) {
        items = new ArrayList<MenuItem>();
        Date dateModified = new Date();
    }


    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Menu() {
        items = new ArrayList<MenuItem>();
        Date dateModified = new Date();
    }

    public ArrayList<MenuItem> getMenus() {return items;}

    public void setMenus(ArrayList<MenuItem>aItems) { items = aItems;}

    public void addMenuItem(MenuItem aMenuItem) {items.add(aMenuItem);}

    public void removeMenuItem(MenuItem aMenuItem) {
        if (items.contains(aMenuItem)) {
            items.remove(aMenuItem);
        }
    }
}
