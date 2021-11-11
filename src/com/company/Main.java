package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Enemy bossFallenAngel = new Enemy("Lucifer","Телекинез",1000,100);
        bossFallenAngel.orujie.setType("klinok");
        bossFallenAngel.orujie.setName("Azrael");
        System.out.println(bossFallenAngel.printInfo());

        Skeleton skelet_1 = new Skeleton("скелет-1","живучесть",120,25,25);
        skelet_1.orujie.setType("Luk");
        skelet_1.orujie.setName(" ");
        Skeleton skelet_2 = new Skeleton("skelet2","besmertie",130,30,20);
        skelet_2.orujie.setType("Luk");
        skelet_2.orujie.setName(" ");
        System.out.println(skelet_1.printInfo());
        System.out.println(skelet_2.printInfo());

        Hero hero1 = new Hero("Капитан Америка","сверхсила",300,50);
        hero1.orujie.setType("щит");
        hero1.orujie.setName("звезда вебраниума");
        System.out.println(hero1.printInfo());

        Hero hero2 = new Hero("Halk","СВЕРХСИЛА",1000,100);
        hero2.orujie.setType(" ");
        hero2.orujie.setName("ГНЕВ");
        System.out.println(hero2.printInfo());
    }
}
