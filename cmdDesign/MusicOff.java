package cmdDesign;

public class MusicOff implements CentralHub {
    private MusicPlayer mp;

    public MusicOff (MusicPlayer mp) {
        this.mp = mp;
    }

    @Override 
    public void execute() {
        mp.off();
    }
    
}
