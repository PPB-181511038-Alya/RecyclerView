package com.example.tasklayout;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.Serializable;
import java.util.ArrayList;

public class SecondActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void onClick(View view) {
        Intent data = new Intent();
        EditText txt_task_name = (EditText)findViewById(R.id.txtTask);
        EditText txt_task_deadline = (EditText)findViewById(R.id.txtDeadline);
        data.setData(Uri.parse(txt_task_name.getText().toString()));
        setResult(RESULT_OK, data);
        //---closes the activity---
        finish();
    }
}

