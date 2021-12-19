package com.example.contacts;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listPerson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person [] persons = {new Person("Abdelrazek", "01234567890",R.drawable.abdelrazek),
                new Person("Ali", "01234567891",R.drawable.ali),
                new Person("Ahmed", "01234567892",R.drawable.ahmed),
                new Person("Amer", "01234567893",R.drawable.abdelrazek),
                new Person("Mohamed", "01234567894",R.drawable.ali),
                new Person("Salah", "01234567895",R.drawable.ahmed),
                new Person("Messi", "01234567896",R.drawable.abdelrazek),
                new Person("Ali", "01234567897",R.drawable.ali),
                new Person("Ahmed", "01234567898",R.drawable.ahmed),
                new Person("Amer", "01234567899",R.drawable.abdelrazek),
                new Person("Mohamed", "01234567894",R.drawable.ali),
                new Person("Salah", "01234567895",R.drawable.ahmed),
                new Person("Messi", "01234567896",R.drawable.abdelrazek),
        };

        MyAdapter ad = new MyAdapter(MainActivity.this, persons);

        listPerson = findViewById(R.id.list_person);
        listPerson.setAdapter(ad);

        listPerson.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);

                i.putExtra("name",persons[position].getName());
                i.putExtra("number",persons[position].getNumber());
                i.putExtra("pic",persons[position].getPic());
                startActivity(i);
            }
        });

    }
}