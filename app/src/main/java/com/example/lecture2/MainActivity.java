package com.example.lecture2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textInputEditText)
    TextInputEditText textInputEditText;
    @BindView(R.id.textInputEditText2)
    TextInputEditText textInputEditText2;
    @BindView(R.id.loginBtn)
    Button loginBtn;
    @BindView(R.id.imageView)
    ImageView imageView;
    @BindView(R.id.linearLayout)
    ConstraintLayout linearLayout;

//    Button btn;
//    @BindView(R.id.textInputLayout)  TextInputEditText t1;
//    @BindView(R.id.textInputLayout)  TextInputEditText t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();
//        ButterKnife.bind(this);
//        t1.setText("New Text");

//        btn = findViewById(R.id.loginBtn);
    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();
//    }

    @OnClick(R.id.loginBtn)
    public void onViewClicked() {
        Toast.makeText(this, "OnClick with plugin", Toast.LENGTH_SHORT).show();
    }
}