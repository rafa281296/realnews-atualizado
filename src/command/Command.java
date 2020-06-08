package command;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.servlet.ServletException;

/**
 * Interface responsável por definir a estrutura
 * dos comandos existentes na aplicação
 */
public interface Command {
	
	/**
	 * Método responsável por executar a ação de cada comando.
	 * @param request Objeto do tipo HttpServletRequest para armazenar os dados da requisição
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void executar(HttpRequest request, 
				HttpResponse response) throws ServletException, IOException;
	
}