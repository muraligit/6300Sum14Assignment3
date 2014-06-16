package edu.gatech.unitconvertor;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class TemperatureActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_temperature);
	}
	
	public String fahrenToCels(double fahren){
		double cels= 5.0*(fahren-32.0)/9.0;
		return String.valueOf(cels);
	}
	
	public String celsTofahren(double cels){
		double fahren = 9.0*cels/5.0+32.0;
		return String.valueOf(fahren);
	}
	
	//click radio button
	public void handleClick1(View view) {
		boolean checked = ((RadioButton) view).isChecked();

		EditText txt = (EditText)findViewById(R.id.editText1);
		double temp = Double.parseDouble(txt.getText().toString());

		switch(view.getId()){
			case R.id.radio0:
				if(checked)
					txt.setText(celsTofahren(temp));
				break;
			case R.id.radio1:
				if(checked)
					txt.setText(fahrenToCels(temp));
				break;

		}
	}
	
	//click home button
	public void handleClick2(View view) {

			super.onBackPressed();
		
		}
	
}
