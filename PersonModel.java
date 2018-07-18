
package Child;

public class PersonModel {

	public static void main(String[] args) {
		
		Person father=new Person("Husain","Khan", "Mumbai", 'M',"Black");
		Person mother=new Person("Rehana", "Sheikh", "Goa", 'F', "Brown");
		
		Person child=new Person("Ariba", 'F' , father, mother);
		System.out.println("The details of child are :");
                System.out.println("Name:" +child.firstname+" "+father.lastName);
                System.out.println("Address :" +father.address);
                System.out.println("Iris Color :" +child.iris);

                
		
	}

}
