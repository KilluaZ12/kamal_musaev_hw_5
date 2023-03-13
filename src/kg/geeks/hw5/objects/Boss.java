package kg.geeks.hw5.objects;

public class Boss {
    private int health;
    private int damage;
    private String defenseType;

    public Boss(){}

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health <= 0) {
            System.out.println("Wrong value for health, it must be positive number!");
        } else {
            this.health = health;
        }
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        if (damage <= 0) {
            System.out.println("Wrong value for damage, it must be positive number!");
        } else {
            this.damage = damage;
        }
    }

    public String getDefenseType() {
        return defenseType;
    }

    public void setDefenseType(String defenseType) {
        this.defenseType = defenseType;
    }
}
