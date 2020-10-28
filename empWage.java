class Empwage {
   public static void main(String[] args){
   System.out.println("Employee Wage Computation Problem");
      final int fullTime = 1;
      final int partTime=0;
      final int empRate=20;
		int totalDays=0;
		int totalHours=0;
      int empHrs;
      int empWage=0;
		int totalWage=0;
		while(totalDays<20 && totalHours<100) {
		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
      switch (empCheck)
			{
        case fullTime:
          	System.out.println("Full time Employee");
          	empHrs=8;
        break;
        case partTime:
          	System.out.println("Part time Employee");
          	empHrs=4;
        break;
        default:
          System.out.println("Employee is absent");
          empHrs=0;
		 break;
         }
         empWage=empHrs*empRate;
			totalWage=empWage+totalWage;
			totalDays++;
			totalHours=totalHours+empHrs;
        }
			System.out.println("Total Employee Wage:" +totalWage);
        }
}

