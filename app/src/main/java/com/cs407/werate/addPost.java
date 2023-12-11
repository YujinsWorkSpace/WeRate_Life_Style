
	 
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
    import android.content.Intent;
    import android.content.pm.PackageManager;
    import android.graphics.Bitmap;
    import android.graphics.BitmapFactory;
    import android.net.Uri;
    import android.os.Bundle;
    import android.util.Log;
    import android.view.MenuItem;
    import android.view.View;
    import android.widget.EditText;
    import android.widget.ImageView;
    import android.widget.PopupMenu;
    import android.widget.TextView;
    import android.widget.Toast;

    import androidx.core.app.ActivityCompat;
    import androidx.core.content.ContextCompat;

    import com.amazonaws.AmazonServiceException;
    import com.amazonaws.HttpMethod;
    import com.amazonaws.mobile.client.AWSMobileClient;
    import com.amazonaws.services.s3.AmazonS3Client;
    import com.amazonaws.services.s3.model.GeneratePresignedUrlRequest;
    import com.amplifyframework.auth.cognito.AWSCognitoAuthSession;
    import com.amplifyframework.core.Amplify;
    import com.amplifyframework.core.model.temporal.Temporal;
    import com.amplifyframework.datastore.generated.model.Post;

    import java.io.File;
    import java.io.FileNotFoundException;
    import java.io.FileOutputStream;
    import java.io.IOException;
    import java.io.InputStream;
    import java.io.OutputStream;
    import java.net.URL;
    import java.time.OffsetDateTime;
    import java.time.format.DateTimeFormatter;
    import java.util.Date;
    import java.util.UUID;

    import aws.smithy.kotlin.runtime.SdkBaseException;

    public class addPost extends Activity {


        private View _bg__add_a_business_ek2;
        private View _bg____container__ek1;
        private TextView business_name;
        private View _bg__description_ek1;
        private View rectangle_217;
        private EditText __description_component_input_textarea_;
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
        private static final int PICK_IMAGE_REQUEST = 1;
        private final String[] dropdownOptions = {"Restaurants", "Coffee & Tea", "Hairdressers", "Bars", "Shopping", "Other"};
        private final String[] dropdownOptionsRating = {"1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5"};
        private ImageView vector_choose;
        private ImageView vector_choose2;
        private TextView textRating;
        private EditText serviceName;
        private EditText zipcode;
        private String imgUrl;
        private static final String BUCKET_NAME = "weratelifestyle-storage-6440478b145334-dev";
        private static final String REGION = "us-east-2";

        public interface UrlCallback {
            void onUrlReceived(String url);
            void onError(Exception e);
        }

        @Override
        public void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.add_post);


            _bg__add_a_business_ek2 = (View) findViewById(R.id._bg__add_a_business_ek2);
//            _bg____container__ek1 = (View) findViewById(R.id._bg____container__ek1);
            business_name = (TextView) findViewById(R.id.business_name);
            _bg__description_ek1 = (View) findViewById(R.id._bg__description_ek1);
            rectangle_217 = (View) findViewById(R.id.rectangle_217);
            __description_component_input_textarea_ = (EditText) findViewById(R.id.__description_component_input_textarea_);
