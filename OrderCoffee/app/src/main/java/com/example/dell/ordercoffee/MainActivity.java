package com.example.dell.ordercoffee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView show_quant,result;
    private CheckBox cream,chocolate;
    private int total_cost,quantity,price=20;
    private Button plus,minus,total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cream=findViewById(R.id.whipped_cream_checkbox);
        chocolate=findViewById(R.id.chocolate_checkbox);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        show_quant=findViewById(R.id.quant);
        result=findViewById(R.id.res);

        total=findViewById(R.id.total);

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantity<=0){
                    quantity = 0;

                }
                else{
                    --quantity;
                    show_quant.setText(quantity+"");
                }
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantity>=10){
                    quantity =10;

                }
                else{
                    quantity++;
                    show_quant.setText(quantity+"");
                }
            }
        });

        total.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if(cream.isChecked())
                {
                    price=price+10;
                }
                if(chocolate.isChecked())
                {
                    price=price+20;
                }
                total_cost=quantity*price;
                price=20;
                result.setText(total_cost+"");
            }
        });

    }
}
