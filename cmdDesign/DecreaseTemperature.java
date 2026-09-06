package cmdDesign;

public class DecreaseTemperature implements CentralHub { 
    
    private Thermostat thermostat;

    public DecreaseTemperature(Thermostat thermostat) {
        this.thermostat = thermostat;
    }
    @Override 
    public void execute(){
        thermostat.decreaseTemp();
    }
    
}
