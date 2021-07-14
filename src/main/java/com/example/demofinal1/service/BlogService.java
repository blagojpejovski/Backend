package com.example.demofinal1.service;

import com.example.demofinal1.entity.BlogEntity;
import com.example.demofinal1.repository.BlogRepository;
import com.example.demofinal1.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService  {

    @Autowired
    public BlogService(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    private BlogRepository blogRepository;



    public List<BlogEntity> getBlogs(){
        List<BlogEntity> blogEntityList = blogRepository.findAllByOrderByIdDesc();
        return blogEntityList;
    }


    public List<BlogEntity> addBlog(BlogEntity blog){
        BlogEntity blogDb = blogRepository.save(blog);
        return blogRepository.findAll();
    }

    public List<BlogEntity> editBlog(BlogEntity blog){
        BlogEntity blogEntity = blogRepository.findById(blog.getId()).get();
        blogEntity.setAuthor(blog.getAuthor());
        blogEntity.setDescription(blog.getDescription());
        blogEntity.setTitle(blog.getTitle());

        BlogEntity savedBlogEntity = blogRepository.save(blogEntity);
        return blogRepository.findAll();
    }

    public List<BlogEntity> deleteBlog(String id){
        BlogEntity blog = blogRepository.findById(id).get();
        blogRepository.delete(blog);
        return blogRepository.findAll();
    }
}