package models;

public class Array {
    private double[] vectorA = new double[50];
    private double[] vectorB = new double[20];

    public Array() {
        for (int i = 0; i < 50; i++) {
            this.vectorA[i] = Math.random() * 100;
        }
    }

    public Array(double[] vectorA, double[] vectorB) {
        this.vectorA = vectorA;
        this.vectorB = vectorB;
    }

    public double[] getVectorA() {
        return vectorA;
    }

    public void setVectorA(double[] vectorA) {
        this.vectorA = vectorA;
    }

    public double[] getVectorB() {
        return vectorB;
    }

    public void setVectorB(double[] vectorB) {
        this.vectorB = vectorB;
    }
}
