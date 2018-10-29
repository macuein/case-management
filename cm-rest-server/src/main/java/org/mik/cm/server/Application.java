package org.mik.cm.server;

import org.mik.cm.server.repository.CasesRepository;
import org.mik.cm.server.repository.OrganizationsRepository;
import org.mik.cm.server.repository.UsersRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    OrganizationsRepository orgrepo;
    @Autowired
    UsersRepository usersrepo;
    @Autowired
    CasesRepository casesrepo;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        //organizations
        logger.info("Org id 101 -> {}", orgrepo.findById(101L));
        logger.info("All organizations -> {}", orgrepo.findAll());

        //users
        logger.info("user id 1001 -> {}", usersrepo.findById(1001L));
        logger.info("All users -> {}", usersrepo.findAll());

        //cases
        logger.info("case id 100002 -> {}", casesrepo.findById(100002L));
        logger.info("All cases -> {}", casesrepo.findAll());
    }

\\

}