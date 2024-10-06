package Hotel_Management;

public class StandardRoom extends Room {
	
	private boolean ac_availability;
	
	public StandardRoom(String roomId, int roomNum, double roomFare, boolean ac_availability) {
		
		super(roomId, roomNum, roomFare);
		this.ac_availability = ac_availability;
	}
	
	@Override
	void roomInfo() {
		System.out.println("Standard Room Info    ");
		System.out.println("Room Id              : "+super.getRoomId());
		System.out.println("Room Number          : "+super.getRoomNum());
		System.out.println("Room Fare            : "+super.getRoomFare());
		System.out.println("Room Ac Availability : "+this.ac_availability);
		System.out.println();
	}

}
