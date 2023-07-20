import java.util.Arrays;

public class Skeleton extends Boss{
    private int arrowsAmount;

    public int getArrowsAmount(){
        return arrowsAmount;
    }

    public void setArrowsAmount(int arrowsAmount){
        this.arrowsAmount = arrowsAmount;
    }

    public String printInfo(){
        return super.printInfo()+ "Arrows : " + arrowsAmount;
    }
}
