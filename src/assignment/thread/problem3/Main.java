package assignment.thread.problem3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String args[]) throws IOException, InterruptedException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of notification:");
        int numberOfMsg = Integer.parseInt(reader.readLine());
        List<String> notification = new ArrayList<String>();
        for(int i=0;i<numberOfMsg;i++) {
            
            String line = reader.readLine();
            notification.add(line);
        }
        
        System.out.println("Enter number of threads:");
        int numberOfThreads = Integer.parseInt(reader.readLine());
        
        Thread[] threads = new Thread[numberOfThreads];
       
       
        //fill your code here!!!
    }

}
