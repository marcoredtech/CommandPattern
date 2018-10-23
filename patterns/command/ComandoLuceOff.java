package patterns.command;

/**
 * CONCRETE COMMAND
 */
public class ComandoLuceOff implements Imessaggi {

    private DispositivoLuce luce;

    public ComandoLuceOff(DispositivoLuce luce) {
        this.luce = luce;
    }

    @Override
    public void execute() {
        try {
            luce.LuceSpenta();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String GetAvaibleCommand() {
        return "luce.spegni";
    }
}
