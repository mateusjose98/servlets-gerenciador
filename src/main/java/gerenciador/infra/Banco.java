package gerenciador.infra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import gerenciador.model.Empresa;

public class Banco {
	
	private static Integer chaveSequencial = 1;
	private static List<Empresa> lista = new ArrayList<>();
	
	static {
		  Empresa empresa = new Empresa();
		  empresa.setNome("Alura");
		  Empresa empresa2 = new Empresa();
		  empresa2.setNome("Caelum");
		  empresa.setId(chaveSequencial++);
		  empresa2.setId(chaveSequencial++);
		  Banco.lista.add(empresa);
		  Banco.lista.add(empresa2);
		}

	public void salvar(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		lista.add(empresa);
	}
	
	public  List<Empresa> listar() {
		return Banco.lista;
	}
	
	public void removeEmpresa(Integer id) { 

	    Iterator<Empresa> it = lista.iterator();

	    while(it.hasNext()) { 
	        Empresa emp = it.next();

	        if(emp.getId() == id ) {
	            it.remove();
	        }
	    }
	}
	
	public Empresa buscaEmpresaPelaId(Integer id) { 
	    for (Empresa empresa: lista) { 
	        if(empresa.getId() == id)  {
	            return empresa;
	        }

	    }
	    return null;
	}

}
