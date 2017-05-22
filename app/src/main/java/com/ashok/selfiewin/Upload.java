package com.ashok.selfiewin;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Upload extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);

        imageView= (ImageView) findViewById(R.id.imageView);

        MainActivity ma=new MainActivity();

        String ab=ma.picturePath;


        imageView.setImageBitmap(BitmapFactory.decodeFile(ab));
    }
}
