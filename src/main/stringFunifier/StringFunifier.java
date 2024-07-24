package main.stringFunifier;

import java.util.List;
import java.util.Vector;
import java.util.concurrent.*;

import main.interfaces.StringOperation;

public class StringFunifier {
    private final String inputString;
    private final List<Integer> startIndexes;
    private final List<Integer> endIndexes;
    private final List<StringOperation> operations;

    public StringFunifier(String inputString, List<Integer> startIndexes, List<Integer> endIndexes, List<StringOperation> operations) {
        this.inputString = inputString;
        this.startIndexes = startIndexes;
        this.endIndexes = endIndexes;
        this.operations = operations;
    }

    public String getFunnyString() throws InterruptedException, ExecutionException {
        StringBuilder result = new StringBuilder();
        int previousEnd = 0;

        for (int i = 0; i < startIndexes.size(); i++) {
            int start = startIndexes.get(i);
            int end = endIndexes.get(i);
            StringOperation operation = operations.get(i);

            result.append(inputString, previousEnd, start);

            String substring = inputString.substring(start, end + 1);
            List<Future<String>> Modify = startThreadsForOperations();
            String modify2 = Modify.get(i).get();
            result.append('(').append(modify2).append(')');

            previousEnd = end + 1;
        }

        result.append(inputString, previousEnd, inputString.length());

        return result.toString();
    }

    public List<Future<String>> startThreadsForOperations() throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(5);


        Vector<Callable<String>> callables = new Vector<Callable<String>>();

        for (int i = 0; i < startIndexes.size(); i++) {
            int start = startIndexes.get(i);
            int end = endIndexes.get(i);
            String boringSubString = (inputString.substring(start, end + 1));

            int finalI1 = i;



            callables.add(new Callable<String>() {
                public String call() throws Exception {
                    String result = operations.get(finalI1).operate(boringSubString);
                    return result;
                }
            });
        }
        java.util.List<Future<String>> futures = executorService.invokeAll(callables);
        executorService.shutdown();
        return futures;
    }
}