package cmdDesign;

public class ThermostatOn implements CentralHub {

    private Thermostat thermostat;

    public ThermostatOn (Thermostat thermostat){
        this.thermostat = thermostat;
    }

    @Override 
    public void execute(){
        thermostat.on();
    }
    
}
