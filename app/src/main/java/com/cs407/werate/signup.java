

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

    import android.app.Activity;
    import android.content.Context;
    import android.content.Intent;
    import android.content.SharedPreferences;
    import android.os.Bundle;
    import android.text.InputType;
    import android.util.Log;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.ImageView;
    import android.widget.TextView;
    import android.widget.Toast;


    import com.amplifyframework.auth.AuthException;
    import com.amplifyframework.auth.AuthUserAttributeKey;
    import com.amplifyframework.auth.options.AuthSignUpOptions;
    import com.amplifyframework.auth.result.AuthSignUpResult;
    import com.amplifyframework.core.Amplify;




    public class signup extends Activity {
        private View rectangle_5;
        private TextView register;
        private EditText my_email_address;
        private Button vector_ek15;
        private EditText my_password;

        private SharedPreferences sharedPreferences;
        private EditText code;
        private EditText full_name;
        private TextView login;
        private View _bg__lock_ek1;

        @Override
        public void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            Log.i("hiiiiiiii", "I am signing up!");

            sharedPreferences = getSharedPreferences("loginStatus", Context.MODE_PRIVATE);

            boolean isLoggedIn = sharedPreferences.getBoolean("isLoggedIn", false);



            setContentView(R.layout.signup);

//


            rectangle_5 = (View) findViewById(R.id.login_btn);
            login = (TextView) findViewById(R.id.login);


            register = (TextView) findViewById(R.id.register);
//            forget_password = (TextView) findViewById(R.id.forget_password);




            my_email_address = (EditText) findViewById(R.id.email_address);

            vector_ek15 = (Button) findViewById(R.id.vector_ek15);

            my_password = (EditText) findViewById(R.id.password);

            code = (EditText) findViewById(R.id.confirm_verification);
            full_name = (EditText) findViewById(R.id.full_name);
            _bg__lock_ek1 = (View) findViewById(R.id._bg__lock_ek1);


            // yujin's design flow goes below

            register.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String verification = code.getText().toString();
                    String user_email = my_email_address.getText().toString();

                    Amplify.Auth.confirmSignUp(
                        user_email,
                            verification,
                            this::onSuccessRegister,
                            this::onErrorRegister
                    );
                }

                private void onErrorRegister(AuthException e) {
                    Toast.makeText(getApplicationContext(), "verification code wrong!", Toast.LENGTH_LONG).show();
                }

                private void onSuccessRegister(AuthSignUpResult authSignUpResult) {
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putBoolean("isLoggedIn", true);
                    editor.apply();
                    // go to home page
                    Intent intent = new Intent(signup.this, homePage.class);
                    intent.putExtra("full_name", full_name.getText().toString());
                    startActivity(intent);
                }
            });


            rectangle_5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setLogin(v);
                }
            });

            // onClick to get verification
            vector_ek15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String user_email = my_email_address.getText().toString();
                    String user_password = my_password.getText().toString();

                    Amplify.Auth.signUp(
                            user_email,
                            user_password,
                            AuthSignUpOptions.builder().userAttribute(
                                    AuthUserAttributeKey.email(), user_email
                            ).build(),
                            this::onJoinSuccess,
                            this::onJoinError
                    );
                }

                private void onJoinError(AuthException e) {

                    Log.i(e.toString(), e.toString());

                }


                private void onJoinSuccess(AuthSignUpResult authSignUpResult) {

                    Toast.makeText(getApplicationContext(), "An verification code has sent to your email!", Toast.LENGTH_LONG).show();
                }
            });

            _bg__lock_ek1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    my_password.setInputType(InputType.TYPE_CLASS_TEXT);
                }
            });


        }

        private void setLogin(View v){
            // some placeholder code here for amplify cognition
            // if (cognition success):

           finish();
        }
    }

