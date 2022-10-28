package cours;

public class OperationDouble implements OperationUnitaire {
    
    @Override
    public double effectuerOperation(double d){
        return 2 * d;
    }
}