//            _bg__pricerange_ek1 = (View) findViewById(R.id._bg__pricerange_ek1);
//            rectangle_217_ek1 = (View) findViewById(R.id.rectangle_217_ek1);
//            __pricerange_component_input_text_ = (TextView) findViewById(R.id.__pricerange_component_input_text_);
            _bg__category_ek1 = (View) findViewById(R.id._bg__category_ek1);
            rectangle_217_ek2 = (View) findViewById(R.id.rectangle_217_ek2);
            __category__component_input_select_restaurant_coffe_tea_hairdresser_bar_delivery_takeout_reservation_other_ = (TextView) findViewById(R.id.__category__component_input_select_restaurant_coffe_tea_hairdresser_bar_delivery_takeout_reservation_other_);
            _bg__group_ek1 = (View) findViewById(R.id._bg__group_ek1);
            vector = (ImageView) findViewById(R.id.vector);
            vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);

            rectangle_217_ek3 = (View) findViewById(R.id.rectangle_217_ek3);
            __name_component_input_text_ = (TextView) findViewById(R.id.__name_component_input_text_);
            _bg__submitbtn__action_submit__ek1 = (View) findViewById(R.id._bg__submitbtn__action_submit__ek1);
            rectangle_218 = (View) findViewById(R.id.rectangle_218);
            btntxt = (TextView) findViewById(R.id.btntxt);
            __image_component_input_image_ = (ImageView) findViewById(R.id.__image_component_input_image_);
            _bg__topbar_container_top_bar__ek1 = (View) findViewById(R.id._bg__topbar_container_top_bar__ek1);
            rectangle_1 = (View) findViewById(R.id.rectangle_1);
            yalp = (TextView) findViewById(R.id.yalp);
            vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);
            vector_choose = findViewById(R.id.vector_choose);
            vector_choose2 = findViewById(R.id.vector_choose2);
            textRating = findViewById(R.id.textRating);
            serviceName = (EditText) findViewById(R.id.serviceName);
            zipcode = (EditText) findViewById(R.id.zipCode);




            //custom code goes here
            vector_ek2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });

            // handle upload image
            __image_component_input_image_.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   openImageChooser();
                }
            });

            vector.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showDropdownMenu(v);
                }
            });

            vector_ek1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showDropdownMenu(v);
                }
            });

            vector_choose.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showDropdownMenuRating(v);
                }
            });

            vector_choose2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showDropdownMenuRating(v);
                }
            });

            rectangle_218.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String title = __name_component_input_text_.getText().toString();
                    String category = __category__component_input_select_restaurant_coffe_tea_hairdresser_bar_delivery_takeout_reservation_other_.getText().toString();
                    String ServiceName = serviceName.getText().toString();

                    double rating;
                    int ZipCode;
                    try {
                        rating = Double.parseDouble(textRating.getText().toString());
                        ZipCode = Integer.parseInt(zipcode.getText().toString());
                    } catch (NumberFormatException e) {
                        Toast.makeText(getApplicationContext(), "Please enter valid numbers for rating and zip code", Toast.LENGTH_SHORT).show();
                        return; // Stop further execution in case of parsing error
                    }

                    String content = __description_component_input_textarea_.getText().toString();

                    if (title.isEmpty() || category.isEmpty() || ServiceName.isEmpty()) {
                        Toast.makeText(getApplicationContext(), "Please fill out title, category or service name", Toast.LENGTH_SHORT).show();
                        return; // Stop further execution in case of missing fields
                    }

                    OffsetDateTime now = OffsetDateTime.now();
                    String formattedDate = now.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);

                    // Fetch user ID and create post
                    Amplify.Auth.fetchAuthSession(
                            result -> {
                                AWSCognitoAuthSession cognitoAuthSession = (AWSCognitoAuthSession) result;
                                if (!cognitoAuthSession.getIdentityIdResult().toString().equals("")) {
                                    String userId = cognitoAuthSession.getIdentityIdResult().toString();
                                    createPost(title, category, ServiceName, rating, content, userId, formattedDate, ZipCode);
                                } else {
                                    Log.e("AuthDemo", "User ID not available");
                                    // Handle the scenario when user ID is not available
                                    return;
                                }
                            },
                            error -> Log.e("AuthDemo", error.toString())
                    );

                    Intent intent = new Intent(addPost.this, homePage.class);
                    startActivity(intent);
                }
            });
        }

        private void createPost(String title, String category, String serviceName, double rating, String content, String userId, String postTime, int zip) {
            Temporal.Date today = new Temporal.Date(new Date());
            Post newPost = Post.builder()
                    .title(title)
                    .category(category)
                    .rating(rating)
                    .content(content)
                    .userId(userId) // Set the userId here
                    .serviceName(serviceName)
                    .postDate(today)
                    .zipCode(zip)
                    .postImgUrl(imgUrl)
                    .build();

            // Save the newPost to the DataStore or backend
            Amplify.DataStore.save(newPost,
                    success -> Log.i("Save", "Post saved successfully"),
                    error -> Log.e("Save", "Error saving post", error)
            );
        }

        private void openImageChooser() {
            Intent intent = new Intent();
            intent.setType("image/*");
            intent.setAction(Intent.ACTION_GET_CONTENT);
            startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE_REQUEST);
        }

        /**
         *
         * @param requestCode The integer request code originally supplied to
         *                    startActivityForResult(), allowing you to identify who this
         *                    result came from.
         * @param resultCode The integer result code returned by the child activity
         *                   through its setResult().
         * @param data An Intent, which can return result data to the caller
         *               (various data can be attached to Intent "extras").
         *
         */
        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
            super.onActivityResult(requestCode, resultCode, data);

            if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null) {
                Uri imageUri = data.getData();

                try {
                    Bitmap bitmap = decodeUriToBitmap(imageUri);
                    __image_component_input_image_.setImageBitmap(bitmap);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

                uploadImageToS3(imageUri);
            } else {
                Log.i("MyAmplifyApp", "failed enter uploaded: ");
            }
        }

        private Bitmap decodeUriToBitmap(Uri selectedImage) throws FileNotFoundException {
            BitmapFactory.Options o = new BitmapFactory.Options();
            o.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(getContentResolver().openInputStream(selectedImage), null, o);

            // The new size we want to scale to
            final int REQUIRED_SIZE = 140;

            // Find the correct scale value. It should be a power of 2.
            int scale = 1;
            while (o.outWidth / scale / 2 >= REQUIRED_SIZE && o.outHeight / scale / 2 >= REQUIRED_SIZE) {
                scale *= 2;
            }

            BitmapFactory.Options o2 = new BitmapFactory.Options();
            o2.inSampleSize = scale;
            return BitmapFactory.decodeStream(getContentResolver().openInputStream(selectedImage), null, o2);
        }


        private void uploadImageToS3(Uri imageUri) {
            String fileName = "image_" + System.currentTimeMillis() + "_" + UUID.randomUUID().toString() + ".jpg"; // Generate or get a unique file name

            File imageFile = uriToFile(imageUri);
            if (imageFile != null) {
                Amplify.Storage.uploadFile(
                        fileName,
                        imageFile,
                        result -> {
                            Log.i("MyAmplifyApp", "Successfully uploaded: " + result.getKey());
                            getUploadedFileUrl(result.getKey(), new UrlCallback() {
                                @Override
                                public void onUrlReceived(String url) {
                                    String fileKey = url.substring(url.indexOf(BUCKET_NAME) + BUCKET_NAME.length() + 1);
                                    imgUrl = generatePresignedUrl(BUCKET_NAME, fileKey);
                                    Log.i("MyAmplifyApp", "Actual URL: " + imgUrl);
                                }

                                @Override
                                public void onError(Exception e) {
                                    Log.e("MyAmplifyApp", "Error in getting URL", e);
                                }
                            });
                            },
                        storageFailure -> Log.e("MyAmplifyApp", "Upload failed", storageFailure)
                );
            } else {
                Log.e("MyAmplifyApp", "Failed to convert URI to file");
            }
        }

        private File uriToFile(Uri uri) {
            File file = new File(getCacheDir(), "upload_" + System.currentTimeMillis());
            try (InputStream in = getContentResolver().openInputStream(uri);
                 OutputStream out = new FileOutputStream(file)) {
                byte[] buffer = new byte[1024];
                int length;
                while ((in != null) && (length = in.read(buffer)) > 0) {
                    out.write(buffer, 0, length);
                }
                return file;
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        private void getUploadedFileUrl(String fileKey, UrlCallback callback) {
            Amplify.Storage.getUrl(
                    fileKey,
                    result -> callback.onUrlReceived(result.getUrl().toString()),
                    error -> callback.onError(error)
            );
        }


        private void showDropdownMenu(View anchor) {
            PopupMenu popupMenu = new PopupMenu(this, anchor);
            for (String option : dropdownOptions) {
                popupMenu.getMenu().add(option);
            }
            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    // Replace the text of the EditText field with the selected option
                    __category__component_input_select_restaurant_coffe_tea_hairdresser_bar_delivery_takeout_reservation_other_.setText(item.getTitle());
                    return true;
                }
            });
            popupMenu.show();
        }

        private void showDropdownMenuRating(View anchor) {
            PopupMenu popupMenu = new PopupMenu(this, anchor);
            for (String option : dropdownOptionsRating) {
                popupMenu.getMenu().add(option);
            }
            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    // Replace the text of the EditText field with the selected option
                    textRating.setText(item.getTitle());
                    return true;
                }
            });
            popupMenu.show();
        }

        private String getPublicFileUrl(String fileKey) {
            return "https://" + BUCKET_NAME + ".s3." + REGION + ".amazonaws.com/" + fileKey;
        }

        private String generatePresignedUrl(String bucketName, String objectKey) {
            try {
                AmazonS3Client s3Client = new AmazonS3Client(AWSMobileClient.getInstance());
                java.util.Date expiration = new java.util.Date();
                long expTimeMillis = expiration.getTime();
                expTimeMillis += 1000 * 60 * 60; // Add 1 hour.
                expiration.setTime(expTimeMillis);

                GeneratePresignedUrlRequest generatePresignedUrlRequest =
                        new GeneratePresignedUrlRequest(bucketName, objectKey)
                                .withMethod(HttpMethod.GET)
                                .withExpiration(expiration);
                URL url = s3Client.generatePresignedUrl(generatePresignedUrlRequest);

                return url.toString();
            } catch (AmazonServiceException e) {
                // Handle AmazonServiceException, which means your request made it
                // to AWS, but was rejected with an error response for some reason.
                e.printStackTrace();
            } catch (SdkBaseException e) {
                // Handle SdkClientException, which means there was an error
                // generating the pre-signed URL.
                e.printStackTrace();
            }

            return null;
        }
    }


	
	