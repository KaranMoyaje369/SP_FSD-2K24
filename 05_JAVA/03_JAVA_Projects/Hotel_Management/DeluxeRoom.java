package Hotel_Management;

public class DeluxeRoom extends StandardRoom{
	
	private double roomSize;

	public DeluxeRoom(String roomId, int roomNum, double roomFare, boolean ac_availability, double roomSize) {
		super(roomId, roomNum, roomFare, ac_availability);
		this.roomSize = roomSize;
	}
	
	
	@Override
	void roomInfo() {
		System.out.println("Deluxe Room Info      ");
		System.out.println("Room ID              : "+super.getRoomId());
		System.out.println("Room Number          : "+super.getRoomNum());
		System.out.println("Room Fare            : "+super.getRoomFare());
		System.out.println("Room Size            : "+ this.roomSize);
		System.out.println();
	}
	

}
