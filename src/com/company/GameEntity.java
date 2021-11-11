package com.company;

public class GameEntity {
    private String name;
    private String power;
    private int health;
    private int damage;

    public GameEntity(String name, String power, int health, int damage) {
        this.name = name;
        this.power = power;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public String printInfo(){return " - " +health+ "hp " +damage+"dd способность -  "+power;}
}
