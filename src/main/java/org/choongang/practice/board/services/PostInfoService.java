package org.choongang.practice.board.services;

import lombok.RequiredArgsConstructor;
import org.choongang.practice.board.entities.Post;
import org.choongang.practice.board.repositories.PostRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class PostInfoService {
    private final PostRepository boardRepository;
    private final PostRepository boardRepositoryRepository;


    public List<Post> getPosts() {
        return boardRepository.findAll();
    }


    public Post getPost(Long id) {
        return boardRepository.findById(id).orElse(null);
    }

}
