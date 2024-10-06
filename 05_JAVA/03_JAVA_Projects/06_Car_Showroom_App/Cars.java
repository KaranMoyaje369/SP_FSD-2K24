package Car_Showroom_App;

public class Cars extends Showroom {

	String carName;
	String carColor;
	String fuelType;
	double carPrice;
	String carType;
	String carTransmission;

	public void getDetails() {
		System.out.println("Car Name              : " + carName);
		System.out.println("Car Color             : " + carColor);
		System.out.println("Fuel Type             : " + fuelType);
		System.out.println("Car Price             : " + carPrice);
		System.out.println("Car Type              : " + carType);
		System.out.println("Car Transmission Type : " + carTransmission);
	}

	public void setDetails(String carName, String carColor, String fuelType, double carPrice, String carType,
			String carTransmission) {

		this.carName = carName;
		this.carColor = carColor;
		this.fuelType = fuelType;
		this.carPrice = carPrice;
		this.carType = carType;
		this.carTransmission = carTransmission;
	}
}
