package patterns;

import patterns.command.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {


        InvocaComando invocaComando = new InvocaComando();
        DispositivoLuce dispositivoLuce = new DispositivoLuce();

        ComandoLuceOn comandoLuceOn = new ComandoLuceOn(dispositivoLuce);
        ComandoLuceOff comandoLuceOff = new ComandoLuceOff(dispositivoLuce);

        while(true){

            //arriva il primo messaggio
            invocaComando.ImpostaComando(comandoLuceOn);
            invocaComando.execute();

            //aspetta
            Thread.sleep(1000);

            // -----------------------------------------------------------------//

            //arriva il secondo messaggio
            invocaComando.ImpostaComando(comandoLuceOff);
            invocaComando.execute();

            //aspetta
            Thread.sleep(1000);


        }





    }


}
