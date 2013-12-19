package hxjad;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leo on 12/18/13.
 */
public class Variable {
    private Debugger debugger;
    private String name;
    private String type;
    private String value;
    private List<Variable> fields = new ArrayList<Variable>();
    private String path;

    public Debugger getDebugger() {
        return debugger;
    }

    public void setDebugger(Debugger debugger) {
        this.debugger = debugger;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<Variable> getFields() {
        return fields;
    }

    public void setFields(List<Variable> fields) {
        this.fields = fields;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
