package com.wahyu.services.impl;

import com.wahyu.model.Negara;
import com.wahyu.services.NegaraService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@WebService(endpointInterface = "com.wahyu.services.NegaraService")
public class NegaraServiceImpl implements NegaraService
{
    private final Map<Integer, Negara> negaraMap = new HashMap<>();

    @Override
    @WebMethod()
    public boolean addNegara(Negara n)
    {
        if(negaraMap.get(n.getId()) != null)
        {
            return false;
        }
        else
        {
            negaraMap.put(n.getId(), n);
            return true;
        }
    }
    @Override
    public boolean deleteNegara(int id)
    {
        if(negaraMap.get(id) == null)
        {
            return false;
        }
        else
        {
            negaraMap.remove(id);
            return true;
        }
    }
    @Override
    public Negara getNegara(int id)
    {
        return negaraMap.get(id);
    }
    @Override
    public Negara[] getAllNegara()
    {
        Set<Integer> ids = negaraMap.keySet();
        Negara[] negaras= new Negara[ids.size()];
        int i = 0;
        for (Integer id : ids)
        {
            negaras[i] = negaraMap.get(id);
            i++;
        }
        return negaras;
    }
}
