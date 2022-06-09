package com.example.kt_tranhieunghia;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import Adapter.ProductAdapter;
import models.ProductActivity;
import models.SaleManager;

public class listitem_shop extends AppCompatActivity {
    ListView lv;
    ProductAdapter adapter;
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listitem_shop);
        lv = (ListView) findViewById(R.id.lvProducts);
        //Khởi tạo các sản phẩm
        SaleManager saleManager = SaleManager.get();
        saleManager.generateProducts();

        //lấy các product từ class saleManager
        ArrayList products = saleManager.getProducts();
        adapter = new ProductAdapter(this, products);//khởi tạo adapter
        lv.setAdapter(adapter);//hiển lên listview
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        // nếu btnAdd được click
        if (id == R.id.btnAdd) {
            //đến màng hình ProductActivity
            Intent intent = new Intent(this, ProductActivity.class);
            //tham số -1 tức ta không truyền 1 position của item nào cả
            //ta mở ProductActivity để thêm sp mới
            intent.putExtra(ProductActivity.EXTRA_POSITION, -1);
            startActivityForResult(intent, 0);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}