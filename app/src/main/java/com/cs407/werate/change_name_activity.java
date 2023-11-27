
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		change_name
	 *	@date 		Friday 24th of November 2023 05:12:20 AM
	 *	@title 		Screen
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.cs407.werate;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

public class change_name_activity extends Activity {

	
	private View _bg__change_name_ek2;
	private View _bg__first_name_ek1;
	private TextView first_name_ek2;
	private View _bg__first_name_form_ek1;
	private TextView maximus;
	private View _bg__last_name_ek1;
	private TextView last_name_ek2;
	private View _bg__last_name_form_ek1;
	private TextView gold;
	private View _bg__save_button_ek1;
	private TextView save;
	private View _bg__header_ek1;
	private View rectangle_406;
	private TextView name;
	private ImageView line_39;
	private View _bg__system_icon_24px_left_ek1;
	private ImageView vector;
	private View _bg__ui___status_bars_ek1;
	private View _bg__battery_ek1;
	private ImageView rectangle;
	private ImageView combined_shape;
	private ImageView rectangle_ek1;
	private ImageView wifi;
	private ImageView mobile_signal;
	private View _bg__time_style_ek1;
	private TextView _9_41;
	private View _bg__ui___home_indicator_ek1;
	private View home_indicator;
	private SharedPreferences sharedPreferences;

	private TextView firstName;
	private TextView lastName;
	private ImageView back_btn;


	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.change_name);

		sharedPreferences = getSharedPreferences("user_number", Context.MODE_PRIVATE);



		_bg__first_name_ek1 = (View) findViewById(R.id._bg__first_name_ek1);
		first_name_ek2 = (TextView) findViewById(R.id.first_name_ek2);
		_bg__first_name_form_ek1 = (View) findViewById(R.id._bg__first_name_form_ek1);
		last_name_ek2 = (TextView) findViewById(R.id.last_name_ek2);
		_bg__last_name_form_ek1 = (View) findViewById(R.id._bg__last_name_form_ek1);

		_bg__save_button_ek1 = (View) findViewById(R.id._bg__save_button_ek1);
		save = (TextView) findViewById(R.id.save);

		firstName = (TextView) findViewById(R.id.user_firstName);
		lastName = (TextView) findViewById(R.id.user_lastName);
		back_btn = (ImageView) findViewById(R.id.vector_ek3);

		String firstExtra = getIntent().getStringExtra("pass_first");
		String lastExtra = getIntent().getStringExtra("pass_last");

		firstName.setText(firstExtra);
		lastName.setText(lastExtra);

	
		
		//custom code goes here


		// handle onClick for save button
		_bg__save_button_ek1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String f = firstName.getText().toString();
				String l = lastName.getText().toString();

				SharedPreferences.Editor editor = sharedPreferences.edit();

				editor.putString("firstName", f);
				editor.putString("lastName", l);

				editor.apply();
				finish();
			}
		});

		back_btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
	
	}
}
	
	