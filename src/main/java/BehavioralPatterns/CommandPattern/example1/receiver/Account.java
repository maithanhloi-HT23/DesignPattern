package BehavioralPatterns.CommandPattern.example1.receiver;

public class Account {
    private String name;

    public Account(String name){
        this.name = name;
    }

    public void open(){
        System.out.println("Account [" + name + "] Opened\n");
    }

    public void close(){
        System.out.println("Account [" + name + "] Closed\n");
    }
}
