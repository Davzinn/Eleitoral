package exercicios;

public class Eleitoral {
	String nome;
	int idade;
	void imprimir() {
	System.out.println(idade);
	System.out.println(nome);
	verificar();
	}
	void verificar() {
	if(idade<16) {
		System.out.println("Eleitor não pode votar");
	}else if(idade>=16 || idade<=35) {
		System.out.println("Eleitor deve votar");
	}else {
		System.out.println("Voto Facultativo");
	}
	}
	
	}