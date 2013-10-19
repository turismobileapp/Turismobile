package com.turismobile.cargadatos;

import com.turismobile.cargadatos.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Cargando extends Activity {

	TextView loadText;
	ProgressBar progressBar;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_carga);
		loadText = (TextView) findViewById(R.id.loadText);
		progressBar = (ProgressBar) findViewById(R.id.progressBar1);
		progressBar.setMax(100);
		progressBar.setBackgroundColor(Color.GRAY);
		progressBar.setProgress(0);
		
		AsyncTaskCargaDatos ATCargaDatos = new AsyncTaskCargaDatos(this);
		ATCargaDatos.execute();
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
			loadText.setText(value[0] + " %");

			progressBar.setProgress(value[0]);

		}

		@Override
		protected void onPostExecute(Void result) {
			mContext.startActivity(new Intent(mContext, Inicio.class));
			finish();
		}

	}// fin asynctask

}