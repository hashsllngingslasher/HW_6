public class Boss extends GameEntity {
//    Boss() {
//        super();
//    }

    private Weapon bossWeapon;

    public Boss(int health, int damage, Weapon bossWeapon){
        super();
        this.setHealth(health);
        this.setDamage(damage);
        this.bossWeapon = bossWeapon;
    }

    public Weapon getBossWeapon() {
        return bossWeapon;
    }

    public void setBossWeapon(Weapon bossWeapon) {
        this.bossWeapon = bossWeapon;
    }

    public String printInfo() {
        return "Boss health: " + getHealth() +
                "\nBoss damage: " + getDamage() +
                "\nBoss weapon type: " + bossWeapon.getWeaponType() +
                "\nBoss weapon name: " + bossWeapon.getWeaponName();
    }
}

