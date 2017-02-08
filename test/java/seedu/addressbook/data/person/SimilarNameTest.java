package seedu.addressbook.data.person;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;

public class SimilarNameTest {
	@Test
	public void SimilarNameTest() throws IllegalValueException {
		// Comparing two exactly same name
		Name n1 = new Name("John Doe");
		Name n2 = new Name("John Doe");
		assertTrue(n1.isSimilar(n2));
	}
}
