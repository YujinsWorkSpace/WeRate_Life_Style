
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		home_search
	 *	@date 		Thursday 23rd of November 2023 09:28:36 PM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.cs407.werate;

import android.annotation.SuppressLint;
import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;


import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.amplifyframework.auth.cognito.result.AWSCognitoAuthSignOutResult;
import com.amplifyframework.auth.cognito.result.HostedUIError;
import com.amplifyframework.core.Amplify;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.Locale;

	public class homePage extends Activity {

	
	private View _bg__home_search_ek2;
	private View _bg__topbar_container_top_bar__ek1;
	private View _bg__searchfield_ek1;
	private View rectangle_2;
	private TextView search__component_input_text_;
	private ImageView vector;
	private View _bg__submitbtn__action_submit__ek1;
	private View rectangle_3;
	private ImageView vector_ek1;
	private TextView yalp;
	private TextView greeting;
	private View _bg____container__ek1;
	private View _bg__restaurants_ek1;
	private TextView restaurants_ek2;
	private View _bg__group_427319991_ek1;
	private ImageView vector__stroke_;
	private View _bg__delivery_ek1;
	private TextView delivery_ek2;
	private View _bg__truck_ek1;
	private ImageView vector_ek2;
	private ImageView vector_ek3;
	private ImageView vector_ek4;
	private ImageView vector_ek5;
	private View _bg__coffee_ek1;
	private TextView coffee___tea;
	private View _bg__coffee_ek3;
	private ImageView vector_ek6;
	private ImageView vector_ek7;
	private ImageView vector_ek8;
	private ImageView vector_ek9;
	private ImageView vector_ek10;
	private View _bg__restaurants_ek4;
	private TextView takeout;
	private View _bg__shopping_bag_ek1;
	private ImageView vector_ek11;
	private ImageView vector_ek12;
	private ImageView vector_ek13;
	private View _bg__hairdressers_ek1;
	private ImageView vector_ek14;
	private TextView hairdressers_ek2;
	private View _bg__reservations_ek1;
	private View _bg__calendar_ek1;
	private ImageView vector_ek15;
	private ImageView vector_ek16;
	private ImageView vector_ek17;
	private ImageView vector_ek18;
	private TextView reservations_ek2;
	private View _bg__bars_ek1;
	private TextView bars_ek2;
	private View _bg__group_427319992_ek1;
	private ImageView polygon_1;
	private ImageView vector_4;
	private ImageView vector_5;
	private ImageView vector_6;
	private View _bg__more_ek1;
	private ImageView vector_ek19;
	private TextView more_ek2;
	private SharedPreferences sharedPreferences;
	private View shopping;
	private static final int REQUEST_LOCATION_PERMISSION = 1;

	@SuppressLint("MissingInflatedId")
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_page);

		if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
			ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, REQUEST_LOCATION_PERMISSION);
		}


		sharedPreferences = getSharedPreferences("loginStatus", Context.MODE_PRIVATE);

		
		_bg__home_search_ek2 = (View) findViewById(R.id._bg__home_search_ek2);
		_bg__topbar_container_top_bar__ek1 = (View) findViewById(R.id._bg__topbar_container_top_bar__ek1);
		_bg__searchfield_ek1 = (View) findViewById(R.id._bg__searchfield_ek1);
		rectangle_2 = (View) findViewById(R.id.rectangle_2);
		search__component_input_text_ = (TextView) findViewById(R.id.search__component_input_text_);
		vector = (ImageView) findViewById(R.id.vector);
		_bg__submitbtn__action_submit__ek1 = (View) findViewById(R.id._bg__submitbtn__action_submit__ek1);
//		rectangle_3 = (View) findViewById(R.id.rectangle_3);
		vector_ek1 = (ImageView) findViewById(R.id.home_vector_ek1);
		yalp = (TextView) findViewById(R.id.yalp);
		greeting = (TextView) findViewById(R.id.greeting);
