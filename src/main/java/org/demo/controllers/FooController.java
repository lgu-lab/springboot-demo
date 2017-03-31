package org.demo.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The class is flagged as a @RestController, 
 * meaning it’s ready for use by Spring MVC to handle web requests. 
 * @RequestMapping maps / to the index() method. 
 * When invoked from a browser or using curl on the command line, 
 * the method returns pure text. 
 * That’s because @RestController combines @Controller and @ResponseBody, 
 * two annotations that results in web requests returning data rather than a view.
 * 
 * @author lgu
 *
 */
@RestController
public class FooController {

    @RequestMapping("/foo")
    public String foo() {
        return "Response for the path '/foo' ";
    }

}