package br.com.ffs.service;

import lombok.val;

public class PublishService {

    private static final String BASE_URL = "graph.facebook.com";

    public void publishMediaIgContainer(final String igUserId){
        val endpoint = "/" + igUserId + "/media";
    }

    public void publishMedia(final String igUserId){
        val endpoint = "/" + igUserId + "/media_publish";
    }

}
