/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author Ally
 */
public class JavaApplication5 {

    static  boolean loggedIn = false;
    /**
     * @param args the command line arguments
     */
    
          // TODO code application logic here
        
   
    public static void main(String[] args) {
        // Sample Employee data
    /*  String empNumber;
        String empLastName = "Garcia";
        String empFirstName = "Manuel III";
        String empDob = "10/11/1983";
        String address = "Valero Carpark Building Valero Street 1227, Makati City";
        String phoneNumber = "966-860-270";
        String sssNumber = "44-4506057-3";
        String philHealthNumber = "9820126853951";
        String tinNumber = "442-605-657-000";
        String pagIbigNumber = "691295330870";
        String empStatus = "Regular";
        String empPosition = "Chief Executive Officer";
    //  String password = "";
        
// Sample Payroll Information
        double basicSalary = 90000;
        double riceSubsidy = 1500;
        double phoneAllowance = 2000;
        double clothingAllowance = 1500;
        double semiMonthlyRate = 45000;
        double dailyRate = 535.71;
         
    */    
       loginPage();
        
    }    
        
        // log in page
        public static void loginPage() {  
            
            Scanner scan = new Scanner(System.in);
            
            System.out.println("=================================================");
            System.out.println("              MOTORPH PAYROLL SYSTEM");
            System.out.println("=================================================");
            System.out.print("User ID: ");
            String empNumber = scan.nextLine();
            System.out.print("Password: ");
            String password = scan.nextLine();
           
                if (password.equals("password")) {
                   mainMenu();
               } else {
                    System.out.println("Incorrect Password!!!");
                    loginPage();
               }
        }        
     
    // main menu
        public static void mainMenu(){
            int choice = -1;
            
            Scanner scan = new Scanner(System.in);
            
   
            while (choice != 0) {
                System.out.println("================================================");
                System.out.println("MOTORPH PAYROLL SYSTEM");
                System.out.println("================================================");
                System.out.println("[1] PROFILE");
                System.out.println("[2] PAYSLIP");
                System.out.println("[3] ATTENDANCE");
                System.out.println("[4] ADMIN [HR/PAYROLL/IT]");
                System.out.println("[0] Lgout");
                System.out.println("=================================================");
                System.out.println("ENTER SELECTION:  ");
                choice = scan.nextInt();
                scan.nextLine();

                    switch (choice){
                        case 1: profilePage(); break;
                        case 2: payslipPage(); break;
                        case 3: attendancePage(); break;
                        case 4: adminPage(); break;
                        case 0: System.out.println("Logging Out..."); break;
                        default: System.out.println("Invalid option!");
                    }
            
            }        
        }    
    //profilePage
        
        public static void profilePage(){
        // Sample Employee data
            String empNumber = "10000";
            String empLastName = "Garcia";
            String empFirstName = "Manuel III";
            String empDob = "10/11/1983";
            String address = "Valero Carpark Building Valero Street 1227, Makati City";
            String phoneNumber = "966-860-270";
            String sssNumber = "44-4506057-3";
            String philHealthNumber = "9820126853951";
            String tinNumber = "442-605-657-000";
            String pagIbigNumber = "691295330870";
            String empStatus = "Regular";
            String empPosition = "Chief Executive Officer";
            String password = "password";    
            Scanner scan = new Scanner(System.in);
            int choice = -1;
            
          
            while (choice != 0) {
                System.out.println("================================================");
                System.out.println("EMPLOYEE PROFILE");
                System.out.println("================================================");
                System.out.println("Employee ID:" + " " + empNumber);
                System.out.println("Employee Name: " + " " +empLastName + " " + empFirstName);
                System.out.println("Position:" + " " +empPosition);
                System.out.println("Department:");
                System.out.println("Birthday:" + " " + empDob);
                System.out.println("Address:" + " " + address);
                System.out.println("Phone Number:" + " " + phoneNumber);
                System.out.println("================================================");
                System.out.println("[1] Update User Information");
                System.out.println("[2] Change Password");
                System.out.println("[0] Back to Menu Page");
                choice = scan.nextInt();
                scan.nextLine();
                
                    if (choice == 1) {
                        System.out.println("Enter New Address : ");
                        address = scan.nextLine();
                        System.out.println("Enter New Phone Number : ");
                        phoneNumber = scan.nextLine();
                        System.out.println("Profile updated. ");
                    }else if (choice == 2) {
                        System.out.println("Simulated password reset functionality.");
                    }else if (choice == 0){
                        mainMenu();
                    } else {
                        System.out.println("Invalid Selection");
                    }       
                }   
        }
            
