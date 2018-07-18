
package Child;

public class Person {
	String firstname;
	String lastName;
	String address;
	char gender;
	String iris;
	Person mparent;
	Person fparent;
	public Person(String firstname, char gender, Person fparent, Person mparent) {
		
		
		this.firstname = firstname;
		this.gender = gender;
		this.mparent = mparent;
		this.fparent = fparent;
		this.address=fparent.address;
		this.lastName=fparent.lastName;
                if(mparent.iris == fparent.iris)
                {
                   if(gender == 'M'){
                iris = "Brown";
                }
                   else if(gender=='F')
                   {
                       iris= "Not defined";
                 
                   }
                
                }
                else if (mparent.iris !=fparent.iris)
                {
                    if(gender == 'M')
                    {
                        iris= mparent.iris;
                    }
                    else
                        iris = fparent.iris;
                }
		
	}
	public Person(String firstname, String lastName, String address, char gender, String iris) {
		
		this.firstname = firstname;
		this.lastName = lastName;
		this.address = address;
		this.gender = gender;
		this.iris = iris;
	}
	
}
