package restaurant;

import java.util.Date;

public class MenuItem {

    private String itemName;
    private double price;
    private String description;
    private String category;
    private boolean newItem;
    private Date createdAt;

    public MenuItem(String itemName, double price, String description, String category, boolean newItem){
        this.itemName = itemName;
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItem = newItem;
        this.createdAt = new Date();
    }
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
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
        this.category = category;
    }

    public boolean isNewItem() {
        return newItem;
    }

    public void setNewItem(boolean newItem) {
        this.newItem = newItem;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    }


