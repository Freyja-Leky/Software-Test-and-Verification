import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class HotelWorldClocksTest {
    private HotelWorldClockSystem hotelWorldClockSystem;
    private PhoneClock phoneClock;

    @Before
    public void initialize() {
        this.hotelWorldClockSystem = new HotelWorldClockSystem();
        this.phoneClock = new PhoneClock(8);
    }

    @Test
    public void the_time_of_clock_London_should_be_1_after_the_phone_clock_is_set_to_9() {
        CityClock londonClock = new CityClock(0);
        hotelWorldClockSystem.attach(londonClock);
        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(9);
        assertEquals(1, londonClock.getTime());
    }

    @Test
    public void the_time_of_clock_Sydney_should_be_15_after_the_phone_clock_is_set_to_9() {
        CityClock SydneyClock = new CityClock(-10);
        hotelWorldClockSystem.attach(SydneyClock);
        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(9);
        assertEquals(15, SydneyClock.getTime());
    }
    
    public void the_time_of_clock_NewYork_should_be_20_after_the_phone_clock_is_set_to_9() {
        CityClock newYorkClock = new CityClock(-5);
        hotelWorldClockSystem.attach(newYorkClock);
        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(9);
        assertEquals(20, newYorkClock.getTime());
    }

    @Test
    public void the_time_of_clock_Moscow_should_be_5_after_the_phone_clock_is_set_to_9() {
        CityClock moscowClock = new CityClock(4);
        hotelWorldClockSystem.attach(moscowClock);
        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(9);
        assertEquals(5, moscowClock.getTime());
    }
      
    @Test
    public void the_time_of_the_phone_clock_should_be_9_after_its_setTime_is_9() {
        phoneClock.setTime(9);
        assertEquals(9, phoneClock.getTime());
    }
}
