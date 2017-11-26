package com.example.johny.helloworld.Activity;

import android.content.Intent;
import android.graphics.Region;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.johny.helloworld.R;
import com.example.johny.helloworld.VisualStringsActivity;

public class HelloWorldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);

        Button btn = (Button)this.findViewById(R.id.firstBtn);

        //region Button Click Event
        btn.setOnClickListener(View->{
            String textToShow = "";

            CheckBox checkBox = (CheckBox)this.findViewById(R.id.myCheckBox);

            if(checkBox.isChecked())
            {
                EditText text = (EditText)this.findViewById(R.id.whatToSay_txt);

                textToShow = text.getText().toString();
            }
            else
            {
                RadioGroup radioGroup = (RadioGroup)this.findViewById(R.id.rdChosenOne);

                int checkedID = radioGroup.getCheckedRadioButtonId();

                RadioButton checkedRadioButton = (RadioButton) this.findViewById(checkedID);

                textToShow = checkedRadioButton.getText().toString();
            }


            if(textToShow.equals("Animal"))
            {
                Intent intent = new Intent(this, VisualStringsActivity.class);
                this.startActivity(intent);
            }
            else {
                Toast.makeText(this, textToShow, Toast.LENGTH_SHORT).show();
            }
        });
        //endregion


    }
}
