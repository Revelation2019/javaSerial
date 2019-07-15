package demo1;

import java.io.*;

public class SerializeDemo {
    public static void main(String[] args) {
        Employee employee = new Employee("zhousheng", "shanghai", 101, 500);
        try {
            FileOutputStream fo = new FileOutputStream(new File("./src/main/java/demo1/employee.ser"));
            ObjectOutputStream out = new ObjectOutputStream(fo);
            out.writeObject(employee);
            out.close();
            fo.close();
            System.out.println("序列化数据保存在employee.ser文件中");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
