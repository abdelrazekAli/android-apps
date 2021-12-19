package com.example.contacts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    TextView tvName,tvNumber;
    ImageView imgPic;
    ImageButton imgbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent i = getIntent();

       String name = i.getExtras().getString("name");
       String number = i.getExtras().getString("number");
       int pic = i.getExtras().getInt("pic");

       imgPic= findViewById(R.id.img_detail);
       tvName= findViewById(R.id.tv_name_details);
       tvNumber=findViewById(R.id.tv_number_details);
       imgbtn=findViewById(R.id.imgbtn);

       imgPic.setImageResource(pic);
       tvName.setText(name);
       tvNumber.setText(number);

       imgbtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(Intent.ACTION_CALL);
               intent.setData(Uri.parse("tel:" + number));
               if (intent.resolveActivity(getPackageManager()) != null) {
                   startActivity(intent);
               }
           }
       });
    }
}