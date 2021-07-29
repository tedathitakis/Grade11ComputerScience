
public class CellPhone {
	private String carrier, type;
	private double speed, memory;
	private int numApps;
	
	//constructor
	public CellPhone(String carrier, String type, double speed, double memory, int numApps) {
		this.carrier = carrier;
		this.type = type;
		this.speed = speed;
		this.memory = memory;
		this.numApps = numApps;
	}

	//getters and setters
	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getMemory() {
		return memory;
	}

	public void setMemory(double memory) {
		this.memory = memory;
	}

	public int getNumApps() {
		return numApps;
	}

	public void setNumApps(int numApps) {
		this.numApps = numApps;
	}

	@Override
	public String toString() {
		return "CellPhone [carrier=" + carrier + ", type=" + type + ", speed=" + speed + ", memory=" + memory
				+ ", numApps=" + numApps + "]";
	}

}
