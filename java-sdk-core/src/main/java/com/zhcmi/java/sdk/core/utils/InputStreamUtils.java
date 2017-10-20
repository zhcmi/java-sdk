package com.zhcmi.java.sdk.core.utils;

import java.io.*;
import java.nio.ByteBuffer;

/**
 * @author zhangcm
 * @version 1.0, 2017/10/20
 */
public class InputStreamUtils {

    private InputStreamUtils(){}

    public static String toString(InputStream inputStream, String charsetName) {
        StringBuilder out = new StringBuilder();
        try {
            byte[] b = new byte[4096];
            for (int n; (n = inputStream.read(b)) != -1; ) {
                out.append(new String(b, 0, n, charsetName));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return out.toString();
    }
}
