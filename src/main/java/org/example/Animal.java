package org.example;

import java.util.Objects;

public class Animal {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(this.getName(), animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.getName());
    }
}
