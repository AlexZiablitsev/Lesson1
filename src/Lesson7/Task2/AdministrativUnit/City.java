package Lesson7.Task2.AdministrativUnit;

import java.util.Arrays;

public class City extends AdministrativeUnit {
    private float square;

    public City(String name, float square) {
        super(name);
        this.square = square;
    }

    @Override
    public double squareCalculation() {
        return this.square;
    }

    public double getSquare() {
        return square;
    }

    @Override
    public String toString() {
        return name;
    }
}

