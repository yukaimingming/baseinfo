package org.Infointerface;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InfoInterfaceApplication {
    private final static Log log = LogFactory.getLog(InfoInterfaceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(InfoInterfaceApplication.class, args);
        log.info("InfoInterface services running... ");
    }
}
