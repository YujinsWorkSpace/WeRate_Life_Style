
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		profile
	 *	@date 		Friday 24th of November 2023 05:10:41 AM
	 *	@title 		Screen
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.cs407.werate;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;


import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class profile_activity extends Activity {

	
	private View _bg__profile_ek2;
	private View _bg__profile_ek4;
	private ImageView profile_picture;
	private TextView name;
	private TextView username;
	private View _bg__list_ek1;
	private View _bg__gender_ek1;
	private View rectangle_392;
	private TextView gender_ek2;
	private TextView gender;
	private View _bg__system_icon_24px_gender_ek1;
	private View _bg__group_ek1;
	private ImageView vector;
	private ImageView vector_ek1;
	private ImageView vector_ek2;
	private View _bg__system_icon_24px_right_ek1;
	private ImageView vector_ek3;
	private View _bg__birthday_ek1;
	private View rectangle_392_ek1;
	private TextView birthday_ek2;
	private TextView _12_12_2000;
	private View _bg__system_icon_24px_date_ek1;
	private View _bg__group_ek3;
	private ImageView vector_ek4;
	private View _bg__system_icon_24px_right_ek3;
	private ImageView vector_ek5;
	private View _bg__email_ek1;
	private View rectangle_392_ek2;
	private TextView email_ek2;
	private TextView derlaxy_yahoo_com;
	private View _bg__system_icon_24px_message_ek1;
	private View _bg__group_ek5;
	private ImageView vector__stroke_;
	private ImageView vector__stroke__ek1;
	private View _bg__system_icon_24px_right_ek5;
	private ImageView vector_ek6;
	private View _bg__phone_number_ek1;
	private View rectangle_392_ek3;
	private TextView phone_number_ek2;
	private TextView user_phone_number;
	private View _bg__system_icon_24px_phone_ek1;
	private View _bg__group_ek7;
	private ImageView vector_ek7;
	private ImageView vector_ek8;
	private View _bg__system_icon_24px_right_ek7;
	private ImageView vector_ek9;
	private View _bg__change_password_ek1;
	private View rectangle_392_ek4;
	private TextView change_password_ek2;
	private TextView __________________;
	private View _bg__system_icon_24px_password_ek1;
	private View _bg__group_ek9;
	private ImageView vector__stroke__ek2;
	private ImageView vector__stroke__ek3;
	private ImageView vector__stroke__ek4;
	private View _bg__system_icon_24px_right_ek9;
	private ImageView vector_ek10;
	private View _bg__header_ek1;
	private View rectangle_406;
	private TextView profile_ek5;
	private ImageView line_39;
	private View _bg__system_icon_24px_left_ek1;
	private ImageView vector_ek11;
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
	private Spinner spinner;
	private SharedPreferences sharedPreferences;
	private View changeName;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.profile);
		user_phone_number = findViewById(R.id.user_phone_number);
		sharedPreferences = getSharedPreferences("user_number", Context.MODE_PRIVATE);

		String savedNumber = sharedPreferences.getString("savedNumber", ""); // "" is the default value
		user_phone_number.setText(savedNumber);

		String user_gender = sharedPreferences.getString("user_gender", "");
		gender = (TextView) findViewById(R.id.my_gender);
		gender.setText(user_gender);


		profile_picture = (ImageView) findViewById(R.id.profile_picture);
		name = (TextView) findViewById(R.id.name);
		username = (TextView) findViewById(R.id.username);
		_bg__list_ek1 = (View) findViewById(R.id._bg__list_ek1);
		_bg__gender_ek1 = (View) findViewById(R.id._bg__gender_ek1);
		rectangle_392 = (View) findViewById(R.id.rectangle_392);
		gender_ek2 = (TextView) findViewById(R.id.gender_ek2);

		_bg__system_icon_24px_gender_ek1 = (View) findViewById(R.id._bg__system_icon_24px_gender_ek1);

		vector = (ImageView) findViewById(R.id.vector);
		vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
		vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);

		vector_ek3 = (ImageView) findViewById(R.id.vector_ek3);
		_bg__birthday_ek1 = (View) findViewById(R.id._bg__birthday_ek1);
		rectangle_392_ek1 = (View) findViewById(R.id.rectangle_392_ek1);
		birthday_ek2 = (TextView) findViewById(R.id.birthday_ek2);
		_12_12_2000 = (TextView) findViewById(R.id._12_12_2000);

		vector_ek4 = (ImageView) findViewById(R.id.vector_ek4);

		_bg__email_ek1 = (View) findViewById(R.id._bg__email_ek1);
		rectangle_392_ek2 = (View) findViewById(R.id.rectangle_392_ek2);
		email_ek2 = (TextView) findViewById(R.id.email_ek2);
		derlaxy_yahoo_com = (TextView) findViewById(R.id.derlaxy_yahoo_com);
		_bg__group_ek5 = (View) findViewById(R.id._bg__group_ek5);

		vector__stroke__ek1 = (ImageView) findViewById(R.id.vector__stroke__ek1);
		_bg__phone_number_ek1 = (View) findViewById(R.id._bg__phone_number_ek1);
		rectangle_392_ek3 = (View) findViewById(R.id.rectangle_392_ek3);
		phone_number_ek2 = (TextView) findViewById(R.id.phone_number_ek2);
		user_phone_number = (TextView) findViewById(R.id.user_phone_number);
		_bg__system_icon_24px_phone_ek1 = (View) findViewById(R.id._bg__system_icon_24px_phone_ek1);

		vector_ek7 = (ImageView) findViewById(R.id.vector_ek7);
		vector_ek8 = (ImageView) findViewById(R.id.profile_to_home);
		_bg__change_password_ek1 = (View) findViewById(R.id._bg__change_password_ek1);
		rectangle_392_ek4 = (View) findViewById(R.id.rectangle_392_ek4);
		change_password_ek2 = (TextView) findViewById(R.id.change_password_ek2);
		__________________ = (TextView) findViewById(R.id.__________________);
		_bg__system_icon_24px_password_ek1 = (View) findViewById(R.id._bg__system_icon_24px_password_ek1);
		_bg__group_ek9 = (View) findViewById(R.id._bg__group_ek9);
		vector__stroke__ek2 = (ImageView) findViewById(R.id.vector__stroke__ek2);
		vector__stroke__ek3 = (ImageView) findViewById(R.id.vector__stroke__ek3);
		vector__stroke__ek4 = (ImageView) findViewById(R.id.vector__stroke__ek4);
		changeName = (View) findViewById(R.id.usernameFrame);




		spinner = findViewById(R.id.spinner);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
				R.array.gender_dropdown_items, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner.setAdapter(adapter);

		String savedGender = sharedPreferences.getString("user_gender", "");
		String first = sharedPreferences.getString("firstName", "Yujin");
		String last = sharedPreferences.getString("lastName", "Wang");
		name.setText(first + " " + last);

		if (!savedGender.isEmpty()) {
			int spinnerPosition = adapter.getPosition(savedGender);
			spinner.setSelection(spinnerPosition);
		}

		spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
				String selectedItem = parent.getItemAtPosition(position).toString();
				gender.setText(selectedItem);
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// Another interface callback
			}
		});

		vector_ek8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String number_toSave = user_phone_number.getText().toString();
				SharedPreferences.Editor editor = sharedPreferences.edit();
				editor.putString("savedNumber", number_toSave);


				String gender_toSave = gender.getText().toString();
				SharedPreferences.Editor editor2 = sharedPreferences.edit();
				editor2.putString("user_gender", gender_toSave);

				editor.apply();
				editor2.apply();
				finish();
			}
		});

		changeName.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(profile_activity.this, change_name_activity.class);
				intent.putExtra("pass_first", name.getText().toString().split(" ")[0]);
				intent.putExtra("pass_last", name.getText().toString().split(" ")[1]);

				startActivity(intent);
			}
		});
	}

	@Override
	protected void onResume(){
		super.onResume();

		String first = sharedPreferences.getString("firstName", "Yujin");
		String last = sharedPreferences.getString("lastName", "Wang");
		name.setText(first + " " + last);

	}


}
	
	