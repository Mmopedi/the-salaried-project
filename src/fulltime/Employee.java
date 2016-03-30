package fulltime;

public abstract class Employee {
	
	
	 /**
    instance variables
    */
   private String name;
   private char gender;
   private int age;
   private Address address; //association relationship

   /**
    default constructor
    */
   public Employee()
   {
       name = "";
       gender = ' ';
       age = 0;
       address = null;
   }

   /**
    overloaded constructor
    */
   public Employee(String name, char gender, int age, Address address)
   {
       setName(name);
       setGender(gender);
       setAge(age);
       this.address = address;
   }

   /**
    set the name of the employee

    @param name
    */
   public void setName(String name)
   {
       if (name.length() < 3)
       {
           throw new IllegalArgumentException("invalid name");
       }
       else
       {
           this.name = name;
       }
   }

   /**
    set the gender

    @param gender
    */
   public void setGender(char gender)
   {
       gender = String.valueOf(gender).toUpperCase().charAt(0);
       if (gender == 'F' || gender == 'M')
       {
           this.gender = gender;
       }
       else
       {
           throw new IllegalArgumentException("invalid gender");
       }
       /**
        set the age

        @param age
        */
   }

   public void setAge(int age)
   {
       if (age < 25)
       {
           throw new IllegalArgumentException("invalid age");
       }
       else
       {
           this.age = age;
       }
   }

   /**
    set the address

    @param address
    */
   public void setAddress(Address address)
   {
       this.address = address;
   }

   /**
    get the employee name

    @return name
    */
   public String getName()
   {
       return name;
   }

   /**
    get the employee gender

    @return name
    */
   public char getGender()
   {
       return gender;
   }

   /**
    get the age

    @return age
    */
   public int getAge()
   {
       return age;
   }

   /**
    get the address

    @return address
    */
   public Address getAddress()
   {
       return address;
   }

   /**
    abstract method calculate employee salary
    */
   public abstract double calcSalary();
   
   /**
   display the employee details
   @return employee details
   */
   @Override
   public String toString(){
       return name+","+gender+","+age+","+address.toString();
   }

}
