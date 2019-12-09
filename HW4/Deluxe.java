package Hotel;

public class Deluxe extends HotelRoom implements Hotel{
	public Deluxe() {
		this.SetType("Deluxe"); //Sets type as Deluxe
		this.SetMax(7); //Max 7 ppl for deluxe
	}

}