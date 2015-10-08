//package com.toraysoft.lib.amap;
//
//import com.amap.api.maps2d.AMap;
//import com.amap.api.maps2d.CameraUpdateFactory;
//import com.amap.api.maps2d.MapView;
//import com.amap.api.maps2d.model.BitmapDescriptorFactory;
//import com.amap.api.maps2d.model.CameraPosition;
//import com.amap.api.maps2d.model.LatLng;
//import com.amap.api.maps2d.model.MarkerOptions;
//
//import android.app.Activity;
//import android.content.Intent;
//import android.os.Bundle;
//
//public class MainActivity extends Activity{
//	
//	private MapView mapView;
//	private AMap aMap;
//	
//	@Override
//	protected void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		
//		setContentView(R.layout.activity_main);
//		
//		mapView = (MapView) findViewById(R.id.map);
//		mapView.onCreate(savedInstanceState);
//		
//		init();
//		
//		
//		Intent intent = getIntent();
//		double lat = getIntent().getDoubleExtra("lat", 0);
//		double lng = getIntent().getDoubleExtra("lng", 0);
//		if(lat==0 && lng==0){
//			return;
//		}
//		
////		aMap.addMarker(new MarkerOptions().position(new LatLng(23.036501, 113.316032)).icon(
////				BitmapDescriptorFactory
////						.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
////		
////		aMap.moveCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition(
////				new LatLng(23.036501, 113.316032), 18, 0, 30)));
//		
//		LatLng position = new LatLng(lat, lng);
//		aMap.addMarker(new MarkerOptions().position(position).icon(
//				BitmapDescriptorFactory
//						.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
//		
//		aMap.moveCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition(
//				position, 18, 0, 30)));
//	}
//	
//	/**
//	 * 初始化AMap对象
//	 */
//	private void init() {
//		if (aMap == null) {
//			aMap = mapView.getMap();
//		}
//	}
//
//	/**
//	 * 方法必须重写
//	 */
//	@Override
//	protected void onResume() {
//		super.onResume();
//		mapView.onResume();
//	}
//
//	/**
//	 * 方法必须重写
//	 */
//	@Override
//	protected void onPause() {
//		super.onPause();
//		mapView.onPause();
//	}
//
//	/**
//	 * 方法必须重写
//	 */
//	@Override
//	protected void onSaveInstanceState(Bundle outState) {
//		super.onSaveInstanceState(outState);
//		mapView.onSaveInstanceState(outState);
//	}
//
//	/**
//	 * 方法必须重写
//	 */
//	@Override
//	protected void onDestroy() {
//		super.onDestroy();
//		mapView.onDestroy();
//	}
//
//}
