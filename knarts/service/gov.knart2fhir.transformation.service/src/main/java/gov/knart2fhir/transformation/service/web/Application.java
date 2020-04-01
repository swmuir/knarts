package gov.knart2fhir.transformation.service.web;

import java.io.InputStream;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {

		System.getProperty("org.eclipse.emf.common.util.URI.archiveSchemes");

		Properties prop = new Properties();
		InputStream xxx = Application.class.getClassLoader().getResourceAsStream("version.properties");
		if (xxx != null) {
			prop.load(xxx);
			String RUNTIMEVERSION = prop.getProperty("version");
			String RUNTIMEBUILD = prop.getProperty("build.date");
			System.setProperty("mdmi.engine.version", RUNTIMEVERSION + " :: " + RUNTIMEBUILD);
		}

		SpringApplication.run(Application.class, args);
	}
}
