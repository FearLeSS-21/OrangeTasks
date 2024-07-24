package main.operations;

import java.util.Arrays;

import main.interfaces.StringOperation;
import main.interfaces.Impl.Decorator;

public class SortOperation extends Decorator {

    public SortOperation(StringOperation operations) {
        super(operations);
    }

    @Override
    public String operate(String subString) {
        char[] chars = subString.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
