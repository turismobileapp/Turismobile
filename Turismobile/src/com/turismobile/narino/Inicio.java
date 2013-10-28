package com.turismobile.narino;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

import android.view.MenuItem;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Inicio extends Activity {
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
			imagen.setLayoutParams(new Gallery.LayoutParams(300, 300));
			
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
		
			
		case R.id.Restaurantes:
			Intent act = new Intent(this,Restaurantes.class);
			startActivity(act);
			return true;
		
		case R.id.Hoteles:
			Intent act1 = new Intent(this,Hoteles.class);
			startActivity(act1);
			return true;
		
		case R.id.Tours:
			Intent act2 = new Intent(this,Hoteles.class);
			startActivity(act2);
			return true;
				
		case R.id.Trasportes:
			Intent act3 = new Intent(this,Hoteles.class);
			startActivity(act3);
			return true;
		
		case R.id.Destinos:
			Intent act4 = new Intent(this,Hoteles.class);
			startActivity(act4);
			return true;
		
		case R.id.Rutas:
			Intent act5 = new Intent(this,Hoteles.class);
			startActivity(act5);
			return true;
			
		default:	
		return super.onOptionsItemSelected(item);
		}
	}
}






