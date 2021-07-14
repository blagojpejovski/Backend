package com.example.demofinal1.rest;

import com.example.demofinal1.entity.BlogEntity;
import com.example.demofinal1.entity.PersonEntity;
import com.example.demofinal1.service.BlogService;
import com.example.demofinal1.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(
        value = {"/blog"},
        produces = MediaType.APPLICATION_JSON_VALUE
)
@CrossOrigin(origins = "http://localhost:3000",maxAge = 3600)
public class BlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping("/get_blog")
    public List<BlogEntity> getBlogs(){
        return blogService.getBlogs();
    }


    @PostMapping("/add_blog")
    public List<BlogEntity> addBlog(@RequestBody BlogEntity blog){
        return blogService.addBlog(blog);
    }

    @PutMapping("/edit_blog")
    public List<BlogEntity> editBlog(@RequestBody BlogEntity blog){
        return blogService.editBlog(blog);
    }

    @DeleteMapping("/delete_blog")
    public List<BlogEntity> deleteBlog(@RequestParam("id") String id){
        return blogService.deleteBlog(id);
    }

}
