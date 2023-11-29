
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		add_a_business
	 *	@date 		Friday 24th of November 2023 12:20:22 AM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.cs407.werate;

    import android.app.Activity;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.ImageView;
    import android.widget.TextView;

    public class addPost extends Activity {


        private View _bg__add_a_business_ek2;
        private View _bg____container__ek1;
        private TextView business_name;
        private View _bg__description_ek1;
        private View rectangle_217;
        private TextView __description_component_input_textarea_;
        private View _bg__pricerange_ek1;
        private View rectangle_217_ek1;
        private TextView __pricerange_component_input_text_;
        private View _bg__category_ek1;
        private View rectangle_217_ek2;
        private TextView __category__component_input_select_restaurant_coffe_tea_hairdresser_bar_delivery_takeout_reservation_other_;
        private View _bg__group_ek1;
        private ImageView vector;
        private ImageView vector_ek1;
        private View _bg__name_ek1;
        private View rectangle_217_ek3;
        private TextView __name_component_input_text_;
        private View _bg__phone_ek1;
        private View rectangle_217_ek4;
        private TextView __phone_component_input_text_;
        private View _bg__web_ek1;
        private View rectangle_217_ek5;
        private TextView __web_component_input_text_;
        private View _bg__email_ek1;
        private View rectangle_217_ek6;
        private TextView __email_component_input_email_;
        private View _bg__submitbtn__action_submit__ek1;
        private View rectangle_218;
        private TextView btntxt;
        private ImageView __image_component_input_image_;
        private View _bg__topbar_container_top_bar__ek1;
        private View rectangle_1;
        private TextView yalp;
        private ImageView vector_ek2;

        @Override
        public void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.add_post);


            _bg__add_a_business_ek2 = (View) findViewById(R.id._bg__add_a_business_ek2);
//            _bg____container__ek1 = (View) findViewById(R.id._bg____container__ek1);
            business_name = (TextView) findViewById(R.id.business_name);
            _bg__description_ek1 = (View) findViewById(R.id._bg__description_ek1);
            rectangle_217 = (View) findViewById(R.id.rectangle_217);
            __description_component_input_textarea_ = (TextView) findViewById(R.id.__description_component_input_textarea_);
//            _bg__pricerange_ek1 = (View) findViewById(R.id._bg__pricerange_ek1);
//            rectangle_217_ek1 = (View) findViewById(R.id.rectangle_217_ek1);
//            __pricerange_component_input_text_ = (TextView) findViewById(R.id.__pricerange_component_input_text_);
            _bg__category_ek1 = (View) findViewById(R.id._bg__category_ek1);
            rectangle_217_ek2 = (View) findViewById(R.id.rectangle_217_ek2);
            __category__component_input_select_restaurant_coffe_tea_hairdresser_bar_delivery_takeout_reservation_other_ = (TextView) findViewById(R.id.__category__component_input_select_restaurant_coffe_tea_hairdresser_bar_delivery_takeout_reservation_other_);
            _bg__group_ek1 = (View) findViewById(R.id._bg__group_ek1);
            vector = (ImageView) findViewById(R.id.vector);
            vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
            _bg__name_ek1 = (View) findViewById(R.id._bg__name_ek1);
            rectangle_217_ek3 = (View) findViewById(R.id.rectangle_217_ek3);
            __name_component_input_text_ = (TextView) findViewById(R.id.__name_component_input_text_);
//            _bg__phone_ek1 = (View) findViewById(R.id._bg__phone_ek1);
//            rectangle_217_ek4 = (View) findViewById(R.id.rectangle_217_ek4);
//            __phone_component_input_text_ = (TextView) findViewById(R.id.__phone_component_input_text_);
//            _bg__web_ek1 = (View) findViewById(R.id._bg__web_ek1);
//            rectangle_217_ek5 = (View) findViewById(R.id.rectangle_217_ek5);
//            __web_component_input_text_ = (TextView) findViewById(R.id.__web_component_input_text_);
//            _bg__email_ek1 = (View) findViewById(R.id._bg__email_ek1);
//            rectangle_217_ek6 = (View) findViewById(R.id.rectangle_217_ek6);
//            __email_component_input_email_ = (TextView) findViewById(R.id.__email_component_input_email_);
            _bg__submitbtn__action_submit__ek1 = (View) findViewById(R.id._bg__submitbtn__action_submit__ek1);
            rectangle_218 = (View) findViewById(R.id.rectangle_218);
            btntxt = (TextView) findViewById(R.id.btntxt);
            __image_component_input_image_ = (ImageView) findViewById(R.id.__image_component_input_image_);
            _bg__topbar_container_top_bar__ek1 = (View) findViewById(R.id._bg__topbar_container_top_bar__ek1);
            rectangle_1 = (View) findViewById(R.id.rectangle_1);
            yalp = (TextView) findViewById(R.id.yalp);
            vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);


            //custom code goes here
            vector_ek2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }
    }
	
	