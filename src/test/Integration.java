package test;

import main.interfaces.StringOperation;
import main.operations.*;
import main.interfaces.Impl.*;
import main.stringFunifier.*;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

class StringFunifierIntegrationTest {

    @Test
    public void testStringFunifierIntegration() throws ExecutionException, InterruptedException {
        String boringString = "HelloWorld";
        List<Integer> startIndexes = Arrays.asList(1, 5);
        List<Integer> endIndexes = Arrays.asList(4, 8);
        List<StringOperation> operations = Arrays.asList(
                new ReverseOperation(new UpperCaseOperation(new NothingOperation())),
                new UpperCaseOperation(new NothingOperation())
        );

        StringFunifier funny = new StringFunifier(boringString, startIndexes, endIndexes, operations);
        String funnyString = funny.getFunnyString();
        Assertions.assertEquals("H(OLLE)(WORL)d", funnyString);
    }

    @Test
    public void testStringFunifierIntegration2() throws ExecutionException, InterruptedException {
        String boringString = "HelloWord";
        List<Integer> startIndexes = Arrays.asList(1, 5);
        List<Integer> endIndexes = Arrays.asList(4, 8);
        List<StringOperation> operations = Arrays.asList(
                new ReverseOperation(new NothingOperation()),
                new UpperCaseOperation(new NothingOperation())
        );

        StringFunifier funny = new StringFunifier(boringString, startIndexes, endIndexes, operations);
        String funnyString = funny.getFunnyString();
        Assertions.assertEquals("H(olle)(WORD)", funnyString);
    }
}
