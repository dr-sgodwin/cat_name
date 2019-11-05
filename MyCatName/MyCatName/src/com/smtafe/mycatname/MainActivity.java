package com.smtafe.mycatname;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

	ImageView catImage;
	RelativeLayout background_layout;
	TextView catName;
	String[] catNameArray;
	int colorValue = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// stop the soft keyboard from appearing
		getWindow().setSoftInputMode(
				WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

		catImage = (ImageView) findViewById(R.id.catImage);
		catName = (TextView) findViewById(R.id.catName);
		catNameArray = getResources().getStringArray(R.array.cat_name);
		background_layout = (RelativeLayout)findViewById(R.id.main_background);
		NumberPicker rainbow_color_picker = (NumberPicker) findViewById(R.id.catPicker);
		rainbow_color_picker.setDisplayedValues(getResources().getStringArray(
				R.array.my_fav_color));
		rainbow_color_picker.setMinValue(0);
		rainbow_color_picker.setMaxValue(6);
		rainbow_color_picker.setWrapSelectorWheel(true);

		rainbow_color_picker
				.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {

					@Override
					public void onValueChange(NumberPicker picker, int oldVal,
							int newColor) {
						colorValue = newColor;

						switch (newColor) {
						case 0:
							catName.setText(catNameArray[0]);
							catImage.setImageResource(R.drawable.panther);
							background_layout.setBackgroundColor(getResources().getColor(R.color.background_red));
							catName.setTextColor(getResources().getColor(R.color.text_color_red));
							break;
						case 1:
							catName.setText(catNameArray[1]);
							catImage.setImageResource(R.drawable.tiger);
							background_layout.setBackgroundColor(getResources().getColor(R.color.background_orange));
							catName.setTextColor(getResources().getColor(R.color.text_color_orange));
							break;
						case 2:
							catName.setText(catNameArray[2]);
							catImage.setImageResource(R.drawable.lion);
							background_layout.setBackgroundColor(getResources().getColor(R.color.background_yellow));
							catName.setTextColor(getResources().getColor(R.color.text_color_yellow));
							break;
						case 3:
							catName.setText(catNameArray[3]);
							catImage.setImageResource(R.drawable.leopard);
							background_layout.setBackgroundColor(getResources().getColor(R.color.background_green));
							catName.setTextColor(getResources().getColor(R.color.text_color_green));
							break;
						case 4:
							catName.setText(catNameArray[4]);
							catImage.setImageResource(R.drawable.jaguar);
							background_layout.setBackgroundColor(getResources().getColor(R.color.background_blue));
							catName.setTextColor(getResources().getColor(R.color.text_color_blue));
							break;
						case 5:
							catName.setText(catNameArray[5]);
							catImage.setImageResource(R.drawable.cougar);
							background_layout.setBackgroundColor(getResources().getColor(R.color.background_indigo));
							catName.setTextColor(getResources().getColor(R.color.text_color_indigo));
							break;
						case 6:
							catName.setText(catNameArray[6]);
							catImage.setImageResource(R.drawable.cheetah);
							background_layout.setBackgroundColor(getResources().getColor(R.color.background_violet));
							catName.setTextColor(getResources().getColor(R.color.text_color_violet));
							break;
						} // switch
					}
				});
		
		catImage.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(
						MainActivity.this,
						CatDetailsActivity.class
						);
				//intent.putExtra("cat_num", colorValue);
				startActivity(intent);				
			}
		});
	} // onCreate Bundle
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
