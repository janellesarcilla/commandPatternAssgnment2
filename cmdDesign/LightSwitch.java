package cmdDesign;

public class LightSwitch {

    private int brightness = 1;

   public void on (){
    System.out.println("The light is ON!");
    System.out.println("LIGHT:   ◉ ON   ○ OFF");
   }

   public void off() {
    System.out.println("\nThe light is OFF!");
    System.out.println("LIGHT:   ○ ON   ◉ OFF");
   }
   
   public void increaseBrightness() {
    System.out.println("╭────────────────────────────────╮");
    System.out.println("│       Brightness Setting       │");
    System.out.println("├────────────────────────────────┤");
    System.out.println("│  Brightness: " + brightness + "                 │");
    System.out.println("│                    [ + ] [ - ] │");
    System.out.println("╰────────────────────────────────╯");
    brightness++;
    System.out.println("Increasing brightness..");
    System.out.println("╭────────────────────────────────╮");
    System.out.println("│       Brightness Setting       │");
    System.out.println("├────────────────────────────────┤");
    System.out.println("│  Brightness: " + brightness + "                 │");
    System.out.println("│                    [ + ] [ - ] │");
    System.out.println("╰────────────────────────────────╯");

   }
   public void decreaseBrightness() {
    System.out.println("Lowering brightness..");
    brightness--;
    System.out.println("╭────────────────────────────────╮");
    System.out.println("│       Brightness Setting       │");
    System.out.println("├────────────────────────────────┤");
    System.out.println("│  Brightness: " + brightness + "                 │");
    System.out.println("│                    [ + ] [ - ] │");
    System.out.println("╰────────────────────────────────╯");
   }
    
}
