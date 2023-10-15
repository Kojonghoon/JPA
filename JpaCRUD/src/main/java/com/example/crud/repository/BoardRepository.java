package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Integer> {

}
