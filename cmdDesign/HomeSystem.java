package cmdDesign;

public class HomeSystem {
    public static void main(String[] args) {
        
        UniversalRemote rc = new UniversalRemote();
        MusicPlayer appleMusic = new MusicPlayer();
        Thermostat thermostat = new Thermostat();
        LightSwitch kitchen = new LightSwitch();
        
        CentralHub musicOn = new MusicOn(appleMusic);
        rc.press(musicOn);

        CentralHub volUp = new VolUp(appleMusic);
        rc.press(volUp);
        CentralHub volDown = new VolDown(appleMusic);
        rc.press(volDown);
        CentralHub musicOff = new MusicOff(appleMusic);
        rc.press(musicOff);
        System.out.println("----------------------------------");

        System.out.println("\n════════════════════════════");
        System.out.println("    Kitchen Light Switch");
        System.out.println("════════════════════════════");
        CentralHub lightsOn = new LightOn(kitchen);
        rc.press(lightsOn);
        
        CentralHub upBrightness = new BrightnessUp(kitchen);
        rc.press(upBrightness);
        CentralHub downBrightness = new BrightnessDown(kitchen);
        rc.press(downBrightness);

        CentralHub lightsOff = new LightOff(kitchen);
        rc.press(lightsOff);
        System.out.println("----------------------------------");


        System.out.println("\n════════════════════════════");
        System.out.println("         Thermostat ");
        System.out.println("════════════════════════════");
        CentralHub tempOn = new ThermostatOn(thermostat);
        rc.press(tempOn);
       
       
        CentralHub tempUp = new IncreaseTemperature(thermostat);
        rc.press(tempUp);
        CentralHub tempDown = new DecreaseTemperature(thermostat);
        rc.press(tempDown);

        CentralHub tempOff = new ThermostatOff(thermostat);
        rc.press(tempOff);

    } 
}

