package alura.com.forum.demo.controller;

import alura.com.forum.demo.dto.ListarTopicoDto;
import alura.com.forum.demo.modelo.Curso;
import alura.com.forum.demo.modelo.Topico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @RequestMapping("/topicos")
    public List<ListarTopicoDto> lista() {
        Curso curso = new Curso("Spring Boot", "Programação");
        Topico topico = new Topico("Dúvidas", "Porque ta vindo null ?", curso);

        return ListarTopicoDto.converter(Arrays.asList(topico, topico, topico));
    }
}
