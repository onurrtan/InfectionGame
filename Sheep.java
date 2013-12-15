/**
 * Created by turkmen on 15.12.2013.
 */
public class Sheep extends Transmission{

    int[] SheepArray; // Each Index Contain Own power and price these are same
    protected int sheepIndex; // Current index Start with 0 when the beginning of game
    private int sheepPrice;
    private int sheepPower;

    public Sheep(){
        SheepArray = new int[5];
        sheepIndex = 0;
        sheepPrice = 0;
        sheepPower = 0;
    }

    @Override
    protected void fillArray(){
        for (int i = 0; i<5; i++){
            SheepArray[i] = (i+1)*3; // i+1 because avoid first element be 0
        }
        sheepPrice = SheepArray[0];
        sheepPower = SheepArray[0];
    }

    public void buySheep(){
        sheepIndex++;
        sheepPrice = SheepArray[sheepIndex];
        sheepPower = SheepArray[sheepIndex];
    }

    public int getSheepPrice(){
        return this.sheepPrice;
    }
    public int getSheepPower(){
        return this.sheepPower;
    }


}

