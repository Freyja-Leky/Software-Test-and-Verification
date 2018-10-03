import java.util.ArrayList;

public class HotelWorldClockSystem {
	private ArrayList<CityClock> cityclocks=new ArrayList<CityClock>();
	
	public void attach(CityClock cityclock) {
		this.cityclocks.add(cityclock);
	}
	
	public ArrayList<CityClock> getClocks(){
		return this.cityclocks;
	}
}
