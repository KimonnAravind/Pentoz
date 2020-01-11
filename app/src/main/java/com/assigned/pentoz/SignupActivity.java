package com.assigned.pentoz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity
{
Button signupp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        signupp=(Button)findViewById(R.id.snp);

        signupp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignupActivity.this, "Test Application", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
