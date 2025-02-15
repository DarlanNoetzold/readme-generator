package tech.noetzold;

import tech.noetzold.gh.GitHubConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ImportRuntimeHints;

@ImportRuntimeHints(ResourceBundleRuntimeHints.class)
@EnableConfigurationProperties(GitHubConfiguration.class)
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
