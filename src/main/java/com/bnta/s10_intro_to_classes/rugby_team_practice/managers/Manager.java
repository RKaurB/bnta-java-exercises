package com.bnta.s10_intro_to_classes.rugby_team_practice.managers;

import java.util.Objects;

public class Manager {

    // PROPERTIES
    private String name;

    // CONSTRUCTORS
    public Manager(String name) {
        this.name = name;
    }

    // Default Constructor
    public Manager() {

    }

    // GETTERS
    public String getName() {
        return name;
    }

    // SETTERS
    public void setName(String name) {
        this.name = name;
    }

    // TOSTRING()
    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                '}';
    }

    // EQUALS()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return Objects.equals(name, manager.name);
    }

    // HASHCODE()
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
