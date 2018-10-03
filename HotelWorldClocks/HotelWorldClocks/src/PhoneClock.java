
public class PhoneClock extends Clock {
	private HotelWorldClockSystem hotelWordlClockSystem;
	private int time;
	
	public PhoneClock(int utcOffset) {
		super.utcOffset=utcOffset;
	}
	
	public void setTime(int time) {
		this.time=time;
		if (this.hotelWordlClockSystem==null)
			return;
		for (CityClock cityClock:this.hotelWordlClockSystem.getClocks())
		{
			cityClock.setUtcZeroTime(time-super.utcOffset);
		}
	}
	
	public void setHotelWorldClockSystem(HotelWorldClockSystem hotelWorldClockSystem) {
		this.hotelWordlClockSystem=hotelWorldClockSystem;
	}
	
	@Override
	public int getTime() {
		return this.time;
	}

}
