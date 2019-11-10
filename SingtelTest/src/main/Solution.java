package main;
import animals.*;

public class Solution {
	public static void main(String[] args) {
		
		System.out.println("======================Start of Animeal Bird======================");
		//Question A Initial
		Bird bird = new Bird();
		bird.walk();         
		bird.fly();         
		bird.sing();
		
		System.out.println("======================End of Animeal Bird======================");
		System.out.println("                                                                 ");
		System.out.println("======================Start of Animeal Duck======================");
		
		//Question A
		Duck duck = new Duck();
		//2(a)
		duck.say();
		//2(b)
		duck.swim();
		
		System.out.println("======================End of Animeal Duck======================");
		System.out.println("                                                                 ");
		System.out.println("======================Start of Animeal Chicken======================");
		
		Chicken chicken = new Chicken();
		//2(c)
		chicken.say();
		//2(d)
		chicken.fly();
		
		System.out.println("======================End of Animeal Chicken======================");
		System.out.println("                                                                 ");
		System.out.println("======================Start of Animeal Rooster======================");
		//3
		Rooster rooster = new Rooster();
		//(a), (b) and Rooster extends Chicken
		rooster.say();
		rooster.peck();
		
		//(c) Rooster creation Non-Inheritance. Use of Composition
		RoosterNonInheritance rooster2 = new RoosterNonInheritance();
		rooster2.say();
		rooster.peck();
		
		System.out.println("======================End of Animeal Rooster======================");
		System.out.println("                                                                 ");
		System.out.println("======================Start of Animeal Parrot======================");
		
		//Question 4
		//(a)
		Parrot parrotwithDog = new Parrot("Woof Woof");
		parrotwithDog.say();
		
		//(b)
		Parrot parrotwithCat = new Parrot("Meow");
		parrotwithCat.say();
		
		//(c)
		Parrot parrotwithRooster = new Parrot("Cock-a-doodle-doo");
		parrotwithRooster.say();
		
		//(d)
		Parrot parrotwithPhone = new Parrot("Ring Ring");
		parrotwithPhone.say();
		
		System.out.println("======================End of Animeal Parrot======================");
		System.out.println("                                                                 ");
		System.out.println("======================Start of Animeal Fish======================");
		
		//Question B
		Fish fish = new Fish();
		//Fish, no sing method
		//(b)
		fish.walk();
		//(c)
		fish.swim();
		
		System.out.println("======================End of Animeal Fish======================");
		System.out.println("                                                                 ");
		System.out.println("======================Start of Animeal Shark======================");
				
		//2(a)
		Shark shark = new Shark();
		shark.colour();
		shark.size();
		//2(d)
		shark.eat();
		
		System.out.println("======================End of Animeal Shark======================");
		System.out.println("                                                                 ");
		System.out.println("======================Start of Animeal Clownfish======================");
		
		
		Clownfish clownfish = new Clownfish();
		//2(c)
		clownfish.swim();
		//2(d)
		clownfish.joke();
		
		
		System.out.println("======================End of Animeal Clownfish======================");
		System.out.println("                                                                 ");
		System.out.println("======================Start of Animeal Dolphin======================");
		
		//3(a)
		Dolphin dolphin = new Dolphin();
		dolphin.swim();
		
		System.out.println("======================End of Animeal Dolphin======================");
		System.out.println("                                                                 ");
		System.out.println("======================Start of Animeal Butterfly======================");
		
		//Question D
		Butterfly butterfly = new Butterfly(true);
		//1(a) & (b) Butterfly does not may any sound....Directly inherit from Animal
		butterfly.fly();
		
		System.out.println("======================End of Animeal Butterfly======================");
		System.out.println("                                                                 ");
		System.out.println("======================Start of Animeal Caterpillar======================");
		
		//2(a) and (b) Swoop fly method with walking
		Caterpillar caterpillar = new Caterpillar(false);
		caterpillar.fly();
		
		System.out.println("======================End of Animeal Caterpillar======================");
		System.out.println("                                                                 ");
		
		//Question E Count Animals
		CreateAndCount();
		
	}
	
public static void CreateAndCount() {
		
		//E.1 
		//Create Animal Array
		Animal[] animals = new Animal[]{         
				new Bird(),
				new Duck(),         
				new Chicken(),         
				new Rooster(),         
				new Parrot("Meow"),         
				new Fish(),         
				new Shark(),         
				new Clownfish(),         
				new Dolphin(),         
				new Frog(),         
				new Dog(),         
				new Butterfly(true),         
				new Cat() };
		
		//Integer variables for count
		 int fly = 0;
		 int walk = 0;
		 int sing = 0;
		 int swim = 0;
		
		 //Loop to count which animals can fly, walk, sing or swim
		 for(int i = 0; i<animals.length; i++)
		 {
			 //Try to run fly method and increment count if fly method is available
			 try {
				 animals[i].getClass().getMethod("fly");
				 fly++;
				 }catch (NoSuchMethodException e) {
					 
				 }catch (SecurityException e) {
					 e.printStackTrace();
					 }
			//Try to run walk method and increment count if walk method is available
			 try {
				 animals[i].getClass().getMethod("walk");
				 String className = animals[i].getClass().getName();
				 String superClassName =  animals[i].getClass().getSuperclass().getName();

				 if(className == "animals.Fish" || superClassName == "animals.Fish")
				 {
					 
				 }
				 else
				 {
					 walk++;
				 }
				 
			 } catch (NoSuchMethodException e) {
				 
			 } catch (SecurityException e) {
				 e.printStackTrace();
				 }
			 
			//Try to run sing method and increment count if sing method is available
			 try {
				 animals[i].getClass().getMethod("sing");
				 sing++;
				 }catch (NoSuchMethodException e) {
					 
				 }catch (SecurityException e) {
					 e.printStackTrace();
					 }
			 
			//Try to run swim method and increment count if swim method is available
			 try {
				 animals[i].getClass().getMethod("swim");
				 swim++;
				 }catch (NoSuchMethodException e) {
					 
				 } catch (SecurityException e) {
					 e.printStackTrace();
					 }
			 }
		 //Print out Count of animals that can fly, walk, sing and swim
		 System.out.println(fly + " animals can fly, " + walk + " animals can walk, " + sing + " animals can sing " + swim + " animals can swim" );
		 }
} 
