package com.example.imageview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
    
    int[] images = new int[] {
            R.drawable.lijiang,
            R.drawable.qiao,
            R.drawable.shuangta,
            R.drawable.shui,
            R.drawable.xiangbi
    };
    
    int currentImage = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final ImageView imageView = (ImageView) findViewById(R.id.image);

        OnClickListener listener = new OnClickListener() {
            
            @Override
            public void onClick(View v) {
               imageView.setImageResource(images[++currentImage % images.length]); 
            }
        };
        
        Button next = (Button) findViewById(R.id.next);
        next.setOnClickListener(listener);

        Button prev = (Button) findViewById(R.id.previous);
        prev.setOnClickListener(listener);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
