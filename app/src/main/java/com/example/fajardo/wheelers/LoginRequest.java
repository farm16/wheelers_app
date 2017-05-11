package com.example.fajardo.wheelers;

/**
 * Created by Fajardo on 3/30/2017.
 */

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class LoginRequest extends StringRequest {
    private static final String LOGIN_REQUEST_URL = "http://35.185.51.101/login.php";
    private Map<String, String> params;

    public LoginRequest(String name, String password, Response.Listener<String> listener) {
        super(Method.POST, LOGIN_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("name", name);
        params.put("password", password);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}