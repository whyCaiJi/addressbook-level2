package seedu.addressbook.data.person;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;

public class SimilarNameTest {
	@Test
	public void SimilarNameTest() throws IllegalValueException {
		// Comparing two exactly same names
		Name n1 = new Name("John Doe");
		Name n2 = new Name("John Doe");
		assertTrue(n1.isSimilar(n2));
		
		// Comparing two different names
		Name n3 = new Name("Billy Jean");
		assertFalse(n1.isSimilar(n3));
		
		// Comparing two similar names differing in case
		Name n4 = new Name("john doe");
		assertTrue(n1.isSimilar(n4));
	}
}
