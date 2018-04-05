package com.engim.alfonso.myapplication.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import com.engim.alfonso.myapplication.R;
import com.engim.alfonso.myapplication.adapters.ShowDataAdpater;
import com.engim.alfonso.myapplication.adapters.ShowDataRecyclerAdapter;
import com.engim.alfonso.myapplication.models.Rifornimento;

import java.util.ArrayList;

/**
 * Created by Alfonso-LAPTOP on 27/03/2018.
 */

public class ShowDataActivity extends AppCompatActivity {

    private RecyclerView myShowDataList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.show_data);

        myShowDataList = findViewById(R.id.list);

        ArrayList<Rifornimento> data = new ArrayList<>();

        Rifornimento r = new Rifornimento("eni",30.0);
        data.add(r);
        data.add(r);
        data.add(r);
        data.add(r);
        data.add(r);
        ShowDataRecyclerAdapter adapter = new ShowDataRecyclerAdapter(getApplicationContext(),data);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        myShowDataList.setLayoutManager(linearLayoutManager);

        myShowDataList.setAdapter(adapter);


    }
}
