package com.wahyu.services;

import com.wahyu.model.Negara;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface NegaraService
{
    @WebMethod
    public boolean addNegara(Negara n);

    @WebMethod
    public boolean deleteNegara(int id);

    @WebMethod
    public Negara getNegara(int id);

    @WebMethod
    public Negara[] getAllNegara();
}
