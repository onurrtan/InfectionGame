/** 
Author : Onur Tan

*/

public class Bird extends Transmission{


      int[] birdValues; // It is used to keep the water values in an array
      
      protected int birdIndex; // It is used to control the index in waterValues array.
      private int birdPrice;
      private int powerOfBird;
      
      
      // Constructor Method
      public Bird(){
        birdValues = new int[];
        birdIndex = 0;
        birdPrice = 0;
        powerOfBird = 0;
      }
      
      @Override
      protected void fillArray(){
        int i = 0;
        while (i < 5){
          biirdValues[i] = (i+1)*3;
          i++;
        }
        birdPrice = birdValues[0];
        powerOfBird = birdValues[0];
      }
      

}
