package cmdDesign;

public class BrightnessDown implements CentralHub {
    private LightSwitch lights;

    public BrightnessDown (LightSwitch lights){
        this.lights = lights;
    }

    @Override 
    public void execute(){
        lights.decreaseBrightness();
    }
    
}
