package fulltime;


import java.util.*;
public class SalaryApp {
	
	 /**
    @param args the command line arguments
    */
   /**
    get the address information

    @param employee address
    */
   public static Address getAddress(Scanner in)
   {
       int houseNo;
       String street, city;
       Address anAddress = null;
       
       try{
          System.out.println("-----------Address info---------");
          System.out.print("House No.:");
          houseNo = in.nextInt();
          in = new Scanner(System.in);
          System.out.print("Street:");
          street = in.nextLine();
          System.out.print("City: ");
          city = in.nextLine();

         anAddress = new Address(houseNo, street, city);
      }catch(InputMismatchException ex){
          System.out.println(ex.getMessage());
      }

       return anAddress;
   }

   /**
    get employee details

    @param employee details
    */
   public static Employee getEmployee(Scanner in)
   {
       String name;
       char gender;
       int age, noHrs;
       double payRate;
       Employee anEmployee = null;

       try{
           System.out.println("-------------Employee details-----------");
           Address address = getAddress(in);

           in = new Scanner(System.in);
           System.out.print("Name: ");
           name = in.nextLine();
           System.out.print("Gender: ");
           gender = in.next().charAt(0);
           System.out.print("Ager: ");
           age = in.nextInt();

           //ge the employee type
           System.out.println("Employee type (P = Part time; F = Full time)");
           char empType = in.next().toUpperCase().charAt(0);

           if (empType == 'P')
           {
               System.out.print("No of hours worked: ");
               noHrs = in.nextInt();
               System.out.print("Pay rate: ");
               payRate = in.nextDouble();
               anEmployee = new PartTimeEmployee(name, gender, age,
                   address, noHrs, payRate);
           }
           else if (empType == 'F')
           {
              System.out.print("Basic salary: ");
              double basicSal = in.nextDouble();
              System.out.print("Tax rate: ");
              double taxRate = in.nextDouble();
              anEmployee = new FullTimeEmployee(name, gender, age,
                   address, basicSal, taxRate);
           }
           else
           {
              System.out.println("Invalid employee type");
           }
      }catch(InputMismatchException ex){
          System.out.println(ex.getMessage());
      }

       return anEmployee;
   }
   
   //static Employee[] empList = new Employee[20];
   //static int arct;
   
   static ArrayList<Employee> empList = new ArrayList<Employee>();
   
   public static int searchEmployee(String name){
       int pos = -1;
       //Employee emp;
       try{
          //for(int i = 0; i < arct; i++){
          for(int i = 0; i < empList.size(); i++){
             //emp = empList[i];
             //if(empList[i].getName().equals(name)){
             if(empList.get(i).getName().equals(name)){
               pos = i;
             }
          }
       }catch(ArrayIndexOutOfBoundsException ex){
           System.out.println(ex.getMessage());
       }
       
       return pos;
   }
   
   public static void main(String[] args)
   {
       Scanner scan = new Scanner(System.in);
       int no;
       Employee emp;
       String name;
       int pos;
       
       try{
       do
       {
               System.out.println("----------Salary Application---------");
               System.out.println("Enter a number(1-4) to indicate your choice");
               System.out.println("1-Register and employee");
               System.out.println("2-Search for an employee");
               System.out.println("3-Display an employee");
               System.out.println("4-Display the total salary paid out");
               System.out.println("-1 to stop");
               System.out.println("-------------------------------------");
               no = scan.nextInt();
                       
           if(no == 1){
               emp = getEmployee(scan);
               //empList[arct] = emp;
               empList.add(emp);
               //arct++;
           }else if(no == 2){
               scan = new Scanner(System.in);
               System.out.println("Enter the name you are looking for");
               name = scan.nextLine();
               
               pos = searchEmployee(name);
               
               if(pos == -1){
                   System.out.println("Unknown employee");
               }else{
                   System.out.println("Registered employee");
               }
           }else if(no == 3){
               scan = new Scanner(System.in);
               System.out.println("Enter the name you are looking for");
               name = scan.nextLine();
               
               pos = searchEmployee(name);
               
               if(pos == -1){
                   System.out.println("Unknown employee");
               }else{
                   //System.out.println(empList[pos].toString());
                   System.out.println(empList.get(pos).toString());
               }
           }else if(no == 4){
               System.out.println("Total Salary Paid: R"+totalSalary());
           }
         } while (no != -1);
       }catch(InputMismatchException ex){
           System.out.println(ex.getMessage());
       }

       //Employee emp = getEmployee(scan);

       //System.out.println(emp.toString());
   }
   
   public static double totalSalary(){
       double totalSal = 0;
       
       //for(int i = 0; i < arct; i++){
       for(int i = 0; i < empList.size(); i++){
           //totalSal += empList[i].calcSalary();
           totalSal += empList.get(i).calcSalary();
       }
       
       return totalSal;
   }

}
