package com.example.android.githubsearch;

import android.net.Uri;

/**
 * Created by hessro on 1/30/18.
 */

public class GitHubUtils {
    final static String GITHUB_SEARCH_BASE_URL = "https://api.github.com/search/repositories";
    final static String GITHUB_SEARCH_QUERY_PARAM = "q";
    final static String GITHUB_SEARCH_SORT_PARAM = "sort";
    final static String GITHUB_SEARCH_SORT_VALUE = "stars";

    public static String buildGitHubSearchURL(String searchQuery) {
        return  Uri.parse(GITHUB_SEARCH_BASE_URL).buildUpon()
                .appendQueryParameter(GITHUB_SEARCH_QUERY_PARAM, searchQuery)
                .appendQueryParameter(GITHUB_SEARCH_SORT_PARAM, GITHUB_SEARCH_SORT_VALUE)
                .build()
                .toString();

        /*
        URL url = null; //new URL(searchUri.toString());
        try {
            url = new URL(searchUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
        */
    }
}
