/**
 * Created by turkmen on 15.12.2013.
 */
public class Sheep extends Transmission{

    int[] SheepArray = new int[5]; // Each Index Contain Own power
    protected int sheepIndex = 0; // Current index Start with 0 when the beginning of game
    @Override
    protected void fillArray(){
        for (int i = 0; i<5; i++){
            SheepArray[i] = i*10;
        }
    }


}