    //payslip
        public static void payslipPage() {
            
            Scanner scan = new Scanner(System.in);
        // Sample Payroll Information
            double basicSalary = 90000;
            double riceSubsidy = 1500;
            double phoneAllowance = 2000;
            double clothingAllowance = 1500;
            double semiMonthlyRate = 45000;
            double dailyRate = 535.71;
            int choice = -1; 
        
            //sss contribution computation
            double sssContribution = 0;
            
                if (basicSalary < 325.00){
                    sssContribution = 135.00;
                }else if (basicSalary <= 3649.99){
                    sssContribution = 157.00;
                }else if (basicSalary <= 4149.99){
                    sssContribution = 180.00;
                }else if (basicSalary <= 4649.99){
                    sssContribution = 202.50;
                }else if (basicSalary <= 5449.99){
                    sssContribution = 225.00;
                }else if (basicSalary <= 5649.99){
                    sssContribution = 147.50;
                }else if (basicSalary <= 6149.99){
                    sssContribution = 270.00;
                }else if (basicSalary <= 6649.99){
                    sssContribution = 292.50;
                }else if (basicSalary <= 7149.99){
                    sssContribution = 315.00;
                }else if (basicSalary <= 7649.99){
                    sssContribution = 337.50;
                }else if (basicSalary <= 8149.99){
                    sssContribution = 360.00;
                }else if (basicSalary <= 8649.99){
                    sssContribution = 382.50;
                }else if (basicSalary <= 9149.99){
                    sssContribution = 405.00;
                }else if (basicSalary <= 9649.99){
                    sssContribution = 427.50;
                }else if (basicSalary <= 10149.99){
                    sssContribution = 450.00;
                }else if (basicSalary <= 10649.99){
                    sssContribution = 472.50;
                }else if (basicSalary <= 11149.99){
                    sssContribution = 495.00;
                }else if (basicSalary <= 11649.99){
                    sssContribution = 517.50;
                }else if (basicSalary <= 12149.99){
                    sssContribution = 540;
                }else if (basicSalary <= 12649.99){
                    sssContribution = 562.50;
                }else if (basicSalary <= 13149.99){
                    sssContribution = 585.00;
                }else if (basicSalary <= 13649.99){
                    sssContribution = 605.50;
                }else if (basicSalary <= 14149.99){
                    sssContribution = 630.00;
                }else if (basicSalary <= 14649.99){
                    sssContribution = 652.50;
                }else if (basicSalary <= 15149.99){
                    sssContribution = 675.00;
                }else if (basicSalary <= 15649.99){
                    sssContribution = 698.50;
                }else if (basicSalary <= 16149.99){
                    sssContribution = 720.00;
                }else if (basicSalary <= 16649.99){
                    sssContribution = 742.50;
                }else if (basicSalary <= 17149.99){
                    sssContribution = 765.00;
                }else if (basicSalary <= 17649.99){
                    sssContribution = 787.50;
                }else if (basicSalary <= 18149.99){
                    sssContribution = 810.00;
                }else if (basicSalary <= 18649.99){
                    sssContribution = 832.50;
                }else if (basicSalary <= 19149.99){
                    sssContribution = 855.00;
                }else if (basicSalary <= 19649.99){
                    sssContribution = 877.50;
                }else if (basicSalary <= 20149.99){
                    sssContribution = 900.00;
                }else if (basicSalary <= 20649.99){
                    sssContribution = 922.50;
                }else if (basicSalary <= 21149.99){
                    sssContribution = 945.00;
                }else if (basicSalary <= 21649.99){
                    sssContribution = 967.50;
                }else if (basicSalary <= 22149.99){
                    sssContribution = 990.00;
                }else if (basicSalary <= 22649.99){
                    sssContribution = 1012.50;
                }else if (basicSalary <= 23149.99){
                    sssContribution = 1035.00;
                }else if (basicSalary <= 23649.99){
                    sssContribution = 1057.50;
                }else if (basicSalary <= 24149.99){
                    sssContribution = 1080.00;
                }else if (basicSalary <= 24649.99){
                    sssContribution = 1102.50;
                }else {
                    sssContribution = 1125.00;
                      }
           
            //phil health contribution 
            double philHealthCont = 0;
                if (basicSalary <= 10000){
                    philHealthCont = 300;
                }else if (basicSalary <=60000){
                    philHealthCont = basicSalary * 0.03;
                }else {
                    philHealthCont = 1800;
                      }
            
            //pag-ibig contribution    
            double pagIbigCont = 0;
                
                if (basicSalary <=1500){
                    pagIbigCont = basicSalary * 0.01;
                } else {
                    pagIbigCont = basicSalary * 0.02;
                    }
                
            //tax calculation   
            double withholdingTax = 0;
                
                if (basicSalary <= 20832.00){
                    withholdingTax = 0;
                }else if (basicSalary <=33333.00){
                    withholdingTax = (basicSalary-20833) * 0.20;
                }else if (basicSalary <=66667.00){
                    withholdingTax = ((basicSalary-33333) * 0.25) + 2500; 
                }else if (basicSalary <= 166667.00){
                    withholdingTax = ((basicSalary-66667) * 0.30) + 10833;
                }else if (basicSalary <= 666667.00){
                    withholdingTax = ((basicSalary-166667) * 0.32) + 40833.33;
                }else {
                    withholdingTax = ((basicSalary-666667) * 0.35) + 200833.33;
                      }
            
            //gross pay calculation 
            double semiMonthlyGrossPay = 0;
                semiMonthlyGrossPay = (basicSalary + riceSubsidy + phoneAllowance + clothingAllowance) / 2; 
                
            // deductions
            double deductions = 0;
                deductions = (withholdingTax + pagIbigCont + philHealthCont + sssContribution) / 2;
                
            // net pay calculations
            double netPay = semiMonthlyGrossPay - deductions;
            
            while (choice != 0) {
                System.out.println("================================================");
                System.out.println("PAYSLIP");
                System.out.println("================================================");
                System.out.println("Pay Period: ");
                System.out.println("Gross Pay: " + semiMonthlyGrossPay ); 
                System.out.println("Deductions: " + deductions); 
                System.out.println("Net Pay: " + netPay); 
                System.out.println("===== ===========================================");
                System.out.println("[1] Download Payslip");
                System.out.println("[0] Back to Main Menu");
                System.out.println("=================================================");
                System.out.println("ENTER SELECTION:  ");
                choice = scan.nextInt();
                scan.nextLine();
            
                    if (choice == 1) {
                        System.out.println("Download payslip simulation.");
                    }else if (choice == 0){
                        mainMenu();
                    } else {
                        System.out.println("Invalid Selection");
                    }
                }
        }
        
