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

    private class AnimalListItem {
        private final Animal animal;
        private AnimalListItem nextAnimalListItem = null;

        public AnimalListItem(Animal animal) {
            this.animal = animal;
        }

        public Animal getAnimal() {
            return animal;
        }

        public AnimalListItem getNextAnimalListItem() {
            return nextAnimalListItem;
        }

        public void setNextAnimalListItem(AnimalListItem nextAnimalListItem) {
            this.nextAnimalListItem = nextAnimalListItem;
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

        public void remove(Animal animal) {
            if (this.nextAnimalListItem == null) {
                return;
            }

            if (this.nextAnimalListItem.getAnimal().equals(animal)) {
                this.nextAnimalListItem = this.nextAnimalListItem.getNextAnimalListItem();
                this.remove(animal);
            } else {
                this.nextAnimalListItem.remove(animal);
            }
        }
    }
}
