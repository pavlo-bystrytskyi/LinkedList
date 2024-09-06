package org.example;

public class AnimalList {
    private AnimalListItem head = null;

    public void add(Animal animal) {
        if (this.head == null) {
            this.head = new AnimalListItem(animal);
        } else {
            this.head.setNextAnimal(animal);
        }
    }

    public void remove(Animal animal) {
        if (this.head == null) {
            return;
        }

        AnimalListItem virtualAnimal = new AnimalListItem(new Animal(""));
        virtualAnimal.setNextAnimalListItem(this.head);
        virtualAnimal.remove(animal);
        this.head = virtualAnimal.getNextAnimalListItem();
    }

    @Override
    public String toString() {
        if (this.head != null) {
            return this.head.toString();
        }

        return "";
    }
}
