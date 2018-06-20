package com.example.ardo.recyclerviewcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView lstChatHistory;
    LinearLayoutManager linear;

    List<PolaItem> item;
    ChatAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstChatHistory = (RecyclerView) findViewById(R.id.lst_chat_history);

        linear = new LinearLayoutManager(this);
        lstChatHistory.setLayoutManager(linear);

        item = new ArrayList<>();
        item.add(new PolaItem(0, "Yuningsih","Assalamualaikum", "07:32 PM"));
        item.add(new PolaItem(0, "Monic","Mas ardo lagi dimana?", "10:54 AM"));
        item.add(new PolaItem(0, "Ardo Manis","Hallo ardo", "09:31 AM"));

        adapter = new ChatAdapter(this, item);

        lstChatHistory.setAdapter(adapter);
    }
}
