package com.example.g.inclassassignment10_jiajingc;

import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ObjectActivity extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference postRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object);

        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference postRef = database.getReference("post");

    }


    public void save(View view) {
        EditText titleField = (EditText) findViewById(R.id.title);
        EditText bodyField = (EditText) findViewById(R.id.body);
        long currentTime = Calendar.getInstance().getTimeInMillis();

        String title = titleField.getText().toString();
        String body = bodyField.getText().toString();
        String time = String.valueOf(currentTime);

        BlogPost post = new BlogPost(title, body, time);

        postRef.setValue(post);
        postsRef.push().setValue(post);

        TextView statusView = (TextView) findViewById(R.id.display_status);
        statusView.setText(post.toString());

        statusView.setVisibility(View.VISIBLE)
        titleField.setText(--);
        bodyField.setText(--);
    }
}
