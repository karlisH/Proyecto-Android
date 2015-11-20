package com.utpl.ejemploskradac;





import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ejemplos extends Activity{
	Button boton1,boton2,boton3,boton4,boton5,boton6;
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton1 = (Button)findViewById(R.id.button1);
        boton1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				iniciarejemplo1();
				
			}
		});
        
        

		   
        
    }
public void iniciarejemplo1(){
	Intent i = new Intent(this, TodoList_Activity.class);
	startActivity(i);
}
}
