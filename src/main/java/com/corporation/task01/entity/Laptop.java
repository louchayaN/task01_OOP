package com.corporation.task01.entity;

public class Laptop extends Appliance {

	private double batteryCapacity;
	private String os;
	private double memoryRom;
	private double systemMemory;
	private double cpu;
	private double displayInches;

	public Laptop() {
	}

	public double getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public double getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(double memoryRom) {
		this.memoryRom = memoryRom;
	}

	public double getSystemMemory() {
		return systemMemory;
	}

	public void setSystemMemory(double systemMemory) {
		this.systemMemory = systemMemory;
	}

	public double getCpu() {
		return cpu;
	}

	public void setCpu(double cpu) {
		this.cpu = cpu;
	}

	public double getDisplayInchs() {
		return displayInches;
	}

	public void setDisplayInchs(double displayInchs) {
		this.displayInches = displayInchs;
	}

	@Override
	public String toString() {
		return "Laptop [batteryCapacity=" + batteryCapacity + ", os=" + os + ", memoryRom=" + memoryRom + ", systemMemory=" + systemMemory
				+ ", cpu=" + cpu + ", displayInches=" + displayInches + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(batteryCapacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(cpu);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(displayInches);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(memoryRom);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((os == null) ? 0 : os.hashCode());
		temp = Double.doubleToLongBits(systemMemory);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (Double.doubleToLongBits(batteryCapacity) != Double.doubleToLongBits(other.batteryCapacity))
			return false;
		if (Double.doubleToLongBits(cpu) != Double.doubleToLongBits(other.cpu))
			return false;
		if (Double.doubleToLongBits(displayInches) != Double.doubleToLongBits(other.displayInches))
			return false;
		if (Double.doubleToLongBits(memoryRom) != Double.doubleToLongBits(other.memoryRom))
			return false;
		if (os == null) {
			if (other.os != null)
				return false;
		} else if (!os.equals(other.os))
			return false;
		if (Double.doubleToLongBits(systemMemory) != Double.doubleToLongBits(other.systemMemory))
			return false;
		return true;
	}

}
