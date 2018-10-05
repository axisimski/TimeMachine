package bg.axisimski.zeitmaschine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

     Button mars_btn, wwii_btn, jurassic_btn, other_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mars_btn=findViewById(R.id.mars_btn);
        jurassic_btn=findViewById(R.id.jurassic_btn);
        wwii_btn=findViewById(R.id.ww2_btn);
        other_btn=findViewById(R.id.other_btn);


        mars_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        jurassic_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, JurassicActivity.class);
                startActivity(intent);
            }
        });

        wwii_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(MainActivity.this, WWII_Act.class);
                startActivity(intent);

            }
        });

        other_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}
