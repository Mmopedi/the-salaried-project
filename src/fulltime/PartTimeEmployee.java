package fulltime;

public class PartTimeEmployee extends Employee {
	/**
    instance variables 
    */
    private int noHrsWorked;
    private double payRate;
    
    /**
    default constructor
    */
    public PartTimeEmployee(){
        super(); //invoking the default constructor in the super class
        noHrsWorked = 0;
        payRate = 0;
    }
    
    /**
    overloaded constructor
    */
    public PartTimeEmployee(String name, char gender, 
            int age, Address address, int noHrsWorked, double payRate){
        super(name, gender, age, address);
        this.noHrsWorked = noHrsWorked;
        this.payRate = payRate;
    }
    
    /**
    set the number of hours worked
    @param number of hours
    */
    public void setNoHrsWorked(int noHrsWorked){
        this.noHrsWorked = noHrsWorked;
    }
    
    /**
    set the pay rate
    @param pay rate
    */
    public void setPayRate(double payRate){
        this.payRate = payRate;
    }
    
    /**
    get the number of hours worked
    @return number of hours
    */
    public int getNoHrsWorked(){
        return noHrsWorked;
    }
    
    /**
    get the pay rate
    @return pay rate
    */
    public double getPayRate(){
        return payRate;
    }
    
    /**
    display employee details
    @return employee details
    */
    @Override
    public String toString(){
        return super.toString()+", R"+calcSalary();
    }
    
    @Override
    public double calcSalary(){
        return noHrsWorked * payRate;
    }

}
