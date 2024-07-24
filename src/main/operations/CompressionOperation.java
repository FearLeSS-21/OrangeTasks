package main.operations;
import main.interfaces.StringOperation;
import  main.interfaces.Impl.Decorator;
public class CompressionOperation extends Decorator {

    public CompressionOperation(StringOperation operations) {
        super(operations);
    }

    @Override
    public String operate(String subString) {
        subString = super.operate(subString);
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < subString.length(); i++) {
            if (subString.charAt(i) == subString.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(subString.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        compressed.append(subString.charAt(subString.length() - 1)).append(count);
        return compressed.toString();
    }
}
