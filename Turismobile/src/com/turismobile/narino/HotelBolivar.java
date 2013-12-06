package com.turismobile.narino;

	import android.os.Bundle;
	import android.app.Activity;
	import android.content.DialogInterface;
	import android.content.DialogInterface.OnClickListener;
	import android.content.Intent;
	import android.view.View;
	import android.widget.Button;

	public class HotelBolivar extends Activity implements OnClickListener, android.view.View.OnClickListener  {

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.hotel_bolivar);
			Button bimagenes = (Button)findViewById(R.id.b_4);
			Button bub = (Button)findViewById(R.id.btni4);
			Button bdescp = (Button)findViewById(R.id.b01);
			Button bservicios = (Button)findViewById(R.id.btni2);
			
			bimagenes.setOnClickListener(this);
			bub.setOnClickListener(this);
			bdescp.setOnClickListener(this);
			bservicios.setOnClickListener(this);
		}
		@Override
		public void onClick(DialogInterface arg0, int arg1) {
			// TODO Auto-generated method stub
		
		}

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switch(v.getId()){
				    case R.id.b01:
					Intent act1 = new Intent(this,HotelBolivarDescrip.class);
					startActivity(act1);
					return;
				    case R.id.btni2:
					Intent act0 = new Intent(this,ServiciosBolivar.class);
					startActivity(act0);
					return;
				
				    case R.id.b_4:
					Intent act2 = new Intent(this,ImaHotelBolivar.class);
					startActivity(act2);
					return;
					
				    case R.id.btni4:
					Intent act4 = new Intent(this,TurismobileMapa.class);
					startActivity(act4);
					return;
					
				}
				
				
				
				
			
			}


	}
