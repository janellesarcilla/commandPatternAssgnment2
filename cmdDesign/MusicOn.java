package cmdDesign;

public class MusicOn implements CentralHub {
    private MusicPlayer mp;

    public MusicOn (MusicPlayer mp) {
        this.mp = mp;
    }

    @Override 
    public void execute() {
        mp.on();
    }
    
}