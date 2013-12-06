package com.turismobile.narino;

import android.os.Bundle;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class picanteria_Reservas extends Activity implements OnClickListener, android.view.View.OnClickListener{
	String salida;
	private EditText eNombre;
	private EditText eIden;
	private EditText eCelular;
	private EditText eEmail;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.picanteria__reservas);
		Button breservas = (Button)findViewById(R.id.btn_picanteria);
		breservas.setOnClickListener(this);	
		eNombre =(EditText)findViewById(R.id.edit1_pi);
		eIden =(EditText)findViewById(R.id.edit2_pi);
		eCelular =(EditText)findViewById(R.id.edit3_pi);
		eEmail =(EditText)findViewById(R.id.edit4_pi);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
	    case R.id.btn_picanteria:
	    salida = "Nombres: " + eNombre.getText().toString() + "\n Identificación:" 
	    + eIden.getText().toString() + "\n Celular :" + eCelular.getText().toString() + "\n Email :"+
	    eEmail.getText().toString();
	    String[] to = { "vittorio15@hotmail.com", "turismobileapp@gmail.com" };
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
