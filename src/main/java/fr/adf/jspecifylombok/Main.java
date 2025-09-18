package fr.adf.jspecifylombok;

import fr.adf.jspecifylombok.records.RecordWithBuilder;

public class Main {
    public static void main(String[] args) {
        var recordWithBuilder =
                RecordWithBuilder.builder().arg1("hello").arg2(null).build();
        System.out.println("recordWithBuilder = " + recordWithBuilder);
    }
}
