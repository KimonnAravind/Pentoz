package com.assigned.pentoz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity
{
Button signupp;
EditText uname,email,pword,againpword;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        signupp=(Button)findViewById(R.id.snp);
        uname=(EditText)findViewById(R.id.Uname);
        email=(EditText)findViewById(R.id.email);
        pword=(EditText)findViewById(R.id.Pword);
        againpword=(EditText)findViewById(R.id.CNFPword);
        Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();


        signupp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if((uname.getText().toString()).isEmpty()||(email.getText().toString()).isEmpty()||(pword.getText().toString()).isEmpty()||(againpword.getText().toString()).isEmpty())
                {
                    Toast.makeText(SignupActivity.this, "Empty fields are not acceptable", Toast.LENGTH_SHORT).show();

                }

                else
                {
                    Toast.makeText(SignupActivity.this, "Test Application", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}
