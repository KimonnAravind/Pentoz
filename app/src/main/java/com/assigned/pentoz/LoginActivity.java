package com.assigned.pentoz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity
{
    Button login;
    EditText Uname, Pword;
    TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login=(Button)findViewById(R.id.login);
        Uname=(EditText)findViewById(R.id.Uname);
        Pword=(EditText)findViewById(R.id.Pword);
        signup=(TextView)findViewById(R.id.signup);

        Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if((Uname.getText().toString()).isEmpty()||(Pword.getText().toString()).isEmpty())
                {
                    Toast.makeText(LoginActivity.this, "Empty User name or password", Toast.LENGTH_SHORT).show();

                }

                else
                {
                    Toast.makeText(LoginActivity.this, "Test Application, Click below option to go to SIGN UP activity", Toast.LENGTH_SHORT).show();

                }


            }
        });

    }
}
