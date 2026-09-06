package cmdDesign;

public class VolDown implements CentralHub {
    private MusicPlayer mp;

    public VolDown (MusicPlayer mp) {
        this.mp = mp;
    }

    @Override 
    public void execute(){
        mp.volDecrease();
    }
    
}