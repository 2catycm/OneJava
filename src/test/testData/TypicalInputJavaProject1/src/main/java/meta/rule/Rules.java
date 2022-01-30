package meta.rule;

import java.util.Map;
import java.util.TreeMap;

public final class Rules {
    public static final Map<String, Rule> rules;
    static {
        rules = new TreeMap<>();
        rules.put("1.1", new Rule("不允许"));
    }
}
