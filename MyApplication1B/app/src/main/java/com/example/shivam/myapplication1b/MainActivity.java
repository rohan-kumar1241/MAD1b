package com.example.shivam.myapplication1b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText c1,c2,c3,aat;
    Button b;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=(EditText)findViewById(R.id.cie_1);
        c2=(EditText)findViewById(R.id.cie_2);
        c3=(EditText)findViewById(R.id.cie_3);
        aat=(EditText)findViewById(R.id.att);
        Button b=(Button)findViewById(R.id.button_Add);
        t=(TextView)findViewById(R.id.CIE);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                Editable a=c1.getText();
                int a1=Integer.parseInt(a.toString());
                Editable b=c2.getText();
                int a2=Integer.parseInt(b.toString());
                Editable c=c3.getText();
                int a3=Integer.parseInt(c.toString());
                Editable d=aat.getText();
                int a4=Integer.parseInt(d.toString());
                if( a1 > 20 || a2 > 20 || a3 > 20 || a4 >10)
                {
                    t.setText("Wrong Data. CIE marks/20 and AAT/10");
                }
                else
                {
                    int sum;
                    if(a1 > a2)
                    {
                        if( a2 > a3)
                        {
                            sum=a1+a2;
                        }
                        else
                        {
                            sum=a1 + a3;
                        }
                    }
                    else
                    {
                        if(a1 > a3)
                        {
                            sum=a1+a2;
                        }
                        else
                        {
                            sum=a2+a3;
                        }
                    }
                    sum+=a4;
                    t.setText("Total Marks " + String.valueOf(sum));
                }
            }
        });
    }
}
