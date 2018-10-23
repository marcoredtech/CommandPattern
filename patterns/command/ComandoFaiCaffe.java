package patterns.command;

public class ComandoFaiCaffe implements Imessaggi{
    private DispositivoMacchinaCaffe dispositivoMacchinaCaffe;

    public ComandoFaiCaffe(DispositivoMacchinaCaffe dispositivoMacchinaCaffe){
        this.dispositivoMacchinaCaffe = dispositivoMacchinaCaffe;
    }

    @Override
    public void execute() {
        dispositivoMacchinaCaffe.FaiCaffe();
    }

    @Override
    public String GetAvaibleCommand() {
        return "mcaffe.faicaffe";
    }
}
