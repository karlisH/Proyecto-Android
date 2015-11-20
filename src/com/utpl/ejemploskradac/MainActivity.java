package com.utpl.ejemploskradac;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.os.Build;

public class MainActivity extends Activity {
	Button boton1,boton2,boton3,boton4,boton5,boton6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton1 = (Button)findViewById(R.id.button1);
        boton1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				iniciarejemplo1();
				
			}
		});
        boton2 = (Button)findViewById(R.id.button2);
        boton2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				iniciarejemplo2();
				
			}
		});
        boton3=(Button)findViewById(R.id.button3);
        boton3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				iniciarejemplo3();
				
			}
		});
        
        boton4=(Button)findViewById(R.id.button4);
        boton4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				iniciarejemplo4();
				
			}
		});
        boton5=(Button)findViewById(R.id.button5);
        boton5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				iniciarejemplo5();
				
			}
		});
        boton6=(Button)findViewById(R.id.button6);
        boton6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent i = new Intent(MainActivity.this, EjemploSharePreferencias.class);
				startActivity(i);
			}
		});
		   
        
    }
public void iniciarejemplo1(){
	Intent i = new Intent(this, TodoList_Activity.class);
	startActivity(i);
}
public void iniciarejemplo2(){
	Intent i = new Intent(this, EjemploTable.class);
	startActivity(i);
}      
    
public void iniciarejemplo3(){
	Intent i=new Intent(this, EditTexModified.class);
	startActivity(i);
}
public void iniciarejemplo4(){
	Intent i=new Intent(this, EjemploFragment.class);
	startActivity(i);
}
public void iniciarejemplo5(){
	Intent i=new Intent(this, EjemploCinco.class);
	startActivity(i);
}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

}
