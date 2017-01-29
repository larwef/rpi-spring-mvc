package rpiSpringMvc;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import org.springframework.web.servlet.DispatcherServlet;
import rpiSpringMvc.Config.AppConfig;
import rpiSpringMvc.Config.ApplicationConfig;

public class Main {
    public static void main(String[] args) throws Exception {

        Server server = new Server(ApplicationConfig.SERVICE_PORT);
        ServletContextHandler context = new ServletContextHandler(server, ApplicationConfig.SERVICE_CONTEXT);

        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        dispatcherServlet.setContextConfigLocation("rpiSpringMvc.Config");

        ServletHolder servletHolder = new ServletHolder(dispatcherServlet);
        context.addServlet(servletHolder, "/*");

        server.start();
        server.join();
    }
}