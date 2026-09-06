package cmdDesign;

public class BrightnessUp implements CentralHub {
    private LightSwitch lights;

    public BrightnessUp (LightSwitch lights)
    {
        this.lights = lights;
    }

    @Override 
    public void execute(){
        lights.increaseBrightness();
    }
    
}
