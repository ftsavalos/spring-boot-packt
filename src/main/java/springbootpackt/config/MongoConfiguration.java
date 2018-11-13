package springbootpackt.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.*;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.net.UnknownHostException;

//@Configuration
//@EnableMongoRepositories(
//        mongoTemplateRef = "template",
//        includeFilters = {@ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*TestRepository")}
//)
//public class MongoConfiguration {
//
//    @Bean
//    public MongoClient mongoClient() throws UnknownHostException {
//        return new MongoClient("localhost", 27017);
//    }
//
//    @Bean
//    public MongoDbFactory mongoDbFactory() throws UnknownHostException {
//        return new SimpleMongoDbFactory(mongoClient(), "test");
//    }
//
//    @Bean
//    public MongoTemplate template() throws UnknownHostException {
//        return new MongoTemplate(this.mongoDbFactory());
//    }
//}
