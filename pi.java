import java.util.Scanner;

public class pi {
	static double getpi(double largeNumber){
		double pi = (double) 0.0;
		for(double i=0;i<=largeNumber;i++){
			pi+= (double)((1/(Math.pow(16, i)))*((4/((8*i)+1))-(2/((8*i)+4))-(1/((8*i)+5))-(1/((8*i)+6))));
		}
		return pi;
		
	}
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String response;
		while(true){
			System.out.println("Please enter a number until which you would like to compute pi (Integer)");
			double largeInt = keyboard.nextInt();
			System.out.println(getpi(largeInt));
			while(true){
				System.out.println("Would you like to compute pi to another accuracy? (Y/N)" );
				response = keyboard.next();
				if(response.equals("Y")||response.equals("y")||response.equals("N")||response.equals("n")){
					break;
				}
				System.err.println("Please enter a valid input");
			}
			if(response.equals("N")||response.equals("n")){
				System.err.println("Program has ended");
				System.exit(0);
				
			}
			
		}
		
	}

}
