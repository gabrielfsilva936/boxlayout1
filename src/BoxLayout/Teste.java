package BoxLayout;

import javax.swing.*;
import java.awt.*;

public class Teste {

    public static void main(String[] args){

        rigid();

        //x_axis();
        //y_axis();
        //line_axis();
        //page_axis();
        
    }

    //Constante X_AXIS: Os componentes são orientados da esquerda para a direita da tela, na horizontal
    //Execute o método e redimensione a janela para uma melhor visualização
    public static void x_axis(){
        //Criando o frame que será a "moldura" da janela
        JFrame frame = new JFrame("Exemplo X_AXIS");
        //Comando que encerrará o programa quando o frame for fechado
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Criando o painel onde serão inseridos os componentes da janela
        JPanel painel = new JPanel();
        //É preciso configurar o layout do painel. Nesse caso, será usado o BoxLayout
        //O construtor do BoxLayout recebe o objeto JPanel que o usará e a constante de orientação
        painel.setLayout(new BoxLayout(painel, BoxLayout.X_AXIS));
        //Criando 3 botões e 1 campo de texto para compor o painel
        JButton btn1 = new JButton("Botão 1");
        JButton btn2 = new JButton("Botão 2");
        JButton btn3 = new JButton("Botão3");
        JTextField txtField = new JTextField("Campo de texto");
        //Adicionando os 4 componentes criados ao painel
        painel.add(btn1);
        painel.add(btn2);
        painel.add(btn3);
        painel.add(txtField);
        //Inserindo o painel dentro do frame
        frame.setContentPane(painel);
        //Comando que irá redimensionar a janela de acordo com os componentes
        frame.pack();
        //Comando que irá deixar o frame visível para o usuário
        frame.setVisible(true);
    }
    //Constante LINE_AXIS: A orientação dos componentes é horizontal, porém o sentido dependerá da orientação do painel
    //Se valor ComponentOrientation for LEFT_TO_RIGHT, os componentes serão posicionados, lado a lado, da esquerda para a direita
    //Se valor ComponentOrientation for RIGHT_TO_LEFT, os componentes serão posicionados, lado a lado, da direita para a esquerda
    public static void line_axis(){
        //Criando o frame que será a "moldura" da janela
        JFrame frame = new JFrame("Exemplo LINE_AXIS");
        //Comando que encerrará o programa quando o frame for fechado
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Criando o painel onde serão inseridos os componentes da janela
        JPanel painel = new JPanel();
        //Configurando a orientação dos componentes no painel
        //Descomente a outra configuração para testar os dois códigos
        painel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        //painel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        //É preciso configurar o layout do painel. Nesse caso, será usado o BoxLayout
        //O construtor do BoxLayout recebe o objeto JPanel que o usará e a constante de orientação
        painel.setLayout(new BoxLayout(painel, BoxLayout.LINE_AXIS));
        //Criando 3 botões e 1 campo de texto para compor o painel
        JButton btn1 = new JButton("Botão 1");
        JButton btn2 = new JButton("Botão 2");
        JButton btn3 = new JButton("Botão3");
        JTextField txtField = new JTextField("Campo de texto");
        //Adicionando os 4 componentes criados ao painel
        painel.add(btn1);
        painel.add(btn2);
        painel.add(btn3);
        painel.add(txtField);
        //Inserindo o painel dentro do frame
        frame.setContentPane(painel);
        //Comando que irá redimensionar a janela de acordo com os componentes
        frame.pack();
        //Comando que irá deixar o frame visível para o usuário
        frame.setVisible(true);
    }
    //Constante Y_AXIS: os componentes são orientados na vertical, de cima para baixo
    public static void y_axis(){
        //Criando o frame que será a "moldura" da janela
        JFrame frame = new JFrame("Exemplo Y_AXIS");
        //Comando que encerrará o programa quando o frame for fechado
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Criando o painel onde serão inseridos os componentes da janela
        JPanel painel = new JPanel();
        //É preciso configurar o layout do painel. Nesse caso, será usado o BoxLayout
        //O construtor do BoxLayout recebe o objeto JPanel que o usará e a constante de orientação
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
        //Criando 3 botões e 1 campo de texto para compor o painel
        JButton btn1 = new JButton("Botão 1");
        JButton btn2 = new JButton("Botão 2");
        JButton btn3 = new JButton("Botão3");
        JTextField txtField = new JTextField("Campo de texto");
        //Adicionando os 4 componentes criados ao painel
        painel.add(btn1);
        painel.add(btn2);
        painel.add(btn3);
        painel.add(txtField);
        //Inserindo o painel dentro do frame
        frame.setContentPane(painel);
        //Comando que irá redimensionar a janela de acordo com o tamanho dos componentes
        frame.pack();
        //Comando que irá deixar o frame visível para o usuário
        frame.setVisible(true);
    }
    //Constante PAGE_AXIS: Os componentes são orientados na vertical, de cima para baixo
    //A depender da orientação do painel, os componentes podem estar alinhados à esquerda ou à direita
    public static void page_axis(){
        //Criando o frame que será a "moldura" da janela
        JFrame frame = new JFrame("Exemplo PAGE_AXIS");
        //Comando que encerrará o programa quando o frame for fechado
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Criando o painel onde serão inseridos os componentes da janela
        JPanel painel = new JPanel();
        //Se a orientação for LEFT_TO_RIGHT os componentes serão alinhados à esquerda
        //Se a orientação for RIGHT_TO_LEFT os componentes serão alinhados à direita
        painel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        //painel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        //É preciso configurar o layout do painel. Nesse caso, será usado o BoxLayout
        //O construtor do BoxLayout recebe o objeto JPanel que o usará e a constante de orientação
        painel.setLayout(new BoxLayout(painel, BoxLayout.PAGE_AXIS));
        //Criando 3 botões e 1 campo de texto para compor o painel
        JButton btn1 = new JButton("Botão 1");
        JButton btn2 = new JButton("Botão 2");
        JButton btn3 = new JButton("Botão3");
        JTextField txtField = new JTextField("Campo de texto");
        //Adicionando os 4 componentes criados ao painel
        painel.add(btn1);
        painel.add(btn2);
        painel.add(btn3);
        painel.add(txtField);
        //Inserindo o painel dentro do frame
        frame.setContentPane(painel);
        //Comando que irá redimensionar a janela de acordo com o tamanho dos componentes
        frame.pack();
        //Comando que irá deixar o frame visível para o usuário
        frame.setVisible(true);
    }
    public static void rigid(){
        JFrame frame = new JFrame("Exemplo Y_AXIS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
        JButton btn1 = new JButton("Botão 1");
        JButton btn2 = new JButton("Botão 2");
        JButton btn3 = new JButton("Botão3");
        JTextField txtField = new JTextField("Campo de texto");
        painel.add(btn1);
        painel.add(btn2);
        //Adicionando uma área "vazia" com dimensões 30 x 30
        painel.add(Box.createRigidArea(new Dimension(30, 30)));
        painel.add(btn3);
        painel.add(txtField);
        frame.setContentPane(painel);
        frame.pack();
        frame.setVisible(true);
    }
}