package com.cs407.werate;

import android.app.Application;
import android.util.Log;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.api.aws.AWSApiPlugin;
import com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.datastore.AWSDataStorePlugin;
import com.amplifyframework.datastore.generated.model.AmplifyModelProvider;

public class AmplifyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
    try{
        Log.i("hiiiiiiiiiiiii", "at least i am here!");
        AmplifyModelProvider modelProvider = AmplifyModelProvider.getInstance();
        Amplify.addPlugin(new AWSDataStorePlugin(modelProvider));

        Amplify.addPlugin(new AWSApiPlugin());
        Amplify.addPlugin(new AWSCognitoAuthPlugin());

        Amplify.configure(getApplicationContext());

        Log.i("amplify", "configured");

    }catch (AmplifyException e) {
        Log.e("AmplifyInit", "Error during Amplify initialization", e);
        e.printStackTrace();
    }

    }
}
