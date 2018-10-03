package bg.axisimski.zeitmaschine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WWII_Act extends AppCompatActivity {

    private Button forward_btn, back_btn, left_btn, right_btn, ok_btn, no_btn;

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

        setButtons();

    }

    public void run (char c){


    }


    private void setButtons(){

        forward_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                run('f');
            }
        });

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                run('b');
            }
        });

        left_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                run('l');
            }
        });

        right_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                run('r');
            }
        });

        ok_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                run('o');
            }
        });

        no_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                run('n');
            }
        });

    }




}
