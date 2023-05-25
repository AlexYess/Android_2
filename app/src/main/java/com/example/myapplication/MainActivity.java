package com.example.myapplication;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    public void msg_in_log(View view){
        Log.i("Decl", "Click on Button");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.logo);
        Toast.makeText(getApplicationContext(), "onCreate", Toast.LENGTH_SHORT).show();
        TextView txt_HW = this.findViewById(R.id.txt_1);
        Button btn_TC = this.findViewById(R.id.button);
        Button lin_layout = this.findViewById(R.id.lin_layout);
        Button rel_layout = this.findViewById(R.id.rel_layout);
        EditText txt_input = this.findViewById(R.id.txt_input_main);
        btn_TC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_HW.setText(txt_input.getText());
            }
        });
        lin_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                }
        });
        rel_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                String txt_data = txt_HW.getText().toString();
                intent.putExtra("text", txt_data);
                startActivity(intent);
            }
        });
        Log.e("onCreate", "error in onCreate");
        Log.w("onCreate", "warning in onCreate");
        Log.i("onCreate", "info in onCreate");
        Log.d("onCreate", "debug in onCreate");
        Log.v("onCreate", "verbose in onCreate");
    }


}