    //Attendance Page
        public static void attendancePage(){
            Scanner scan = new Scanner(System.in);
        //    boolean loggedIn = false;
            int choice = -1; 
            
            while (choice !=0) {
                System.out.println("================================================");
                System.out.println("ATTENDANCE");
                System.out.println("================================================");
                System.out.println("Date: "  );
                System.out.println("Attendance Status: "  + loggedIn );
                System.out.println("[1] Login");
                System.out.println("[2] Logout");
                System.out.println("[3] View Attendance" ); 
                System.out.println("[0] Back to Main Menu"); 
                System.out.println("ENTER SELECTION:  ");    
                choice = scan.nextInt();
                scan.nextLine();
            
                    if (choice == 1 && !loggedIn) {
                        loggedIn = true;
                        System.out.println("You are now logged in.");
                    }else if (choice == 2 && loggedIn){
                        loggedIn = false;
                        System.out.println("You are now logged out.");
                    }else if (choice == 3){
                        System.out.println("View Attendance Simulation!");
                    }else if (choice == 0){
                        mainMenu();
                    } else {
                        System.out.println("Invalid Selection");
                    }
                }
        }    
    // Admin Console
        public static void adminPage(){
            Scanner scan = new Scanner(System.in);
            int choice = -1; 
            
            while (choice != 0) {
                System.out.println("================================================");
                System.out.println("ADMIN PAGE");
                System.out.println("================================================");
                System.out.println("[1] HR");
                System.out.println("[2] Payroll");
                System.out.println("[3] IT" ); 
                System.out.println("[0] Back to Main Menu"); 
                System.out.println("ENTER SELECTION:  ");    
                choice = scan.nextInt();
                scan.nextLine();
            
                    switch (choice) {
                        case 1: hrConsole(); 
                        break;
                        case 2: payrollConsole(); 
                        break;
                        case 3: itConsole(); 
                        break;
                    }
            
            }
        }
        
