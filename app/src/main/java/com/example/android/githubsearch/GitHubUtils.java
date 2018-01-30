package com.example.android.githubsearch;

import android.net.Uri;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

/**
 * Created by wongnich on 1/30/18.
 */

public class GitHubUtils {
    final static String GITHUB_SEARCH_BASE_URL = "https://api.github.com/search/repositories";
    final static String GITHUB_SEARCH_QUERY_PARAM = "q";
    final static String GITHUB_SEARCH_SORT_PARAM = "sort";
    final static String GITHUB_SEARCH_SORT_VALUE = "stars";

    public static URL buildGitHubSearchURL(String searchQuery){
    Uri searchURI = Uri.parse(GITHUB_SEARCH_BASE_URL).buildUpon()
            .appendQueryParameter(GITHUB_SEARCH_QUERY_PARAM, searchQuery)
            .appendQueryParameter(GITHUB_SEARCH_SORT_PARAM, GITHUB_SEARCH_SORT_VALUE)
            .build();

    URL url = null; //new URL(searchURI.toString());
        try{
            url = new URL(searchURI.toString());
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
    }
}

