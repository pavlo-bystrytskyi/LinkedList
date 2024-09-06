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

    @Override
    public String toString() {
        if (this.head != null) {
            return this.head.toString();
        }

        return "";
    }
}
