package test;
/**
 * 程序启动后，要求用户输入一个文件名，如果文件存在则提示
 *  * 并要求用户更换，直到该文件还不存在为止，然后将这个文件
 *  * 在当前目录中创建出来。
 *  *
 *  * 单词记一记:
 *  * exsits 存在
 *  * create 创建
 *  * new    新的
 *  *
 *
 * */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Test5 {
    public static void main(String[] args) throws IOException {
      Scanner sc=new Scanner(System.in);
      while (true){
          System.out.println("请输入文件名：");
          String name=sc.nextLine();
          File file=new File(name);
          if(file.exists()){//判断文件是否存在
              System.out.println("该文件已经存在，请重新创建");
          }else{
              file.createNewFile();
              System.out.println("文件创建成功！！");
              break;
          }
      }
    }
}
