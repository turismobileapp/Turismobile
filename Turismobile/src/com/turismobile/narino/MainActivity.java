package com.turismobile.narino;

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends Activity  implements OnItemClickListener  {
   // private WebView webView;
	private ListView listView;
	private ProgressDialog progressDialog;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Display a indeterminate progress bar on title bar
		requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);

		this.setContentView(R.layout.main);

		this.listView = (ListView) findViewById(R.id.listView);
		//this.webView = (WebView) findViewById(R.id.webView1);

		List<Item> items = new ArrayList<Item>();
		items.add(new Item(R.drawable.picanteria, "Picanteria Ipiales",
				""));
	

		// Sets the data behind this ListView
		this.listView.setAdapter(new ItemAdapter(this, items));

		// Register a callback to be invoked when an item in this AdapterView
		// has been clickedt
		listView.setOnItemClickListener(this);
	
	}

	public void onItemClick(AdapterView<?> adapter, View view,int position, long arg) {
		   
		switch(position){
		case 0:
		Intent act = new Intent(this,Restaurante_picanteria.class);
		startActivity(act);
		
		return;
			
		
		}

		// Sets the visibility of the indeterminate progress bar in the
		// title
		//setProgressBarIndeterminateVisibility(true);
		// Show progress dialog
		//progressDialog = ProgressDialog.show(MainHotel.this,
			//	"ProgressDialog", "Loading!");

		// Tells JavaScript to open windows automatically.
		//webView.getSettings().setJavaScriptEnabled(true);
		// Sets our custom WebViewClient.
		//webView.setWebViewClient(new myWebClient());
		// Loads the given URL
		//Item item = (Item) listView.getAdapter().getItem(position);
		//webView.loadUrl(item.getUrl());
	}
	private class myWebClient extends WebViewClient {

		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			// Load the given URL on our WebView.
			view.loadUrl(url);
			return true;
		}

		@Override
		public void onPageFinished(WebView view, String url) {

			// When the page has finished loading, hide progress dialog and
			// progress bar in the title.
			super.onPageFinished(view, url);
			setProgressBarIndeterminateVisibility(false);
			progressDialog.dismiss();
		}
	}
}
