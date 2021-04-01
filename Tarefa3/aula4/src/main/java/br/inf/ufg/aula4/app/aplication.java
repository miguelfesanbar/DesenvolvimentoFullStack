package br.inf.ufg.aula4.app;

import br.inf.ufg.aula4.ctrl.DisciplinaCtrl;
import br.inf.ufg.aula4.ctrl.OfertaCtrl;
import br.inf.ufg.aula4.ctrl.PessoaCtrl;
import br.inf.ufg.aula4.ctrl.ProfessorCtrl;


public class aplication {

	public static void main(String[] args) {

		System.out.println("Começando por aqui");

		TesteApp testeApp = new TesteApp();
		
		//testeApp.testeCrudDisciplina(new DisciplinaCtrl());
		testeApp.testeCrudPessoa(new PessoaCtrl());
		//testeApp.testeCrudProfessor(new ProfessorCtrl(), new PessoaCtrl());
		//testeApp.testeCrudOferta(new OfertaCtrl(), new DisciplinaCtrl(), new ProfessorCtrl());
	}
	
	

}
