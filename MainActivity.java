package org.geeksforgeeks.my;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button searchButton;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        searchButton = findViewById(R.id.button);
        result = findViewById(R.id.result);

        View.OnClickListener onClickListener = view -> result.setText("кнопка была нажата");

        searchButton.setOnClickListener(onClickListener);
    }
}