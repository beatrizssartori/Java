package hashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        
    	//Lista de especialidades CC do Hospital Regional Hans Dieter Schmidt
    	
    	Set<String> hospitalRegional = new HashSet<>();
        hospitalRegional.add("ginecológica"); 
		hospitalRegional.add("cardíaca");
		hospitalRegional.add("torácica");
		hospitalRegional.add("ortopédica");
		hospitalRegional.add("bariátrica");
		hospitalRegional.add("plástica");
        
        System.out.println("Especialidades CC do Hospital Regional: " + hospitalRegional);
        
        // Lista de especialiades CC do Hospital Bethesda
        
        List<String> list = Arrays.asList("ortopédica", "vascular", "neurológica", "ginecológica", "bucomaxilar");
        Set<String> hospitalBethesda = new HashSet<>(list);
        System.out.println("Especialidades CC do Hospital Bethesda: " + hospitalBethesda);
        
        // Intersecção entre as especialidades
        
        Set<String> intersection = new HashSet<>(hospitalRegional);
        intersection.retainAll(hospitalBethesda);
        System.out.println("Intersecção: " + intersection);
        
        // Operações
        
        System.out.print("\n");
        System.out.println(hospitalRegional.add("oncológica")?"sim":"não"); //Se já tivesse oncológica, retornaria "não", pois HashSet aceita apenas valores únicos.
		System.out.println(hospitalRegional);
		
		System.out.print("\n");
		System.out.println(hospitalRegional.contains("oncológica")?"sim":"não"); //Verificar se a especialidade já existe.

		System.out.print("\n");
		hospitalRegional.remove("neurológica"); // Remover especialidade.
		System.out.println(hospitalRegional);
		System.out.println(hospitalRegional.size()); // Tamanho da lista de especialidades.
		
		System.out.print("\n");
		hospitalRegional.clear(); //Excluir lista inteira.
		System.out.println(hospitalRegional);
		System.out.print(hospitalRegional.isEmpty()); // A lista está vazia? True ou false.
    }
}