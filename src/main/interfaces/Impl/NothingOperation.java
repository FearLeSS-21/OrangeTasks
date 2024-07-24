package main.interfaces.Impl;
import main.interfaces.StringOperation;

public class NothingOperation implements StringOperation {

    @Override
    public String operate(String subString) {
        return subString;
    }
}
