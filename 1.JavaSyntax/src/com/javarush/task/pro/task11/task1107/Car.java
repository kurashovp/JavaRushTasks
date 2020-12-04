package com.javarush.task.pro.task11.task1107;

/* 
Двигатель — сердце автомобиля
 // П.К. логика этого задания не ясна: почему у всех машин должен быть
  только один двигатель на все машины (static)?

*/

public class Car {
    public static Engine engine;

    public static void main(String[] args) {

        Car car = new Car();
        car.engine.start();
        car.engine.stop();
    }

    public class Engine {
        private  boolean isRunning;

        public void start() {
            isRunning = true;
        }

        public void stop(){
            isRunning = false;
        }
    }
}
