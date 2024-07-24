package main;

import main.interfaces.StringOperation;
import main.operations.*;
import main.interfaces.Impl.*;
import main.stringFunifier.*;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {


        Scanner scanner = new Scanner(System.in);
        String boringString = scanner.next();

        List<Integer> startIndexes = List.of(1, 5, 7, 11, 13);
        List<Integer> endIndexes = List.of(3, 5, 10, 12, 14);
        List<StringOperation> funOperations = List.of(
                new ReverseOperation(new CompressionOperation(new NothingOperation())),
                new UpperCaseOperation((new NothingOperation())),
                new CompressionOperation(new UpperCaseOperation(new SortOperation(new NothingOperation()))),
                new CompressionOperation(new NothingOperation()),
                new ReverseOperation(new UpperCaseOperation(new CompressionOperation(new NothingOperation())))

        );
        StringFunifier sd = new StringFunifier(boringString, startIndexes, endIndexes, funOperations);
        long startTime = System.currentTimeMillis();
        System.out.println("Time Before Execution : " + startTime);
        System.out.println(sd.getFunnyString());
        long endTime = System.currentTimeMillis();
        System.out.println("Time After Execution  : " + endTime);
        System.out.println("Total Execution Time  : " + (endTime - startTime));

    }


}