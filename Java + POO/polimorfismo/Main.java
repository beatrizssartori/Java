package polimorfismo;
public class Main {
	public static void main(String[] args) {
		Mamifero mamifero = new Mamifero();
		Reptil reptil = new Reptil();
		Peixe peixe = new Peixe();
		Ave ave = new Ave();
		Cachorro cachorro = new Cachorro();
		
		mamifero.setPeso(35.3f);
		reptil.setMembros(2);
		peixe.soltarBolha();
		ave.setCorPena("verde");
		cachorro.emitirSom();
		
		cachorro.reagir("Olá!");
		cachorro.reagir(false);
		cachorro.reagir(17, 9f);
	}
}