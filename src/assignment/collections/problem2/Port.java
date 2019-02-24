package assignment.collections.problem2;


public class Port {
    
    Integer id;
    String name;
    String city;
    
    Port(){}
    Port(Integer id,String name,String city){
     this.id = id;
     this.name = name;
     this.city = city;    
    }
    void setId(Integer id){
     this.id = id;
    }
    Integer getId(){
     return id;
    }
    
    void setName(String name){
     this.name = name;
    }
    String getName(){
     return name;
    }
    
    void setCity(String city){
     this.city = city;
    }
    
    String getCity(){
     return city;
    }
    
   public String toString(){
     return String.format("%-15s %-15s %-15s",getId(),getName(),getCity());
   }
    
}
