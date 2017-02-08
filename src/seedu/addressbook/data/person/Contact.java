package seedu.addressbook.data.person;

/**
 * Represent a parent class for a Person's contacts
 */
public class Contact {
	private String value;
	private boolean isPrivate;
	
	public Contact() {}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
	
	public void setPrivate(boolean isPrivate) {
		this.isPrivate = isPrivate;
	}
	
	
	
	@Override
	public String toString() {
		return value;
	}

	@Override
	public int hashCode() {
		return value.hashCode();
	}
	
	public boolean isPrivate() {
		return this.isPrivate;
	}
	
}
