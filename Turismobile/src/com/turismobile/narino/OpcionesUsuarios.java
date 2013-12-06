package com.turismobile.narino;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class OpcionesUsuarios extends Activity {
	private Button btnYo;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_opciones_usuarios);
		btnYo = (Button) findViewById(R.id.btnp5);
		
		btnYo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0)
			{
				Intent act = new Intent(OpcionesUsuarios.this, Inicio.class); 
				startActivity(act);
				
			}
		});
	
	}

	

}
