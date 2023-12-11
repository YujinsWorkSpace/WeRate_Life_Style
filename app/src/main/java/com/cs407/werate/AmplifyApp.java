package com.cs407.werate;

import android.app.Application;
import android.util.Log;

import com.amazonaws.mobile.client.Callback;
import com.amazonaws.mobile.client.UserStateDetails;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.api.aws.AWSApiPlugin;
import com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.datastore.AWSDataStorePlugin;
import com.amplifyframework.datastore.generated.model.AmplifyModelProvider;
import com.amplifyframework.storage.s3.AWSS3StoragePlugin;
import com.amazonaws.mobile.client.AWSMobileClient;



public class AmplifyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
    try{
        AmplifyModelProvider modelProvider = AmplifyModelProvider.getInstance();
        Amplify.addPlugin(new AWSDataStorePlugin(modelProvider));
        Amplify.addPlugin(new AWSApiPlugin());
        Amplify.addPlugin(new AWSCognitoAuthPlugin());
        Amplify.addPlugin(new AWSDataStorePlugin());
        Amplify.addPlugin(new AWSS3StoragePlugin());
        Amplify.configure(getApplicationContext());


        Log.i("amplify", "configured");

    }catch (AmplifyException e) {
        Log.e("AmplifyInit", "Error during Amplify initialization", e);
        e.printStackTrace();
    }

        initializeAWSMobileClient();

//    Todo todo = Todo.builder()
//            .title("Create an Amplify DataStore app")
//            .status(TodoStatus.ACTIVE)
//            .build();
//    Amplify.DataStore.save(todo,
//            result -> Log.i("MyAplic", "Created a new post successfully"),
//            error -> Log.e("MyAmplifyApp," "Error creating post", error));

    }

    private void initializeAWSMobileClient() {
        AWSMobileClient.getInstance().initialize(this, new Callback<UserStateDetails>() {
            @Override
            public void onResult(UserStateDetails result) {
                Log.i("AWSMobileClient", "Initialization successful.");
            }

            @Override
            public void onError(Exception e) {
                Log.e("AWSMobileClient", "Initialization error.", e);
            }
        });
    }
}
