package org.example;

public class Main {
    public static void main(String[] args) {
        Animal cow = new Animal("Cow");
        Animal cat = new Animal("Cat");
        Animal dog = new Animal("Dog");
        Animal pig = new Animal("Pig");
        Animal sheep = new Animal("Sheep");

        AnimalList animalList = new AnimalList();
        animalList.add(cow);
        animalList.add(cat);
        animalList.add(dog);
        animalList.add(pig);
        animalList.add(sheep);

        System.out.println(animalList);
    }
}
