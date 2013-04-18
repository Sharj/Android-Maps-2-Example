package com.sharj.androidmaps2example;

import com.actionbarsherlock.app.SherlockActivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends SherlockActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void showMap(View v){
		Intent intent = new Intent(this, SampleMapActivity.class);
		startActivity(intent);
	}

	public void showMapFragment(View v){
		Intent intent = new Intent(this, SampleMapFragmentActivity.class);
		startActivity(intent);
	}

}
