package com.carWasher.model;

import java.util.Objects;

public class Car {
    private int id;
    private String model;
    private String color;
    private int year;
    private Driver driver;

    public Car() {
    }

    public Car(int id, String model, String color, int year, Driver driver) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.year = year;
        this.driver = driver;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && year == car.year && Objects.equals(model, car.model) && Objects.equals(color, car.color) && driver.equals(car.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, color, year, driver);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", driver=" + driver +
                '}';
    }
}
