package hxjad;

import hxcpp.debugger.Command;
import hxcpp.debugger.Message;
import hxcpp.debugger.StringList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by leo on 12/18/13.
 */
public class Debugger {
    private HxcppProtocol protocol;

    /**
     * Returns a list of strings with all the class names running in the
     * client application
     *
     * @return
     * @throws IOException
     */
    public List<String> getClasses() throws IOException {
        protocol.writeObject(Command.Classes);
        Message msg = (Message) protocol.readObject();

        // The only param should be an array with the classes
        StringList list = (StringList) msg.params.__get(0);

        ArrayList<String> result = new ArrayList<String>();
        flattenStringList(list, result);

        return result;
    }

    public void addBreakpont(String file, int line) throws IOException {
        protocol.writeObject(Command.AddFileLineBreakpoint(file, line));
        Message msg = (Message) protocol.readObject();
    }

    public void resume() throws IOException {
        protocol.writeObject(Command.Continue(1));
        Message msg = (Message) protocol.readObject();
    }

    // TODO
    public void variables() throws IOException {
        protocol.writeObject(Command.Variables(true));
        Message msg = (Message) protocol.readObject();

        ArrayList<String> variables = new ArrayList<String>();
        flattenStringList((StringList) msg.params.__get(0), variables);

        expression(variables.get(1));

        System.out.println("Hola");
    }

    public Variable expression(String expr) throws IOException {
        protocol.writeObject(Command.PrintExpression(true, expr));
        Message msg = (Message) protocol.readObject();

        Variable result = new Variable();
        result.setName((String) msg.params.__get(0));
        result.setType((String) msg.params.__get(1));
        result.setValue((String) msg.params.__get(2));

        return result;
    }

    // TODO
    public void mem() throws IOException {
        protocol.writeObject(Command.Mem);
        Message msg = (Message) protocol.readObject();
    }

    public List<String> getFiles() throws IOException {
        protocol.writeObject(Command.Files);
        Message msg = (Message) protocol.readObject();

        // The only param should be an array with the classes
        StringList list = (StringList) msg.params.__get(0);

        ArrayList<String> result = new ArrayList<String>();
        flattenStringList(list, result);

        return result;
    }

    private void flattenStringList(StringList list, ArrayList<String> result) {
        result.add((String) list.params.__get(0));
        if (list.params.length > 1) {
            flattenStringList((StringList) list.params.__get(1), result);
        }
    }
}
