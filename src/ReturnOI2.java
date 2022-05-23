import java.util.Scanner;

public class ReturnOI2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter Cost of manual testing ");
		double manualTestingCost=scan.nextInt();
		System.out.println("Enter Cost of automation development ");
		double automationDevelopmentCost=scan.nextInt();
		System.out.println("Enter Cost of automation testing ");
		double automationTestingCost=scan.nextInt();
		
		calculateROI(manualTestingCost,automationDevelopmentCost,automationTestingCost);
		
	}

	private static void calculateROI(double manualTestingCost, double automationDevelopmentCost, double automationTestingCost) {
		double roi=0;
		double result=0;
		double netProfit=0;
		double automationCost=0;
		
		automationCost=automationDevelopmentCost+automationTestingCost;
		
		netProfit=manualTestingCost-automationCost;
		
		result=netProfit/automationCost;
		roi=result*100;
		System.out.println(roi+"%");
		
	}

}
