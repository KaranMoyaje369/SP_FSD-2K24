package Hotel_Management;

public class HotelMain {

	public static void main(String[] args) {


	DeluxeRoom deluxeRoom = new DeluxeRoom("delux-12", 11, 1200.50, false, 35.25);
	deluxeRoom.roomInfo();
	
	StandardRoom standardRoom = new StandardRoom("standard-12", 22, 1000.50, true);
	standardRoom.roomInfo();
	
	Customer customer = new Customer("custm 1", "Karan M", "123456", standardRoom);
	customer.show();

	}

}


// Output : 


// Room Ac Availability : true

// Customer Info         
// Customer Id          : custm 1
// Customer Name        : Karan M
// Customer Contact No. : 123456
// Customer Room ID     : standard-12



