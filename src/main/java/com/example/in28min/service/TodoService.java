package com.example.in28min.service;

import com.example.in28min.entity.TodoList;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
public class TodoService {
    private static List<TodoList> todoLists = new ArrayList<>();
    static {
        todoLists.add(new TodoList(1,"in28minutes","Learn AWS", LocalDate.now().plusMonths(1), false));
        todoLists.add(new TodoList(2,"in28minutes","Learn Pandas", LocalDate.now().plusMonths(2), false));
        todoLists.add(new TodoList(3,"in28minutes","Learn Redis", LocalDate.now().plusMonths(3), false));
    }
    public List<TodoList> findByUserName(String userName){
        return todoLists;
    }
}
