package com.utpl.ejemploskradac;

import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NewListFragment extends ListFragment {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Este ArrayAdapter es el encargado de cargar
		// el listado de strings.xml en el ListFragment.
		ArrayAdapter<CharSequence> adapter;
		// Creamos el ArrayAdapter desde el recurso R.array.titles // y
		// utilizando el layout R.layout.news_list_item.
		adapter = ArrayAdapter.createFromResource(getActivity()
				.getApplicationContext(), R.array.titles,
				R.layout.new_list_item);
		// Le decimos al ListFragment que utilice nuestro adapter
		setListAdapter(adapter);
	}

	private OnSelectedListener selectedListener;

	public interface OnSelectedListener {
		public void onSelected(String uri);
	}

	public void onAttach(Activity activity) {
		super.onAttach(activity);
		try {
			selectedListener = (OnSelectedListener) activity;
		} catch (ClassCastException e) {
			throw new ClassCastException(activity.toString()
					+ " must implement SelectedListener");
		}
	}
	public void onListItemClick(ListView l, View v, int position, long id) {
		String[] links = getResources().getStringArray(R.array.links);
		String content = links[position];
		selectedListener.onSelected(content);
		}
}