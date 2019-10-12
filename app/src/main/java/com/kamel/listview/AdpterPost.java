package com.kamel.listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class AdpterPost extends ArrayAdapter<post> {

    public AdpterPost(Context context, List<post> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.post_row,parent,false);
        }

        TextView title=(TextView) convertView.findViewById(R.id.TV_title);
        TextView description=(TextView) convertView.findViewById(R.id.TV_description);

        post p=getItem(position);
        title.setText(p.getTitle());
        description.setText(p.getDescription());

        return convertView;
    }
}
