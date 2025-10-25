package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

      List<Car> cars = new ArrayList<>();

      cars.add(new Car(20000, 2018, 150));
      cars.add(new Car(15000, 2020, 180));
      cars.add(new Car(15000, 2020, 170));
      cars.add(new Car(15000, 2022, 170));
      cars.add(new Car(25000, 2023, 300));

      System.out.println("Список до сортування");
      for (Car car : cars) {
          System.out.println(car);
      }

      Collections.sort(cars);

      System.out.println("Список після сортування ( від \"меншого\" до \"більшого\")");
      for (Car car : cars) {
          System.out.println(car);
      }
    }
}

