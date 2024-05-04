package com.search;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

    @RequestMapping(value = "/search",method = RequestMethod.GET)
    public RedirectView search(@RequestParam(name = "query", required = true) String query){
        System.out.println("Search Started");
        RedirectView rd=new RedirectView();
        rd.setUrl("https://www.google.com/search?q="+query);
        return rd;
    }
}
