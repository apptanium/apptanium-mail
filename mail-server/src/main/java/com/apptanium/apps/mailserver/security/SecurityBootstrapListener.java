package com.apptanium.apps.mailserver.security;

import com.apptanium.apps.mailserver.om.SystemProperty;
import com.apptanium.apps.mailserver.repositories.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.ServletContextInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by sgupta on 1/1/15.
 */
public class SecurityBootstrapListener implements ServletContextListener, ServletContextInitializer {
  public static final Logger LOGGER = Logger.getLogger(SecurityBootstrapListener.class.getName());

  @Autowired
  private SystemService systemService;

  @Override
  public void contextInitialized(ServletContextEvent servletContextEvent) {
    LOGGER.log(Level.FINEST, "context initialized!! " + systemService);
  }

  @Override
  public void contextDestroyed(ServletContextEvent servletContextEvent) {
    LOGGER.log(Level.FINEST, "context destroyed!!");
  }

  @Override
  public void onStartup(ServletContext servletContext) throws ServletException {
    LOGGER.log(Level.FINEST, " STARTUP!!! system service: " + systemService);
  }
}
