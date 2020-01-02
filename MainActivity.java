//코드4-4 MainActivity.java

package kr.co.hanbit.firstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

	@Overrride
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Log.d("LifeCycleActivity", "OnCreate()");
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		Log.d("LifeCycleActivity", "onStart()");
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		Log.d("LifeCycleActivity", "onResume()");
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		Log.d("LifeCycleActivity", "onPause()");
	}
	
	@Override
	protected void onStop() {
		super.onStop();
		Log.d("LifeCycleActivity", "onStop()");
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d("LifeCycleActivity", "onDestroy()");
	}
} 
