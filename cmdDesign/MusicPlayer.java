package cmdDesign;

public class MusicPlayer {
    private int volume = 54; 

    public void on (){
        System.out.println("\nLoading..");
        System.out.println("Opening application..");
        System.out.println("♪♫════════════════════════════♫♪");
        System.out.println("    Welcome to Apple Music!");
        System.out.println("♪♫════════════════════════════♫♪");
        System.out.println("╭────────────────────────────────╮");
        System.out.println("│       🎵 MUSIC PLAYER          │");
        System.out.println("├────────────────────────────────┤");
        System.out.println("│ ▶ Chiquitita                   │");
        System.out.println("│ ━━━━━━━━━━━●━━━━━━             │");
        System.out.println("│ 02:15                 05:27    │");
        System.out.println("╰────────────────────────────────╯");


    }

    public void off(){
        System.out.println("\nMusic PAUSED");
        System.out.println("╭────────────────────────────────╮");
        System.out.println("│       🎵 MUSIC PLAYER          │");
        System.out.println("├────────────────────────────────┤");
        System.out.println("│ ⏸ Chiquitita                   │");
        System.out.println("│ ━━━━━━━━━━━●━━━━━━             │");
        System.out.println("│ 02:15                 05:27    │");
        System.out.println("╰────────────────────────────────╯");
        System.out.println("Closing application...");
        System.out.println("Application closed!");
    }

    public void volIncrease(){
        System.out.println("\n╭────────────────────────────────╮");
        System.out.println("│             VOLUME             │");
        System.out.println("├────────────────────────────────┤");
        System.out.println("│  Volume: " + volume + "                    │");
        System.out.println("│                    [ + ] [ - ] │");
        System.out.println("╰────────────────────────────────╯");
        
        System.out.println("\nIncreasing volume...");
        volume++;
        System.out.println("╭────────────────────────────────╮");
        System.out.println("│             VOLUME             │");
        System.out.println("├────────────────────────────────┤");
        System.out.println("│  Volume: " + volume + "                    │");
        System.out.println("│                    [ + ] [ - ] │");
        System.out.println("╰────────────────────────────────╯");
    }

    public void volDecrease(){
        System.out.println("\nDecreasing volume...");
        volume--;
        System.out.println("╭────────────────────────────────╮");
        System.out.println("│             VOLUME             │");
        System.out.println("├────────────────────────────────┤");
        System.out.println("│  Volume: " + volume + "                    │");
        System.out.println("│                    [ + ] [ - ] │");
        System.out.println("╰────────────────────────────────╯");
        
    }
}
