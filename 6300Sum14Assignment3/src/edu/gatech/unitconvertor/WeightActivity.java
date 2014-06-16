package edu.gatech.unitconvertor;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class WeightActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_weight);
	}
	
	public String poundsToKilos(double pounds){
		double kilos = pounds/2.2046;
		return String.valueOf(kilos);
	}
	
	public String kilosToPounds(double kilos){
		double pounds = kilos*2.2046;
		return String.valueOf(pounds);
	}
	
	public void handleClick1(View view) {
		boolean checked = ((RadioButton) view).isChecked();

		EditText txt = (EditText)findViewById(R.id.editText1);
		double weight = Double.parseDouble(txt.getText().toString());

		switch(view.getId()){
			case R.id.radio0:
				if(checked)
					txt.setText(kilosToPounds(weight));
				break;
			case R.id.radio1:
				if(checked)
					txt.setText(poundsToKilos(weight));
				break;
		}
	}
	
	
	public void handleClick2(View view) {

			super.onBackPressed();
		
		}
	
}
