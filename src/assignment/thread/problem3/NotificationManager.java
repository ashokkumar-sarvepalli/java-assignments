package assignment.thread.problem3;



import java.util.HashMap;
import java.util.Map;


public class NotificationManager {

    static NotificationManager instance;
    static Map<Integer,String> messages = new HashMap<Integer,String>();
    
    static {
        
        messages.put(100,"Arrived at destination");
        messages.put(101,"Attempted delivery");
        messages.put(102,"Awaiting unloading at consignee");
        messages.put(103,"Delayed en route to destination");
        messages.put(104,"Delivered part short");
        messages.put(105,"En route to destination");
        messages.put(106,"En route to Hawaii");
        messages.put(107,"Late but no possible delay notification sent");
        messages.put(108,"Out for delivery");
        
    }
    
    private NotificationManager() {
        
    }
    
    public static NotificationManager getInstance() {
        if(instance == null) {
            instance = new NotificationManager();
        }
        return instance;
    }
    
    public void sendMessage(String number,Integer code) {
        System.out.println("Sending SMS TO "+number+" MSG:"+messages.get(code));
    }
}
