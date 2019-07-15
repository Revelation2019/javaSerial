package demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeDemo {
    public static void main(String[] args) {
        try {

            FileInputStream in = new FileInputStream("./src/main/java/demo1/employee.ser");
            ObjectInputStream oin = new ObjectInputStream(in);
            Employee employee = (Employee) oin.readObject();
            oin.close();
            in.close();
            System.out.println("反序列化完成...");
            System.out.println(employee.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
