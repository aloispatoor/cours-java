package cours_exercices.exercices.abstraction;

public abstract class Interprete {
    
    public String traduction(){
        return "En " + getNomLangue() + " on dit " + getCommentCaVa() + ".";
    }

    public abstract String getNomLangue();
    public abstract String getCommentCaVa();

}
