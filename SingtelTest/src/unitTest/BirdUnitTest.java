package unitTest;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import animals.Bird;

class BirdUnitTest {
	
	Bird bird;
 

	@BeforeEach
	void setUp() throws Exception {
		bird = new Bird();
		
	}

	@Test
	void test() {
		//Setup stream to contain output
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		//Call sing method to get output stream
		bird.sing();
		
		//Ensure that output stream is correct
				Assert.assertEquals("La La La I am Singing" + "\r\n",outContent.toString());
	}

}
