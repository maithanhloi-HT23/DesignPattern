package StructuralPatterns.DecoratorPattern.decorators;

public interface DataSource {
    void writeData(String data);
    String readData();
}
