package com.example.roger.databindingexample;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class DataClass extends BaseObservable {

  private String text;

  @Bindable
  public String getText() {
    return text;
  }

  public void setText(String text) {
    if(!text.equals(this.text)) {
      this.text = text;
      notifyPropertyChanged(BR.text);
    }
  }

}
