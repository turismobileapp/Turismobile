package com.turismobile.narino;

import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseInstallation;
import com.parse.ParseObject;
import com.parse.PushService;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Cargando extends Activity     {

	//TextView loadText;
	//ProgressBar progressBar;
	private Button btnYo;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_carga);
		//loadText = (TextView) findViewById(R.id.loadText);
	  	//progressBar = (ProgressBar) findViewById  (R.id.progressBar1);
		//progressBar.setMax(100);
		//progressBar.setBackgroundColor(Color.GRAY);
		//progressBar.setProgress(0);
		
		AsyncTaskCargaDatos ATCargaDatos = new AsyncTaskCargaDatos(this);
		ATCargaDatos.execute();
		 Parse.initialize(this, "bYfrZLXmHOGeSSrUHcXoNyWMrZqCpoTNnIiTgn4u", "TfG63Lkk4cHYhD8dRbj3Wcu7nvzp6FSy26YY2h0x");
		 PushService.setDefaultPushCallback(this, Inicio.class);
		 ParseInstallation.getCurrentInstallation().saveInBackground();
		 ParseAnalytics.trackAppOpened (getIntent ());
		 ParseObject testObject = new ParseObject("TestObject");
		 testObject.put("foo", "bar");
		 testObject.saveInBackground();
	
	}

	//
	// ASYNKTASCK
	//

	public class AsyncTaskCargaDatos extends AsyncTask<Void, Integer, Void> {

		Context mContext;

		AsyncTaskCargaDatos(Context context) {
			mContext = context;
		}

		@Override
		protected Void doInBackground(Void... params) {

			publishProgress(0);

			for (int i = 0; i < 100; i++) {
				try {
					Thread.sleep(50);
					publishProgress(i + 1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			return null;
		}


		@Override
		protected void onProgressUpdate(Integer... value) {
			//loadText.setText(value[0] + " %");

			//progressBar.setProgress(value[0]);

		}

		@Override
		protected void onPostExecute(Void result) {
			mContext.startActivity(new Intent(mContext, Inicio.class));
			finish();
		}



		

	}// fin asynctask

	}