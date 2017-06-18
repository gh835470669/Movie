package com.movie.http;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/**
 * Created by ljm on 2017/6/17.
 */
public class Http {
    private static final String  movies = "http://m.maoyan.com/movie/list.json?type=hot&offset=0&limit=1000";
    private static final String  cinemas = "http://m.maoyan.com/cinemas.json";
    private static final String movie_detail = "http://m.maoyan.com/movie/";
    private static final String cinema_detail= "http://m.maoyan.com/showtime/wrap.json?cinemaid=";
    private static final String buy = "http://m.maoyan.com/cinema/movie/";

    public static String getMovies() {
        return getHelper(movies);
    }
    public static String getCinemas() {
        return getHelper(cinemas);
    }

    public static String getCinemaDetail(int id) {
        return getHelper(cinema_detail + id);
    }

    public static String buy(int id) {
        return getHelper(buy+id);
    }

    public static String getMovie_detail(int id) {
        return getHelper(movie_detail + id + ".json");
    }

    private static String getHelper(String ss) {
        try {
            URL url = new URL(ss);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                InputStream inputStream = url.openStream();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bytes = new byte[1024];
                int len = 0;
                while (-1 != (len = inputStream.read(bytes))) {
                    byteArrayOutputStream.write(bytes, 0, len);
                    byteArrayOutputStream.flush();
                }
                return byteArrayOutputStream.toString("utf-8");
            }
        } catch (IOException ee) {
            ee.printStackTrace();
        }
        return "";
    }

}
