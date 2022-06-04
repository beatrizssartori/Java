package controleFuncionarios;
import javax.swing.JOptionPane;

public class ControleFuncionarios {

	public static void main(String[] args) {
		
		// instanciar o objeto da classe Funcionario, chamado funcionario
		Funcionario funcionario = new Funcionario();

		// cadastrando os dados nos atributos do objeto da classe Funcionario
		funcionario.setMatricula(JOptionPane.showInputDialog("Digite a matrícula: "));
		funcionario.setNome(JOptionPane.showInputDialog("Digite o nome: "));
		funcionario.setCargo(JOptionPane.showInputDialog("Digite o cargo: "));
		funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salário: ")));
		
		// exibindo os dados cadastrados no objeto
		JOptionPane.showMessageDialog(null, "Matrícula: " + funcionario.getMatricula());
		JOptionPane.showMessageDialog(null, "Nome: " + funcionario.getNome());
		JOptionPane.showMessageDialog(null, "Cargo: " + funcionario.getCargo());
		JOptionPane.showMessageDialog(null, "Salário inicial: " + funcionario.getSalario());
		
		funcionario.reajustarSalario();
		JOptionPane.showMessageDialog(null, "Salário reajustado: " + funcionario.getSalario());
	}
}