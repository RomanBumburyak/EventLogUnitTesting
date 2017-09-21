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
        Event eventEins = new Event();
        Event eventZwei = new Event();
        Event eventDrei = new Event();

        EventLog eventLogEins = new EventLog;
        assertEquals(eventLogEins.addEvent(eventEins), true);
        assertEquals(eventLogEins.addEvent(eventZwei), true);
        assertEquals(eventLogEins.addEvent(eventDrei), false);

    }


    @Test
    public void getNumEvents() throws Exception {

    }

}