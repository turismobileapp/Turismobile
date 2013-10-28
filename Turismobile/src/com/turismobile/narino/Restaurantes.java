package com.turismobile.narino;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class Restaurantes extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.restaurantes);
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		getMenuInflater().inflate(R.menu.restaurantes, menu);
		return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId()){
		
	   case R.id.Platos:
			Intent act = new Intent(this,RestaurantePlatos.class);
			startActivity(act);
			return true;
		
		case R.id.Ubicacion:
			Intent act1 = new Intent(this,Hoteles.class);
			startActivity(act1);
			return true;
		
		default:	
		return super.onOptionsItemSelected(item);
		}
	}
	
}
