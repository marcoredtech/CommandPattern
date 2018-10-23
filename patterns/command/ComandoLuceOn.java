package patterns.command;

/**
 * CONCRETE COMMAND
 */
public class ComandoLuceOn implements Imessaggi {

    private DispositivoLuce luce;

    public ComandoLuceOn(DispositivoLuce luce) {
        this.luce = luce;

    }

    @Override
    public void execute() {
        try {
            luce.LuceAccesa();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String GetAvaibleCommand() {
        return "luce.accendi";
    }
}
