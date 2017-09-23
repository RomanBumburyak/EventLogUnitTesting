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


    ///Throw an IllegalArgumentException if the event parameter is null or if either if the two variables of event are null.
    public boolean addEvent(Event event) throws IllegalArgumentException {
       if (event == null){
            throw new IllegalArgumentException(); /// throw the exception higher, in orger to throw you also need to catch.
       } else if (event.getName() == null ) {
           throw new IllegalArgumentException(); /// throw the exception higher, in orger to throw you also need to catch.
       } else if (event.getAction() == null ) {
           throw new IllegalArgumentException();
       } else if(event.getAction() != "Face2Face"){
        throw new IllegalArgumentException();
        }
        else if (event.getAction() != "PhoneCall") {
           throw new IllegalArgumentException();
       }
       else if (event.getAction() != "TextMessaging"){
           throw new IllegalArgumentException();
       }
       else if (event.getAction() != "Unknown"){
           throw new IllegalArgumentException();
       }

       try {

       }

       catch ("ExceptionHere name") {



       }

       eventList.add(event);
        System.out.println("This is the next event " + event);            ///The return value from the addEvent method should be true.
        return true;




    }


    public int getNumEvents () {   ///should returns the size of the list



        return eventList.size();
    }



    public EventLog () {
        eventList = new ArrayList<>();
    }












}
