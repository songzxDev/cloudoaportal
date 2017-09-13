package cn.songzx.cloadoaportal.webservice.impl;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.stereotype.Component;

import cn.songzx.cloadoaportal.webservice.ICloudOAPortalServer;

@Component("cloudOAPortalWebService")
@WebService(targetNamespace = "http://webservice.cloadoaportal.songzx.cn")
public class CloudOAPortalServerImpl implements ICloudOAPortalServer {

	@Override
	public String queryTaskByParams(@WebParam(name = "requestXml") String requestXml) {
		System.out.println("requestXml:" + requestXml);
		return "<PENDING_CODE>cb8afc88-8d1c-44e0-99c1-61ca6772b5ca</PENDING_CODE>";
	}

}
