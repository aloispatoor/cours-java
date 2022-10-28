package exercices.lambda;

public class ExLambda {
    public static void main(String[] args){
        // Définir une interface fonctionnelle; annotée comme interface fonctionnelle (OpertationBinaire)
        IOperationBinaire op1 = (double arg1, double arg2) -> {return arg1 * arg2;};
        executeOperation(op1, 5.5, 6.7);

        IOperationBinaire op2 = (double arg1, double arg2) -> {return arg1 / arg2;};
        executeOperation(op2, 12.9, 9.7);

        executeOperation((double arg1, double arg2) -> {return arg1 * arg2 + 45;}, 12, 4.5);
    }

    public static void executeOperation(IOperationBinaire operationBinaire, double arg1, double arg2){
        System.out.println(operationBinaire.execute(arg1, arg2));
    }
}
