/*
 * This content is generated from the API File Info.
 * (Alt+Shift+Ctrl+I).
 *
 * @desc
 * @file      frame_461
 * @date      Thursday 23rd of November 2023 06:50:56 AM
 * @title     Page 1
 * @author
 * @keywords
 * @generator Export Kit v1.3.figma
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
 
     // Declare UI elements
     private View _bg__frame_461_ek2;
     private View _bg__create_an_account_ek1;
     private ImageView rectangle_17;
     // ... (continue for other UI elements)
 
     private SharedPreferences sharedPreferences;
 
     @Override
     public void onCreate(Bundle savedInstanceState) {
 
         super.onCreate(savedInstanceState);
 
         // Initialize shared preferences for login status
         sharedPreferences = getSharedPreferences("loginStatus", Context.MODE_PRIVATE);
 
         // Check if the user is already logged in
         boolean isLoggedIn = sharedPreferences.getBoolean("isLoggedIn", false);
 
         if (isLoggedIn) {
             // If logged in, navigate to home page and finish current activity
             Intent homeIntent = new Intent(this, homePage.class);
             startActivity(homeIntent);
             this.finish();
         } else {
             // If not logged in, set content view to login layout
             setContentView(R.layout.login);
         }
 
         // Initialize UI elements
         // ...
 
         // Set click listeners for UI elements
         rectangle_5.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 setLogin(v);
             }
         });
 
         signUpBtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 // Navigate to signup activity
                 Intent intent = new Intent(login.this, signup.class);
                 startActivity(intent);
             }
         });
     }
 
     // Method to handle login logic
     private void setLogin(View v) {
         // Placeholder code for amplify authentication
         String user_email = email_address.getText().toString();
         String user_password = password.getText().toString();
 
         Auth.signIn(
                 user_email,
                 user_password,
                 this::onLoginSuccess,
                 this::onLoginError
         );
     }
 
     // Method to handle login success
     private void onLoginSuccess(AuthSignInResult authSignInResult) {
         // Update login status in shared preferences
         SharedPreferences.Editor editor = sharedPreferences.edit();
         editor.putBoolean("isLoggedIn", true);
         editor.apply();
 
         // Navigate to home page and finish current activity
         Intent intent = new Intent(login.this, homePage.class);
         startActivity(intent);
         finish();
     }
 
     // Method to handle login error
     private void onLoginError(AuthException e) {
         // Display error message in a Toast
         this.runOnUiThread(() -> {
             Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
         });
     }
 }