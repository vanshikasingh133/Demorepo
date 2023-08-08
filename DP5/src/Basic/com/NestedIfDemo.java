package Basic.com;

public class NestedIfDemo {

	public static void main(String[] args) {
         int marks=80;
         if(marks>70)
         {
        	 if(marks>75)
        	 {
        		 System.out.println(marks+":"+ " You can choose both science and commerce stream");
        	 }
        	 else
        	 {
        		 System.out.println(marks+":"+ "You can choose humanities");
        	 }
         }
         else 
         {
        	 System.out.println("Not eligible");
         }
	}

}
