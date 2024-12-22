package me.dynomake.outline.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PUBLIC)
public class SetDataLimit {
    private BytesDataLimit limit;
}
