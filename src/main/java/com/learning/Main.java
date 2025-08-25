package com.learning;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius: ");
        Double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Circle Area = " + circle.calculateArea());
    }
}