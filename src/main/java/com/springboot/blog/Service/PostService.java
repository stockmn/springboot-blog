package com.springboot.blog.Service;

import com.springboot.blog.payload.PostDto;

public interface PostService {
    PostDto createPost(PostDto postDto);
}
