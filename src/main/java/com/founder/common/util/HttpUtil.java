package com.founder.common.util;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * @Description: Http工具类
 * @Author: yang_yi1@founder.com.cn
 * @Date: Created in 18:33 2018/5/16
 */
public class HttpUtil {

    /**
     * 向指定 URL 发送POST方法的请求
     *
     * @param url   发送请求的 URL
     * @param param 请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return 所代表远程资源的响应结果
     */
    public static String sendPost(String url, String param) {
        OutputStream out = null;
        BufferedInputStream in = null;
        ByteArrayOutputStream baos = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            conn.setRequestProperty("Accept-Charset", "UTF-8");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = conn.getOutputStream();
            // 发送请求参数
            byte[] bypes = param.getBytes("utf-8");
            out.write(bypes);
            // 读取URL的响应
            in = new BufferedInputStream(conn.getInputStream());
            baos = new ByteArrayOutputStream();
            int size = 0;
            byte[] buf = new byte[1024];
            while ((size = in.read(buf)) != -1) {
                baos.write(buf, 0, size);
            }
            result = new String(baos.toByteArray(), "utf-8");
        } catch (Exception e) {
            System.out.println("向"+url+"发送 POST 请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输出流、输入流
        finally {
            close(baos, in, out);
        }
        return result;
    }

    /**
     * 关闭流
     *
     * @param baos
     * @param in
     * @param out
     */
    private static void close(ByteArrayOutputStream baos, BufferedInputStream in, OutputStream out) {
        try {
            if (baos != null) {
                baos.close();
            }
            if (out != null) {
                out.close();
            }
            if (in != null) {
                in.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
