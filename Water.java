/** 
Author : Onur Tan

*/

public class Water extends Transmission{


      int[] waterValues; // It is used to keep the water values in an array
      
      protected int waterIndex; // It is used to control the index in waterValues array.
      private int waterPrice;
      private int powerOfWater;
      
      
      // Constructor Method
      public Water(){
        waterValues = new int[];
        waterIndex = 0;
        waterPrice = 0;
        powerOfWater = 0;
      }
      
      @Override
      protected void fillArray(){
        int i = 0;
        while (i < 5){
          waterValues[i] = (i+1)*3;
          i++;
        }
        waterPrice = waterValues[0];
        powerOfWater = waterValues[0];
      }
      

}
