/**
 * Exemple sur les interfaces
 */

package cours_exercices.cours;

// Interface machine a laver
public interface IMachineALaver{

    // Enumerations
    
    // Methodes declarees dans l'interface.
    public abstract void chargeLinge(int masse);
    public abstract void laver();
    public abstract String dechargeLinge();
}

// Classe MachineALaver implementant l'interface
public class MachineALaver implements IMachineALaver{

    // Proprietes
    private int masseDeLinge;
    // true = ouvert ; false = fermer
    private boolean isOpen = true;

    // Constructeur
    
    // Getters
    
    // Setters
    public boolean setIsOpen(boolean isOpen){
        this.isOpen = isOpen;
        return this;
    }
    
    // Methodes implementant l'interface
    @Override
    public void chargeLinge(int masse){
        setIsOpen(false);
        this.masseDeLinge = masse;
    }

    @Override
    public void laver(){
        System.out.println("Dur de faire tourner " + this.masseDeLinge + " !!");
    }

    @Override
    public String dechargeLinge(){
        setIsOpen(true);
        return "Voilà, c'est propre. On enlève " + this.masseDeLinge;
    }
}

// Classe principale
public class Interfaces {
    public static void main(String[] args) {

        MachineALaver whirpool = new MachineALaver();
        whirpool.chargeLinge(40);
        whirpool.lave();
        whirpool.dechargeLinge();
    }
}