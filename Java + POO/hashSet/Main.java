package hashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        
    	//Lista de especialidades CC do Hospital Regional Hans Dieter Schmidt
    	
    	Set<String> hospitalRegional = new HashSet<>();
        hospitalRegional.add("ginecol�gica"); 
		hospitalRegional.add("card�aca");
		hospitalRegional.add("tor�cica");
		hospitalRegional.add("ortop�dica");
		hospitalRegional.add("bari�trica");
		hospitalRegional.add("pl�stica");
        
        System.out.println("Especialidades CC do Hospital Regional: " + hospitalRegional);
        
        // Lista de especialiades CC do Hospital Bethesda
        
        List<String> list = Arrays.asList("ortop�dica", "vascular", "neurol�gica", "ginecol�gica", "bucomaxilar");
        Set<String> hospitalBethesda = new HashSet<>(list);
        System.out.println("Especialidades CC do Hospital Bethesda: " + hospitalBethesda);
        
        // Intersec��o entre as especialidades
        
        Set<String> intersection = new HashSet<>(hospitalRegional);
        intersection.retainAll(hospitalBethesda);
        System.out.println("Intersec��o: " + intersection);
        
        // Opera��es
        
        System.out.print("\n");
        System.out.println(hospitalRegional.add("oncol�gica")?"sim":"n�o"); //Se j� tivesse oncol�gica, retornaria "n�o", pois HashSet aceita apenas valores �nicos.
		System.out.println(hospitalRegional);
		
		System.out.print("\n");
		System.out.println(hospitalRegional.contains("oncol�gica")?"sim":"n�o"); //Verificar se a especialidade j� existe.

		System.out.print("\n");
		hospitalRegional.remove("neurol�gica"); // Remover especialidade.
		System.out.println(hospitalRegional);
		System.out.println(hospitalRegional.size()); // Tamanho da lista de especialidades.
		
		System.out.print("\n");
		hospitalRegional.clear(); //Excluir lista inteira.
		System.out.println(hospitalRegional);
		System.out.print(hospitalRegional.isEmpty()); // A lista est� vazia? True ou false.
    }
}