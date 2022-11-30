package BehavioralPatterns.CommandPattern.example1.commands;

import BehavioralPatterns.CommandPattern.example1.receiver.Account;

public class OpenAccount implements Command{
    private Account account;

    public OpenAccount(Account account) {
        this.account = account;
    }

    @Override
    public void execute() {
        account.open();
    }
}
