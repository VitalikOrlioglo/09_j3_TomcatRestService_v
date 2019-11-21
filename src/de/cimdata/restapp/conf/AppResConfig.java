package de.cimdata.restapp.conf;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("rest")// http:localhost:8080/rest -> oder web.xml - servletMapping
public class AppResConfig extends ResourceConfig {
	
	public AppResConfig() {
		packages(true, "de.cimdata.restapp.*");
	}
}
