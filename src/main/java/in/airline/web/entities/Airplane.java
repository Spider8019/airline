package in.airline.web.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Airplane {

	@Id
	private String modelNumber;
	private String registrationNumber;
	private int capacity;

	public Airplane() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Airplane(String modelNumber, String registrationNumber, int capacity) {
		super();
		this.modelNumber = modelNumber;
		this.registrationNumber = registrationNumber;
		this.capacity = capacity;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Airplane [modelNumber=" + modelNumber + ", registrationNumber=" + registrationNumber + ", capacity="
				+ capacity + "]";
	}

}
