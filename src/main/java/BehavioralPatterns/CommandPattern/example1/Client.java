package BehavioralPatterns.CommandPattern.example1;

import BehavioralPatterns.CommandPattern.example1.commands.CloseAccount;
import BehavioralPatterns.CommandPattern.example1.commands.Command;
import BehavioralPatterns.CommandPattern.example1.commands.OpenAccount;
import BehavioralPatterns.CommandPattern.example1.receiver.Account;

public class Client {
    public static void main(String[] args) {
        Account account = new Account("gpcoder");

        Command open = new OpenAccount(account);
        Command close = new CloseAccount(account);
        BankApp bankApp = new BankApp(open, close);

        bankApp.clickOpenAccount();
        bankApp.clickCloseAccount();
    }
}
