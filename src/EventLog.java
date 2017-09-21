import java.util.ArrayList;
import java.util.List;

public class EventLog {





//    Write the EventLog class with the following method variables and methods:
//
//    private List<Event> eventList
//    public boolean addEvent(Event event)
//    public int getNumEvents () which returns the size of the list
//    public EventLog () which initializes the list

//    use this example:
//    Set<Student> studious : hmapForTeacher.values

    private List<Event> eventList;


    public boolean addEvent(Event event) {         ///Throw an IllegalArgumentException///
        return true;
    }


    public int getNumEvents () {   ///should returns the size of the list
        return eventList.size();
    }



    public EventLog () {
        eventList = new ArrayList<>();
    }












}
