package br.com.ws.client;

import br.com.ws.WSTest;
import br.com.ws.Yahoo;


public class ClientWS {

	public static void main(String[] args) {
		WSTest wstest = new Yahoo().getWSTestPort();
		System.out.println(wstest.yahooMethod("Text from Client"));
	}
}
