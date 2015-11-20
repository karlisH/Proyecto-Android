package com.utpl.ejemploskradac;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class EjemploCinco extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejemplo5_1);
        Button b=(Button)findViewById(R.id.btnl);
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(EjemploCinco.this, EjemploCincoSecundaria.class);
						startActivity(i);
				
			}
		});
    }

}
