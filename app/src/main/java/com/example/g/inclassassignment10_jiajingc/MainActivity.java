package com.example.g.inclassassignment10_jiajingc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toActivity(View view) {

        switch (((Button) view).getText().toString() {
            case "Object":
                startActivity(new Intent(this, ObjectActivity.class));
                break;

        }
    }

}
