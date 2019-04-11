package com.utsavshrestha.appdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    EditText make,year,color,price,engine;
    TextView setresult;
    Button btn_create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViews();
    }
    public void initializeViews(){
        make=(EditText)findViewById(R.id.make);
        year=(EditText)findViewById(R.id.year);
        color=(EditText)findViewById(R.id.color);
        price=(EditText)findViewById(R.id.price);
        engine=(EditText)findViewById(R.id.engine);

        setresult=(TextView)findViewById(R.id.setresult);

        btn_create=(Button)findViewById(R.id.btn_create);
        btn_create.setOnClickListener(this);


    }
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_create:
                CarModel model = new CarModel(make.getText().toString(),
                        year.getText().toString(),color.getText().toString(),price.getText().toString(),engine.getText().toString());

                setresult.setText(setresult.getText() +"\r\n"+model.toString()+"\r\n");

        }
    }

}
