package Hotel;

public interface Hotel {
	public void SetNum(int a); //set room number
	public void SetOccupy(boolean a);//Occupying setter
	public void SetPpl(int a);//People setter
	public void SetType(String a); //People setter
	public void SetMax(int a); //Setter for max people per room
	public int GetNum(); //Get room number
	public int GetPpl(); //People getter
	public boolean GetOccupy(); //Occupation getter
	public String GetType(); //Type getter
	public int GetMax(); //max ppl getter
	public void SendCleaner(); //sending cleaner
	public void SendFix(); //Sending fixer
	public void CheckRoomType(); //checks a room type
	public void CheckOccupancy(); //checks if a room is occupied
	}

