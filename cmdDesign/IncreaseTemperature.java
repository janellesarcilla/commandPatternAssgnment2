package cmdDesign;

public class IncreaseTemperature  implements CentralHub {

    private Thermostat thermostat;

    public IncreaseTemperature(Thermostat thermostat) {
        this.thermostat = thermostat;
    }
    @Override 
    public void execute(){
        thermostat.increaseTemp();
    }
}
