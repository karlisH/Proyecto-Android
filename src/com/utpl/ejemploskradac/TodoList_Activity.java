package com.utpl.ejemploskradac;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class TodoList_Activity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.todolist_activity);
			final EditText txtTask = (EditText) findViewById(R.id.txtArea);
			Button btnAdd = (Button) findViewById(R.id.btnadd);
			ListView lstItems = (ListView) findViewById(R.id.lstItems);
			ArrayList<String> todoItems = new ArrayList<String> ();
			final ArrayAdapter<String> todoItemsAdapter;
			todoItemsAdapter = new ArrayAdapter<String> (this,android.R.layout.simple_list_item_1,todoItems);
			lstItems.setAdapter(todoItemsAdapter);
			btnAdd.setOnClickListener(new OnClickListener() {
				
				

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					String item = txtTask.getText().toString();
					if (item.length() != 0) {
					todoItemsAdapter.add(item);
					}
				}
				});
	}
	
}
