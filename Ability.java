/**
 * Created by turkmen on 15.12.2013.
 */
public class Ability {
  
    private String coldness; // effective co efficent in urban areas
    private double cost; // Current Cost they will update for each trade
    private String drug;
    private String temperature;
    
    
    void changeAbility(){

    }
    protected void fillArray(){

    }
    
    public String getColdness(){
        return this.coldness;
    }

    public double getCost(){
        return this.cost;
    }

    public String getDrug(){
        return this.drug;
    }
    
    public String getTemperature(){
        return this.temperature;
    }
    
}
