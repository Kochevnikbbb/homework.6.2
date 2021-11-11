package com.company;

public class Enemy extends GameEntity{
    Weapon orujie = new Weapon();
    public Enemy(String name, String power, int health, int damage) {
        super(name, power, health, damage);


    }

    public Weapon getOrujie() {
        return orujie;
    }

    public void setOrujie(Weapon orujie) {
        this.orujie = orujie;
    }
    public String printInfo(){return ConsoleColors.RED + getName() + ConsoleColors.RESET + super.printInfo() + " Тип оружия - " + orujie.getType()+" "+orujie.getName();}
}
