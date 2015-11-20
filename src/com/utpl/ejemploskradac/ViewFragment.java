package com.utpl.ejemploskradac;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ViewFragment extends Fragment {
	private WebView view = null;
	private String mNewUrl = null;

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Cargamos el Layout
		view = (WebView) inflater.inflate(R.layout.view_fragment, container,
				false);
		// Configuramos el WebView para que muestre páginas webs
		view.getSettings().setJavaScriptEnabled(true);
		view.setWebViewClient(new WebViewClient());
		// Cargamos la web seleccionada por el usuario
		if (mNewUrl != null)
			view.loadUrl(mNewUrl);
		return view;
	}

	public void updateUrl(String newUrl) {
		mNewUrl = newUrl;
		if (view != null) {
			view.loadUrl(newUrl);
		}
	}
}