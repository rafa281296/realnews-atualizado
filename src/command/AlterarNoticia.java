package command;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


import javax.servlet.ServletException;
import model.Noticia;
import service.NoticiaService;

public class AlterarNoticia implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id_noticia"));
		String descricao = request.getParameter("descricao_noticia");
		String titulo = request.getParameter("titulo_noticia");
		String texto = request.getParameter("texto_noticia");
		
		Noticia noticia = new Noticia();
		noticia.setId(id);
		noticia.setDescricao(descricao);
		noticia.setTitulo(titulo);
		noticia.setTexto(texto);
		
		NoticiaService noticiaService = new NoticiaService();
		
		noticiaService.alterar(noticia);
		
		PrintWriter saida = response.getWriter();
		saida.println("Notícia com ID " + id + " alterada.");
		
	}

	@Override
	public void executar(HttpRequest request, HttpResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
}
