package com.company;

public class Skeleton extends Enemy{
    private int arrows;

    public Skeleton(String name, String power, int health, int damage,int arrows) {
        super(name, power, health, damage);
        this.arrows = arrows;
    }

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    @Override
    public String printInfo() {return super.printInfo() + " Количество выстрелов - " +getArrows();}
}
