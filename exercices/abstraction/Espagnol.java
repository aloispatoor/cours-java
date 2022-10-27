package cours_exercices.exercices.abstraction;

public class Espagnol extends Interprete {
    private String nomLangue = "Espagnol";
    private String commentCaVa = "Cómo estás?";
    
    @Override
    public String getNomLangue(){
        return this.nomLangue;
    }

    @Override
    public String getCommentCaVa(){
        return this.commentCaVa;
    }
}
