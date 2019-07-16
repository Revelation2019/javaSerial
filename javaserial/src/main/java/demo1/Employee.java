package demo1;

import java.io.Serializable;

public class Employee implements Serializable {
    //反序列化时会根据该类定义的serialVersionUID值、类路径、包路径来判断是否跟反序列化文件中这些值一样，若一样则反序列化，若不一样，则报错
    private static final long serialVersionUID = 1L;

    private String name;
    private String address;
    private transient int SSN;
    private int number;

    public Employee(String name, String address, int SSN, int number) {
        this.name = name;
        this.address = address;
        this.SSN = SSN;
        this.number = number;
    }

    @Override
    public String toString() {
        return this.name + " " + this.address + " " + this.SSN + " " + this.number;
    }
}
