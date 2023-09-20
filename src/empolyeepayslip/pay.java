package empolyeepayslip;
import java.util.Scanner;

public class pay {
	



	

	public class Payslip {



		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);

			System.out.print("Enter the employee number: ");

			int employeeNo = scanner.nextInt();

			scanner.nextLine();

			

			System.out.print("Enter the employee's name: ");

			String employeeName = scanner.nextLine();

			

			System.out.print("Enter the employee's designation: ");

			String employeeDesignation = scanner.nextLine();

			

			System.out.print("Enter the days worked: ");

			int daysWorked = scanner.nextInt();

			

			System.out.print("Enter the pay rate: ");

			int payRate = scanner.nextInt();


			String dates = "12/7/2017";

			scanner.nextLine();

			int basicPay = daysWorked*payRate;

			int pf = basicPay/10;

			final double profTax = basicPay*0.2;

			double totalDeductions = pf + profTax;

			double netPay= basicPay - totalDeductions;

			

			System.out.println("                   SHREE KRISHNA CHEMISTS AND DRUGGISTS      ");

			System.out.println("                         SALARY MONTH 9 2013                   ");

			System.out.println("Emp. No.: " + employeeNo + "              Emp. Name:" + employeeName + "          DESIGNATION: " + employeeDesignation);

			System.out.println("DAYS WORKED: " + daysWorked + "          PAY RATE: " + payRate + "             GEN. DATE: " + dates);

			System.out.println("__________________________________________________________________________");

			System.out.println("EARNINGS          AMOUNT(RS.)         DEDUCTIONS           AMOUNT(RS.)");

			System.out.println("__________________________________________________________________________");

			System.out.println("BASIC PAY         " + basicPay + "               P.F.                 " + pf );

			System.out.println("                                      PROF. TAX              " + profTax );

			System.out.println("__________________________________________________________________________");

			System.out.println("GROSS EAERN:      " + basicPay + "               TOTAL DEDUCT.        " + totalDeductions);

			System.out.println("                                      NET PAY              " + netPay);

			System.out.println("_________________________________________________________________________");

			

			

			



		}



	}



}
