package com.engim.alfonso.myapplication.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.engim.alfonso.myapplication.R;
import com.engim.alfonso.myapplication.adapters.ShowDataAdpater;
import com.engim.alfonso.myapplication.models.Rifornimento;

import java.util.ArrayList;

/**
 * Created by Alfonso-LAPTOP on 27/03/2018.
 */

public class ShowDataActivity extends AppCompatActivity {

    private ListView myShowDataList;

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
        ShowDataAdpater adapter = new ShowDataAdpater(getApplicationContext(),data);

        myShowDataList.setAdapter(adapter);


    }
}
