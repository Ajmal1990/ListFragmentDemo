package com.ajmal.opentrenddemo;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ajmal.utilities.Result;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by ajmal on 7/4/16.
 */
public class ResultAdapter extends BaseAdapter {

    Context context;
    List<Result> result;

    ResultAdapter(Context context, List<Result> results){
        this.context = context;
        this.result = results;
    }

    @Override
    public int getCount() {
        return result.size();
    }

    @Override
    public Object getItem(int position) {
        return result.get(position);
    }

    @Override
    public long getItemId(int position) {
        return result.indexOf(getItem(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) context
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.list_row, null);
        }

        ImageView imageView = (ImageView) convertView.findViewById(R.id.image);
        TextView textView = (TextView) convertView.findViewById(R.id.txt);

        Result rslt = result.get(position);
        // setting the image resource and title
        Picasso.with(context).load(rslt.getEntity().getPicture()).into(imageView);
        textView.setText("Gender : "+rslt.getEntity().getGender());


        return convertView;
    }
}
