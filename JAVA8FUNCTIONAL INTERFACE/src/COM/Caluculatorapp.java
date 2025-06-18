       package COM;

       public class Caluculatorapp {
	   public static void main(String[] args) {
		      //lambda for addition
		   Calculator add = (a, b) -> a + b;
		     // lambda for subtraction
		   Calculator subtract = (a, b) -> a - b;
		   // Lambda for multiplication
	        Calculator multiply = (a, b) -> a * b;

	        // Lambda for division
	        Calculator divide = (a, b) -> {
	            if (b == 0) {
	                System.out.println("Cannot divide by zero");
	                return 0;
	            }
	            return a / b;
	        };
	     // Testing operations
	        System.out.println("Add: " + add.operation(10, 5));
	        System.out.println("Subtract: " + subtract.operation(10, 5));
	        System.out.println("Multiply: " + multiply.operation(10, 5));
	        System.out.println("Divide: " + divide.operation(10, 5));
	}

}
