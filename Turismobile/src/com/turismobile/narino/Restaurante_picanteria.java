package com.turismobile.narino;

import android.os.Bundle;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Restaurante_picanteria extends Activity implements OnClickListener, android.view.View.OnClickListener  {
 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_restaurante_picanteria);
		
		Button bmenu = (Button)findViewById(R.id.btn_p3);
		bmenu.setOnClickListener(this);
		
		Button bmenureserva = (Button)findViewById(R.id.btn_p1);
		bmenureserva.setOnClickListener(this);
		
		Button bplatos = (Button)findViewById(R.id.btn_p2);
		bplatos.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
				switch(v.getId()){
			    
				case R.id.btn_p1:
				Intent act0 = new Intent(this,picanteria_Reservas.class);
				startActivity(act0);
				return;
				
				case R.id.btn_p2:
					Intent act2 = new Intent(this,RestaurantePlatos.class);
					startActivity(act2);
					return;
				  
				case R.id.btn_p3:
				Intent act1 = new Intent(this,Restaurantes.class);
				startActivity(act1);
				return;
			  
			}
		
	}
	@Override
	public void onClick(DialogInterface arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}
}
