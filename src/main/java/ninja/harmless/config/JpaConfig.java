package ninja.harmless.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Enables H2 database support and excludes the mongo auto configuration
 * This config can be used be specifying: spring.profiles.active=jpa in the application.properties
 * or using --spring.profiles.active=jpa as command line parameter or the -Dspring.profiles.active=jpa
 * system property.
 *
 * @author bnjm@harmless.ninja - 4/23/17.
 */
@Configuration
@Profile("jpa")
@EnableJpaRepositories(basePackages = "ninja.harmless.data")
@EntityScan(basePackages = "ninja.harmless.data")
@EnableAutoConfiguration(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
class JpaConfig {

}