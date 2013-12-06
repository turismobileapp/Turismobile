package com.turismobile.narino;


import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MainOpciones extends Activity  implements OnItemClickListener  {

	private ListView listView;
	//private WebView webView;
	//private ProgressDialog progressDialog;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Display a indeterminate progress bar on title bar
		requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);

		this.setContentView(R.layout.main_opciones);

		this.listView = (ListView) findViewById(R.id.listViewh);
		//this.webView = (WebView) findViewById(R.id.webView);

		List<Item> items = new ArrayList<Item>();
		items.add(new Item(R.drawable.restaurantes, "Restaurantes",
				""));
		items.add(new Item(R.drawable.hotel, "Hoteles",
				""));
	
		// Sets the data behind this ListView
		this.listView.setAdapter(new ItemAdapter(this, items));

		// Register a callback to be invoked when an item in this AdapterView
		// has been clicked
		listView.setOnItemClickListener(this);
		
	}
			@Override
	public void onItemClick(AdapterView<?> adapter, View view,int position, long arg) {
	   
				switch(position){
				case 0:
				Intent act = new Intent(this,MainActivity.class);
				startActivity(act);
				return;
				case 1:
					Intent act1 = new Intent(this,MainHotel.class);
					startActivity(act1);
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
		
	
}
