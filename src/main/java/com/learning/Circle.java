package com.learning;

public class Circle {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double calculateArea() {
        return Math.PI * radius * radius;
    }

}
