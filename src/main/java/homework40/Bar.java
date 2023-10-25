package homework40;

import java.util.HashMap;
import java.util.Map;

public class Bar {
    public Map<String, Drink> bar = new HashMap<String, Drink>();

    public boolean  addDrink(String id, Drink drink){
        for (String key: bar.keySet()){
            if(key.equals(id)) return false;
        }
    bar.put(id,drink);
        return true;
    }
    public Drink getDrink(String id){
        for (String key: bar.keySet()){
            if(key.equals(id)) return bar.get(id);
        }
    return null;
    }


}
