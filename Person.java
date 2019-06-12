package by.academy.myJaxbExample.entities;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Class Person
 *
 */

@XmlRootElement
public class Person {

	private String firstName;
	private String surName;
	private int age;

	private List<Integer> phoneNumber;

	public String getFirstName() {
		return firstName;
	}

	@XmlElement
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName;
	}

	@XmlElement
	public void setSurName(String surName) {
		this.surName = surName;
	}

	public int getAge() {
		return age;
	}

	@XmlElement
	public void setAge(int age) {
		this.age = age;
	}

	public List<Integer> getPhoneNumber() {
		return phoneNumber;
	}

	@XmlElement
	public void setPhoneNumber(List<Integer> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		String printPerson = "Person [ firstName=" + firstName + ", surName=" + surName + ", age=" + age
				+ ", phoneNumber=";
		if (phoneNumber != null) {
			for (Integer pn : phoneNumber) {
				printPerson += pn + " ";
			}
		}
		printPerson += "]";
		return printPerson;
	}

}
