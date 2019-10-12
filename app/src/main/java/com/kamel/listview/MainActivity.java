package com.kamel.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listViewTuto;
    private ArrayList<post> posts;
    private AdpterPost adpterPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewTuto =(ListView)findViewById(R.id.ListViewTuto);
        posts=new ArrayList<>();

        posts.add(new post("mostafa","android"));
        posts.add(new post("mostafa","ios"));
        posts.add(new post("mostafa","backend"));
        posts.add(new post("mostafa","fondend"));
        posts.add(new post("mostafa","UX/UI"));

        adpterPost=new AdpterPost(this,posts);

        listViewTuto.setAdapter(adpterPost);

        listViewTuto.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                post p=posts.get(position);
                Toast.makeText(getApplicationContext(),p.getTitle()+ " " +p.getDescription(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
