package com.example.kts1_0308191047;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Intent i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void thoat(View view) {
        finish();
    }


    public void clickItemHandler(View view) {
        i=new Intent(MainActivity.this, MainActivity2.class);
        switch (view.getId()){
            case R.id.persol:
                i.putExtra("data","Cá nhân");
                break;
            case R.id.detail:
                i.putExtra("data","Chi tiêu bán hàng");
                break;
            case R.id.custom:
                i.putExtra("data","khách hàng");
                break;
            case R.id.list:
                i.putExtra("data","Danh sách tuyển");
                break;
            case R.id.tra:
                i.putExtra("data","Tra cứu sản phẩm");
                break;

        }
        startActivity(i);
    }
}
