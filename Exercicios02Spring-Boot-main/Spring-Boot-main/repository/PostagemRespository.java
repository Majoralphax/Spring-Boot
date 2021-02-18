package com.blog.blogPessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.blogPessoal.model.PostagemModel;

@Repository
public interface PostagemRespository extends JpaRepository<PostagemModel, Long>{
public List<PostagemModel>findAllByTituloContainingIgnoreCase (String titulo);
}
