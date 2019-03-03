<#include "/java_copyright.include"/>
package ${basepackage};

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author Klaus Mikaelson
 */
@SpringBootApplication
@EnableSwagger2Doc
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
