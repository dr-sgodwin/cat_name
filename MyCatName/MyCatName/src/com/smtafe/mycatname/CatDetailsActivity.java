package com.smtafe.mycatname;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CatDetailsActivity extends Activity{
	
	RelativeLayout cat_details_background_layout;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cat_details);
		
		TextView cat_details = (TextView)findViewById(R.id.catName);
		cat_details_background_layout = (RelativeLayout)findViewById(R.id.cat_details_background);
		Button homeButton = (Button) findViewById(R.id.buttonReturn);
		
		homeButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			} // onClick
		}); // Listener
		
		//Bundle extras = getIntent().getExtras();
		
		//switch(extras.getInt("cat_number")){
		switch(3){
		case 0:
			cat_details_background_layout.setBackgroundColor(getResources().getColor(R.color.background_red));
			cat_details.setTextColor(getResources().getColor(R.color.text_color_red));
			break;
		case 1:
			cat_details_background_layout.setBackgroundColor(getResources().getColor(R.color.background_orange));
			cat_details.setTextColor(getResources().getColor(R.color.text_color_orange));
			break;
		case 2:
			cat_details_background_layout.setBackgroundColor(getResources().getColor(R.color.background_yellow));
			cat_details.setTextColor(getResources().getColor(R.color.text_color_yellow));
			break;
		case 3:
			cat_details_background_layout.setBackgroundColor(getResources().getColor(R.color.background_green));
			cat_details.setTextColor(getResources().getColor(R.color.text_color_green));
			break;
		case 4:
			cat_details_background_layout.setBackgroundColor(getResources().getColor(R.color.background_blue));
			cat_details.setTextColor(getResources().getColor(R.color.text_color_blue));
			break;
		case 5:
			cat_details_background_layout.setBackgroundColor(getResources().getColor(R.color.background_indigo));
			cat_details.setTextColor(getResources().getColor(R.color.text_color_indigo));
			break;
		case 6:
			cat_details_background_layout.setBackgroundColor(getResources().getColor(R.color.background_violet));
			cat_details.setTextColor(getResources().getColor(R.color.text_color_violet));
			break;			
			
		}
	}

}
