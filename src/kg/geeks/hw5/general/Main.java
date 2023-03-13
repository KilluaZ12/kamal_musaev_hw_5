package kg.geeks.hw5.general;

import kg.geeks.hw5.objects.Boss;
import kg.geeks.hw5.objects.Hero;

public class Main {
    public static void main(String[] args) {

        Boss thanos = new Boss();
        thanos.setHealth(1000);
        thanos.setDamage(50);
        thanos.setDefenseType("Armor");

        System.out.println("Thanos health: " + thanos.getHealth() + ", his damage: " + thanos.getDamage()
                + ", his type defense: " + thanos.getDefenseType());

        Hero[] heroes = createHeroes();
        for (Hero hero : heroes) {
            System.out.println("Hero health: " + hero.getHealth());
            System.out.println("Hero damage: " + hero.getDamage());
            System.out.println("Hero superpower: " + hero.getSuperpower());
        }


    }

    public static Hero[] createHeroes(){
        Hero scarletWitch = new Hero(100, 20, "Flight");
        Hero aurora = new Hero(80, 30, "Invisibility");
        Hero warrior = new Hero(120, 25);

        return new Hero[] {scarletWitch, aurora, warrior};
    }
}