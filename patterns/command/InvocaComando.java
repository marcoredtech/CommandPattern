package patterns.command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  INVOKER
 */
public class InvocaComando {


    Map<String, Imessaggi> avaibleMessage = new HashMap<String,Imessaggi>();
    List<Imessaggi> listaMessaggi = new ArrayList<Imessaggi>();


    public InvocaComando() {
        // Comandi Luce
        DispositivoLuce dispositivoLuce = new DispositivoLuce();
        listaMessaggi.add(new ComandoLuceOff(dispositivoLuce));
        listaMessaggi.add(new ComandoLuceOn(dispositivoLuce));

        // Comandi caffè
        DispositivoMacchinaCaffe macchinaCaffe = new DispositivoMacchinaCaffe();
        listaMessaggi.add(new ComandoAccendiMacchinaCaffe(macchinaCaffe));
        listaMessaggi.add(new ComandoSpegniMacchinaCaffe(macchinaCaffe));
        listaMessaggi.add(new ComandoFaiCaffe(macchinaCaffe));

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
