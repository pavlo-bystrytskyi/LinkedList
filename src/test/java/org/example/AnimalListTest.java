package org.example;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class AnimalListTest {

    @org.junit.jupiter.api.Test
    void addTest_addNoAnimals() {
        AnimalList animalList = new AnimalList();

        String expected = "";
        String actual = animalList.toString();

        Assertions.assertEquals(
              expected,
              actual
        );
    }

    @org.junit.jupiter.api.Test
    void addTest_addMultipleAnimals() {
        Animal cow = new Animal("Cow");
        Animal cat = new Animal("Cat");
        Animal dog = new Animal("Dog");
        Animal pig = new Animal("Pig");
        Animal firstSheep = new Animal("Sheep");
        Animal secondSheep = new Animal("Sheep");
        AnimalList animalList = new AnimalList();

        animalList.add(cow);
        animalList.add(cat);
        animalList.add(dog);
        animalList.add(pig);
        animalList.add(firstSheep);
        animalList.add(secondSheep);
        animalList.add(pig);

        String expected = "Cow -> Cat -> Dog -> Pig -> Sheep -> Sheep -> Pig";
        String actual = animalList.toString();

        Assertions.assertEquals(
              expected,
              actual
        );
    }

    @org.junit.jupiter.api.Test
    void removeTest_removeFromBeginning() {
        Animal cow = new Animal("Cow");
        Animal cat = new Animal("Cat");
        Animal dog = new Animal("Dog");
        Animal pig = new Animal("Pig");
        Animal firstSheep = new Animal("Sheep");
        Animal secondSheep = new Animal("Sheep");
        AnimalList animalList = new AnimalList();

        animalList.add(cow);
        animalList.add(cat);
        animalList.add(dog);
        animalList.add(pig);
        animalList.add(firstSheep);
        animalList.add(secondSheep);
        animalList.add(pig);

        animalList.remove(cow);

        String expected = "Cat -> Dog -> Pig -> Sheep -> Sheep -> Pig";
        String actual = animalList.toString();

        Assertions.assertEquals(
                expected,
                actual
        );
    }

    @org.junit.jupiter.api.Test
    void removeTest_removeFromEnd() {
        Animal cow = new Animal("Cow");
        Animal cat = new Animal("Cat");
        Animal dog = new Animal("Dog");
        Animal pig = new Animal("Pig");
        Animal firstSheep = new Animal("Sheep");
        Animal secondSheep = new Animal("Sheep");
        AnimalList animalList = new AnimalList();

        animalList.add(cow);
        animalList.add(cat);
        animalList.add(pig);
        animalList.add(firstSheep);
        animalList.add(secondSheep);
        animalList.add(pig);
        animalList.add(dog);

        animalList.remove(dog);

        String expected =  "Cow -> Cat -> Pig -> Sheep -> Sheep -> Pig";
        String actual = animalList.toString();

        Assertions.assertEquals(
                expected,
                actual
        );
    }

    @org.junit.jupiter.api.Test
    void removeTest_removeMultiple() {
        Animal cow = new Animal("Cow");
        Animal cat = new Animal("Cat");
        Animal dog = new Animal("Dog");
        Animal pig = new Animal("Pig");
        Animal firstSheep = new Animal("Sheep");
        Animal secondSheep = new Animal("Sheep");
        AnimalList animalList = new AnimalList();

        animalList.add(cow);
        animalList.add(cat);
        animalList.add(pig);
        animalList.add(firstSheep);
        animalList.add(secondSheep);
        animalList.add(pig);
        animalList.add(dog);

        animalList.remove(firstSheep);
        animalList.remove(pig);

        String expected =  "Cow -> Cat -> Dog";
        String actual = animalList.toString();

        Assertions.assertEquals(
                expected,
                actual
        );
    }

    @org.junit.jupiter.api.Test
    void removeTest_removeAll() {
        Animal cow = new Animal("Cow");
        Animal cat = new Animal("Cat");
        Animal dog = new Animal("Dog");
        Animal pig = new Animal("Pig");
        Animal firstSheep = new Animal("Sheep");
        Animal secondSheep = new Animal("Sheep");
        AnimalList animalList = new AnimalList();

        animalList.add(cow);
        animalList.add(cat);
        animalList.add(pig);
        animalList.add(firstSheep);
        animalList.add(secondSheep);
        animalList.add(pig);
        animalList.add(dog);

        animalList.remove(firstSheep);
        animalList.remove(pig);
        animalList.remove(cow);
        animalList.remove(cat);
        animalList.remove(dog);

        String expected =  "";
        String actual = animalList.toString();

        Assertions.assertEquals(
                expected,
                actual
        );
    }
}