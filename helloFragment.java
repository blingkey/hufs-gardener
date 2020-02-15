//코드8-2 HelloFramgment.java

package kr.co.hanbit.bookexample;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HeloFragment extends Fragment {
	public static HelloFragment newInstance() {
		HelloFragment f = new HelloFragment();
		
		rewturn f;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View layout = Inflater.inflate(R.layout.fragment_hello, container, false);
		
		return layout;
		
	}
	
	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		
		setView(view);
	}
	
	private void setView(View view) {
		TextView titleText = view.findViewById(R.id.title);
		titleText.setText("안녕하세요!");
	}
} 
	
