import java.util.*;
public interface IComputeWage {
   public void addCompanyEmpWage(String companyName,int empRatePerHour,int workingDays,int maxHoursPerMonth);
   public void computeEmpWage();
   public int getTotalWage(String companyName);
}

public class CompanyEmpWage {

   public final String companyName;
   public final int empRatePerHour;
   public final int workingDays;
   public final int maxHoursPerMonth;
   public int totalEmpWage;
public CompanyEmpWage(String companyName,int empRatePerHour,int workingDays,int maxHoursPerMonth) {
      this.companyName=companyName;
      this.empRatePerHour=empRatePerHour;
      this.workingDays=workingDays;
      this.maxHoursPerMonth=maxHoursPerMonth;
      }
public void setTotalEmpWage(int totalEmpWage) {
   this.totalEmpWage = totalEmpWage;
}

public String toString(){
      return "Total Empwage for company " +companyName+":"+totalEmpWage;
   }
}

public class empWage implements IComputeWage{
	public static final int partTime=0;
	public static final int fullTime=1;
	private ArrayList<CompanyEmpWage> empList;
	private Map<String,CompanyEmpWage> empWageMap;
	public empWage() {
		empList=new ArrayList<>();
		empWageMap=new HashMap<>();
	}
	@Override
	public void addCompanyEmpWage(String companyName, int empRatePerHour, int workingDays, int maxHoursPerMonth) {
		CompanyEmpWage empwage=new CompanyEmpWage(companyName,empRatePerHour,workingDays,maxHoursPerMonth);
		empList.add(empwage);
		empWageMap.put(companyName,empwage);
	}

	@Override
	public void computeEmpWage() {
		for(int i=0;i<empList.size();i++) {
			empList.get(i).setTotalEmpWage(this.computeEmpWage(empList.get(i)));
			System.out.println(empList.get(i));
		}

	}
	@Override
	public int getTotalWage(String companyName) {
		return empWageMap.get(companyName).totalEmpWage;
	}

	private  int computeEmpWage(CompanyEmpWage companyEmpWage) {
		int empHours=0, totalEmpHours=0, totalWorkingDays=0;
		 while(totalEmpHours<=companyEmpWage.maxHoursPerMonth && totalWorkingDays<companyEmpWage.workingDays){
             int empCheck = (int) Math.floor(Math.random() * 10) % 3;
               switch(empCheck){
               case partTime:
                       empHours=4;
                       break;
               case fullTime:
                       empHours=8;
                       break;
               default :
                       empHours=0;
               }
               totalEmpHours+=empHours;
               totalWorkingDays+=1;
               }
		  return (totalEmpHours*companyEmpWage.empRatePerHour);

	}
	public static void main(String args[]) {
		IComputeWage empWage1=new empWage();
		empWage1.addCompanyEmpWage("google", 15, 21, 80);
		empWage1.addCompanyEmpWage("microsoft", 15, 18, 100);
		empWage1.computeEmpWage();
		System.out.println("Total wage for google company: "+empWage1.getTotalWage("google"));
	}

}
