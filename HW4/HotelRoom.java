package Hotel;
import java.util.Random;
import java.util.Scanner;
public class HotelRoom implements Hotel { //Hotel class that implements all required functions for a hotel room
		Scanner obj = new Scanner(System.in);
		public int choice; //choice from user. no need to set as private
		private int num;
		private int max; //max ppl per room
		private String type; // type of a room
		private boolean occupied; //Is the room occupied?
		private int people; //How many people are staying?
		private boolean isClean = true;//Has to be true - if not clean then it cannot be occupied
		private boolean isFixed = true;//Has to be true - if not fixed then it cannot be occupied
		public HotelRoom() {
			
		}
		public void SetNum(int a) {
			this.num = a;
		}
		public void SetOccupy(boolean a) {//Occupying setter
			this.occupied = a;
		}
		public void SetPpl(int a) { //People setter
			this.people = a;
		}
		public void SetType(String a) { //People setter
			this.type = a;
		}
		public void SetMax(int a) {
			this.max = a;
		}
		public int GetNum() {
			return this.num;
		}
		public int GetPpl() { //People getter
			return this.people;
		}
		public boolean GetOccupy() { //Occupation getter
			return this.occupied;
		}
		public String GetType() { //Type getter
			return this.type;
		}
		public int GetMax() { //max ppl getter
			return this.max;
		}
		public boolean Clean() {
			return this.isClean;
		}
		public boolean Fixed() {
			return this.isFixed;
		}
		public void SendCleaner() { //sending cleaner
			System.out.println("Cleaner on her way!");
			this.isClean = true;
		}
		public void SendFix() { //Sending fixer
			System.out.println("Fixer is on his way!");
			this.isClean = true;
		}
		public void CheckRoomType() { //checks a room type
			System.out.println("This room is a "+this.type+".\n"+this.type+" rooms can be occupied by a maximum of "+this.max+"People.");
		}
		public void CheckOccupancy() { //checks if a room is occupied
			System.out.println("This room is"+this.occupied);
		}
		
		
}



