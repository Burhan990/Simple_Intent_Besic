package com.example.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView t,b;
    EditText e;
    String a="767884.98888";
    private Button bn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bn=(Button)findViewById(R.id.b1);
        e=(EditText)findViewById(R.id.e1);
        t=(TextView)findViewById(R.id.tx1);

        //final String a=e.getText().toString();

        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                i.putExtra("gg", e.getText().toString());
                startActivity(i);

                double ff=Double.parseDouble(a);

                t.setText(a);
            }
        });


        //Intent i=getIntent();
        //int a=i.getExtras().getInt("gg");
        //int b=i.getExtras().getInt("kk");

       // bn.setOnClickListener(new View.OnClickListener() {
           // @Override
           // public void onClick(View view) {
               // Intent i=new Intent(MainActivity.this,Main2Activity.class);

            //}
        //});
    }
}
