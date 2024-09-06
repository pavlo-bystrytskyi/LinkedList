package org.example;

public class AnimalListItem {
    private final Animal animal;
    private AnimalListItem nextAnimalListItem = null;

    public AnimalListItem(Animal animal) {
        this.animal = animal;
    }

    public void setNextAnimal(Animal nextAnimal) {
        if (this.nextAnimalListItem != null) {
            this.nextAnimalListItem.setNextAnimal(nextAnimal);
        } else {
            this.nextAnimalListItem = new AnimalListItem(nextAnimal);
        }
    }

    @Override
    public String toString() {
        String result = animal.toString();
        if (nextAnimalListItem != null) {
            result += " -> " + nextAnimalListItem;
        }

        return result;
    }
}
