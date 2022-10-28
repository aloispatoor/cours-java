package exercices.abstraction;

public class Anglais extends Interprete {
    private String nomLangue = "Anglais";
    private String commentCaVa = "How are you?";
    
    @Override
    public String getNomLangue(){
        return this.nomLangue;
    }

    @Override
    public String getCommentCaVa(){
        return this.commentCaVa;
    }
}
