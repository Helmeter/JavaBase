package io;

/**
 * Created by helmeter on 5/11/16.
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileCon {

    /**
     * 包装类进行文件级联操作
     */
    public static void main(String[] args) {
        // TODO自动生成的方法存根
        try {
            String[] filenames= {"img/student1.txt","img/student2.txt" };
            concennateFile(filenames);
        } catch (Exception e) {
            // TODO自动生成的 catch 块
            e.printStackTrace();
        }
    }
    public static void concennateFile(String...fileName) throws Exception{
        String str;
        //构建对该文件您的输入流
        BufferedReader reader=null;
        StringBuilder s;
        BufferedWriter writer=new BufferedWriter(new FileWriter("img/student5.txt"));
        for(String name: fileName){
             reader=new BufferedReader(new FileReader(name));

            while ((str=reader.readLine())!=null) {
                writer.write(str);
                writer.newLine();
                writer.flush();

            }
        }
        writer.close();
    }

}