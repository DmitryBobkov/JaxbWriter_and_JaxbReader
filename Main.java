package by.academy.myJaxbExample.main;

import java.io.File;

import javax.xml.bind.JAXBException;

import by.academy.myJaxbExample.entities.Person;
import by.academy.myJaxbExample.jaxb.Jaxb;
import by.academy.myJaxbExample.utils.Utils;

/**
 * @author Dmitry Bobkov
 *
 */
public class Main {

	public static void main(String[] args) {

		File file = new File("person.xml");

		Utils u = new Utils();
		Person person = u.cretaePerson();

		Jaxb jw = new Jaxb();

		try {
			jw.jaxbWriter(file, person);
			jw.jaxbReader(file, person);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}
