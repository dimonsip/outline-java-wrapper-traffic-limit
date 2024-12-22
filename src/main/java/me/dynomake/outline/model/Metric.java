package me.dynomake.outline.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PUBLIC)
public class Metric {
    Integer outlineKeyId;
    BigInteger bytesUsed;
}
