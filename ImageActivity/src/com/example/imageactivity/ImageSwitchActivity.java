package com.example.imageactivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class ImageSwitchActivity extends Activity {
	ImageView img;
	Button b1;
	int i;
	int[] im={R.drawable.a,R.drawable.b,R.drawable.c};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_switch);
        img=(ImageView) findViewById(R.id.imageView1);
        b1=(Button) findViewById(R.id.button1);
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				i++;
				i=i % im.length;
					img.setImageResource(im[i]);
					}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.image_switch, menu);
        return true;
    }
    
}
