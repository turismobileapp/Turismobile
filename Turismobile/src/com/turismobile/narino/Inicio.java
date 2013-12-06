package com.turismobile.narino;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

import android.view.MenuItem;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Inicio extends FragmentActivity implements OnClickListener, android.view.View.OnClickListener  {
	private Button btnYo;
	private Button btnDes;
	
	Integer [] imagenId = {
    	    R.drawable.picanteria,
    	    R.drawable.hbolivar,
    	    R.drawable.capitan,
    	    R.drawable.corral,
    	    R.drawable.cubano,
    	    R.drawable.lamerced 		
    		
    };
    
    //comentario
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		RelativeLayout r = (RelativeLayout)findViewById(R.id.relative);
		r.setBackgroundColor(Color.BLACK);
		btnYo = (Button) findViewById(R.id.btndes);
		btnDes = (Button) findViewById(R.id.b_5);
		
		btnYo.setOnClickListener(this);
		btnDes.setOnClickListener(this);
		
		Gallery galeria = (Gallery)findViewById(R.id.gallery1);
		galeria.setAdapter(new ImageAdapter(this) );
	
		
		
    }
	public class ImageAdapter extends BaseAdapter {

		private Context contexto;
		public ImageAdapter(Inicio mainActivity) {
			// TODO Auto-generated constructor stub
			contexto = mainActivity;
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			
			return imagenId.length;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@SuppressWarnings("deprecation")
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			ImageView imagen = new ImageView(contexto);
			imagen.setImageResource(imagenId[position]);
			imagen.setLayoutParams(new Gallery.LayoutParams(400, 300));
			
			return imagen;
		}
		
		
	};
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

    
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId()){
		
		case R.id.Yo:
			FragmentManager fragmentManager = getSupportFragmentManager();
		    DialogoPersonalizado dialogo = new DialogoPersonalizado();
		    dialogo.show(fragmentManager, "tagPersonalizado");
			return true;
			
		case R.id.Que:
			//Intent map = new Intent(this,TurismobileMapa.class);
			//startActivity(map);
			return true;
					
		case R.id.Restaurantes:
			Intent act = new Intent(this,MainActivity.class);
			startActivity(act);
			return true;
		
		case R.id.Hoteles:
			Intent act1 = new Intent(this,MainHotel.class);
			startActivity(act1);
			return true;
				
		default:	
		return super.onOptionsItemSelected(item);
		}
	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		    case R.id.btndes:
			Intent act = new Intent(Inicio.this, MainOpciones.class); 
			startActivity(act);
		    return;
		    case R.id.b_5:
			Intent act0 = new Intent(this,OpcionesUsuarios.class);
			startActivity(act0);
			return;
		}
	}

	@Override
	public void onClick(DialogInterface dialog, int which) {
		// TODO Auto-generated method stub
		
	}
}






