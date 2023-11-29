package org.advent.day1;

/**
 * Elf that is assigned calories
 */
public class Elf implements Comparable<Elf> {

    private int totalCalories = 0;

    /**
     * Calories carried by the Elf
     * @return total calories
     */
    public int getTotalCalories() {
        return totalCalories;
    }

    @Override
    public int compareTo(Elf other) {
        return Integer.valueOf(totalCalories).compareTo(Integer.valueOf(other.totalCalories));
    }

    public void addCalories(int calories) {
        totalCalories += calories;
    }

}
