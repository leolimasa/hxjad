package hxjad;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by leo on 12/15/13.
 */
public class DummyProtocol extends HxcppProtocol {
    public ArrayList<Object> input = new ArrayList<Object>();
    public Queue<Object> output = new LinkedList<Object>();

    public void writeObject(Object obj) {
        input.add(obj);
    }

    public Object readObject() {
        return output.remove();
    }
}
