package com.utpl.ejemploskradac;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;


public class EditTexModified extends Activity {
	Button btclear;
	EditText txtingreso;
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejemploeditex);
        btclear=(Button)findViewById(R.id.btnclear);
        txtingreso=(EditText)findViewById(R.id.txt3);
        btclear.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
					
				if(txtingreso.getText()!=null){
					txtingreso.setText("");
				}
				
			}
		});
	}

}
