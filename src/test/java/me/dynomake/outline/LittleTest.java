package me.dynomake.outline;

import me.dynomake.outline.model.BytesDataLimit;
import me.dynomake.outline.model.MetricMap;
import me.dynomake.outline.model.SetDataLimit;


public class LittleTest {
    public static void main(String[] args) {

        OutlineWrapper outlineWrapper = OutlineWrapper.create("https://127.0.0.1:50912/api");

        System.out.println("server: " + outlineWrapper.getServerInformation().name);
        outlineWrapper.renameKey(70, "heller");

        for (var key: outlineWrapper.getKeys().accessKeys) {
            System.out.println("key with id " + key.id + ", url is " + key.accessUrl + " name " + key.name);
        }

        MetricMap metricMap = outlineWrapper.getMetrics();

        metricMap.getBytesTransferredByUserId().forEach((key, value) -> {
            System.out.println("OutlineKeyId: " + key + ", BytesUsed: " + value);
        });

        BytesDataLimit bytesDataLimit = new BytesDataLimit(200L * 1024 * 1024);
        SetDataLimit dataLimit = new SetDataLimit(bytesDataLimit);

        Boolean result = outlineWrapper.setKeyDataLimit(120, dataLimit);
        System.out.println("Datalimit setted result: " + result.toString());



    }
}
