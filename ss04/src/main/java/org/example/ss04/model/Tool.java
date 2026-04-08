package org.example.ss04.model;

public class Tool {
    private String name;
    private Double price;
    private String desc;
    private String category;

    public Tool() {
    }

    public Tool(String name, Double price, String desc, String category) {
        this.name = name;
        this.price = price;
        this.desc = desc;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
