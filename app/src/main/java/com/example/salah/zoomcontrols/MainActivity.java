package com.example.salah.zoomcontrols;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ZoomControls;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        final ZoomControls zoomControls = (ZoomControls)findViewById( R.id.zoomControl );
        Button button = (Button)findViewById( R.id.button );
        Button button1 = (Button)findViewById( R.id.button1 );

        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zoomControls.show();
            }
        } );
        button1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zoomControls.hide();
            }
        } );
    }
}
