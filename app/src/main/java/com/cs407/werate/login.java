

	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc
	 *	@file 		frame_461
	 *	@date 		Thursday 23rd of November 2023 06:50:56 AM
	 *	@title 		Page 1
	 *	@author
	 *	@keywords
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */


package com.cs407.werate;

    import static com.amplifyframework.core.Amplify.Auth;

    import android.app.Activity;
    import android.content.Context;
    import android.content.Intent;
    import android.content.SharedPreferences;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.ImageView;
    import android.widget.TextView;
    import android.widget.Toast;

    import com.amplifyframework.AmplifyException;
    import com.amplifyframework.auth.AuthUser;
    import com.amplifyframework.auth.*;
    import com.amplifyframework.auth.result.AuthSignInResult;
    import com.amplifyframework.core.Amplify;


    public class login extends Activity {


        private View _bg__frame_461_ek2;
        private View _bg__create_an_account_ek1;
        private ImageView rectangle_17;
        private ImageView rectangle_18;
        private View _bg__group_15_ek1;
        private TextView or_connect_with;
        private View _bg__frame_16_ek1;
        private View rectangle_5;
        private TextView login;
        private View signUpBtn;
        private View rectangle_5_ek1;
        private TextView register;
        private View _bg__frame_454_ek1;
        private TextView welcome;
        private TextView by_signing_in_you_are_agreeing_our_term_and_privacy_policy;
        private TextView forget_password;
        private View _bg__group_17_ek1;
        private TextView remember_password;
        private View _bg__rectangle_7_ek1;
        private View rectangle_6;
        private View _bg__group_1_ek1;
        private ImageView line_2;
        private ImageView line_3;
        private ImageView rectangle_10;
        private View _bg__frame_444_ek1;
        private View _bg__facebook_1_ek1;
        private View _bg__group_ek1;
        private ImageView vector;
        private ImageView vector_ek1;
        private View _bg__instagram_1_ek1;
        private ImageView vector_ek2;
        private ImageView vector_ek3;
        private ImageView vector_ek4;
        private View _bg__pinterest_1_ek1;
        private View _bg__group_ek3;
        private ImageView vector_ek5;
        private View _bg__group_ek5;
        private ImageView vector_ek6;
        private View _bg__linkedin_1_ek1;
        private View _bg__group_ek7;
        private ImageView vector_ek7;
        private View _bg__group_ek9;
        private ImageView vector_ek8;
        private View _bg__frame_450_ek1;
        private View _bg__fingerprint_1_ek1;
        private View _bg__group_ek11;
        private ImageView vector_ek9;
        private ImageView vector_ek10;
        private ImageView vector_ek11;
        private ImageView vector_ek12;
        private ImageView vector_ek13;
        private TextView login_wit_touch_id;
        private View _bg__frame_451_ek1;
        private View rectangle_16;
        private TextView email_address;
        private View _bg__mail_ek1;
        private ImageView vector_ek14;
        private ImageView vector_ek15;
        private View _bg__frame_452_ek1;
        private View rectangle_16_ek1;
        private TextView password;
        private View _bg__lock_ek1;
        private ImageView vector_ek16;
        private ImageView vector_ek17;
        private ImageView rectangle_19;
        private SharedPreferences sharedPreferences;

        @Override
        public void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);

            sharedPreferences = getSharedPreferences("loginStatus", Context.MODE_PRIVATE);

            boolean isLoggedIn = sharedPreferences.getBoolean("isLoggedIn", false);

            if (isLoggedIn) {
                Intent homeIntent = new Intent(this, homePage.class);
                startActivity(homeIntent);
                this.finish();
            } else {
                setContentView(R.layout.login);
            }

