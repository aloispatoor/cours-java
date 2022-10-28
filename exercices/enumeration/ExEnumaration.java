package exercices.enumeration;

public class ExEnumaration {
    public static void main(String[] args){
        States state = States.ERROR;

        // SWITCH
        switch(state){
            case ACTIVE :
                System.out.println("STATE : ACTIVE");
                break;
            
            case INACTIVE :
                System.out.println("STATE : INACTIVE");
                break;

            case UNKNOWN :
                System.out.println("STATE : UNKNOWN");
                break;
            
            default :
                System.out.println("ERROR");
        }

        // IF ... ELSE
        if(state == States.ACTIVE){
            System.out.println("STATE : ACTIVE");
        } else if(state == States.INACTIVE){
            System.out.println("STATE : INACTIVE");
        } else if(state == States.UNKNOWN){
            System.out.println("STATE : UNKNOWN");
        } else {
            System.out.println("ERROR");
        }
    }
}
