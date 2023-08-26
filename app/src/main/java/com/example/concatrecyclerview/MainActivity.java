package com.example.concatrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvdata;
    private cateAdapter mCateAdapter;
    private userAdapter mUserAdapter;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcvdata=(RecyclerView) findViewById(R.id.rcvdata);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        rcvdata.setLayoutManager(linearLayoutManager);

        mCateAdapter=new cateAdapter();
        mCateAdapter.setdata(getdata());


        mUserAdapter=new userAdapter();
        mUserAdapter.setdata(getdatauser());

        ConcatAdapter concatAdapter=new ConcatAdapter(mCateAdapter,mUserAdapter);  //chú ý phải là 1.2.0-alpha06 mới dc

        rcvdata.setAdapter(concatAdapter);



    }

    private List<user> getdatauser() {
        List<user> users=new ArrayList<>();
        users.add(new user(R.drawable.aaa,"user name 1","thai binh"));
        users.add(new user(R.drawable.anh,"user name 2","vung tau"));
        users.add(new user(R.drawable.oo,"user name 3","hai phong"));

        users.add(new user(R.drawable.aaa,"user name 1","thai binh"));
        users.add(new user(R.drawable.anh,"user name 2","vung tau"));
        users.add(new user(R.drawable.oo,"user name 3","hai phong"));

        users.add(new user(R.drawable.aaa,"user name 1","thai binh"));
        users.add(new user(R.drawable.anh,"user name 2","vung tau"));
        users.add(new user(R.drawable.oo,"user name 3","hai phong"));
        return users;
    }

    private List<category> getdata() {
        List<category> categories=new ArrayList<>();
        categories.add(new category(R.drawable.aaa,"anh 1"));
        categories.add(new category(R.drawable.anh,"anh 2"));
        categories.add(new category(R.drawable.oo,"anh 3"));

        categories.add(new category(R.drawable.aaa,"anh 1"));
        categories.add(new category(R.drawable.anh,"anh 2"));
        categories.add(new category(R.drawable.oo,"anh 3"));


        categories.add(new category(R.drawable.aaa,"anh 1"));
        categories.add(new category(R.drawable.anh,"anh 2"));
        categories.add(new category(R.drawable.oo,"anh 3"));

        return categories;
    }
}