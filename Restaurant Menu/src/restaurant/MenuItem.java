package restaurant;


import java.util.Arrays;
import java.util.Date;

public class MenuItem {
    private String name;
    private String category;
    private String description;
    private double price;
    private boolean isNew;
    private Date dateAdded;

    public MenuItem(String name,String category, String description, double price) {
        this.name= name;
        this.setCategory(category);
        this.description = description;
        this.price = price;



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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {

        String [] availableCategory= {"appetizer", "main course", "dessert"};
        if (Arrays.stream(availableCategory).anyMatch(category.toLowerCase()::equals)) {
            this.category = category;
        } else {
            System.out.println("Invalid Category! Please provide a valid choice!" );
        }
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", isNew=" + isNew +
                ", dateAdded=" + dateAdded +
                '}';
    }
}
