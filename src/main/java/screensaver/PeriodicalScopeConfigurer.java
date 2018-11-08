package screensaver;

import javafx.util.Pair;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

import static java.time.LocalTime.*;

/**
 * Created by Erik Feigin on 30/10/2018.
 */
public class PeriodicalScopeConfigurer implements Scope {
    Map<String, Pair<LocalTime,Object>> map = new HashMap<>();

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        if(map.containsKey(name) && (now().getSecond() - map.get(name).getKey().getSecond()) < 5) {
            return map.get(name).getValue();
        }

        Object newObject = objectFactory.getObject();
        map.put(name, new Pair(now(), newObject));
        return newObject;

    }

    @Override
    public Object remove(String name) {
        return null;
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {

    }

    @Override
    public Object resolveContextualObject(String key) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }
}
