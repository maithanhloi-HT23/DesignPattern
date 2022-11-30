package StructuralPatterns.DecoratorPattern;

import StructuralPatterns.DecoratorPattern.decorators.*;

import java.io.File;

public class Demo {
    static final String thuMucHT = System.getProperty("user.dir");
    static final String seprator = File.separator;
    static final String path_file = thuMucHT + seprator + "out" + seprator + "OutputDemo.txt";

    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource(path_file)));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource(path_file);

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
