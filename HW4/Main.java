package Hotel;
import java.util.Random;
import java.util.Scanner;
public class Main {
	public static int OrderAdmin(HotelRoom[] rooms, int[] roomnum, int occupied) {
		int i = 0, choice;
		char again = 1;
		Scanner obj = new Scanner(System.in);
		Random r = new Random();
		for(;i<100 && again == 1;i++) { //as long as again is 1 the loop will continue

		System.out.println("Enter which room to get:"); //user picks room
		System.out.println("1 - Standard\n2 - Family\n3 - Sweet\n4 - Deluxe\n5 - Return to main administration menu");
		do {
			
			choice = obj.nextInt();
			switch(choice) {
			case 1:
				rooms[i] = new Standard();
				break;
			case 2:
				rooms[i] = new Family();
				break;
			case 3:
				rooms[i] = new Sweet();
				break;
			case 4:
				rooms[i] = new Deluxe();
				break;
			case 5:
				again = 0;
				return occupied; //returns the number of occupied rooms
			}
			if(choice > 5 || choice < 1)//if user picked invalid number
			{
				System.out.println("invalid choice.");
			}
			if(choice != 5)//AKA user didn't ask to stop
			{
				roomnum[i] = r.nextInt(100);
				for(int j =0; j< occupied;j++) {//Check if room number exists
					if(roomnum[j] == roomnum[i])//If yes
					{
						roomnum[i] = r.nextInt(100); //new number
						j = 0;//recheck again in number array!
					}
				}
				occupied++;
				rooms[i].SetNum(++roomnum[i]); //Set room number
				System.out.println("Your room number is "+rooms[i].GetNum()+". Here's your key."); //Tell user their room number
			}
		}while(choice > 5 || choice < 1);
		
	}
		return occupied; //For the compiler to shut up
		}
	public static void RoomAdmin(HotelRoom[] rooms, int[] roomnum, int occupied) {
		if(occupied == 0) { //If there are no rooms there's nothing to administrate!
			System.out.println("No rooms were occupied yet!\n");
			return;
		}
		Scanner obj = new Scanner(System.in);
		int choice, room;
		System.out.println("<~~ Hotel Administration ~~>"); //Hotel administration
		System.out.println("============================");
		for(int i =0;i<occupied;i++)//Printing details of every room
		{//Details about every room in the hotel.
			System.out.println("Room number "+rooms[i].GetNum()+"\nRoomType: "+rooms[i].GetType()+
					"\nCleaned: "+rooms[i].Clean()+"\nFixed: "+rooms[i].Fixed()+"\nCapacity: "+rooms[i].GetMax()+"\n"); 
		}
		for(;;) {
			do {
				System.out.println("Enter a room number from the list above. (-1 to exit administration): ");
				room = obj.nextInt();	
				if(room == -1)
					return; //if choice was -1 go back to main menu
				for(int j = 0;j<occupied;j++) //Checking if the room exists
				{
					if (roomnum[j] == room)
					{
						System.out.println("Choose:\n1 - Send Cleaner to a room\n2 - Send fixing\n3 - Exit Administration");
						do {
							choice = obj.nextInt();
							switch(choice) {
							case 1:
								rooms[j].SendCleaner(); //Sending cleaner to the exact room and notifying about it.
								System.out.println("Sending Cleaner to Room ("+rooms[j].GetType()+") no. "+rooms[j].GetNum());
								break;
							case 2:
								rooms[j].SendFix();rooms[j].SendCleaner(); //Sending fixer to the exact room and notifying about it.
								System.out.println("Sending Fixer to Room ("+rooms[j].GetType()+") no. "+rooms[j].GetNum());
								break;
							case 3:
								return; //Finish main aka exit program
							}	
						}while(choice < 1 || choice > 3);
					}
				}
			}while (room > 100 || room < 1); //If room number invalid repeat
	}
}
	public static void main(String[] args) {
		int choice, occupied = 0; //occupied rooms
		Scanner ch = new Scanner(System.in);
	HotelRoom[] rooms = new HotelRoom[10]; //Array of hotel rooms
	int[] roomnum = new int[10]; //Array of hotel room numbers
	System.out.println("Welcome to the worst hotel in the world");
	for(;;) {
		do {
			System.out.println("Choose what you wanna do:\n1 - Order System\n2 - Administration System\n3 - Exit");
			choice = ch.nextInt();
		}while(choice < 1 || choice > 3);
		switch(choice) {
		case 1:
			occupied = OrderAdmin(rooms,roomnum, occupied); //returns amount of occupied rooms!
			break;
		case 2:
			RoomAdmin(rooms,roomnum, occupied);
			break;
		case 3:
			System.out.println("Bye.");
			return;
			
		}
	}
	
}
}


