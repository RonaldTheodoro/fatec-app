package br.com.app.models;

public class Vehicle {
    private Long id;
    private String brand;
    private String model;
    private int year;
    private String category;
    private String color;
    private double value;

    public Vehicle() { }

    public Vehicle(
            String brand,
            String model,
            int year,
            String category,
            String color,
            double value) {
        
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.category = category;
        this.color = color;
        this.value = value;
    }

    public Vehicle(
            Long id,
            String brand,
            String model,
            int year,
            String category,
            String color,
            double value) {

        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.category = category;
        this.color = color;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

}