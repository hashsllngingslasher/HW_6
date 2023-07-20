public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon();
        bossWeapon.setWeaponType(WeaponType.THROWING);
        bossWeapon.setWeaponName("Explosion Head");
        Boss wither = new Boss();
        wither.setHealth(600);
        wither.setDamage(12);
        wither.setBossWeapon(bossWeapon);
        wither.printInfo();
        System.out.println("- - - - - - - - - - - - - - -");
        Weapon skeletonArcherWeapon = new Weapon();
        Boss skeletonArcher = new Boss();
        skeletonArcherWeapon.setWeaponType(WeaponType.RANGE);
        skeletonArcherWeapon.setWeaponName("Giant Bow");
        skeletonArcher.setHealth(400);
        skeletonArcher.setDamage(20);
        skeletonArcher.setBossWeapon(skeletonArcherWeapon);

        Weapon skeletonWarriorWeapon = new Weapon();
        Boss skeletonWarrior = new Boss();
        skeletonWarriorWeapon.setWeaponType(WeaponType.MELEE);
        skeletonWarriorWeapon.setWeaponName("Sword of Ancients");
        skeletonWarrior.setHealth(900);
        skeletonWarrior.setDamage(15);
        skeletonWarrior.setBossWeapon(skeletonWarriorWeapon);

        skeletonArcher.printInfo();
        System.out.println("- - - - - - - - - - - - - - -");
        skeletonWarrior.printInfo();
    }

}