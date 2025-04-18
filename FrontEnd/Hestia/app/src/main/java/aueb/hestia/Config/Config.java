package aueb.hestia.Config;

import java.io.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import java.io.IOException;

public class Config {
    private JSONObject j;
    public Config() {
        try {
            String osName = System.getProperty("os.name").toLowerCase();

            Object jsonFile = null;
            if (osName.contains("windows")) {

                String filePath = new File("").getAbsolutePath();
                jsonFile = new JSONParser().parse(new FileReader(filePath + "\\src\\main\\java\\aueb\\hestia\\Config\\" + "config.json"));

            }else if (osName.contains("linux")) {
                String filePath = new File("").getAbsolutePath();
                jsonFile = new JSONParser().parse(new FileReader(filePath+"/Hestia/src/main/java/aueb/hestia/Config/"+"config.json"));

            }
            else
            {
                String filePath = new File("").getAbsolutePath();
                jsonFile = new JSONParser().parse(new FileReader(filePath + "\\src\\main\\java\\aueb\\hestia\\Config\\" + "config.json"));
            }

            j = (JSONObject) jsonFile;
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
    public int getNumberOfWorkers() {
        Long num =  (Long) j.get("NumberOfWorkers");
        return num.intValue();
    }
    public int getReducerPort() {
        return (int) (long) j.get("ReducerPort");
    }

    public int getWorkersPort() {
        return (int) (long) j.get("WorkersPort");
    }
    public String getWorkersIP()
    {
        return (String) j.get("WorkerIP");
    }

    public String getReducerIP()
    {
        return (String) j.get("ReducerIP");
    }

    public int getClientRequestListenerPort() {
        return (int) (long) j.get("ClientRequestListenerPort");
    }

    public int getReducerRequestListener() {
        return (int) (long) j.get("ReducerRequestListener");
    }

    public String getMasterIp(){
        return (String) j.get("MasterIP");
    }
    public String getCounterIp(){
        return (String) j.get("CounterIP");
    }
    public int getCounterPort() {
        return (int) (long) j.get("CounterPort");
    }
}
