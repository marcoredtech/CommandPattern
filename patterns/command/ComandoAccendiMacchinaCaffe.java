package patterns.command;

public class ComandoAccendiMacchinaCaffe implements Imessaggi{

    private DispositivoMacchinaCaffe dispositivoMacchinaCaffe;

    public ComandoAccendiMacchinaCaffe(DispositivoMacchinaCaffe dispositivoMacchinaCaffe){
        this.dispositivoMacchinaCaffe = dispositivoMacchinaCaffe;
    }

    @Override
    public void execute() {
        this.dispositivoMacchinaCaffe.AccendiMacchina();
    }

    @Override
    public String GetAvaibleCommand() {
        return "mcaffe.accendi";
    }
}
