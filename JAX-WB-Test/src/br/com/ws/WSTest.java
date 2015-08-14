package br.com.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "yahoo")
public class WSTest {

	@WebMethod(operationName="yahooMethod")
	public String testWS(String attribute) {
		return "first test with " + attribute;
	}
}
