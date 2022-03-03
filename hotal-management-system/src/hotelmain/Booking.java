package hotelmain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Booking {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public Rooms room;
	public Date checkIn;
	public Date checkOut;
	public int personOfReservation;
	public float reservationCost;
	public User user;
	
	
	public Booking(String checkIn,String checkOut,int roomNumber,int personOfReservation,float reservationCost,String username) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		this.checkIn = sdf.parse(checkIn);
		this.checkOut = sdf.parse(checkOut);
		this.room = Data.findWithRoomNumber(roomNumber);
		this.personOfReservation = personOfReservation;
		this.reservationCost = reservationCost;
		if(Authentication.findUserWithUsername(username) != null) {
			this.user = Authentication.findUserWithUsername(username);
		}else {
			//this.user = new User("UnRegisteredUsers", "------");
		}
		
	}
	public String toString() {
		return sdf.format(checkIn) + ";" + sdf.format(checkOut) + ";" + String.valueOf(room.getRoomNumber()) + ";" + String.valueOf(personOfReservation) + ";" + String.valueOf(reservationCost)+";"+ user.getUsername() + "\n" ;
	}
	
}
