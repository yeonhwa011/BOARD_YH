package org.choongang.practice.board.repositories;

import org.choongang.practice.board.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface PostRepository extends JpaRepository<Post,Long>, QuerydslPredicateExecutor<Post> {
    Post findByTitle(String title);
}
