package net.openhft.chronicle.map;

import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;


/**
 * @author Rob Austin.
 */
public class TestBooleanValues {

    @Test
    @Ignore
    public void testTestBooleanValues() throws IOException, InterruptedException {
        ChronicleMap<Integer, Boolean> map = ChronicleMapBuilder.of(Integer.class, Boolean.class).create();
        map.put(7, true);
        Boolean currentValue = map.get(7); // IllegalStateException here
    }
}

