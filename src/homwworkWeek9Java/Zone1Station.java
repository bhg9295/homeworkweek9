package homwworkWeek9Java;

import java.util.HashMap;
import java.util.Map;

// Write a programme that tells you which line passes through particular stations.Just use Zone 1 stations name.
public class Zone1Station {
    public static void main(String[] args) {
        Map<String,String[]> stationLine = new HashMap<>();
        stationLine.put("Piccadilly Circus", new String[]{"Bakerlooline","Piccadilly line"});
        stationLine.put("Waterloo", new String[]{"Jublilee line ", "Northeren line"});
        stationLine.put("BondStreet", new String[]{"Central line","Bakerlooline"});
        stationLine.put("Oxford circus", new String[]{"Central line","Victoria line"});
        stationLine.put("Paddington", new String[]{"Backerloo line", "Districtline"});
        System.out.println("few station name and line passing it");
        for(String key: stationLine.keySet()){
            System.out.println(key+":"+ String.join("",stationLine.get(key)));
        } 
    }

}
