package ninja.harmless.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Enables mongo database support and excludes the JPA (h2) auto configuration
 * This config can be used be specifying: spring.profiles.active=mongo in the application.properties
 * or using --spring.profiles.active=mongo as command line parameter or the -Dspring.profiles.active=mongo
 * system property.
 *
 *
 * @author bnjm@harmless.ninja - 4/23/17.
 */
@Configuration
@Profile("mongo")
@EnableMongoRepositories(basePackages = "ninja.harmless.data")
@EntityScan(basePackages = "ninja.harmless.data")
@EnableAutoConfiguration(exclude = {HibernateJpaAutoConfiguration.class, JpaRepositoriesAutoConfiguration.class})
public class MongoConfig {
}
