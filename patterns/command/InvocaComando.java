package patterns.command;

/**
 *  INVOKER
 */
public class InvocaComando {

    Imessaggi messaggi;

    public void ImpostaComando(Imessaggi messaggi) {
        this.messaggi = messaggi;
    }

    public void execute(){
        messaggi.execute();
    }
}
