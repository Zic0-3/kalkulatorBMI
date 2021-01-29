package model;

public class BodyDimensions {
    private int height;
    private int weight;
    private int age;
    private boolean isFemale;

    public BodyDimensions() {
    }

    public BodyDimensions(int height, int weight, int age, boolean isFemale) {
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.isFemale = isFemale;
    }

    public double calculateBMI( ) {
        return this.weight / (Math.pow((double)height/100,2));
    }
    public int calculateBMR() {
        return 2200;
    }
}