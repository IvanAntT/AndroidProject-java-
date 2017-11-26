package com.example.johny.helloworld;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.johny.helloworld.Activity.HelloWorldActivity;
import com.example.johny.helloworld.Models.Animals;

public class VisualStringsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visual_strings);

//        String[] names = {"Ivan","Petur","Trifon"};
//
          ListView viewToShow = (ListView)this.findViewById(R.id.ListWithNames);
//
//        viewToShow.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names));

        Animals[] ListWithAnimal = {
                new Animals(1,"Dog","Rodvailer",12),
                new Animals(2,"Dog","Vulchak",20),
                new Animals(3,"Cat","Sibirska",1),
                new Animals(4,"Mouse","Hamster",3)
        };

        viewToShow.setAdapter(new ArrayAdapter<Animals>(this,-1,ListWithAnimal){
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                LayoutInflater inflatter = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                View view = inflatter.inflate(R.layout.animallistview,null);


                TextView setNames = (TextView)view.findViewById(R.id.itemName);

                setNames.setText(this.getItem(position).getName());

                TextView setPoroda= (TextView)view.findViewById(R.id.itemPoroda);

                setPoroda.setText(this.getItem(position).getPoroda());

                return view;
            }
        });

        viewToShow.setOnItemClickListener((parent,view,position,id)->{
            TextView name = (TextView)view.findViewById(R.id.itemName);
            if(name.getText().toString().equals("Dog"))
            {
                Intent intent = new Intent(this, HelloWorldActivity.class);
                this.startActivity(intent);
            }
            else {
                Toast.makeText(this, name.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
