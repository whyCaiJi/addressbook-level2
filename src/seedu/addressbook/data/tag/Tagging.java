package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

public class Tagging {
	private String isAdd;
	private Tag tag;
	private Person person;
	
	public Tagging(boolean add, Person p, Tag t) {
		if(add) {
			isAdd = "+";
		} else {
			isAdd = "-";
		}
		this.tag = t;
		this.person = p;
	}

	@Override
	public String toString() {
		return isAdd + " " + person.getName() + " " + tag.toString();
	}
	
	
}
