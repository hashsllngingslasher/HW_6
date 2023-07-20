public class Boss extends GameEntity {
//    Boss() {
//        super();
//    }

    private Weapon bossWeapon;

    public Weapon getBossWeapon() {
        return bossWeapon;
    }

    public void setBossWeapon(Weapon bossWeapon) {
        this.bossWeapon = bossWeapon;
    }

    public String printInfo() {
        String info = "Boss health: " + getHealth() +
                "\nBoss damage: " + getDamage() +
                "\nBoss weapon type: " + bossWeapon.getWeaponType() +
                "\nBoss weapon name: " + bossWeapon.getWeaponName();
        System.out.println(info);
        return info;
    }
}

