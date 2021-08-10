package alura.com.forum.demo.controller;

import alura.com.forum.demo.modelo.Curso;
import alura.com.forum.demo.modelo.Topico;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class TopicosController {

    @RequestMapping("/topicos")
    @ResponseBody
    public List<Topico> lista() {
        Curso curso = new Curso("Spring Boot", "Programação");
        Topico topico = new Topico("Duvida", "Porque ta vindo null ?", curso);

        return Arrays.asList(topico, topico, topico);
    }
}
