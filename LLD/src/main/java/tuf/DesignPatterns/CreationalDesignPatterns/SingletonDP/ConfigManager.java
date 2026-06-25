import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
    private HashMap<String, String> map = new HashMap<String, String>();

    private ConfigManager() {
        map.put("theme", "dark");
        map.put("language", "en");
    }
    private static volatile ConfigManager cfg = null;

    public static ConfigManager getInstance(){
        if(cfg == null){
            synchronized (ConfigManager.class){
                if (cfg == null) {
                    cfg = new ConfigManager();
                }
            }
        }
        return cfg;
    }

    public String get(String key){
        return map.get(key);
    }

    public void set(String key, String value){
        map.put(key, value);
    }

    public static void main(String[] args) {
        ConfigManager configA = ConfigManager.getInstance();
        ConfigManager configB = ConfigManager.getInstance();

        configA.set("theme","light");
        System.out.println(configB.get("theme"));

    }
}
