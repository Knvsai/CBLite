class Employee{ 
    public int empid; 
    public String empName; 
    public Address address; 
    
    Employee(int empid, String empName, Address address){
        this.empid=empid;
        this.empName=empName;
        this.address=address;
    }
    
    public void displayDetails(){
        System.out.println("Id:" + this.empid);
        System.out.println("name:" + this.empName);
        System.out.println("Address:House:" + this.address.houseno);
        System.out.println("Address:City:" + this.address.city); 
        System.out.println("Address:State:" + this.address.state);
    }
    
}
from Naga venkata sai kommu (internal) to everyone:    10:21 AM
class Address{
    public int houseno;
    public String city;
    public String state;
    
    public Address(int h, String c, String s){
        this.houseno=h;
        this.city=c;
        this.state=s;
    }
}
public class Tester {
    public static void main(String[] args){
        
      Address a1 = new Address(263, "Panjim", "Goa");
      
      Employee e1 = new Employee(1001, "Naga venkata sai", a1);
      
      e1.displayDetails();
    
      //a1.city, a1.houseno, a1.state
      //this.city, this.house, this.state
    }
}
class Address{
    public int houseno;
    public String city;
    public String state;
    
    public Address(int h, String c, String s){
        this.houseno=h;
        this.city=c;
        this.state=s;
    }
}
public class Tester {
    public static void main(String[] args){
        
      Address a1 = new Address(263, "Panjim", "Goa");
      
      Employee e1 = new Employee(1001, "Naga venkata sai", a1);
      
      e1.displayDetails();
    
      //a1.city, a1.houseno, a1.state
      //this.city, this.house, this.state
    }
}