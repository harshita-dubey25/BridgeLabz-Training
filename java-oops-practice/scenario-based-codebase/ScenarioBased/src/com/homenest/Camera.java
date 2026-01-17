package homenest;

public class Camera extends Device {

    public Camera(String deviceId) {
        super(deviceId, 25.0);
    }

    @Override
    public void reset() {
        turnOff();
        System.out.println("Camera reset: lens recalibrated");
    }
}