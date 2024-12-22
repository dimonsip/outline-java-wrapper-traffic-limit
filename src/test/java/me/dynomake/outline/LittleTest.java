package me.dynomake.outline;

import me.dynomake.outline.model.MetricMap;


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

        Boolean result = outlineWrapper.setKeyDataLimit(120, 200L * 1024 * 1024);
        System.out.println("Datalimit setted result: " + result.toString());



    }
}
