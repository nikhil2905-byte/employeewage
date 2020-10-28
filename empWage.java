class Empwage {
   public static void main(String[] args){
   System.out.println("Employee Wage Computation Problem");
		int present = 1;
		int absent = 0;
		double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == present) {
        	System.out.println("Employee is Present.");
			}
        else {
        	System.out.println("Employee is Absent.");
			}

		}
}
