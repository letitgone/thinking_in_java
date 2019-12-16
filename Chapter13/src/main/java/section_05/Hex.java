package section_05;

import net.mindview.util.BinaryFile;

import java.io.File;

/**
 * @Author ZhangGJ
 * @Date 2019/06/11
 */
public class Hex {
    public static String format(byte[] data) {
        StringBuilder result = new StringBuilder();
        int n = 0;
        for (byte b : data) {
            if (n % 16 == 0)
                result.append(String.format("%05X: ", n));
            result.append(String.format("%02X ", b));
            n++;
            if (n % 16 == 0)
                result.append("\n");
        }
        result.append("\n");
        return result.toString();
    }

    public static void main(String[] args) throws Exception {
        if (args.length == 0)
            // Test by displaying this class file:
            System.out.println(format(BinaryFile.read("README.MD")));
        else
            System.out.println(format(BinaryFile.read(new File(args[0]))));
    }
}