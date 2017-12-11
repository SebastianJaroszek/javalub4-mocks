package com.demo.camera;

public class Camera {

    private final ImageSensor sensor;
    private Card card;

    public Camera(ImageSensor sensor) {
        this.sensor = sensor;
    }

    public Camera(ImageSensor sensor, Card card) {
        this(sensor);
        this.card = card;
    }

    public void turnOn() {
        sensor.turnOn();
    }

    public void turnOff() {
        sensor.turnOff();
    }

    public void pressButton() {
        /*byte[] data = sensor.read();
        card.write(data);*/
    }
}

