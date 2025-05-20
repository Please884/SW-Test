package student;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentManagerTest {
	
	StudentManager studentmanager;

	@BeforeEach
	void setUp() throws Exception {
		studentmanager = new StudentManager();
	}

	@Test
	void testAddStudent() {
		studentmanager.addStudent("Heebeom");
		assertTrue(studentmanager.hasStudent("Heebeom"));
	}

	@Test
	void testRemoveStudent() {
		studentmanager.addStudent("Heebeom");
		studentmanager.removeStudent("Heebeom");
		assertFalse(studentmanager.hasStudent("Heebeom"));
	}

	@Test
	void testAddSameStudent() {
		studentmanager.addStudent("Heebeom");
		assertThrows(IllegalArgumentException.class, () -> studentmanager.addStudent("Heebeom"));
	}
	
	@Test
	void testRemoveNoneStudent() {
		assertThrows(IllegalArgumentException.class, () -> studentmanager.removeStudent("Heebeom"));;
	}
}
