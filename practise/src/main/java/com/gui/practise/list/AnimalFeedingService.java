package com.gui.practise.list;

public class AnimalFeedingService {
	private boolean foodBowlEmpty = true;

	public void feed() {
		if (foodBowlEmpty)
			Feeder.replenishFood();

		// more code to feed the animal
	}

	public static class Feeder {
		public static void replenishFood() {
			System.out.println("replenishFood....");
		}
	}
}
