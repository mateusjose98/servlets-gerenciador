package gerenciador.acoes;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gerenciador.infra.Banco;
import gerenciador.model.Empresa;

public class NovaEmpresa implements Acao {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();
		Empresa empresa = new Empresa();
		empresa.setNome(req.getParameter("nome"));
        String paramDataEmpresa = req.getParameter("data");
		try {
			empresa.setDataAbertura(new SimpleDateFormat("dd/MM/yyyy").parse(paramDataEmpresa));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Banco banco = new Banco();
		
		banco.salvar(empresa);
		
        //chamar o JSP
//        RequestDispatcher rd = req.getRequestDispatcher("/listaEmpresas");
//        req.setAttribute("nomeEmpresa", empresa.getNome());
//        rd.forward(req,  resp);
		return "redirect:controllerServlet?acao=listaEmpresas";

	}

}
