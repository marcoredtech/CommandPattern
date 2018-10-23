package patterns.command;

/**
 * RECEIVER
 */
public class DispositivoLuce {
    private boolean statoLuce;

    public DispositivoLuce() {}

    public void LuceAccesa(){
        this.statoLuce = true;
        System.out.println("Luce accesa");
    }

    public void LuceSpenta(){
        this.statoLuce = false;
        System.out.println("Luce spenta");
    }
}
