package com.example.viewbindingdemosecond;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListViewAdapter listViewAdapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Hoàng","Tôn Thất Tùng"));
        customers.add(new Customer("Hoàng","Tôn Thất Tùng"));
        customers.add(new Customer("Hoàng","Tôn Thất Tùng"));
        customers.add(new Customer("Hoàng","Tôn Thất Tùng"));
        customers.add(new Customer("Hoàng","Tôn Thất Tùng"));
        customers.add(new Customer("Hoàng","Tôn Thất Tùng"));
        customers.add(new Customer("Hoàng","Tôn Thất Tùng"));
        listViewAdapter = new ListViewAdapter(customers);
        listView.setAdapter(listViewAdapter);
    }
}
