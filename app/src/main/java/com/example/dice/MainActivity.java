package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView img=findViewById(R.id.imageView2);
        Button button=(Button)findViewById(R.id.button);
        final EditText t=(EditText) findViewById(R.id.editText) ;
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Random b=new Random();
                int a = b.nextInt(6)+1;
                t.setText(Integer.toString(a));

                   switch (a) {
                       case 1:
                           img.setImageResource(R.drawable.dicea);
                           break;
                       case 2:
                           img.setImageResource(R.drawable.diceb);
                           break;

                       case 3:
                           img.setImageResource(R.drawable.dicec);
                           break;
                       case 4:
                           img.setImageResource(R.drawable.diced);
                           break;
                       case 5:
                           img.setImageResource(R.drawable.dicee);
                           break;

                       case 6:
                           img.setImageResource(R.drawable.dicef);
                           break;
                       default:
                           img.setImageResource(R.drawable.dicea);
                   }




            }

        });
    }
}
