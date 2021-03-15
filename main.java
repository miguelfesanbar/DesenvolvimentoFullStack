import java.time.LocalDate;

public class main {
	public static void main(String[] args) {
		
		System.out.println("Início!\n");
		LocalDate date1 = LocalDate.of(1991, 3, 10);
		LocalDate date2 = LocalDate.of(2021, 1, 1);
		
		PessoaFisica pf1 = new PessoaFisica(01, "Miguel", "Rua 20", 123123, date1, "Masculino");
		System.out.println("Pessoa Física: "+pf1.getNome()+" cadastrada!");
		System.out.println("Idade do Cliente: "+pf1.getIdade(pf1.getDtNascimento())+ " anos");
		PessoaJuridica pj1 = new PessoaJuridica(02, "Miguel Inc.", "Goiânia", 000100020003, "Desenvolvimento");
		System.out.println("Pessoa Jurídica: "+pj1.getNome()+" cadastrada!\n");
		
		ContaPoupanca cp1 = new ContaPoupanca(pf1, 0.5);
		System.out.println("Conta Poupança criada! Cliente "+cp1.getCliente().getNome()+" número: "+cp1.getNrConta());
		ContaEspecial ce1 = new ContaEspecial(pj1, 1000);
		System.out.println("Conta Especial criada! Cliente "+ce1.getCliente().getNome()+" número: "+ce1.getNrConta());
		
		System.out.println("Cliente "+cp1.getCliente().getNome()+" - Saldo: "+cp1.getSaldo());
		cp1.depositar(1000);
		System.out.println("Deposito realizado");
		System.out.println("Novo saldo: "+cp1.getSaldo());

		System.out.println("Cliente "+ce1.getCliente().getNome()+" - Saldo: "+ce1.getSaldo());
		ce1.depositar(1500);
		System.out.println("Deposito realizado");
		System.out.println("Novo saldo: "+ce1.getSaldo());
		
		System.out.println("\nCliente"+ce1.getCliente().getNome()+" - Saldo: "+ce1.getSaldo());
		System.out.println(cp1.transferir(500, cp1, ce1));
		System.out.println("Transferencia realizada! Cliente: "+cp1.getCliente().getNome()+" para Cliente: "+ce1.getCliente().getNome());
		System.out.println("\nCliente: "+ce1.getCliente().getNome()+" - Saldo: "+ce1.getSaldo());
		System.out.println("Cliente: "+cp1.getCliente().getNome()+" - Saldo: "+cp1.getSaldo());
		
		System.out.println("\nExemplo Saque além do saldo");
		System.out.println("Saldo: "+ce1.getSaldo());
		System.out.println(ce1.sacar(6000, ce1.getLimite()));
		System.out.println("Saldo Atual: "+ce1.getSaldo());
		
		System.out.println("\nExemplo Atualização de saldo");
		cp1.atualizaRendimento(cp1);
		System.out.println("Novo saldo atualizado com rendimentos: "+cp1.getSaldo());
	}
}