package edu.gatech.unitconvertor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.view.View;


public class MainActivity extends Activity {

	private RadioGroup radioUnit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void handleClick(View view) {

		radioUnit = (RadioGroup) findViewById(R.id.radioGroup2);
		int selectedId = radioUnit.getCheckedRadioButtonId();

		switch(selectedId){
			case R.id.radioL:
				startActivity(new Intent(getApplicationContext(), DistanceActivity.class));
				break;
			case R.id.radioT:
				startActivity(new Intent(getApplicationContext(), TemperatureActivity.class));
				break;
			case R.id.radioW:
				startActivity(new Intent(getApplicationContext(), WeightActivity.class));
				break;		
		}			
	}
	
}
