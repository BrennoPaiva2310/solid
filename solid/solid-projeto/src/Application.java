
public class Application {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario();
		f1.setNome("Brenno");
		f1.setCpf("148.123.837-06");
		f1.setCargo("Gestor de RH");

		System.out.println(f1.getNome());
		System.out.println(f1.getCpf());
		System.out.println(f1.getCargo());
	}

}
