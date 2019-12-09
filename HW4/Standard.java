package Hotel;

public class Standard extends HotelRoom implements Hotel{
	public Standard() {
		this.SetType("Standard"); //sets the type as standard
		this.SetMax(4); //max 4 ppl for standard
	}

}
