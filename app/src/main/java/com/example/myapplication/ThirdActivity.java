package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String text_data = intent.getStringExtra("text");
        setContentView(R.layout.activity_third);
        EditText txt_input = this.findViewById(R.id.txt_input);
        Button go_btn = this.findViewById(R.id.go_btn);
        Button back_btn = this.findViewById(R.id.back_btn);
        TextView txt_view = this.findViewById(R.id.Constr_text);
        txt_view.setText(text_data);
        go_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_view.setText(txt_input.getText());
            }
        });
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("gg","bla-bla");
                setResult(0,intent);
                finish();
            }
        });
    }
}