package cmdDesign;

public class VolUp implements CentralHub {
    private MusicPlayer mp;

    public VolUp (MusicPlayer mp) {
        this.mp = mp;
    }

    @Override 
    public void execute(){
        mp.volIncrease();
    }
    
}
