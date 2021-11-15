package com.wahyu.services;

import javax.xml.ws.Endpoint;
import com.wahyu.services.impl.NegaraServiceImpl;

public class NegaraSoapPublisher
{
    public static void main(String [] args)
    {
        Endpoint.publish("http://localhost:8888/ws/negara", new NegaraServiceImpl());
    }
}
