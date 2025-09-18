package fr.adf.jspecifylombok.records;

import lombok.Builder;
import org.jspecify.annotations.Nullable;

@Builder
@SuppressWarnings("NullAway.Init")
public record RecordWithBuilder(@Nullable String arg1, @Nullable String arg2) {

    // Testing custom builder method
    public static class RecordWithBuilderBuilder {
        @SuppressWarnings("NullAway")
        public RecordWithBuilderBuilder assignBoth(Container c) {
            this.arg1 = c.value();
            this.arg2 = c.value();
            return this;
        }
    }
}
