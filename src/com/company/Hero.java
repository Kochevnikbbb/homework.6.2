package com.company;

public class Hero extends GameEntity{
    Weapon orujie = new Weapon();
    public Hero(String name, String power, int health, int damage) {
        super(name, power, health, damage);

    }
    public String printInfo(){return ConsoleColors.GREEN + getName() + ConsoleColors.RESET + super.printInfo() + " Тип оружия - " + orujie.getType()+" "+orujie.getName();}
}
