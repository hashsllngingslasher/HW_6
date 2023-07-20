public class Skeleton extends Boss{
    private int arrowsAmount;
    public Skeleton(int health, int damage, Weapon bossWeapon, int arrowsAmount){
        super(health, damage, bossWeapon);
        setArrowsAmount(arrowsAmount);
    }

    public int getArrowsAmount(){
        return arrowsAmount;
    }

    public void setArrowsAmount(int arrowsAmount){
        this.arrowsAmount = arrowsAmount;
    }

    public String printInfo(){
        return super.printInfo() + "\nArrows : " + getArrowsAmount();
    }
}
