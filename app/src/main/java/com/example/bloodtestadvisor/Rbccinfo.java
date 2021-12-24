package com.example.bloodtestadvisor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Rbccinfo extends AppCompatActivity {

    EditText ag,c;
    RadioGroup rg;
    Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hemoc);
        ag=findViewById(R.id.age);
        c=findViewById(R.id.check);
        b=findViewById(R.id.botck);
        rg=findViewById(R.id.rg);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            final
            public void onClick(View view) {
                String a= ag.getText().toString();
                String p=c.getText().toString();
                int age= Integer.parseInt(a);
                float per= Float.parseFloat(p);
                if(age<61 && age>17){

                    switch (rg.getCheckedRadioButtonId()){
                        case (R.id.m):
                        {
                            if(per>=4.3 && per<=5.9){//normal
                                Intent i=new Intent(Rbccinfo.this,Nrbc.class);
                                startActivity(i);
                            }else if(per<4.5){//low
                                Intent i=new Intent(Rbccinfo.this,Lrbc.class);
                                startActivity(i);
                            }else{//high
                                Intent i=new Intent(Rbccinfo.this,Hrbc.class);
                                startActivity(i);
                            }

                        }break;
                        case (R.id.f):
                        {
                            if(per>=3.5 && per<=5.5){//normal
                                Intent i=new Intent(Rbccinfo.this,Nrbc.class);
                                startActivity(i);
                            }else if(per<3.5){//low
                                Intent i=new Intent(Rbccinfo.this,Lrbc.class);
                                startActivity(i);
                            }else{//high
                                Intent i=new Intent(Rbccinfo.this,Hrbc.class);
                                startActivity(i);
                            }
                        }break;
                    }


                }else{

                    Toast.makeText(Rbccinfo.this, "Please enter valid age", Toast.LENGTH_SHORT).show();


                }
            }
        });

    }
}