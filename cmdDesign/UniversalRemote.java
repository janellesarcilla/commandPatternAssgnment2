package cmdDesign;

public class UniversalRemote {
    //Invoker
   public void press (CentralHub central) {
    central.execute();
   }
}

