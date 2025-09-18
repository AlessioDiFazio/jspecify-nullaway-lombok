package fr.adf.jspecifylombok.records;

import lombok.Builder;
import org.jspecify.annotations.Nullable;

@Builder
public record RecordWithBuilder(@Nullable String arg1, @Nullable String arg2) {
}
