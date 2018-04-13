package com.example.ckrit.credithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    LoginHandler LH = new LoginHandler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void loginClick(View view) {
        EditText userField = (EditText) findViewById(R.id.userNameField);
        EditText passField = (EditText) findViewById(R.id.passWordField);
        String userName = userField.getText().toString();
        String passWord = passField.getText().toString();
        Toast.makeText(getApplicationContext(),"verifying..",Toast.LENGTH_SHORT).show();
        if(LH.verifyUser(userName,passWord)){
            // send the user to overview activity, they are verified
            Toast.makeText(getApplicationContext(),"verified!",Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(getApplicationContext(),"denied!",Toast.LENGTH_LONG).show();
        }
    }

    public void createAccountPrompt(View view) {

        AbstractBackend.users.add(new Account("test","1234"));
    }
}
