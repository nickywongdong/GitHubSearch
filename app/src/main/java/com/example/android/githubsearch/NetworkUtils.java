package com.example.android.githubsearch;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by hessro on 1/30/18.
 */

public class NetworkUtils {

    private static final OkHttpClient mHTTPClient = new OkHttpClient();


    //except this function to throw exception
    public static String doHTTPGet(String url) throws IOException {

        Request req = new Request.Builder().url(url).build();

        Response res = mHTTPClient.newCall(req).execute();

        try {
            return res.body().string();
        } finally{
            res.close();
        }

        /*
        HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();

        InputStream inputStream;
        try {
            inputStream = urlConnection.getInputStream();
        } finally {
            urlConnection.disconnect();
        }

        Scanner scanner = new Scanner(inputStream);
        scanner.useDelimiter("\\A");

        if (scanner.hasNext()) {
            return scanner.next();
        } else {
            return null;
        }
        */
    }
}
