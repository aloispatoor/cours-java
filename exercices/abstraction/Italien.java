package exercices.abstraction;

public class Italien extends Interprete {
    private String nomLangue = "Italien";
    private String commentCaVa = "Come vai?";
    
    @Override
    public String getNomLangue(){
        return this.nomLangue;
    }

    @Override
    public String getCommentCaVa(){
        return this.commentCaVa;
    }

}
