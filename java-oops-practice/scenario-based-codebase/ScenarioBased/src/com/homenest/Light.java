package homenest;

public class Light extends Device{
	public Light(String deviceId) {
        super(deviceId, 10.5);
    }

    @Override
    public void reset() {
        turnOff();
        System.out.println("Light reset: brightness restored");
    }
}