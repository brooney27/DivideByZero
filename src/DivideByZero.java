
public class DivideByZero {
	public static void main(String[] args){
		int a = 1;
		int b = 0;
		
		try{
			
			int c = a/b;
			System.out.println("" + c);
		}catch(ArithmeticException e){
			System.out.println("Can't divide by zero!");
		}catch(Exception e){
			System.out.println("Found a problem while dividing");
		}
	}
}
