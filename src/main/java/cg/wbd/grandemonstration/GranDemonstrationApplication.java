package cg.wbd.grandemonstration;

import cg.wbd.grandemonstration.service.CustomerService;
import cg.wbd.grandemonstration.service.ProvinceService;
import cg.wbd.grandemonstration.service.impl.CustomerServiceImplWithSpringData;
import cg.wbd.grandemonstration.service.impl.ProvinceServiceImplWithSpringData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GranDemonstrationApplication {
    public static void main(String[] args) {
        SpringApplication.run(GranDemonstrationApplication.class, args);
    }

    @Bean
    public CustomerService customerService() {
        return new CustomerServiceImplWithSpringData();
    }

    @Bean
    public ProvinceService provinceService() {
        return new ProvinceServiceImplWithSpringData();
    }

}
