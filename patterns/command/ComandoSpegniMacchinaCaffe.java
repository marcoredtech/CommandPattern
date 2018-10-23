package patterns.command;

public class ComandoSpegniMacchinaCaffe implements Imessaggi{
    private DispositivoMacchinaCaffe dispositivoMacchinaCaffe;

    public ComandoSpegniMacchinaCaffe(DispositivoMacchinaCaffe dispositivoMacchinaCaffe){
        this.dispositivoMacchinaCaffe = dispositivoMacchinaCaffe;
    }


    @Override
    public void execute() {
        dispositivoMacchinaCaffe.SpegniMacchina();
    }

    @Override
    public String GetAvaibleCommand() {
        return "mcaffe.spegni";
    }
}
