package payrollsystemcsv;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class PayrollSystemCSV {

    static final String EMPLOYEE_FILE = "employees.csv";
    static final String PAYROLL_FILE = "payroll.csv";
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n==========================");
            System.out.println(" PAYROLL SYSTEM (CSV-BASED)");
            System.out.println("==========================");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Process Payroll");
            System.out.println("4. View Payroll Records");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            String choice = input.nextLine();

            switch (choice) {
                case "1": addEmployee(); break;
                case "2": viewEmployees(); break;
                case "3": processPayroll(); break;
                case "4": viewPayrollRecords(); break;
                case "5":
                    System.out.println("Exiting Payroll System... Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    // ----------------------------
    // ADD EMPLOYEE
    // ----------------------------
    public static void addEmployee() {
        try (FileWriter fw = new FileWriter(EMPLOYEE_FILE, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {

            System.out.print("Enter Employee ID: ");
            String id = input.nextLine();
            System.out.print("Enter Name: ");
            String name = input.nextLine();
            System.out.print("Enter Position: ");
            String position = input.nextLine();
            System.out.print("Enter Hourly Rate: ");
            double hourlyRate = Double.parseDouble(input.nextLine());
            System.out.print("Enter Overtime Rate: ");
            double overtimeRate = Double.parseDouble(input.nextLine());

            File file = new File(EMPLOYEE_FILE);
            if (file.length() == 0) {
                out.println("employee_id,name,position,hourly_rate,overtime_rate");
            }

            out.println(id + "," + name + "," + position + "," + hourlyRate + "," + overtimeRate);
            System.out.println("✅ Employee added successfully!");

        } catch (IOException e) {
            System.out.println("Error adding employee: " + e.getMessage());
        }
    }

    // ----------------------------
    // VIEW EMPLOYEES
    // ----------------------------
    public static void viewEmployees() {
        try (BufferedReader br = new BufferedReader(new FileReader(EMPLOYEE_FILE))) {
            String line;
            System.out.println("\n--- Employee List ---");
            while ((line = br.readLine()) != null) {
                if (line.startsWith("employee_id")) continue;
                String[] data = line.split(",");
                System.out.printf("%s | %s | %s | Rate: %.2f%n",
                        data[0], data[1], data[2], Double.parseDouble(data[3]));
            }
        } catch (IOException e) {
            System.out.println("⚠️ No employees found.");
        }
    }

    // ----------------------------
    // PROCESS PAYROLL
    // ----------------------------
    public static void processPayroll() {
        System.out.print("Enter Employee ID: ");
        String empId = input.nextLine();

        String[] empData = findEmployee(empId);
        if (empData == null) {
            System.out.println("❌ Employee not found.");
            return;
        }

        System.out.print("Enter Hours Worked: ");
        double hoursWorked = Double.parseDouble(input.nextLine());
        System.out.print("Enter Overtime Hours: ");
        double overtimeHours = Double.parseDouble(input.nextLine());
        System.out.print("Enter Deductions: ");
        double deductions = Double.parseDouble(input.nextLine());

        double hourlyRate = Double.parseDouble(empData[3]);
        double overtimeRate = Double.parseDouble(empData[4]);

        double grossPay = (hoursWorked * hourlyRate) + (overtimeHours * overtimeRate);
        double netPay = grossPay - deductions;

        try (FileWriter fw = new FileWriter(PAYROLL_FILE, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {

            File file = new File(PAYROLL_FILE);
            if (file.length() == 0) {
                out.println("employee_id,hours_worked,overtime_hours,deductions,gross_pay,net_pay,pay_date");
            }

            out.println(empId + "," + hoursWorked + "," + overtimeHours + "," + deductions + ","
                    + grossPay + "," + netPay + "," + LocalDate.now());

            System.out.printf("✅ Payroll processed for %s%n", empData[1]);
            System.out.printf("   Gross Pay: ₱%.2f%n", grossPay);
            System.out.printf("   Net Pay:   ₱%.2f%n", netPay);

        } catch (IOException e) {
            System.out.println("Error writing payroll: " + e.getMessage());
        }
    }

    // ----------------------------
    // VIEW PAYROLL RECORDS
    // ----------------------------
    public static void viewPayrollRecords() {
        try (BufferedReader br = new BufferedReader(new FileReader(PAYROLL_FILE))) {
            String line;
            System.out.println("\n--- Payroll Records ---");
            while ((line = br.readLine()) != null) {
                if (line.startsWith("employee_id")) continue;
                String[] data = line.split(",");
                System.out.printf("%s | Date: %s | Net Pay: ₱%.2f%n",
                        data[0], data[6], Double.parseDouble(data[5]));
            }
        } catch (IOException e) {
            System.out.println("⚠️ No payroll records found.");
        }
    }

    // ----------------------------
    // FIND EMPLOYEE BY ID
    // ----------------------------
    private static String[] findEmployee(String empId) {
        try (BufferedReader br = new BufferedReader(new FileReader(EMPLOYEE_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("employee_id")) continue;
                String[] data = line.split(",");
                if (data[0].equals(empId)) {
                    return data;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading employee file.");
        }
        return null;
    }
}
