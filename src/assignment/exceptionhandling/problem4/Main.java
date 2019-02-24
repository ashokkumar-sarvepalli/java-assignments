package assignment.exceptionhandling.problem4;


import java.io.*;
public class Main {
	public static void main(String args[])throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the invoice number :");
		String invoiceNumber = buf.readLine();
		System.out.println("Enter the total invoice amount :");
		Double totalAmount = Double.parseDouble(buf.readLine());

		//fill the code

		System.out.println("Enter the credit card number :");
		String cardNumber = buf.readLine();
		System.out.println("Enter the credit limit :");
		Double cardLimit = Double.parseDouble(buf.readLine());

		//fill the code
	
		String ch;
		try {
			do{
				System.out.println("Do you want to process invoice payment?(yes/no)");
				ch = buf.readLine();
				System.out.println("Enter the amount :");
				Double amount = Double.parseDouble(buf.readLine());
				
				//fill the code
				
			}while(ch.equalsIgnoreCase("yes"));
		}catch(Exception e){
			System.out.println("Exception occured :"+e.toString());
		}
	}
}
