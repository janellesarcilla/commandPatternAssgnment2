package cmdDesign;

public class LightOn implements CentralHub{ 
    private LightSwitch lights;

    public LightOn (LightSwitch lights) 
    {
        this.lights = lights;
    }

    @Override 
    public void execute() {
        lights.on();
    }
    
}
