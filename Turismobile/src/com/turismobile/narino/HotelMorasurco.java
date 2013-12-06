package com.turismobile.narino;

import android.os.Bundle;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class HotelMorasurco extends Activity implements OnClickListener, android.view.View.OnClickListener  {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hotel_morasurco);
		Button bservicios = (Button)findViewById(R.id.bmora2);
		bservicios.setOnClickListener(this);
		Button breserva = (Button)findViewById(R.id.bmora3);
		breserva.setOnClickListener(this);
		Button bubi = (Button)findViewById(R.id.bmora4);
		bubi.setOnClickListener(this);
	
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hotel_morasurco, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
	    case R.id.bmora1:
		Intent act1 = new Intent(this,HotelMorasurcoHome.class);
		startActivity(act1);
		return;
	    case R.id.bmora2:
		Intent act0 = new Intent(this,ServiciosMorasurco.class);
		startActivity(act0);
		return;
	
	    case R.id.bmora3:
		Intent act2 = new Intent(this,Morasurco_Reservas.class);
		startActivity(act2);
		return;
		
	    case R.id.bmora4:
		Intent act4 = new Intent(this,Morasurco_ubicacion.class);
		startActivity(act4);
		return;
		
	}
	
	}

	@Override
	public void onClick(DialogInterface dialog, int which) {
		// TODO Auto-generated method stub
		
	}

}
