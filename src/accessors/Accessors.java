
package accessors;

public class Accessors {

    public static void main(String[] args) {
        Flight slc = new Flight();
        
        slc.setAge(20);//setter age here
        System.out.println(slc.getAge()); // getter age here
        
        slc.setName("Jasper");//setter age here
        System.out.println(slc.getName());// getter age here
        
        slc.setCity("Lyngby");//setter age here
        System.out.println(slc.getCity());// getter age here
    }
    
}
