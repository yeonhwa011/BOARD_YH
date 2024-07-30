package org.choongang.practice.board.services;

import lombok.RequiredArgsConstructor;
import org.choongang.practice.board.entities.Post;
import org.choongang.practice.board.repositories.PostRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class PostSaveService {
    private final PostRepository postRepository;

    public Post save(Post post) {
        return postRepository.save(post);
    }

}


