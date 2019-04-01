package pl.dawidpalka.carnote.model;

import java.io.Serializable;
import java.util.Date;

public class Refueling implements Serializable {
    private Date date;
    private Integer mileage;
    private Integer liters;
    private Integer cost;

    public Refueling(Date date, Integer mileage, Integer liters, Integer cost) {
        this.date = date;
        this.mileage = mileage;
        this.liters = liters;
        this.cost = cost;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Integer getLiters() {
        return liters;
    }

    public void setLiters(Integer liters) {
        this.liters = liters;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
}
