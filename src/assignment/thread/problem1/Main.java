package assignment.thread.problem1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String args[]) throws IOException, InterruptedException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of Cargo:");
        int numberOfCargo = Integer.parseInt(reader.readLine());
        
        System.out.println("Enter cargo details (id,length,width,weight,cargo type,storage type):");
        List<Cargo> cargoList = new ArrayList<Cargo>();
        for(int i=0;i<numberOfCargo;i++) {
            cargoList.add(new Cargo(reader.readLine()));
        }
        
       //fill in your code here
       
        
    }
    
    public static void displayPrice(List<Double> list) {
        //fill in your code
    }
}
