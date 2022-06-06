package com.example.kt_tranhieunghia;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class Bai3 extends AppCompatActivity {
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("List View");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                return true;
            case R.id.menu1:
                Toast.makeText(this, "Ban vua bam vao menu1", Toast.LENGTH_SHORT).show();//code xử lý khi bấm menu1
                break;
            case R.id.menu2:
                Toast.makeText(this, "Ban vua bam vao menu2", Toast.LENGTH_SHORT).show();//code xử lý khi bấm menu2
                break;
            case R.id.menu3:
                i = new Intent(Bai3.this,MainActivity.class);//code xử lý khi bấm menu3
                startActivity(i);
                break;
            case R.id.menu4:
                Toast.makeText(this, "Ban vua bam vao menu4", Toast.LENGTH_SHORT).show();//code xử lý khi bấm menu3
                break;

            default:break;
        }

        return super.onOptionsItemSelected(item);
    }

    public void moManHinhListView1(View view) {
        i = new Intent(Bai3.this,Listview1.class);//code xử lý khi bấm menu3
        startActivity(i);
    }

    public void moManHinhListView2(View view) {
        i = new Intent(Bai3.this,Listview2.class);//code xử lý khi bấm menu3
        startActivity(i);
    }

    public void moManHinhListView3(View view) {
        i = new Intent(Bai3.this,Listview3.class);//code xử lý khi bấm menu3
        startActivity(i);
    }
}