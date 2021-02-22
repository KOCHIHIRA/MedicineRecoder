package com.example.medicinerecoder;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CreateProject extends AppCompatActivity {
    RecyclerView recycler;
    List<Test> TestView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_project);

        recycler = findViewById(R.id.Wrap_components);
        TestView = new ArrayList<>();
        Test test = new Test();
        TestView.add(test);
        ViewAdapter viewadapter = new ViewAdapter(TestView);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(viewadapter);
        recycler.setHasFixedSize(true);
    }

    private void setRecyclerView() {
        ViewAdapter adapter = new ViewAdapter(TestView);
        recycler.setAdapter(adapter);
        recycler.setHasFixedSize(true);
    }

    private void initData() {
        Test test = new Test();
        TestView.add(test);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_right);
    }
}