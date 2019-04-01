package pl.dawidpalka.carnote.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Car implements Serializable {

    private String brand;
    private String model;
    private String color;
    private List<Refueling> refuelings;

    public Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        refuelings = new ArrayList<>();
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Refueling> getRefuelings() {
        return refuelings;
    }

    public void setRefuelings(List<Refueling> refuelings) {
        this.refuelings = refuelings;
    }
}
