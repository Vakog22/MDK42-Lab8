package com.example.vlab8;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout ;
import android.widget.TextView;
import android.widget.ImageView;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ConstraintLayout cl = (ConstraintLayout) findViewById(R.id.linlay);
        ImageView IV = (ImageView) findViewById(R.id.imageView) ;
        Button btn1 = (Button) findViewById(R.id.button);
        Button btn2 = (Button) findViewById(R.id.button2);
        TextView tw1 = (TextView) findViewById(R.id.textView) ;
        TextView tw2 = (TextView) findViewById(R.id.textView2) ;

        btn1.setText(R.string.btnred);
        btn2.setText(R.string.btndel);

        tw1.setText(R.string.pfname);
        tw2.setText(R.string.pfsurename);

        IV.setBackgroundResource(R.drawable.pfp);
        cl.setBackgroundResource(R.color.llBottomColor);




    }
}