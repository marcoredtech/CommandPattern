package patterns;

import patterns.command.*;

public class Main {



    public static void main(String[] args) throws InterruptedException {
         final String accendiLuce = "luci.accendi";
         final String spegniLuce = "luce.spegni";

        InvocaComando invocaComando = new InvocaComando();
        //DispositivoLuce dispositivoLuce = new DispositivoLuce();

        //ComandoLuceOn comandoLuceOn = new ComandoLuceOn(dispositivoLuce);
        //ComandoLuceOff comandoLuceOff = new ComandoLuceOff(dispositivoLuce);

        while(true){

            //arriva il primo messaggio

            invocaComando.execute(accendiLuce);

            //aspetta
            Thread.sleep(1000);

            // -----------------------------------------------------------------//

            //arriva il secondo messaggio

            invocaComando.execute(spegniLuce);

            //aspetta
            Thread.sleep(1000);


        }





    }


}
