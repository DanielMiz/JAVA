package Hotel;

public class Family extends HotelRoom implements Hotel{
	public Family() {
		this.SetType("Family"); //Sets type as family
		this.SetMax(6); //Set max ppl to 6
	}

}