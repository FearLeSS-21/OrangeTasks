package main.operations;

import main.interfaces.StringOperation;
import  main.interfaces.Impl.Decorator;
public class UpperCaseOperation extends Decorator {
    public UpperCaseOperation(StringOperation operations) {
        super(operations);
    }

    @Override
    public String operate(String subString) {
        subString = super.operate(subString);
        return subString.toUpperCase();
    }
}
