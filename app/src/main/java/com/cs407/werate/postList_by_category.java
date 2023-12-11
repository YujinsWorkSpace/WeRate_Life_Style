
	 
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

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.HttpMethod;
import com.amazonaws.mobile.client.AWSMobileClient;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.GeneratePresignedUrlRequest;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.model.query.Where;
import com.amplifyframework.datastore.generated.model.Post;
import com.bumptech.glide.Glide;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import aws.smithy.kotlin.runtime.SdkBaseException;

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
	private RecyclerView postsRecyclerView;
	private PostsAdapter postsAdapter;
//	private TextView title;
//	private TextView rating;
//	private

	public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.PostViewHolder> {
		private List<Post> postsList;

		public PostsAdapter(List<Post> postsList) {
			this.postsList = postsList;
		}

		@NonNull
		@Override
		public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
			View view = LayoutInflater.from(parent.getContext())
					.inflate(R.layout.post_list_layout, parent, false);
			return new PostViewHolder(view);
		}


		@SuppressLint("SetTextI18n")
		@Override
		public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
			Post post = postsList.get(position);
			holder.titleTextView.setText(post.getTitle());
			holder.categoryTextView.setText(post.getCategory());
			// Set other attributes of the post to the holder as needed
			holder.rating.setText("Rating: " + String.format(Locale.getDefault(), "%.2f", post.getRating()));
			holder.zipCode.setText("Zip Code: " + String.valueOf(post.getZipCode()));
			holder.serviceName.setText(post.getServiceName());
			if (post.getPostImgUrl() != null && !post.getPostImgUrl().isEmpty()) {
				Glide.with(holder.itemView.getContext())
						.load(post.getPostImgUrl())
						.into(holder.postImg);
			}
		}

		@Override
		public int getItemCount() {
			return postsList.size();
		}

		public class PostViewHolder extends RecyclerView.ViewHolder {
			TextView titleTextView;
			TextView categoryTextView;
			TextView rating;
			TextView zipCode;
			TextView serviceName;
			ImageView postImg;

			// Define other views in the item layout

			public PostViewHolder(View itemView) {
				super(itemView);
				titleTextView = itemView.findViewById(R.id.post_list_title);
				categoryTextView = itemView.findViewById(R.id.post_list_category);
				// Initialize other views in the item layout
				rating = itemView.findViewById(R.id.post_list_rating);
				zipCode = itemView.findViewById(R.id.post_list_zipCode);
				serviceName = itemView.findViewById(R.id.post_list_service_name);
				postImg = itemView.findViewById(R.id.post_list_img);
			}
		}

		// Method to update the data set and refresh the RecyclerView
		public void setPostsList(List<Post> newPostsList) {
			this.postsList = newPostsList;
			notifyDataSetChanged(); // Refresh the RecyclerView
		}
	}

		@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.post_list_by_categories);

		
		_bg__businesslist_category = (View) findViewById(R.id._bg__businesslist_category);



		_bg__category__container__ek1 = (View) findViewById(R.id._bg__category__container__ek1);
		category_name = (TextView) findViewById(R.id.category_name);
		_bg__topbar_container_top_bar__ek1 = (View) findViewById(R.id._bg__topbar_container_top_bar__ek1);
		rectangle_1 = (View) findViewById(R.id.rectangle_1);
		yalp = (TextView) findViewById(R.id.yalp);
		vector = (ImageView) findViewById(R.id.vector);

		rectangle_2 = (View) findViewById(R.id.rectangle_2);
		search_component_input_text__action_filter_ = (TextView) findViewById(R.id.search_component_input_text__action_filter_);

	
		
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

			postsRecyclerView = findViewById(R.id.postsRecyclerView);
			postsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
			postsAdapter = new PostsAdapter(new ArrayList<>());
			postsRecyclerView.setAdapter(postsAdapter);


			fetchAndDisplayPosts(textReceived);
	}

	private void fetchAndDisplayPosts(String category) {
		Amplify.DataStore.query(
				Post.class,
				Where.matches(Post.CATEGORY.eq(category)),
				posts -> {
					// Assuming you have a RecyclerView to show your posts
					List<Post> categoryPosts = new ArrayList<>();
					while (posts.hasNext()) {
						categoryPosts.add(posts.next());
					}
					runOnUiThread(() -> {
						// Update your RecyclerView with the list of posts
						// You'll need to implement a RecyclerView.Adapter to handle the display

						postsAdapter.setPostsList(categoryPosts);

					});
				},
				failure -> Log.e("CategoryPostsActivity", "Query failed", failure)
		);
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
	
	