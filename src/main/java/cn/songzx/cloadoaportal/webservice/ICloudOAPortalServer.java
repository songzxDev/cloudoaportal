package cn.songzx.cloadoaportal.webservice;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://webservice.cloadoaportal.songzx.cn")
public interface ICloudOAPortalServer {

	@WebResult(name = "response")
	public String queryTaskByParams(@WebParam(name = "requestXml") String requestXml);
}
