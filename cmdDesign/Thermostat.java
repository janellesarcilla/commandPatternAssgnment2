package cmdDesign;

public class Thermostat {
    private int temp = 25;

    public void on (){
        System.out.println("╭────────────────────────────────╮");
        System.out.println("│       Thermostat Switch        │");
        System.out.println("├────────────────────────────────┤");
        System.out.println("│  Thermostat is turned ON       │");
        System.out.println("│                    [ + ] [ - ] │");
        System.out.println("╰────────────────────────────────╯");
    }
    
       public void off() { 
         System.out.println("\nTurning off thermostat..");
        System.out.println("╭────────────────────────────────╮");
        System.out.println("│       Thermostat Switch        │");
        System.out.println("├────────────────────────────────┤");
        System.out.println("│  Thermostat is turned OFF      │");
        System.out.println("╰────────────────────────────────╯");
       }
       public void increaseTemp() {
        temp++;
        System.out.println("\nIncreasing temperature...");
        System.out.println("╭────────────────────────────────╮");
        System.out.println("│       Thermostat Switch        │");
        System.out.println("├────────────────────────────────┤");
        System.out.println("│  Thermostat temp: " + temp+ "°C         │");
        System.out.println("│                    [ + ] [ - ] │");
        System.out.println("╰────────────────────────────────╯");
    
    
       }
       public void decreaseTemp() {
        temp--;
        System.out.println("\nDecreasing temperature...");
        System.out.println("╭────────────────────────────────╮");
        System.out.println("│       Thermostat Switch        │");
        System.out.println("├────────────────────────────────┤");
        System.out.println("│  Thermostat temp: " + temp+ "°C         │");
        System.out.println("│                    [ + ] [ - ] │");
        System.out.println("╰────────────────────────────────╯");
       }
}
