/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Child;

public class Person {
	String firstname;
	String lastName;
	String address;
	char gender;
	String iris;
	Person mparent;//father
	Person fparent;//mother
	public Person(String firstname, char gender, Person fparent, Person mparent) {
		
		
		this.firstname = firstname;
		this.gender = gender;
		this.mparent = mparent;
		this.fparent = fparent;
		this.address=fparent.address;
		this.lastName=fparent.lastName;
                if(mparent.iris == fparent.iris)
                {
                iris = "Brown";
                
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
		super();
		this.firstname = firstname;
		this.lastName = lastName;
		this.address = address;
		this.gender = gender;
		this.iris = iris;
	}
	
}
