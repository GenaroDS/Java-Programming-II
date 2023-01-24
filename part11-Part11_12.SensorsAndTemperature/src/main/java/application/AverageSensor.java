/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import jdk.jfr.BooleanFlag;

/**
 *
 * @author -G
 */
public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : this.sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        this.sensors.forEach(sensor -> sensor.setOn());
    }

    @Override
    public void setOff() {
        this.sensors.forEach(sensor -> sensor.setOff());
    }

    @Override
    public int read() {
        if (this.sensors.size() < 1 || !this.isOn()) {
            throw new IllegalStateException("asdasdaasds");
        } else {
            double average = this.sensors.stream()
                    .collect(Collectors.averagingInt(Sensor::read));
           
            int toReturn = (int) Math.floor(average);
            this.readings.add(toReturn);
            return toReturn;
        }
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    public List<Integer> readings() {        
        return this.readings;
    }
}
