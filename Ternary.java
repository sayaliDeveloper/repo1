package start;

public class Ternary {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=3, b=7, c=21, d;
       
        
        d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        System.out.println("largest number is :" +d);
	}

}