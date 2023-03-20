package com.example.demo.api;

import com.alibaba.fastjson.JSON;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;

@Service
public class BaiduApi {

    public String getResponse() throws IOException {
        Request request = new Request.Builder()
                .get()
                .url("https:www.baidu.com")
                .build();

        Call call = new OkHttpClient().newCall(request);
        Response response = call.execute();

        return JSON.toJSONString(response);
    }

}
