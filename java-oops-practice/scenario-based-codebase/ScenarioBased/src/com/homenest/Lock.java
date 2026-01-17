package homenest;

public class Lock extends Device{
	public Lock(String deviceId) {
        super(deviceId, 5.0);
    }

    @Override
    public void reset() {
        turnOff();
        System.out.println("Lock reset: security rearmed");
    }
}
