import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EventLogTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void addEvent() throws Exception {
        Event eventEins = new Event("PhoneOpt", "PhoneCall");
        Event eventZwei = new Event("Walk", "20k");
        Event eventDrei = new Event("Jog", "15k");
        Event eventVier = new Event(null, null);
        
        EventLog eventLogEins = new EventLog();
        assertEquals(eventLogEins.addEvent(eventEins), true);   //I have my assert equals, so I don't need a try catch rn.
//        assertEquals(eventLogEins.addEvent(eventZwei), true);
//        assertEquals(eventLogEins.addEvent(eventDrei), true);

        try {
            eventLogEins.addEvent(eventVier);
            fail("Should never reach this");

        } catch (Exception ex) {
            assertTrue(true);
        }

        try{
            eventLogEins.addEvent(eventZwei);
            fail("Should never reach this");
        }
        catch (Exception ex) {
            assertTrue(true);
        }

        try {
            eventLogEins.addEvent(eventDrei);
            fail("Should Never Reach This");
        } catch (Exception ex) {
            assertTrue(true);
        }


    }


    @Test
    public void getNumEvents() throws Exception {

    }

    @Test
    public void truthTest() throws Exception {
        Event eventVier = new Event("Video Chat", "Face2Face");

    }
}