package io;

import java.io.*;

/**
 * 使用流连接形式创建pw完成文本数据的写出操作
 *
 * */
public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        FileOutputStream fos=new FileOutputStream("demo.txt");//低级流：文件流，向文件中写入数据
        //高级流，转换流：负责衔接字符流与字节流，负责将写出的字符按照指定的字符集转换为字节
        OutputStreamWriter osw=new OutputStreamWriter(fos,"utf-8");
        //高级流，缓冲字符输出流，负责块写文本书加速
        BufferedWriter bw=new BufferedWriter(osw);
        //高级流pw赋值按行写字符串，并可以自动行刷新
        PrintWriter pw=new PrintWriter(bw);
        pw.println("我相信我就是我，我相信明天");
        pw.println("我相信青春没有地平线，在日落的海边，在热闹的大街，都是我心中最美的乐园");
        System.out.println("写出完毕");
        pw.close();
    }
}
