package main.operations;
import main.interfaces.StringOperation;
import  main.interfaces.Impl.Decorator;
public class ReverseOperation extends Decorator {
    public ReverseOperation(StringOperation operations) {
        super(operations);
    }

    @Override
    public String operate(String subString) {
        subString = super.operate(subString);
        return new StringBuilder(subString).reverse().toString();

    }
}
