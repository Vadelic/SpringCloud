package com.greenbalance.client;

import com.greenpoint.api.ActionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * Created by Komyshenets on 25.05.2019.
 */
@Service
public class Controller {

    @Autowired
    private final LoadBalancerClient loadBalancerClient;
    @Autowired
    private final RestTemplate restTemplate;

    public Controller(LoadBalancerClient loadBalancerClient, RestTemplate restTemplate) {
        this.loadBalancerClient = loadBalancerClient;
        this.restTemplate = restTemplate;
    }

    private void initSnapshotResponse() {
        URI serviceUri = loadBalancerClient.choose("serverId").getUri();
        ActionResult forObject = restTemplate.getForObject(serviceUri + "/testPoint", ActionResult.class);
//или так
// serverId это spring.application.name или как-то надо получить с клауда эти точки

        forObject = restTemplate.getForObject("serverId/testPoint", ActionResult.class);
    }

}
