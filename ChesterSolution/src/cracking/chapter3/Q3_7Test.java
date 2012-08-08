package cracking.chapter3;

import static org.junit.Assert.*;
import static cracking.chapter3.Q3_7.*;

import org.junit.Test;

public class Q3_7Test {

	@Test
	public void testAnimalShelter() {
		AnimalShelter shelter = new AnimalShelter1();
		enqueueSamples(shelter);
		dequeueAndPrints(shelter);
	}

	@Test
	public void testAnimalShelter2() {
		AnimalShelter shelter = new AnimalShelter2();
		enqueueSamples(shelter);
		dequeueAndPrints(shelter);
	}
	
	private void enqueueSamples(AnimalShelter shelter) {
		shelter
			.enqueue(new Dog("Charlie"))
			.enqueue(new Dog("Silver"))
			.enqueue(new Cat("Muscat Love"))
			.enqueue(new Dog("Snoopy"))
			.enqueue(new Cat("Persian"));
	}
	
	private void dequeueAndPrints(AnimalShelter shelter) {
		System.out.println("dequeueAny() - " + shelter.dequeueAny().name);
		System.out.println("dequeueCat() - " + shelter.dequeueCat().name);
		System.out.println("dequeueDog() - " + shelter.dequeueDog().name);
	}
}