//

            _bg__frame_461_ek2 = (View) findViewById(R.id._bg__frame_461_ek2);
            _bg__create_an_account_ek1 = (View) findViewById(R.id._bg__create_an_account_ek1);
            rectangle_17 = (ImageView) findViewById(R.id.rectangle_17);

            _bg__group_15_ek1 = (View) findViewById(R.id._bg__group_15_ek1);
            or_connect_with = (TextView) findViewById(R.id.or_connect_with);
            _bg__frame_16_ek1 = (View) findViewById(R.id._bg__frame_16_ek1);
            rectangle_5 = (View) findViewById(R.id.login_btn);
            login = (TextView) findViewById(R.id.login);
            signUpBtn = (View) findViewById(R.id._bg__frame_453_ek1);

            register = (TextView) findViewById(R.id.register);
            _bg__frame_454_ek1 = (View) findViewById(R.id._bg__frame_454_ek1);
            welcome = (TextView) findViewById(R.id.welcome);
            by_signing_in_you_are_agreeing_our_term_and_privacy_policy = (TextView) findViewById(R.id.by_signing_in_you_are_agreeing_our_term_and_privacy_policy);
            forget_password = (TextView) findViewById(R.id.forget_password);
            _bg__group_17_ek1 = (View) findViewById(R.id._bg__group_17_ek1);

            rectangle_10 = (ImageView) findViewById(R.id.rectangle_10);
            _bg__frame_444_ek1 = (View) findViewById(R.id._bg__frame_444_ek1);
            _bg__facebook_1_ek1 = (View) findViewById(R.id._bg__facebook_1_ek1);
            _bg__group_ek1 = (View) findViewById(R.id._bg__group_ek1);
            vector = (ImageView) findViewById(R.id.vector);
            vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
            _bg__instagram_1_ek1 = (View) findViewById(R.id._bg__instagram_1_ek1);
            vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);
            vector_ek3 = (ImageView) findViewById(R.id.vector_ek3);

            _bg__pinterest_1_ek1 = (View) findViewById(R.id._bg__pinterest_1_ek1);
            _bg__group_ek3 = (View) findViewById(R.id._bg__group_ek3);
            vector_ek5 = (ImageView) findViewById(R.id.vector_ek5);

            vector_ek6 = (ImageView) findViewById(R.id.vector_ek6);
            _bg__linkedin_1_ek1 = (View) findViewById(R.id._bg__linkedin_1_ek1);
            _bg__group_ek7 = (View) findViewById(R.id._bg__group_ek7);
            vector_ek7 = (ImageView) findViewById(R.id.vector_ek7);

            vector_ek8 = (ImageView) findViewById(R.id.vector_ek8);

            _bg__frame_451_ek1 = (View) findViewById(R.id._bg__frame_451_ek1);
            rectangle_16 = (View) findViewById(R.id.rectangle_16);
            email_address = (TextView) findViewById(R.id.email_address);
            _bg__mail_ek1 = (View) findViewById(R.id._bg__mail_ek1);
            vector_ek14 = (ImageView) findViewById(R.id.vector_ek14);
            vector_ek15 = (ImageView) findViewById(R.id.vector_ek15);
            _bg__frame_452_ek1 = (View) findViewById(R.id._bg__frame_452_ek1);
            rectangle_16_ek1 = (View) findViewById(R.id.rectangle_16_ek1);
            password = (TextView) findViewById(R.id.password);
            _bg__lock_ek1 = (View) findViewById(R.id._bg__lock_ek1);
            vector_ek16 = (ImageView) findViewById(R.id.vector_ek16);
            vector_ek17 = (ImageView) findViewById(R.id.vector_ek17);
            rectangle_19 = (ImageView) findViewById(R.id.rectangle_19);


            // yujin's design flow goes below


            rectangle_5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setLogin(v);
                }
            });

            // signup activity intent
            signUpBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(login.this, signup.class);
                    startActivity(intent);

                }
            });


        }

        private void setLogin(View v){
            // some placeholder code here for amplify cognition
            // if (cognition success):

            String user_email = email_address.getText().toString();
            String user_password = password.getText().toString();

            Auth.signIn(
                    user_email,
                    user_password,
                    this::onLoginSuccess,
                    this::onLoginError
                    );


//
//            Intent intent = new Intent(login.this, homePage.class);
//            startActivity(intent);
//
//            finish();
        }

        private void onLoginError(AuthException e) {
            this.runOnUiThread(() -> {
                Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
            });

        }

        private void onLoginSuccess(AuthSignInResult authSignInResult) {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean("isLoggedIn", true);
            editor.apply();

            Intent intent = new Intent(login.this, homePage.class);
            startActivity(intent);

            finish();
        }
    }

