
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		businesslist_category
	 *	@date 		Friday 24th of November 2023 03:53:26 AM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.cs407.werate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class postList_by_category extends Activity {

	
	private View _bg__businesslist_category;
	private View _bg____businessitem_container__ek1;
	private ImageView platter_gab742ad7c_1920_1;
	private TextView business_name;
	private TextView _____;
	private TextView number_of_reviews;
	private TextView category;
	private TextView address;
	private TextView ______;
	private View rectangle_214;
	private View _bg__category__container__ek1;
	private TextView category_name;
	private View _bg__topbar_container_top_bar__ek1;
	private View rectangle_1;
	private TextView yalp;
	private ImageView vector;
	private View _bg__searchfield_ek1;
	private View rectangle_2;
	private TextView search_component_input_text__action_filter_;
	private ImageView vector_ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.post_list_by_categories);

		
		_bg__businesslist_category = (View) findViewById(R.id._bg__businesslist_category);
		_bg____businessitem_container__ek1 = (View) findViewById(R.id._bg____businessitem_container__ek1);
		platter_gab742ad7c_1920_1 = (ImageView) findViewById(R.id.platter_gab742ad7c_1920_1);
		business_name = (TextView) findViewById(R.id.business_name);
		_____ = (TextView) findViewById(R.id._____);
		number_of_reviews = (TextView) findViewById(R.id.number_of_reviews);
		category = (TextView) findViewById(R.id.category);
		address = (TextView) findViewById(R.id.address);
		______ = (TextView) findViewById(R.id.______);
		rectangle_214 = (View) findViewById(R.id.rectangle_214);
		_bg__category__container__ek1 = (View) findViewById(R.id._bg__category__container__ek1);
		category_name = (TextView) findViewById(R.id.category_name);
		_bg__topbar_container_top_bar__ek1 = (View) findViewById(R.id._bg__topbar_container_top_bar__ek1);
		rectangle_1 = (View) findViewById(R.id.rectangle_1);
		yalp = (TextView) findViewById(R.id.yalp);
		vector = (ImageView) findViewById(R.id.vector);
		_bg__searchfield_ek1 = (View) findViewById(R.id._bg__searchfield_ek1);
		rectangle_2 = (View) findViewById(R.id.rectangle_2);
		search_component_input_text__action_filter_ = (TextView) findViewById(R.id.search_component_input_text__action_filter_);
		vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
	
		
		//yujin's code:

		// set category name title
		String textReceived = getIntent().getStringExtra("category");
		category_name.setText("Results for " + textReceived);

		// set go back to home page
		vector.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});

		_bg____businessitem_container__ek1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(postList_by_category.this, postDetails.class);
				startActivity(intent);
			}
		});
	}
}
	
	