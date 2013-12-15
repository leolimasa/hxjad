package hxjad;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by leo on 12/14/13.
 */
public class HxcppProtocol {
    private InputStream in;
    private OutputStream out;

    private static String serverIdent = "Haxe debug server v1.0 ready and willing, sir!\n\n";
    private static String clientIdent = "Haxe debug client v1.0 coming at you!\n\n";

    // _____________________________________________________________________________________________

    public Object readObject() throws IOException {

        // Reads the size of the object
        String sizeStr = readString(8);
        int size = Integer.parseInt(sizeStr);

        // Reads the serialized object
        String serialized = readString(size);

        // Decodes the serialized object
        return haxe.Unserializer.run(serialized);
    }

    // _____________________________________________________________________________________________

    public void writeObject(Object obj) throws IOException {
        String serialized = haxe.Serializer.run(obj);

        // Converts the length to string
        String objLength = Integer.toString(serialized.length());

        // Pads with zeroes if needed (needs to be at least 8 bytes)
        while (objLength.length() < 8) {
            objLength = "0" + objLength;
        }

        writeString(objLength);
        writeString(serialized);
    }

    // _____________________________________________________________________________________________

    public void handshake() throws IOException {
        readString(clientIdent.length());
        writeString(serverIdent);
    }

    // _____________________________________________________________________________________________

    /**
     * Reads X number of bytes from input and returns as a string.
     *
     * @param bytes how many bytes to read from input
     * @return
     */
    private String readString(int bytes) throws IOException {
        byte[] input = new byte[bytes];
        getIn().read(input, 0, bytes);
        System.out.println("<< " + new String(input));
        return new String(input);
    }

    // _____________________________________________________________________________________________

    /**
     * Writes the string in byte form to the OutputStream
     *
     * @param str String to end
     * @throws IOException
     */
    private void writeString(String str) throws IOException {
        byte[] output = str.getBytes();
        getOut().write(output);
        System.out.println(">> " + str);
    }

    // --------------------------------------------------------------------------------------------
    // GETTERS AND SETTERS
    // --------------------------------------------------------------------------------------------

    public InputStream getIn() {
        return in;
    }

    public void setIn(InputStream in) {
        this.in = in;
    }

    public OutputStream getOut() {
        return out;
    }

    public void setOut(OutputStream out) {
        this.out = out;
    }
}
