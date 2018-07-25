package com.example.allela.listvieww;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
        ListView listings;
        String[] students={
        "Rose","Bruce","Andrew","Enock","Allan","Gitau",
                "Ted","Naum","Tracy","Eve","Brian","Susan",
                "Mponzi","Zawadi","Dennis","Victor","Michael",
                "Brandy","Mary","Alex","Esther","BrianT"
        };
        /*an array adapter is used when you want to conver the items in
        * a listview to be views that are to be loaded on the
        * listview container*/
        ArrayAdapter<String> myadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listings=findViewById(R.id.list);
        myadapter=new ArrayAdapter<String>(
                this,R.layout.list_layout,students);
        listings.setAdapter(myadapter);
    }
}
