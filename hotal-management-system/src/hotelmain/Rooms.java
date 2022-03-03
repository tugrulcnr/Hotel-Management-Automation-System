package hotelmain;



public class Rooms {
	
	private int numberOfPerson;
	private int roomNumber;
        public static int roomSize = 0;
	
	// -1 = single, 0 = double , 1 = tripple
	private int roomType;
        private float amount;
	
	public Rooms(int numberOfPerson,int roomNumber, int roomType,float amount) {
		this.roomNumber = roomNumber;
		this.numberOfPerson = numberOfPerson;
		roomSize++;
		this.roomType = roomType;
                this.amount=amount;
                
	}
	
	public int getNumberOfPerson() {
		return this.numberOfPerson;
	}
	public int getRoomNumber() {
		return this.roomNumber;
	}
	
	public int getRoomType() {
		return this.roomType;
	}
        public float getAmount() {
		return this.amount;
	}
	public String toString() {
		String str = String.valueOf(this.numberOfPerson) + ";" + String.valueOf(this.roomNumber)  + ";" + String.valueOf(roomType) +";" + String.valueOf(amount)+ "\n" ;
		return str;
	}


}
