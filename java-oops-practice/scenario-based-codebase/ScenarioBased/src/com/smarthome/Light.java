package com.smarthome;

public class Light extends Appliance implements Controllable{
	private int brightness;

    public Light(String id) {
        super(id, 15.0); 
        this.brightness = 100;
    }

    public void turnOn() {
        setPowerState(true);
        System.out.println("Light [" + getDeviceId() + "] glowing at " + brightness + "%.");
    }
    
    public void turnOff() {
        setPowerState(false);
        System.out.println("Light [" + getDeviceId() + "] turned off.");
    }

    public void showStatus() {
        System.out.println("Device: Light | Status: " + (isDeviceOn() ? "ON" : "OFF"));
    }
}