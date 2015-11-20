package com.utpl.ejemploskradac;

import android.app.Activity;
import android.os.Bundle;

public class EjemploFragment extends Activity implements
		NewListFragment.OnSelectedListener {

	@Override
	public void onSelected(String uri) {
		ViewFragment view;
		// Obtenermos el ViewerFragment.
		view = (ViewFragment) getFragmentManager().findFragmentById(R.id.view_fragment);
		// Actualizamos la url;
		view.updateUrl(uri);

	}
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejemplofragment);
	}

}
