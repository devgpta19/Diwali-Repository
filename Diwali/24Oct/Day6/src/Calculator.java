import java.util.Scanner;

import com.demo.exceptions.WrongOperatorException;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int a = sc.nextInt();
		System.out.println("Enter First Number");
		int b = sc.nextInt();
		
		String ch;
		System.out.println("Enter Operation \n Select from + , - , / , * , % ");
		ch = sc.next();
		
		try {
		    calculate(a, b, ch);  
		} catch (WrongOperatorException e) {
		    System.out.println("Caught Custom Exception: " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void calculate(int a, int b, String ch) throws WrongOperatorException {
		// TODO Auto-generated method stub
		
		switch(ch) {
		case "+"->{
			System.out.println(a+"+"+b+"="+(a+b)); 
		}
		case "-"->{
			System.out.println(a+"-"+b+"="+(a-b)); 
		}
		case "/"->{
			System.out.println(a+"/"+b+"="+(a/b)); 
		}
		case "*"->{
			System.out.println(a+"*"+b+"="+(a*b)); 
		}
		case "%"->{
			System.out.println(a+"%"+b+"="+(a%b)); 
		}
		default -> {
            throw new WrongOperatorException("Invalid operator provided: '" + ch + "'. Valid operators are +, -, *, /, %.");
        }
		}
	}

}
