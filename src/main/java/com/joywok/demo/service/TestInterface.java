package com.joywok.demo.service;

import org.apache.cxf.binding.soap.SoapBinding;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * @Author: Jay
 * @Date: 2020/4/7 18:16
 */

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface TestInterface {
    @WebMethod
    public void test1();

}
