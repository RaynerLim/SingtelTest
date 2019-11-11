package unitTest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import animals.Parrot;

class ParrotUnitTest {
	
	Parrot parrot1;
	Parrot parrot2;
	Parrot parrot3;
	
	String[] sounds = {"Meow", "Hello", "Pew Pew"};

	
	@BeforeEach
	void setUp() throws Exception {
		parrot1 = new Parrot(sounds[0].toString());
		parrot2 = new Parrot(sounds[1].toString());
		parrot3 = new Parrot(sounds[2].toString());
	}

	@Test
	void test() {
		
		//Catch println for parrot1
		final ByteArrayOutputStream parrot1OutContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(parrot1OutContent));
		parrot1.say();
		
		//Catch println for parrot2
		final ByteArrayOutputStream parrot2OutContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(parrot2OutContent));
		parrot2.say();
		
		//Catch println for parrot3
		final ByteArrayOutputStream parrot3OutContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(parrot3OutContent));
		parrot3.say();
		
		//Ensure that output stream for parrot1 is correct
		Assert.assertEquals(sounds[0].toString() + "\r\n",parrot1OutContent.toString());
		
		//Ensure that output stream for parrot1 is correct
		Assert.assertEquals(sounds[0].toString() + "\r\n",parrot1OutContent.toString());
				
		//Ensure that output stream for parrot1 is correct
		Assert.assertEquals(sounds[0].toString() + "\r\n",parrot1OutContent.toString());
	}
	
	

}