    // HR Console
        public static void hrConsole() {
            Scanner scan = new Scanner(System.in);
            int choice = -1;
            
            while (choice != 0) {
                System.out.println("=================================================");
                System.out.println("                  HR CONSOLE");
                System.out.println("=================================================");
                System.out.println("[1] Create User Profile");
                System.out.println("[2] Update Employee Information");
                System.out.println("[0] Back to Admin Console");
                System.out.print("Enter Selection: ");
                choice = scan.nextInt(); 
                scan.nextLine();

                    if (choice == 1) {
                            System.out.println("New user profile created (simulation).\n");
                        } else if (choice == 2) {
                            System.out.println("Employee info updated (simulation).\n");
                        } else if (choice == 0) {
                            adminPage();
                        } else {
                            System.out.println("Invalid selection.");
                        }
            }
            
        }
        
    //Payroll console
        public static void payrollConsole() {
        
        Scanner scan = new Scanner(System.in);
        int choice = -1;
            while (choice != 0) {
                System.out.println("=================================================");
                System.out.println("               PAYROLL CONSOLE");
                System.out.println("=================================================");
                System.out.println("[1] Verify Attendance");
                System.out.println("[2] Generate Payroll");
                System.out.println("[3] Generate Payslip");
                System.out.println("[0] Back to Admin Console");
                System.out.print("Enter Selection: ");
                choice = scan.nextInt(); 
                scan.nextLine();

                    if (choice == 1) {
                        System.out.println("Attendance verified (simulation).\n");
                    } else if (choice == 2) {
                        System.out.println("Payroll generated (simulation).\n");
                    } else if (choice == 3) {
                        System.out.println("Payslip generated (simulation).\n");
                    } else if (choice == 0) {
                        adminPage();
                    } else {
                        System.out.println("Invalid Selection.\n");
                    }
            }
        }
        
    //IT Console
        public static void itConsole() {
        
        Scanner scan = new Scanner(System.in);
        int choice = -1;
            
            while (choice != 0) {
                System.out.println("=================================================");
                System.out.println("                  IT CONSOLE");
                System.out.println("=================================================");
                System.out.println("[1] Create User Roles");
                System.out.println("[2] Update User Roles");
                System.out.println("[3] View Employee Database");
                System.out.println("[0] Back to Admin Console");
                System.out.print("Enter Selection: ");
                choice = scan.nextInt(); 
                scan.nextLine();

                    if (choice == 1) {
                        System.out.println("User role created (simulation).\n");
                    } else if (choice == 2) {
                        System.out.println("User role updated (simulation).\n");
                    } else if (choice == 3) {
                        System.out.println("Employee database viewed (simulation).\n");
                    } else if (choice == 0) {
                        adminPage();
                    } else {
                        System.out.println("Invalid Selection.\n");
                    }
            }
        }
}   
   

