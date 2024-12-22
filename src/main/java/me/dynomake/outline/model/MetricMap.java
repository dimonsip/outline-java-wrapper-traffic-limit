package me.dynomake.outline.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;
import java.util.Map;

@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PUBLIC)
public class MetricMap {
    Map<Integer, BigInteger> bytesTransferredByUserId;
}
