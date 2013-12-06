package com.turismobile.narino;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Morasurco_Reservas extends Activity implements OnClickListener, android.view.View.OnClickListener{
	String salida;
	private EditText eNombre;
	private EditText eIden;
	private EditText eCelular;
	private EditText eEmail;
	private Spinner eTipo;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_morasurco__reservas);
		Button breservas = (Button)findViewById(R.id.btnReservarm);
		breservas.setOnClickListener(this);	
		eNombre =(EditText)findViewById(R.id.txtM_nomm);
		eIden =(EditText)findViewById(R.id.txtM_2m);
		eCelular =(EditText)findViewById(R.id.txtM_3m);
		eEmail =(EditText)findViewById(R.id.txtM_4m);
		eTipo = (Spinner)findViewById(R.id.spinner1);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
	    case R.id.btnReservarm:
	    salida = "Nombres: " + eNombre.getText().toString() + "\n Identificación:" + eIden.getText().toString() + "\n Celular :" + eCelular.getText().toString() + "\n Email :"+ eEmail.getText().toString()
		+ "\n Tipo de Habitación:" + eTipo.getSelectedItem().toString();
	    String[] to = { "vittorio15@hotmail.com", "reservas@hotelmorasurco.co" };
	    String[] cc = { "turismobileapp@gmail.com" };
	    enviar(to, cc, "RESERVAS TURISMOBILE APP",salida);
		return;
		}
	}
	private void enviar(String[] to, String[] cc,String asunto, String mensaje) {
	        Intent emailIntent = new Intent(Intent.ACTION_SEND);
	        emailIntent.setType("plain/text");
	        
	        emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, to);
	        emailIntent.putExtra(Intent.EXTRA_CC, cc);
	        emailIntent.putExtra(Intent.EXTRA_SUBJECT, asunto);
	        emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, mensaje);
            startActivity(Intent.createChooser(emailIntent, "Email "));
	    }
	@Override
	public void onClick(DialogInterface arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}
	
}
