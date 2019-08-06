package controlador;
import dao.AlunoDao;
import javax.swing.JOptionPane;
import modelo.Aluno;
import tela.manutencao.Manutencao_Aluno;

public class ControladorAluno {

    public static void inserir(Manutencao_Aluno man){
        Aluno objeto = new Aluno();
        objeto.setNome(man.jtfNome.getText());
        objeto.setSobrenome(man.jtfSobrenome.getText());
        objeto.setSexo(man.jtfSexo.getSelectedItem().toString());
        
        boolean resultado = AlunoDao.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}

    public static void alterar(Manutencao_Aluno man){
        Aluno objeto = new Aluno();
        //definir todos os atributos
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText()));
        objeto.setNome(man.jtfNome.getText());
        objeto.setSobrenome(man.jtfSobrenome.getText());
        objeto.setSexo(man.jtfSexo.getSelectedItem().toString());
        
        boolean resultado = AlunoDao.alterar(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }

    public static void excluir(Manutencao_Aluno man){
        Aluno objeto = new Aluno();
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText())); //só precisa definir a chave primeira
        
        boolean resultado = AlunoDao.excluir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
    
}
