package org.choongang.practice.board.services;

import lombok.RequiredArgsConstructor;
import org.choongang.practice.board.repositories.PostRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class PostDeleteService {
    private final PostRepository postRepository;

    // 게시글 삭제
    public void delete(Long id) {
        postRepository.deleteById(id);
    }
}
