package homenest;

public abstract class Device implements IControllable {

    protected String deviceId;
    private boolean status;              
    protected double energyUsage;

    protected Device(String deviceId, double energyUsage) {
        this.deviceId = deviceId;
        this.energyUsage = energyUsage;
        this.status = false;
        logFirmwareUpdate("Device registered");
    }

    public boolean isOn() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    public double getEnergyUsage() {
        return energyUsage;
    }

   
    public double addEnergy(Device other) {
        return this.energyUsage + other.energyUsage;
    }

    protected void logFirmwareUpdate(String msg) {
        System.out.println("[Firmware Log] " + deviceId + " → " + msg);
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println(deviceId + " turned ON");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println(deviceId + " turned OFF");
    }
}