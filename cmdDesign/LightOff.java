package cmdDesign;

public class LightOff implements CentralHub{
    private LightSwitch lights;

    public LightOff (LightSwitch lights) 
    {
        this.lights = lights;
    }

    @Override 
    public void execute() {
        lights.off();
    }

}
