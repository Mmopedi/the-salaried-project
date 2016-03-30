package fulltime;

public class FullTimeEmployee extends Employee
{
	
	 /**
    instance variables
    */
    private double basicSalary;
    private double taxRate;
    
    /**
    default constructor
    */
    public FullTimeEmployee(){
        super();
        basicSalary = taxRate = 0.0;
    }
    
    /**
    overloaded constructor
    */
    public FullTimeEmployee(String name, char gender, 
            int age, Address address, double basicSalary, double taxRate){
        super(name, gender, age, address);
        this.basicSalary = basicSalary;
        this.taxRate = taxRate;
    }
    
    /**
    set the basic salary
    @param basic salary
    */
    public void setBasicSalary(double basicSalary){
        this.basicSalary = basicSalary;
    }
    
    /**
    set the tax rate
    @param tax rate
    */
    public void setTaxRate(double taxRate){
        this.taxRate = taxRate;
    }
    
    /**
    get the basic salary
    @return basic salary
    */
    public double getBasicSalary(){
        return basicSalary;
    }
    
    /**
    get the tax rate
    @return tax rate
    */
    public double getTaxRate(){
        return taxRate;
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
        return basicSalary - (basicSalary * taxRate);
    
	
	
	
	
	
	
	
	
	
	
	
    }
	

}
