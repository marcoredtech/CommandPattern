package patterns.command;

public class DispositivoMacchinaCaffe extends Dispositivi {
    private boolean status = false;

    public DispositivoMacchinaCaffe(){

    }

    public void AccendiMacchina(){
        this.status = true;
        System.out.println("Accendo la macchina del caffè");
    }

    public void SpegniMacchina(){
        this.status = false;
        System.out.println("Sto spegnendo la macchina del caffè");
    }

    public void FaiCaffe(){
        System.out.println("Sto facendo il caffè");
    }


}
