package restaurant;


public class MenuItem {

    private String category;
    private String description;
    private double price;
    private boolean isNew;

    public MenuItem(String category, String description, double price, boolean isNew) {
       this.category = category;
       this.description = description;
       this.price = price;
       this.isNew = false;


    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getcategory() {
        return category;
    }

    public void setcategory(String category) {
        category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
