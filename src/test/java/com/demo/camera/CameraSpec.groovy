package com.demo.camera

import spock.lang.Specification

class CameraSpec extends Specification {


    def "Should power up the sensor when camera is switched on"() {
        given:
        ImageSensor sensor = Mock(ImageSensor)
        Camera camera = new Camera(sensor)

        when:
        camera.turnOn()

        then:
        1 * sensor.turnOn()
    }

    def "Should power off the sensor when camera is switched off"() {
        given:
        ImageSensor sensor = Mock(ImageSensor)
        Camera camera = new Camera(sensor)

        when:
        camera.turnOff()

        then:
        1 * sensor.turnOff()
    }

    def "Press snapshot button should do nothing when power is off"() {
        given:
        ImageSensor sensor = Mock(ImageSensor)
        Camera camera = new Camera(sensor)
        camera.turnOff()

        when:
        camera.pressButton()

        then:
        0 * sensor.turnOn()
    }

    /*def "Press snapshot button should copy data to memory card when power is on"() {
        given:
        Card card = Mock(Card)
        ImageSensor sensor = Mock(ImageSensor) //stub
        Camera camera = new Camera(sensor, card)
        camera.turnOn()
        def data = sensor.read()

        when:
        camera.pressButton()

        then:
        1 * card.write(data)
    }*/

    /*0 * camera.turnOn()
    1 * camera.turnOff()*/

}
