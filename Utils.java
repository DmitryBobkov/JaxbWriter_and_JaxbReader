package by.academy.myJaxbExample.utils;

import java.util.ArrayList;
import java.util.List;

import by.academy.myJaxbExample.entities.Person;

/**
 * Class Utils
 *
 */
public class Utils {

	public Person cretaePerson() {

		Person person = new Person();

		person.setFirstName("Ivan");
		person.setSurName("Ivanov");
		person.setAge(18);

		List<Integer> phoneNumber = new ArrayList<Integer>();
		phoneNumber.add(7773388);
		phoneNumber.add(1114477);

		person.setPhoneNumber(phoneNumber);
		return person;
	}

}
