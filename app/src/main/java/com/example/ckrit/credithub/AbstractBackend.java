package com.example.ckrit.credithub;

import java.util.ArrayList;

public abstract class AbstractBackend {
    // attributes
    String userName;
    String passWord;
    static ArrayList<Account> users = new ArrayList<>(1);

    // constructors
    AbstractBackend() {}

    // methods
    protected String getUserName() {
        return "REPLACEME";
    }

    protected String getPassWord() {
        return "REPLACEME";
    }

    void setUserName() {

    }
    void setPassWord() {

    }
}

class LoginHandler extends AbstractBackend {
    // attributes

    // constructors
    LoginHandler() {}

    // methods

    String getUserName(Account A) {                                                                 // not sure we will need these getters and setters, TBD
        return A.userName;
    }

    String getPassWord(Account A) {
        return A.passWord;
    }

    void setUserName(String userName_){

    }

    void setPassWord(String passWord_){

    }
    boolean verifyUser(String userName_, String passWord_) {
        // search for the username and match passwords, if verified, return true
        boolean verified = false;
        for (int i = 0; i<Account.users.size()-1;i++){
            if (users.get(i).userName.equals(userName_)){
                if (users.get(i).passWord.equals(passWord_)){
                    verified = true;
                }
            }
            else verified = false;
        }
        return verified;

    }

}

class Account extends AbstractBackend {
    // attributes
    public String userName;
    String passWord;
    static int accounts = users.size();                                                             // amount of accounts, equals the account number of the latest "Account" created.
    private int balance;                                                                            // credit balance
    private int accountNo;                                                                          // the specific account number for each object "Account"

    //constructors
    Account(String userName_, String passWord_) {
        balance = 200;
        this.accountNo = accounts++;                                                                // account number is amount of accounts plus plus
        //accounts = this.accountNo;                                                                  // now amount of accounts is equal to the account number.
        this.userName = userName_;                                                                  // hand over the username
        this.passWord = passWord_;                                                                  // hand over the password
    }

    // methods

    protected String getPassWord(){
        return this.passWord;
    }

}

class DataHandler extends AbstractBackend {

    void saveState() {}
    void loadState() {}

}