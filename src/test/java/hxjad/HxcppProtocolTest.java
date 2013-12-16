package hxjad;

import junit.framework.TestCase;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

/**
 * Created by leo on 12/15/13.
 */
public class HxcppProtocolTest extends TestCase {
    public void testWriteObject() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ArrayList<String> arr = new ArrayList<String>();
        HxcppProtocol prot = new HxcppProtocol();

        prot.setOut(out);
        prot.writeObject(arr);

        // the first eight bytes should be the message length, followed by the haxe serialization
        // of the object
        String expected = "00000025cy19:java.util.ArrayListg";
        assertEquals(out.toString(), expected);
    }

    public void testReadObject() throws Exception {
        String instr = "00000025cy19:java.util.ArrayListg";
        ByteArrayInputStream in = new ByteArrayInputStream(instr.getBytes());
        HxcppProtocol prot = new HxcppProtocol();
        prot.setIn(in);
        Object obj = prot.readObject();
        assertTrue(obj instanceof ArrayList);
    }
}
