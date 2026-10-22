import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner (System.in);
	    System.out.println("Enter the value of a");
	    int a = input.nextInt();
	    System.out.println("Enter the value of b");
        int b = input.nextInt();
	    System.out.println("Enter the value of c");
	    int c = input.nextInt();
	    
	    int max = 0;
	    if(a>b){
	        max = a;
        System.out.println("maximum value is a="+a);
        
	        
	    }
	   else if(c>b){
	    max=c;
	    System.out.println("maximum value is c="+c);
	        
	    }
	    else {
	        max = b;
	        System.out.println("maximum value is b="+b);
	    }
	        
	        
	    
	  
	}
	    
		
}