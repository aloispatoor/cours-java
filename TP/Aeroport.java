package TP;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Aeroport {

    private List<ObjetVolant> objetsVolants = new ArrayList<>();

    public void ajoute(ObjetVolant objetVolant) {
        this.objetsVolants.add(objetVolant);
    }

    private void demarre() {
        if (this.objetsVolants.isEmpty()) {
            return;
        }

        while (true) {
            for (ObjetVolant objetVolant : this.objetsVolants) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    System.out.println("Erreur grave");
                    return;
                }
                if (!objetVolant.prepareVole()) {
                    objetVolant.decolle();
                    objetVolant.vole();
                    objetVolant.atterrit();
                } else {
                    objetVolant.repare();
                }
            }
        }

    }

    public static void main(String args[]) {
        Aeroport charlesDeGaulle = new Aeroport();
        //Ajouter ici des avions
        ObjetVolant a320 = new AvionDeLigne("AirBus A320", 7800);
        ObjetVolant planeur = new Planeur("Planeur");
        ObjetVolant montgolfiere = new Montgolfiere("Montgolfiere", EtatEnveloppe.GONFLE);
        charlesDeGaulle.ajoute(a320);
        charlesDeGaulle.ajoute(planeur);
        charlesDeGaulle.ajoute(montgolfiere);
        //ObjetVolant objetVolant = new ....
        //charlesDeGaulle.ajoute(..);
        charlesDeGaulle.demarre();
    }
}
