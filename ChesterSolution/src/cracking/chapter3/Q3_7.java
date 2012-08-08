package cracking.chapter3;

import java.util.Date;
import java.util.LinkedList;

/*
 * An animal shelter holds only dogs and cats, and operates on a strictly "first in,
 * first out" basis.  People must adopt either the "oldest" (based on arrival time) of
 * all animals at the shelter, or they can select whether they would prefer a dog or
 * a cat (and will receive the oldest animal of that type).  They cannot select which
 * specific animal they would like.  Create the data structures to maintain this system
 * and implement operations such as enqueue, dequeueAny, dequeueDog and dequeueCat.
 * You may use the built-in LinkedList data structure.
 */

public class Q3_7 {
	static enum Species { DOG, CAT; }
	static class Animal {
		Species species;
		String name;
		Date timestamp;
		Animal() { timestamp = new Date(); }
	}
	
	static class Dog extends Animal {
		Dog(String name) {
			super();
			this.species = Species.DOG;
			this.name = name;
		}
	}
	
	static class Cat extends Animal {
		Cat(String name) {
			super();
			this.species = Species.CAT;
			this.name = name;
		}
	}

	interface AnimalShelter {
		AnimalShelter enqueue(Animal animal);
		Animal dequeueAny();
		Animal dequeueCat();
		Animal dequeueDog();
	}
	
	static class AnimalShelter1 implements AnimalShelter {
		private LinkedList<Animal> list = new LinkedList<Animal>();

		public AnimalShelter enqueue(Animal animal) {
			list.offer(animal);
			return this;
		}
		
		public Animal dequeueAny() { return list.poll(); }
		public Animal dequeueDog() { return dequeue(Species.DOG); }
		public Animal dequeueCat() { return dequeue(Species.CAT); }
		
		Animal dequeue(Species species) {
			for (Animal animal: list) {
				if (animal.species == species) {
					list.remove(animal);
					return animal;
				}
			}
			return null;
		}
	}
	
	static class AnimalShelter2 implements AnimalShelter {
		private LinkedList<Animal> catList = new LinkedList<Animal>();
		private LinkedList<Animal> dogList = new LinkedList<Animal>();
		
		public AnimalShelter enqueue(Animal animal) {
			switch (animal.species) {
			case CAT:
				catList.offer(animal);
				break;
			case DOG:
				dogList.offer(animal);
				break;
			}
			return this;
		}
		
		public Animal dequeueAny() {
			if (catList.peek().timestamp.before(dogList.peek().timestamp))
				return catList.poll();
			else
				return dogList.poll();
		}
		
		public Animal dequeueCat() { return catList.poll(); }
		public Animal dequeueDog() { return dogList.poll(); }
	}
	
}
