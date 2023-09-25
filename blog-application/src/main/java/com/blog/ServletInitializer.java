package com.blog;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BlogApplication.class);
	}

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		
		String xml="<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
				+ "<APP_RES_ROOT>\n"
				+ "    <APP_PAN_INQ>\n"
				+ "        <APP_PAN_NO>AYPPT0168D</APP_PAN_NO>\n"
				+ "        <ERROR>PAN AND DOB COMBINATION DO NOT MATCH</ERROR>\n"
				+ "    </APP_PAN_INQ>\n"
				+ "</APP_RES_ROOT>\n"
				+ "";
		DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		InputSource src = new InputSource();
		src.setCharacterStream(new StringReader(xml));
		Document doc = builder.parse(src);
		if (xml.contains("ERROR")) {
			String errormsg = doc.getElementsByTagName("ERROR").item(0).getTextContent();
			System.out.println(errormsg);
		}
	}

}
