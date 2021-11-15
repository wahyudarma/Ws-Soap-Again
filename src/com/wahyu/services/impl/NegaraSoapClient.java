package com.wahyu.services.impl;

import com.sun.xml.internal.ws.api.addressing.WSEndpointReference;
import com.wahyu.model.Negara;
import com.wahyu.services.NegaraService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class NegaraSoapClient
{
    public static void main(String[]args)
    {
        URL wsdlUrl = null;

        try {
            wsdlUrl = new URL("http://localhost:8888/ws/negara?wsdl");
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
        QName qname = new QName("http://impl.services.wahyu.com/","NegaraServiceImplService");

        Service service = Service.create(wsdlUrl,qname);
        NegaraService ns = service.getPort(NegaraService.class);

        Negara n1 = new Negara();
        n1.setId(1);
        n1.setNamaNegara("Indonesia");
        n1.setPopulasi(1500000);

        Negara n2 = new Negara();
        n2.setId(2);
        n2.setNamaNegara("Malaysia");
        n2.setPopulasi(1200000);

//        add
        System.out.println("Add Status: " + ns.addNegara(n1));
        System.out.println("Add Status: " + ns.addNegara(n2));

//        Get
        System.out.println(ns.getNegara(1));

//        Get All
        System.out.println(Arrays.asList(ns.getAllNegara()));

//        Delete
        System.out.println("Delete Status : " + ns.deleteNegara(2));

//        Get All Again
        System.out.println(Arrays.asList(ns.getAllNegara()));

    }
}
