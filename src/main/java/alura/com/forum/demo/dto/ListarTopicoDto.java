package alura.com.forum.demo.dto;

import alura.com.forum.demo.modelo.Topico;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class ListarTopicoDto {

    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;

    public ListarTopicoDto(Topico topico) {
        this.id = topico.getId();
        this.titulo = topico.getTitulo();
        this.mensagem = topico.getMensagem();
        this.dataCriacao = topico.getDataCriacao();
    }

    public static List<ListarTopicoDto> converter(List<Topico> topicos) {
        return topicos.stream().map(ListarTopicoDto::new).collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }
}
