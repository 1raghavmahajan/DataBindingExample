package com.example.roger.databindingexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import com.example.roger.databindingexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements CreateToastListener{

  ActivityMainBinding binding;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    DataClass object = new DataClass();
    object.setText("Hello World!");
    binding.setObject(object);
    binding.setBtnClickListener(this);

  }

  @Override
  public void onBtnClick() {
    Toast.makeText(this, binding.getObject().getText(), Toast.LENGTH_SHORT).show();
  }

}
