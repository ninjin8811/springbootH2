package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

//jpaRepositoryクラスを継承することでfindOne, findAll, save, deleteのメソッドが使用できる
public interface UserRepository extends JpaRepository<User, Integer> {

}
