package demo2;

import java.io.Serializable;

public class Employee implements Serializable {
    public String name;
    public static String address;//static属性存储在方法区中，不参与序列化过程
    public transient final int SSN = 12;//final属性直接通过值参与序列化过程，加transient不会生效
    public int number;

    @Override
    public String toString() {
        return name + " " + address + " " + SSN + " " + number;
    }
}
