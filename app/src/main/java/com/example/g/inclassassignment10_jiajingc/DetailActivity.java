package com.example.g.inclassassignment10_jiajingc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView title = (TextView) findViewById(R.id.title);
        TextView time = (TextView) findViewById(R.id.time);
        TextView body = (TextView) findViewById(R.id.body);

        Intent intent = getIntent();
        BlogPost blogPost = (BlogPost) intent.getSerializableExtra("A Blogpost");

        title.setText(blogPost.getTitle());
        time.setText(blogPost.toReadableTime());
        body.setText(blogPost.getBody());
    }
}
