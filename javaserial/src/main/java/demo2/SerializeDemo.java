package demo2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "zhouSheng";
        employee.address = "wuhan";
        employee.number = 600;

        try {

            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("./src/main/java/demo2/employee.ser"));
            out.writeObject(employee);
            out.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
            return;
        }catch (IOException e){
            e.printStackTrace();
            return;
        }

    }
}
