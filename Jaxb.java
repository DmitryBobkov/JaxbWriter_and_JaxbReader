package by.academy.myJaxbExample.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import by.academy.myJaxbExample.entities.Person;

/**
 * JaxbWriter and JaxbReader
 *
 */
public class Jaxb {

	public void jaxbWriter(File file, Object o) throws JAXBException {

		JAXBContext context = JAXBContext.newInstance(o.getClass());
		Marshaller marshaller = context.createMarshaller();

		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(o, file);
		marshaller.marshal(o, System.out);

	}

	public void jaxbReader(File file, Object o) throws JAXBException {
		
		JAXBContext context = JAXBContext.newInstance(o.getClass());
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Person person  = (Person) unmarshaller.unmarshal(file);
		
		System.out.print(person);

		
	}

}
