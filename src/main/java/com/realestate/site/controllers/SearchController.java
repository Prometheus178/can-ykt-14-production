package com.realestate.site.controllers;

import com.realestate.site.models.post.Post;
import com.realestate.site.models.post.enums.Commercial;
import com.realestate.site.models.post.enums.DealType;
import com.realestate.site.models.post.enums.Living;
import com.realestate.site.models.post.enums.NumberOfRooms;
import com.realestate.site.services.search.interfaces.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SearchController {

    @Autowired
    SearchService searchService;

    @PostMapping("/search")
    public String searchForm(Model model, @ModelAttribute("post") Post post,
                             @RequestParam("from") String fromString,
                             @RequestParam("to") String toString) {

        if (fromString.equals("") & toString.equals("")) {
            int from = 0;
            int to = 1000000000;
            List<Post> posts = searchService.findAllByQuery(post.getDealType(), post.getLiving(), post.getNumberOfRooms(), post.getBuildingType(), post.getAccountType(), from, to);
            model.addAttribute("postsSearchedByQuery", posts);
            return "search-result";
        }
        if (toString.equals("")) {
            int fromInt = Integer.parseInt(fromString);
            int toInt = 1000000000;
            List<Post> posts = searchService.findAllByQuery(post.getDealType(), post.getLiving(), post.getNumberOfRooms(), post.getBuildingType(), post.getAccountType(), fromInt, toInt);
            model.addAttribute("postsSearchedByQuery", posts);
            return "search-result";
        }
        if (fromString.equals("")) {
            int fromInt = 0;
            int toInt = Integer.parseInt(toString);
            List<Post> posts = searchService.findAllByQuery(post.getDealType(), post.getLiving(), post.getNumberOfRooms(), post.getBuildingType(), post.getAccountType(), fromInt, toInt);
            model.addAttribute("postsSearchedByQuery", posts);
            return "search-result";
        }


        int from = Integer.parseInt(fromString);
        int to = Integer.parseInt(toString);
        List<Post> posts = searchService.findAllByQuery(post.getDealType(), post.getLiving(), post.getNumberOfRooms(), post.getBuildingType(), post.getAccountType(), from, to);
        model.addAttribute("postsSearchedByQuery", posts);


        return "search-result";
    }

}
