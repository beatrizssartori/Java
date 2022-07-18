package hashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
	
		Jogador j1 = new Jogador("Neymar", "Meia atacante");
		Jogador j2 = new Jogador("Rom�rio", "Centroavante");
		HashMap<Jogador, Integer> map = new HashMap<>();
		
		map.put(j1, 464); // j1 � uma key, 464 � um value.
		map.put(j2, 1002);
		
		for (Entry<Jogador, Integer> relacao : map.entrySet()) {
			System.out.println("Jogador: " + relacao.getKey());
			System.out.println("Quantidade de gols: " + relacao.getValue());
			System.out.println("--------------");
		}
		
		map.remove(j1); // Excluir jogador j1.
		System.out.println("\n" + map.containsKey(j1)); // Se o jogador j1 ainda estiver na lista, aparecer� "true". Caso contr�rio, "false".
		
		System.out.println("\nAp�s remover o primeiro jogador:");
		Set<Jogador> jogadores = map.keySet();
		for (Jogador j: jogadores) {
			System.out.println("Jogador: " + j); 
			System.out.println("Quantidade de gols: " + map.get(j));
		}
		
	}
}