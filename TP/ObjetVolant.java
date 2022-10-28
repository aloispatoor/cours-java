package TP;

public abstract class ObjetVolant {
    protected String id;  

    public ObjetVolant (String id){
        this.id = id;
    }

    public boolean prepareVole(){
        System.out.println("Préparation vol");
        return false;
    };

    public boolean decolle(){
        if(prepareVole() == false){
            System.out.print("Décollage");
            return true;
        }
        return false;
    };

    public boolean vole(){
        if(decolle() == true){
            System.out.print("Vol");
            return true;
        }
        return false;
    };

    public boolean atterrit(){
        if(vole() == true){
            System.out.print("Atterrissage");
            return true;
        }
        return false;
    };

    public boolean repare(){
        if(vole() == false && atterrit() == false && decolle() == false){
            System.out.print("En réparation");
            return false;
        }
        System.out.print("Réparé");
        return true;
    };

}
