package org.example;

public class Smartphone implements GPS, Cellular {

    @Override
    public double[] getCoordinates() {

        double[] coords = {50.4501, 30,5234};
        System.out.println("Отримання GPS координат");
        return coords;
    }

    @Override
    public void makeCall() {
        System.out.println("Здійснюємо вихідний дзвінок");
    }

    @Override
    public void receiveCall() {
        System.out.println("Приймаємо вхідний дзвінок");
    }
}
