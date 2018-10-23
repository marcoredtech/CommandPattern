package patterns.command;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  INVOKER
 */
public class InvocaComando {


    Map<String, Imessaggi> avaibleMessage = new HashMap<String,Imessaggi>();
    List<Imessaggi> listaMessaggi;


    public InvocaComando() {
        // Comandi Luce
        DispositivoLuce dispositivoLuce = new DispositivoLuce();
        listaMessaggi.add(new ComandoLuceOff(dispositivoLuce));
        listaMessaggi.add(new ComandoLuceOn(dispositivoLuce));

        PrecaricaComandi();
    }

    private void PrecaricaComandi(){
        for(Imessaggi m: listaMessaggi  ) {
            avaibleMessage.put(m.GetAvaibleCommand(),m);
        }
    }

    public void execute(String incommingMessage){
        avaibleMessage.get(incommingMessage).execute();
    }


}
