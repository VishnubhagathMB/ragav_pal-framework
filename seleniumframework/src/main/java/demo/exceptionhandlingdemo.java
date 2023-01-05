package demo;

public class exceptionhandlingdemo {

	public static void main(String[] args) {
		try {
		demo();
	}
		catch ( Exception e) {
			e.printStackTrace();
		}
	
		}
		public static void demo() throws Exception{
			
		//try {
		System.out.println("hello world");
		throw new ArithmeticException("not valid operation");
		//int i = 1/0;
		//System.out.println("completed");
		}
		//catch(Exception exp) {
			//System.out.println("i am inside catch block");
			//System.out.println("message is:" + exp.getMessage());
			//System.out.println("cause is:" + exp.getCause());
			//exp.printStackTrace();
		//}
		
		//finally {
			//System.out.println("i am inside fnally");
		//}
}
