package com.example.chat_app.Fragments;

import com.example.chat_app.Notifications.MyResponse;
import com.example.chat_app.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAABuHVvVg:APA91bHcH38qPg2D3QPVYjYEkXFps7MEKMs3sYf-H8stax_tBpH1saqYVIcXlZCPk5NwM7jG00SBwtTW5DEqh5LYptep3tXVFeGLLBD_8pgBx7NlpR-TY0b2W20hVcAOwUubx0-0pWUx"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
