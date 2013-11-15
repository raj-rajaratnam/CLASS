
package com.arima.classanalyzer.webs.client.localhost._7070.class_wsdl;

import com.arima.classanalyzer.webs.client.ObjectFactory;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import java.util.List;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IEngine", targetNamespace = "http://webs.classengine.arima.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IEngine {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertStudents", targetNamespace = "http://webs.classengine.arima.com/", className = "com.arima.classengine.webs.InsertStudents")
    @ResponseWrapper(localName = "insertStudentsResponse", targetNamespace = "http://webs.classengine.arima.com/", className = "com.arima.classengine.webs.InsertStudentsResponse")
    @Action(input = "http://webs.classengine.arima.com/IEngine/insertStudentsRequest", output = "http://webs.classengine.arima.com/IEngine/insertStudentsResponse")
    public String insertStudents(
            @WebParam(name = "arg0", targetNamespace = "")
            String arg0);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getmodel", targetNamespace = "http://webs.classengine.arima.com/", className = "com.arima.classengine.webs.Getmodel")
    @ResponseWrapper(localName = "getmodelResponse", targetNamespace = "http://webs.classengine.arima.com/", className = "com.arima.classengine.webs.GetmodelResponse")
    @Action(input = "http://webs.classengine.arima.com/IEngine/getmodelRequest", output = "http://webs.classengine.arima.com/IEngine/getmodelResponse")
    public String getmodel();

    /**
     * 
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.Integer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getNearestLocalProfiles", targetNamespace = "http://webs.classengine.arima.com/", className = "com.arima.classengine.webs.GetNearestLocalProfiles")
    @ResponseWrapper(localName = "getNearestLocalProfilesResponse", targetNamespace = "http://webs.classengine.arima.com/", className = "com.arima.classengine.webs.GetNearestLocalProfilesResponse")
    @Action(input = "http://webs.classengine.arima.com/IEngine/getNearestLocalProfilesRequest", output = "http://webs.classengine.arima.com/IEngine/getNearestLocalProfilesResponse")
    public List<Integer> getNearestLocalProfiles(
            @WebParam(name = "arg0", targetNamespace = "")
            int arg0,
            @WebParam(name = "arg1", targetNamespace = "")
            int arg1,
            @WebParam(name = "arg2", targetNamespace = "")
            int arg2,
            @WebParam(name = "arg3", targetNamespace = "")
            List<String> arg3,
            @WebParam(name = "arg4", targetNamespace = "")
            List<Integer> arg4);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.Integer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getNearestGlobalProfiles", targetNamespace = "http://webs.classengine.arima.com/", className = "com.arima.classengine.webs.GetNearestGlobalProfiles")
    @ResponseWrapper(localName = "getNearestGlobalProfilesResponse", targetNamespace = "http://webs.classengine.arima.com/", className = "com.arima.classengine.webs.GetNearestGlobalProfilesResponse")
    @Action(input = "http://webs.classengine.arima.com/IEngine/getNearestGlobalProfilesRequest", output = "http://webs.classengine.arima.com/IEngine/getNearestGlobalProfilesResponse")
    public List<Integer> getNearestGlobalProfiles(
            @WebParam(name = "arg0", targetNamespace = "")
            int arg0,
            @WebParam(name = "arg1", targetNamespace = "")
            int arg1,
            @WebParam(name = "arg2", targetNamespace = "")
            List<String> arg2,
            @WebParam(name = "arg3", targetNamespace = "")
            List<Integer> arg3);

}
