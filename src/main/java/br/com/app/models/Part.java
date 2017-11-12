package br.com.app.models;

public class Part {
    private Long id;
    private String name;
    private String model;
    private double value;

    public Part() { }

    public Part(String name, String model, double value) {
        this.name = name;
        this.model = model;
        this.value = value;
    }

    public Part(Long id, String name, String model, double value) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

}