class Empwage {
   public static void main(String[] args){
   System.out.println("Employee Wage Computation Problem");
      final int fullTime = 1;
      final int partTime=2;
      final int wagePerHour=20;
      int empCheck = (int) Math.floor(Math.random() * 10) % 3;
      int empHrs=0;
      int salaryPerDay=0;
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
          System.out.println("Employee is Absent");
          empHrs=0;
         }
         salaryPerDay = (empHrs*wagePerHour);
         System.out.println(salaryPerDay);

      }
}

