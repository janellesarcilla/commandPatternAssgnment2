package cmdDesign;

public class ThermostatOff implements CentralHub {

    private Thermostat thermostat;

    public ThermostatOff (Thermostat thermostat){
        this.thermostat = thermostat;
    }

    @Override 
    public void execute(){
        thermostat.off();
    }
    
}
