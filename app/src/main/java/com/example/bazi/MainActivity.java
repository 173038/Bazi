package com.example.bazi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.bazi.db.Repository;
import com.example.bazi.models.Cars;

public class MainActivity extends AppCompatActivity {

    TextView title;
    EditText enterPrice;
    EditText enterType;
    EditText enterNo;
    Button sub;
    public Repository repository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        repository = new Repository(getApplicationContext());
        initViews();
        submitListener(repository);




    }

    private void initViews() {

        title=findViewById(R.id.textView);
        enterType=findViewById(R.id.type);
        enterPrice=findViewById(R.id.price);
        enterNo=findViewById(R.id.No);
        sub=findViewById(R.id.submit);
    }

    void submitListener(final Repository repo){

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cars car=new Cars(enterType.getText().toString(),
                         Integer.valueOf(enterPrice.getText().toString()),
                        enterNo.getText().toString());

                repo.insert(car);
            }
        });
    }


}
