public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon(WeaponType.THROWING, "Explosion Head");
        Boss wither = new Boss(600, 12, bossWeapon);
        System.out.println(wither.printInfo());
        System.out.println("- - - - - - - - - - - - - - -");

        Weapon skeletonArcherWeapon = new Weapon(WeaponType.RANGE, "Giant Bow");
        Skeleton skeletonArcher = new Skeleton(400, 20, skeletonArcherWeapon, 100);
        System.out.println(skeletonArcher.printInfo());
        System.out.println("- - - - - - - - - - - - - - -");

        Weapon skeletonWarriorWeapon = new Weapon(WeaponType.MELEE, "Sword of Ancients");
        Skeleton skeletonWarrior = new Skeleton(900, 15, skeletonWarriorWeapon, 20);
        System.out.println(skeletonWarrior.printInfo());
    }

}