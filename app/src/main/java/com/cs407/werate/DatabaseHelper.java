package com.cs407.werate;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    // Database Info
    private static final String DATABASE_NAME = "myAppDatabase";
    private static final int DATABASE_VERSION = 1;

    // Table Names
    private static final String TABLE_CATEGORY = "Category";
    private static final String TABLE_COMMENT = "Comment";
    private static final String TABLE_POST = "Post";
    private static final String TABLE_USER = "User";
    private static final String TABLE_USER_COMMENT = "UserComment";

    // Category Table Columns
    private static final String KEY_CATEGORY_ID = "id";

    // Comment Table Columns
    private static final String KEY_COMMENT_ID = "id";
    private static final String KEY_COMMENT_CONTENT = "content";
    private static final String KEY_COMMENT_LIKES = "likes";
    private static final String KEY_COMMENT_POST_ID = "postID";
    private static final String KEY_COMMENT_USER = "userID";

    // Post Table Columns
    private static final String KEY_POST_ID = "id";
    private static final String KEY_POST_CATEGORY = "Category";
    private static final String KEY_POST_RATING = "Rating";
    private static final String KEY_POST_SERVICE_WEB = "ServiceWeb";
    private static final String KEY_POST_SERVICE_NUM = "ServiceNum";
    private static final String KEY_POST_TITLE = "Title";
    private static final String KEY_POST_CONTENT = "Content";
    private static final String KEY_POST_POST_TIME = "postTime";
    private static final String KEY_POST_USER_ID = "userID";
    private static final String KEY_POST_CATEGORY_ID = "categoryID";

    // User Table Columns
    private static final String KEY_USER_ID = "id";
    private static final String KEY_USER_FIRST_NAME = "FirstName";
    private static final String KEY_USER_LAST_NAME = "LastName";
    private static final String KEY_USER_EMAIL = "Email";
    private static final String KEY_USER_PASSWORD = "password";
    private static final String KEY_USER_PHONE_NUMBER = "phoneNumber";
    private static final String KEY_USER_VERIFIED = "Verified";

    // UserComment Table Columns
    private static final String KEY_USER_COMMENT_USER_ID = "userID";
    private static final String KEY_USER_COMMENT_COMMENT_ID = "commentID";

    // Table Create Statements
    private static final String CREATE_CATEGORY_TABLE = "CREATE TABLE " + TABLE_CATEGORY + "("
            + KEY_CATEGORY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT"
            + ")";

    private static final String CREATE_COMMENT_TABLE = "CREATE TABLE " + TABLE_COMMENT + "("
            + KEY_COMMENT_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + KEY_COMMENT_CONTENT + " TEXT,"
            + KEY_COMMENT_LIKES + " INTEGER,"
            + KEY_COMMENT_POST_ID + " INTEGER,"
            + "FOREIGN KEY(" + KEY_COMMENT_POST_ID + ") REFERENCES " + TABLE_POST + "(" + KEY_POST_ID + ")"
            + ")";

    private static final String CREATE_POST_TABLE = "CREATE TABLE " + TABLE_POST + "("
            + KEY_POST_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + KEY_POST_CATEGORY + " TEXT,"
            + KEY_POST_RATING + " INTEGER,"
            + KEY_POST_SERVICE_WEB + " TEXT,"
            + KEY_POST_SERVICE_NUM + " TEXT,"
            + KEY_POST_TITLE + " TEXT,"
            + KEY_POST_CONTENT + " TEXT,"
            + KEY_POST_POST_TIME + " TEXT,"
            + KEY_POST_USER_ID + " INTEGER,"
            + KEY_POST_CATEGORY_ID + " INTEGER,"
            + "FOREIGN KEY(" + KEY_POST_USER_ID + ") REFERENCES " + TABLE_USER + "(" + KEY_USER_ID + "),"
            + "FOREIGN KEY(" + KEY_POST_CATEGORY_ID + ") REFERENCES " + TABLE_CATEGORY + "(" + KEY_CATEGORY_ID + ")"
            + ")";

    private static final String CREATE_USER_TABLE = "CREATE TABLE " + TABLE_USER + "("
            + KEY_USER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + KEY_USER_FIRST_NAME + " TEXT,"
            + KEY_USER_LAST_NAME + " TEXT,"
            + KEY_USER_EMAIL + " TEXT,"
            + KEY_USER_PASSWORD + " TEXT,"
            + KEY_USER_PHONE_NUMBER + " TEXT,"
            + KEY_USER_VERIFIED + " BOOLEAN"
            + ")";

    private static final String CREATE_USER_COMMENT_TABLE = "CREATE TABLE " + TABLE_USER_COMMENT + "("
            + KEY_USER_COMMENT_USER_ID + " INTEGER,"
            + KEY_USER_COMMENT_COMMENT_ID + " INTEGER,"
            + "PRIMARY KEY(" + KEY_USER_COMMENT_USER_ID + ", " + KEY_USER_COMMENT_COMMENT_ID + "),"
            + "FOREIGN KEY(" + KEY_USER_COMMENT_USER_ID + ") REFERENCES " + TABLE_USER + "(" + KEY_USER_ID + "),"
            + "FOREIGN KEY(" + KEY_USER_COMMENT_COMMENT_ID + ") REFERENCES " + TABLE_COMMENT + "(" + KEY_COMMENT_ID + ")"
            + ")";
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_CATEGORY_TABLE);
        db.execSQL(CREATE_COMMENT_TABLE);
        db.execSQL(CREATE_POST_TABLE);
        db.execSQL(CREATE_USER_TABLE);
        db.execSQL(CREATE_USER_COMMENT_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CATEGORY);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_COMMENT);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_POST);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USER);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USER_COMMENT);
        onCreate(db);
    }

    // CRUD Operations for Category


}
