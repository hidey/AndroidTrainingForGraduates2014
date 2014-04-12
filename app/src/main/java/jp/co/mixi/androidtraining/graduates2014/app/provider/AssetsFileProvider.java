package jp.co.mixi.androidtraining.graduates2014.app.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

import java.io.FileNotFoundException;
import java.io.IOException;

public class AssetsFileProvider extends ContentProvider {
    private static final String TAG = AssetsFileProvider.class.getSimpleName();

    public static final String AUTHORITY = "jp.co.mixi.androidtraining.graduates2014.app.assets";
    public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY);

    public AssetsFileProvider() {
    }

    @Override
    public AssetFileDescriptor openAssetFile(Uri uri, String mode)
            throws FileNotFoundException {
        Log.i(TAG, "open Asset file");
        try {
            String path = uri.getLastPathSegment();
            Log.e(TAG, "file" + path);
            return getContext().getAssets().openFd(path);
        } catch (IOException e) {
            e.printStackTrace();
            Log.e(TAG, "ERROR: " + e);
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        // Implement this to handle requests to delete one or more rows.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public String getType(Uri uri) {
        // at the given URI.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public boolean onCreate() {
        return false;
    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection,
                        String[] selectionArgs, String sortOrder) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection,
                      String[] selectionArgs) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
