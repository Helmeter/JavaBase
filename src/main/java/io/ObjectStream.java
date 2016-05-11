package io;

import java.io.*;

/**
 * Created by helmeter on 5/10/16.
 */
public class ObjectStream {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO自动生成的方法存根
        ObjectOutputStream objectwriter=null;
        ObjectInputStream objectreader=null;

        try {
            objectwriter=new ObjectOutputStream(new FileOutputStream("img/student.txt"));
            objectwriter.writeObject(new Student("gg", 22));
            objectwriter.writeObject(new Student("tt", 18));
            objectwriter.writeObject(new Student("rr", 17));
            objectreader=new ObjectInputStream(new FileInputStream("img/student.txt"));
            for (int i = 0; i < 6; i++) {
                System.out.println(objectreader.readObject());
            }
        } catch (Exception  e) {
            // TODO自动生成的 catch 块
            e.printStackTrace();
        }finally{
            try {
                objectreader.close();
                objectwriter.close();
            } catch (IOException e) {
                // TODO自动生成的 catch 块
                e.printStackTrace();
            }

        }

    }

}
class Student implements Serializable{
    private String name;
    private int age;

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }


}