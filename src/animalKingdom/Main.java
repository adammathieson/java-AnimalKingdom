package animalKingdom;

import java.util.*;

public class Main
{
	public static void printAnimals(ArrayList<Animals> animals, CheckAnimals tester)
	{
		for (Animals a : animals)
		{
			if (tester.test(a))
			{
				System.out.println(a.getName() + " " + a.getYrDisc() + " " + a.move() + " " + a.breath() + " " + a.reproduce());
			}
		}
	}

	public static void main(String[] args)
	{
		ArrayList<Animals> animalsList = new ArrayList<>();

		// Mammals
		animalsList.add(new Mammals("Panda", 1869));
		animalsList.add(new Mammals("Zebra", 1778));
		animalsList.add(new Mammals("Koala", 1816));
		animalsList.add(new Mammals("Sloth", 1804));
		animalsList.add(new Mammals("Armadillo", 1758));
		animalsList.add(new Mammals("Raccoon", 1758));
		animalsList.add(new Mammals("Bigfoot", 2021));

		// Birds
		animalsList.add(new Birds("Pigeon", 1873));
		animalsList.add(new Birds("Peacock", 1821));
		animalsList.add(new Birds("Toucan", 1758));
		animalsList.add(new Birds("Parrot", 1824));
		animalsList.add(new Birds("Swan", 1758));

		// Fish
		animalsList.add(new Fish("Salmon", 1758));
		animalsList.add(new Fish("Catfish", 1817));
		animalsList.add(new Fish("Perch", 1758));

		System.out.println();
		System.out.println("decriment order by yrDisc");
		animalsList.sort((a1, a2) -> a2.getYrDisc() - a1.getYrDisc());
		System.out.println(animalsList.toString());

		System.out.println();
		System.out.println("alphabetical");
		animalsList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		System.out.println(animalsList.toString());

		System.out.println();
		System.out.println("moves");
		animalsList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
		animalsList.forEach(a -> System.out.println("Name: " + a.getName() + "Move: " + a.move()));

		System.out.println();
		System.out.println("Animals with lungs");
		printAnimals(animalsList, a -> a.breath() == "lungs");

		System.out.println();
		System.out.println("Lungs & 1758");
		printAnimals(animalsList, a -> (a.breath() == "lungs") && (a.getYrDisc() == 1758));

		System.out.println();
		System.out.println("Lungs & Lay Eggs");
		// printAnimals(animalsList, a -> (a.breath() == "lungs") && (a.reproduce() == "lay eggs"));
		printAnimals(animalsList, a -> (a instanceof Birds));

		System.out.println();
		System.out.println("alph 1758");
		animalsList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		printAnimals(animalsList, a -> a.getYrDisc() == 1758);

		// Stretch
		System.out.println();
		System.out.println("alph mammals");
		animalsList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		printAnimals(animalsList, a -> (a instanceof Mammals));



	}
}