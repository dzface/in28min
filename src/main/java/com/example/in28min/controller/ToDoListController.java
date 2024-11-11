package com.example.in28min.controller;

import com.example.in28min.entity.TodoList;
import com.example.in28min.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller
@SessionAttributes("name")
public class ToDoListController {
    private TodoService todoService;
    public ToDoListController(TodoService todoService) {
        this.todoService = todoService;
    }
    @RequestMapping(value = "todo-list", method = RequestMethod.GET)
    public String showToDolist(ModelMap model){
        List<TodoList> list= todoService.findByUserName("in28minutes");
        model.addAttribute("list", list);
        return "toDoListJsp";
    }
    @RequestMapping(value = "add-todo", method = RequestMethod.GET)
    public String showAddToDoItem(){
        return "addToDoJsp";
    }
    @RequestMapping(value = "add-todo", method = RequestMethod.POST)
    public String addToDoItem(@RequestParam(value = "description") String description, ModelMap model){
        String userName = (String)model.get("name");
        todoService.addToDoItem(userName, description, LocalDate.now().plusMonths(1), false);
        return "redirect:todo-list";
    }
}
