package homenest;

public class Thermostat extends Device{
	public Thermostat(String deviceId) {
        super(deviceId, 40.0);
    }

    @Override
    public void reset() {
        turnOff();
        System.out.println("Thermostat reset: temperature normalized");
    }
}