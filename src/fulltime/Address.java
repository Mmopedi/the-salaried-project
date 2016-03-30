package fulltime;

public class Address {
	
	
	 /**
    instance variables
    */
    private int houseNo;
    private String street;
    private String city;
    
    /**
    default constructor
    */
    public Address(){
    houseNo = 0; street =  city = "";
    }
    /**
    overloaded constructor
    */
    public Address(int houseNo, String street, String city){
        this.houseNo = houseNo;
        setStreet(street);
        setCity(city);    
    }
    /**
    set the house number
    @param house number
    */
    public void setHouseNo(int houseNo){
    this.houseNo =  houseNo;
    }
    /**
    set the street name
    */
    public void setStreet(String street){
        if(street.equals("")){
        throw new IllegalArgumentException("street is needed");
        }else{
        this.street = street;
        } 
    }
       public void setCity(String city){
        if(street.equals("")){
        throw new IllegalArgumentException("street is needed");
        }else{
        this.city = city;
        }
       
        }

    @Override
    public String toString()
    {
        return "["+houseNo + "," + street + "," + city + ']';
    }

}
