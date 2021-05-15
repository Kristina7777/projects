import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {
    public LowerCaseInputStream(InputStream in){
        super (in);
    }
    //реализовываем два метода read(), они получают байт или массив байтов и преобразуют каждый символ верхнего регистра к нижнему-
    public int read() throws IOException{
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char)c));
    }
    public int read(byte[]b, int offset, int len) throws IOException{
        int result = super.read(b,offset, len);
        for (int i = offset; i < offset + result;i++) {
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return result;
    }
}
