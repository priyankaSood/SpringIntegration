package main.java.com.infosys.springintegrationexample.web;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import main.java.com.infosys.springintegrationexample.model.ServiceStatus;


@Controller
public class StatusController
{
    @RequestMapping( value = "/status", method = RequestMethod.GET )
    @ResponseBody
    public ServiceStatus getStatus()
    {
        return new ServiceStatus( ServiceStatus.StatusType.OK, "1.0-SNAPSHOT" );
    }
}
