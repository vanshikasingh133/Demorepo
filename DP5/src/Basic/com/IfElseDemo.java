package Basic.com;

public class IfElseDemo {
	
	public static void main(String[] args) {
		
		double per=75;
		char grade;
		
		if(per>=90)
			grade='A';
		else if (per>=80)
			grade='B';
		else if (per>=70)
			grade='C';
		else if (per>=60)
			grade='D';
		else
			grade='E';
		
		System.out.println(per+":"+grade);
		
	}
}
