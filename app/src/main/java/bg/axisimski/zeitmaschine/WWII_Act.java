package bg.axisimski.zeitmaschine;

import android.icu.util.Output;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class WWII_Act extends AppCompatActivity {

    private Button forward_btn, back_btn, left_btn, right_btn, ok_btn, no_btn;
    public TextView output_tv;
    public char input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wwii_);

        forward_btn=findViewById(R.id.forward_btn);
        back_btn=findViewById(R.id.back_btn);
        left_btn=findViewById(R.id.left_btn);
        right_btn=findViewById(R.id.right_btn);
        ok_btn=findViewById(R.id.ok_btn);
        no_btn=findViewById(R.id.no_btn);
        output_tv=findViewById(R.id.output_tv);

        output_tv.setText("Welcome to 1930's Germany, the country is rapidly militarizing." +
                "You are a poor class jewish person and with only 50 marks to your name" +
                "What would you like to do? Press 'Right' to immigrate east to Poland, 'Left to immigrate to the US " +
                "or ok to stay put for now ");

        setButtons();

      run(input);


    }

    public void run (char c){

        if(input=='r'){
            output_tv.setText("You were denied entry and returned to Germany, the ticket cost 15 marks, you have 35 left");
        }

        if(input=='l'){
            output_tv.setText("You have successfully made it across the Polish border, unfortunatly both the USSR and Nazi Germany are about to" +
                    " invade the country. What do you do? Press forward to fight for the Polish ary, Left to defect to the Soviet" +
                    "Union or Down to try to immigrate to Israel");
        }

    }


    private void setButtons(){

        forward_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 input='f';
                 run(input);
            }
        });

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input='b';
                run(input);
            }
        });

        left_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input='l';
                run(input);
            }
        });

        right_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input='r';
                run(input);
            }
        });

        ok_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input='o';
                run(input);
            }
        });

        no_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input='n';
                run(input);
            }
        });

    }




}
