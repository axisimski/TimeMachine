package bg.axisimski.zeitmaschine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class JurassicActivity extends AppCompatActivity {

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

        output_tv.setText("Dinosoaru");

        setButtons();

        run(input);


    }

    public void run (char c){

        if(input=='r'){
            output_tv.setText("bla bala");
        }

        if(input=='l'){
            output_tv.setText("blablabala");
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