//		_bg____container__ek1 = (View) findViewById(R.id._bg____container__ek1);
		_bg__restaurants_ek1 = (View) findViewById(R.id._bg__restaurants_ek1);
		restaurants_ek2 = (TextView) findViewById(R.id.restaurants_ek2);
		_bg__group_427319991_ek1 = (View) findViewById(R.id._bg__group_427319991_ek1);
		vector__stroke_ = (ImageView) findViewById(R.id.vector__stroke_);
		_bg__delivery_ek1 = (View) findViewById(R.id.myProfile);
		delivery_ek2 = (TextView) findViewById(R.id.delivery_ek2);
		_bg__truck_ek1 = (View) findViewById(R.id._bg__truck_ek1);
		vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);
		vector_ek3 = (ImageView) findViewById(R.id.vector_ek3);
		vector_ek4 = (ImageView) findViewById(R.id.vector_ek4);
		vector_ek5 = (ImageView) findViewById(R.id.vector_ek5);
		_bg__coffee_ek1 = (View) findViewById(R.id._bg__coffee_ek1);
		coffee___tea = (TextView) findViewById(R.id.coffee___tea);
		_bg__coffee_ek3 = (View) findViewById(R.id._bg__coffee_ek3);
		vector_ek6 = (ImageView) findViewById(R.id.vector_ek6);
		vector_ek7 = (ImageView) findViewById(R.id.vector_ek7);
		vector_ek8 = (ImageView) findViewById(R.id.vector_ek8);
		vector_ek9 = (ImageView) findViewById(R.id.vector_ek9);
		vector_ek10 = (ImageView) findViewById(R.id.vector_ek10);

		takeout = (TextView) findViewById(R.id.takeout);
		_bg__shopping_bag_ek1 = (View) findViewById(R.id._bg__shopping_bag_ek1);
		vector_ek11 = (ImageView) findViewById(R.id.vector_ek11);
		vector_ek12 = (ImageView) findViewById(R.id.vector_ek12);
		vector_ek13 = (ImageView) findViewById(R.id.vector_ek13);
		_bg__hairdressers_ek1 = (View) findViewById(R.id._bg__hairdressers_ek1);
		vector_ek14 = (ImageView) findViewById(R.id.vector_ek14);
		hairdressers_ek2 = (TextView) findViewById(R.id.hairdressers_ek2);
		_bg__reservations_ek1 = (View) findViewById(R.id._bg__reservations_ek1);
		_bg__calendar_ek1 = (View) findViewById(R.id._bg__calendar_ek1);
		vector_ek15 = (ImageView) findViewById(R.id.vector_ek15);
		vector_ek16 = (ImageView) findViewById(R.id.vector_ek16);
		vector_ek17 = (ImageView) findViewById(R.id.vector_ek17);
		vector_ek18 = (ImageView) findViewById(R.id.vector_ek18);
		reservations_ek2 = (TextView) findViewById(R.id.reservations_ek2);
		_bg__bars_ek1 = (View) findViewById(R.id._bg__bars_ek1);
		bars_ek2 = (TextView) findViewById(R.id.bars_ek2);
		_bg__group_427319992_ek1 = (View) findViewById(R.id._bg__group_427319992_ek1);
		polygon_1 = (ImageView) findViewById(R.id.polygon_1);
		vector_4 = (ImageView) findViewById(R.id.vector_4);
		vector_5 = (ImageView) findViewById(R.id.vector_5);
		vector_6 = (ImageView) findViewById(R.id.vector_6);
		_bg__more_ek1 = (View) findViewById(R.id.logout_btn);
		vector_ek19 = (ImageView) findViewById(R.id.vector_ek19);
		more_ek2 = (TextView) findViewById(R.id.more_ek2);
		shopping = (View) findViewById(R.id.shopping);
	
		
		// yujin's code
		Intent intent = getIntent();
		String user_full_name = intent.getStringExtra("full_name");
		// get current time
		LocalTime current = LocalTime.now();
		// set noon time

		LocalTime noon = LocalTime.of(12, 0);

		// set evening time
		LocalTime evening = LocalTime.of(18, 0);

		if (user_full_name != null) {
			if (current.isBefore(noon)) {
				greeting.setText("Good morning, " + user_full_name.split(" ")[0] + "!");
			} else if (current.isAfter(noon) && current.isBefore(evening)) {
				greeting.setText("Good afternoon, " + user_full_name.split(" ")[0] + "!");
			} else {
				greeting.setText("Good evening, " + user_full_name.split(" ")[0] + ".");
			}
		}
		else {
			if (current.isBefore(noon)) {
				greeting.setText("Good morning!");
			} else if (current.isAfter(noon) && current.isBefore(evening)) {
				greeting.setText("Good afternoon!");
			} else {
				greeting.setText("Good evening!");
			}
		}



		// handle click on logout
		_bg__more_ek1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				handleLogout();
			}
		});

		// handle onClick for restaurants
		_bg__restaurants_ek1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(homePage.this, postList_by_category.class);
				String category = getResources().getString(R.string.restaurants_ek2_string);
				intent.putExtra("category", category);
				startActivity(intent);
			}
		});

		// handle onClick for coffee
		_bg__coffee_ek1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(homePage.this, postList_by_category.class);
				String category = "Coffee & Tea";
				intent.putExtra("category", category);
				startActivity(intent);
			}
		});

		// handle onClick for hairDressers
		_bg__hairdressers_ek1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(homePage.this, postList_by_category.class);
				String category = "Hairdressers";
				intent.putExtra("category", category);
				startActivity(intent);
			}
		});

		// handle onClick for Bars
		_bg__bars_ek1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(homePage.this, postList_by_category.class);
				String category = "Bars";
				intent.putExtra("category", category);
				startActivity(intent);
			}
		});

		// handle onClick for myProfile
		_bg__delivery_ek1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(homePage.this, profile_activity.class);
				startActivity(intent);
			}
		});

		// handle onClick for shopping
		shopping.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(homePage.this, postList_by_category.class);
				String category = "Shopping";
				intent.putExtra("category", category);
				startActivity(intent);
			}
		});

		// handle onClick for new Post
		_bg__reservations_ek1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(homePage.this, addPost.class);
				startActivity(intent);
			}
		});
	
	}




	private void handleLogout() {


		Amplify.Auth.signOut(signOutResult -> {
			if (signOutResult instanceof AWSCognitoAuthSignOutResult.CompleteSignOut) {
				// Sign Out completed fully and without errors.
				Log.i("AuthQuickStart", "Signed out successfully");
				SharedPreferences.Editor editor = sharedPreferences.edit();
				editor.putBoolean("isLoggedIn", false);
				editor.apply();

				Intent intent = new Intent(homePage.this, login.class);
				startActivity(intent);
				finish();

			} else if (signOutResult instanceof AWSCognitoAuthSignOutResult.PartialSignOut) {
				AWSCognitoAuthSignOutResult.PartialSignOut partialSignOutResult =
						(AWSCognitoAuthSignOutResult.PartialSignOut) signOutResult;
				HostedUIError hostedUIError = partialSignOutResult.getHostedUIError();
			}
		});




	}
}
	
	