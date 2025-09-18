package fr.adf.jspecifylombok;

import fr.adf.jspecifylombok.records.Container;
import fr.adf.jspecifylombok.records.RecordWithBuilder;
import java.util.Locale;
import org.jspecify.annotations.Nullable;

public class Main {
    public static void main(String[] args) {
        var recordWithBuilder = RecordWithBuilder.builder().arg1("hello").build();
        System.out.println("recordWithBuilder = " + recordWithBuilder);

        var main = new Main();
        main.nullSafeUpperCase(recordWithBuilder.arg2());

        System.out.println("Custom Builder: "
                + RecordWithBuilder.builder()
                        .assignBoth(new Container("heyhey"))
                        .build());
    }

    public void nullSafeUpperCase(@Nullable String arg) {
        System.out.println("doSomethingWithArg: " + String.valueOf(arg).toUpperCase(Locale.ROOT));
    }
}
