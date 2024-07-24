package main.operations;
import main.interfaces.StringOperation;
import  main.interfaces.Impl.Decorator;

class LowerCaseOperation extends Decorator {
    public LowerCaseOperation(StringOperation operations) {
        super(operations);
    }

    @Override
    public String operate(String subString) {
        subString = super.operate(subString);
        return subString.toLowerCase();
    }
}