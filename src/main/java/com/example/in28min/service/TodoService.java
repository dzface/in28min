package com.example.in28min.service;

import com.example.in28min.entity.TodoList;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
public class TodoService {

    private static List<TodoList> todoList = new ArrayList<>();
    private static int CountList= 0;
    static {
        todoList.add(new TodoList(++CountList,"in28minutes","Learn AWS", LocalDate.now().plusMonths(1), false));
        todoList.add(new TodoList(++CountList,"in28minutes","Learn Pandas", LocalDate.now().plusMonths(2), false));
        todoList.add(new TodoList(++CountList,"in28minutes","Learn Redis", LocalDate.now().plusMonths(3), false));
    }
    public List<TodoList> findByUserName(String userName){
        return todoList;
    }
    public void addToDoItem(String userName, String description, LocalDate targetDate, boolean done){
        TodoList item = new TodoList(++CountList, userName,description,targetDate,done);
        todoList.add(item);
    }
}
