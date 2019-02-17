package com.tw.step.javadockerapp.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    @Transactional
    @PostConstruct
    public void init() {
        todoRepository.save(new Todo(1, "A"));
        todoRepository.save(new Todo(2, "B"));
        todoRepository.save(new Todo(3, "C"));
    }

    public List<Todo> findAll() {
        return (List<Todo>) todoRepository.findAll();
    }

    public void deleteById(int id) {
        todoRepository.deleteById(id);
    }

    public Todo findById(int id) {
        return todoRepository.findById(id).orElse(null);
    }

    public void save(Todo todo){
        todoRepository.save(todo);
    }
}
