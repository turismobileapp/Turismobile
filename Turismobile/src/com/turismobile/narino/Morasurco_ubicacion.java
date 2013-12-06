package com.turismobile.narino;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Morasurco_ubicacion extends android.support.v4.app.FragmentActivity {
	
	private GoogleMap mapa = null;
	//private Button btnYo;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_morasurco_ubicacion);
		

		mapa = ((SupportMapFragment) getSupportFragmentManager()
				   .findFragmentById(R.id.mapm)).getMap();
		
		CameraPosition pos = new CameraPosition.Builder().target(new LatLng(1.23125, -77.283888)).zoom(17).build();
		CameraUpdate update = CameraUpdateFactory.newCameraPosition(pos);
		mapa.animateCamera(update);
		mapa.addMarker(new MarkerOptions()
        .position(new LatLng(1.23125, -77.283888))
        .title("Hotel Morasurco - Pasto "));
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.menu_mapa, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) 
	{	
		switch(item.getItemId())
		{
			case R.id.menu_marcadores:
				mostrarMarcador(1.23125, -77.283888);
				break;
			//case R.id.menu_lineas:
				//mostrarLineas();
				//break;
		}
		
		return super.onOptionsItemSelected(item);
	}
	
	private void mostrarMarcador(double lat, double lng)
	{
		mapa.addMarker(new MarkerOptions()
        .position(new LatLng(lat, lng))
        .title("Hotel Morasurco - Pasto "));
	}
	
	private void mostrarLineas()
	{
		//Dibujo con Lineas
		
		PolylineOptions lineas = new PolylineOptions()
	        .add(new LatLng(45.0, -12.0))
	        .add(new LatLng(45.0, 5.0))
	        .add(new LatLng(34.5, 5.0))
	        .add(new LatLng(34.5, -12.0))
	        .add(new LatLng(45.0, -12.0));

		lineas.width(8);
		lineas.color(Color.RED);

		mapa.addPolyline(lineas);
		
		//Dibujo con pol�gonos
		
		//PolygonOptions rectangulo = new PolygonOptions()
		//              .add(new LatLng(45.0, -12.0),
		//            	   new LatLng(45.0, 5.0),
		//            	   new LatLng(34.5, 5.0),
		//            	   new LatLng(34.5, -12.0),
		//            	   new LatLng(45.0, -12.0));
		//
		//rectangulo.strokeWidth(8);
		//rectangulo.strokeColor(Color.RED);
		//
		//mapa.addPolygon(rectangulo);
	}
}