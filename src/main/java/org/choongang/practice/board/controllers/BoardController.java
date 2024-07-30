package org.choongang.practice.board.controllers;

import lombok.RequiredArgsConstructor;
import org.choongang.practice.board.entities.Post;
import org.choongang.practice.board.repositories.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final PostRepository postRepository;

    @GetMapping("/list")
    public String list(Model model){
        List<Post> posts = postRepository.findAll();
        model.addAttribute("post",posts);

        return "board/list";
    }
    @GetMapping("/post/{id}")
     public  String viewPost(@PathVariable("id") Long id, Model model){
        postRepository.findById(id).ifPresent(post ->model.addAttribute("post",post));

        return "board/post";

    }

    @GetMapping("/write")//게시글 작성
    public String writePost(Model model){
        model.addAttribute("post",new Post());

        return "board/write";
    }

    @GetMapping("/update/{id}") //게시글 수정
    public String editPost(@PathVariable("id")Long id,Model model){
        Post post = postRepository.findById(id).orElse(null);
        if (post == null){

        }
        model.addAttribute("post",post);

        return "board/update";
    }
    @PostMapping("/save") //게시글 저장
    public String savePost(@ModelAttribute Post post){
        postRepository.save(post);

        return "redirect:/board/list";
    }

    public String deletePost(@PathVariable("id")Long id){
        postRepository.deleteById(id);
        return "redirect:/board/list";
    }
}
