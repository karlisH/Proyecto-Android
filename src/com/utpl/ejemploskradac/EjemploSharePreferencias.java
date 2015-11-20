package com.utpl.ejemploskradac;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class EjemploSharePreferencias extends Activity {
	EditText txtguardado;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejemplo_share_preferencias);
        
        Button btn=(Button)findViewById(R.id.btnGuardar);
        btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				SharedPreferences preferencia=getSharedPreferences("Guardar",MODE_PRIVATE);
				txtguardado.setText((CharSequence) preferencia.edit());
				// TODO Auto-generated method stub
				
			}
		});
        Button btn2=(Button)findViewById(R.id.btnMostrar);
        btn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
        }

}
