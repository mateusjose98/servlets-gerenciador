package gerenciador.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gerenciador.acoes.Acao;
import gerenciador.acoes.AlteraEmpresa;
import gerenciador.acoes.ListaEmpresa;
import gerenciador.acoes.MostraEmpresa;
import gerenciador.acoes.NovaEmpresa;
import gerenciador.acoes.NovaEmpresaForm;
import gerenciador.acoes.RemoveEmpresa;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/controllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Map<String, Acao> rotas = new HashMap<>();
	
	public ControllerServlet() {
		rotas.put("listaEmpresas", new ListaEmpresa());
		rotas.put("removeEmpresa", new RemoveEmpresa());
		rotas.put("mostraEmpresa", new MostraEmpresa());
		rotas.put("alteraEmpresa", new AlteraEmpresa());
		rotas.put("novaEmpresa", new NovaEmpresa());
		rotas.put("novaEmpresaForm", new NovaEmpresaForm());
	}
       

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String acao = request.getParameter("acao");
		
		Acao handler= rotas.get(acao);
		
		System.out.println("Acao: "+ acao + " Classe handler: " + handler.getClass().getSimpleName());
		
		String[] result = handler.executa(request, response).split(":");
		
		String sendTo = result[1];
		

		if("forward".equals(result[0])) {
	        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/" + sendTo);
	        rd.forward(request, response);
		} else {
			response.sendRedirect(sendTo);
		}

		
		
	}

}
