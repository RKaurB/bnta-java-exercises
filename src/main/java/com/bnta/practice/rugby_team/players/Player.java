package com.bnta.practice.rugby_team.players;

public class Player {

    // PROPERTIES
    private String name;
    private String position;
    private int number;
    private int contractLength;

    // CONSTRUCTOR
    public Player(String name, String position, int number, int contractLength) {
        this.name = name;
        this.position = position;
        this.number = number;
        this.contractLength = contractLength;
    }

    // Default Constructor
    // (Both constructors are valid and have their purpose)
    public Player() {}

    // GETTERS & SETTERS
    // (Encapsulation)

    // GETTERS
    // for each of the properties
    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getNumber() {
        return number;
    }

    private int getContractLength() {
        return contractLength;
    }

    // SETTERS
    // for each of the properties
    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setContractLength(int contractLength) {
        this.contractLength = contractLength;
    }

    // TOSTRING() METHOD
    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", number=" + number +
                ", contractLength=" + contractLength +
                '}';
    }
}
