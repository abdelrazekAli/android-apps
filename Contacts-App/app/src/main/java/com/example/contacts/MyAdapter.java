package com.example.contacts;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class MyAdapter extends BaseAdapter {
    Context context;
    Person [] persons;

    public MyAdapter(Context c, Person []p){
        context = c;
        persons = p;
    }

    @Override
    public int getCount() {
        return persons.length;
    }

    @Override
    public Object getItem(int position) {
        return persons[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        convertView= LayoutInflater.from(context).inflate(R.layout.item_person_main,null);
        ImageView imgPic =convertView.findViewById(R.id.img_pic_item);
        TextView tvName =convertView.findViewById(R.id.tv_name_item);
        TextView tvNumber =convertView.findViewById(R.id.tv_number_item);

        imgPic.setImageResource(persons[position].getPic());
        tvName.setText(persons[position].getName());
        tvNumber.setText(persons[position].getNumber());

        return convertView;


    }
}
