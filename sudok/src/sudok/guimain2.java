package sudok;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class guimain2 {
   static JPanel loci1,locj1, locsol1,loci2,locj2, locsol2,loci3,locj3, locsol3;
   static JLabel jlloci1,jllocj1, jlsol1,jlloci2,jllocj2, jlsol2,jlloci3,jllocj3, jlsol3;
   static JTextField i1,j1, sol1,i2,j2, sol2,i3,j3, sol3;
   private static JButton [] btnset1;
   private static JButton [] btnset2;
   private static JButton [] btnset3;
   public static void main(String[] args)
     {
        JFrame fr1 = new JFrame();//������(��)�� ���� ������
        fr1.setTitle("������...Ǯ�����!");
        fr1.setLocation(500, 0);
        fr1.setResizable(false);
        Container cont1 = fr1.getContentPane();
        cont1.setLayout(new GridLayout(10, 9));
//------------------------------------------------------------------------------------------------------ 
        JFrame fr2 = new JFrame();//������(��)�� ���� ������
        fr2.setTitle("������...Ǯ�����!");
        fr2.setLocation(500, 0);
        fr2.setResizable(false);
        Container cont2 = fr2.getContentPane();
        cont2.setLayout(new GridLayout(10, 9));
//------------------------------------------------------------------------------------------------------
        JFrame fr3 = new JFrame();//������(��)�� ���� ������
        fr3.setTitle("������...Ǯ�����!");
        fr3.setLocation(500, 0);
        fr3.setResizable(false);
        Container cont3 = fr3.getContentPane();
        cont3.setLayout(new GridLayout(10, 9));    
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------
        JFrame fr_helper = new JFrame();//����ȭ���� ���� ������
        fr_helper.setTitle("���� ���");
        fr_helper.setSize(1000,700);
        fr_helper.setLocation(500, 200);
        fr_helper.setResizable(false);
        Container cont_helper = fr_helper.getContentPane();
        cont_helper.setLayout(new GridLayout(11, 1)); 
        JLabel helper = new JLabel("�Ʒ��� ������ ��ĭ �� ù��° ��ĭ���� ���� ���� �ǹ��ϰ�, �ι�° ��ĭ���� ���� ���� �ǹ��Ѵ�.",JLabel.CENTER);
        JLabel helper1 = new JLabel("�׸��� �� ��° ��ĭ���� i��° ���ο� j��° ���� ��ĭ�� ���ϴ� ���ڸ� �ִ´�.",JLabel.CENTER);
        JLabel helper2 = new JLabel("���̵� ���� 45���� ��ĭ�� �־�����.",JLabel.CENTER);
        JLabel helper3 = new JLabel("���̵� ���� 36���� ��ĭ�� �־�����.",JLabel.CENTER);
        JLabel helper4 = new JLabel("���̵� �ϴ� 27���� ��ĭ�� �־�����.",JLabel.CENTER);
        JLabel helper5 = new JLabel("�࿩�� Ǯ�� ������� ������ ����� �ϳ� �˷��ְڴ�. ������ ���� ������ �ܼ��� Ȯ���غ���. ��¦ ������̴�.",JLabel.CENTER);
        JLabel helper6 = new JLabel("��ĭ�� ä��ų�  ��ĭ�� �ƴ� ��ǥ�� �Է��ϸ� ��ư�� ���ڰ� �ٲ��. �� ���� ĭ�� ä�������� �ƴ����� �����ؾ� �Ѵ�.",JLabel.CENTER);
        JLabel helper7 = new JLabel("�߸��� �Է��̳� Ʋ�� �Էµ� ��ư�� ģ���ϰ� �˷��ش�.",JLabel.CENTER);
        
        JLabel helper8 = new JLabel("������ ���� ��ư�� ������ ������ �ȴ�. ���� �ƹ� �ϵ� �� �Ͼ��.",JLabel.CENTER);


        cont_helper.add(helper);
        cont_helper.add(helper1);
        cont_helper.add(helper2);
        cont_helper.add(helper3);
        cont_helper.add(helper4);
        cont_helper.add(helper5);
        cont_helper.add(helper6);
        cont_helper.add(helper7);
        cont_helper.add(helper8);
//-=---------------------------------------------------------------------------------------
        JFrame fr_maker = new JFrame();//����ȭ���� ���� ������
        fr_maker.setTitle("������");
        fr_maker.setSize(1000,700);
        fr_maker.setLocation(500, 200);
        fr_maker.setResizable(false);
        Container cont_maker = fr_maker.getContentPane();
        cont_maker.setLayout(new GridLayout(15, 1)); 
        JLabel maker = new JLabel("Developer",JLabel.CENTER);
        maker.setForeground(Color.RED);
        JLabel maker1 = new JLabel("����Ʈ�����к� 2018044420 �迵��",JLabel.CENTER);
        
        JLabel maker2 = new JLabel("����Ʈ�����к� 2018044857 �̰���",JLabel.CENTER);
        JLabel maker3 = new JLabel("Git Hub",JLabel.CENTER);
        JLabel maker4 = new JLabel("�ּ� : https://github.com/gang7994/sudokgame.git",JLabel.CENTER);
        maker3.setForeground(Color.RED);
        cont_maker.add(maker);
        cont_maker.add(maker1);
        cont_maker.add(maker2);
        cont_maker.add(maker3);
        cont_maker.add(maker4);
//------------------------------------------------------------------------------------------------------
        JFrame fr_level = new JFrame();//���� ����â�� ���� ������
        fr_level.setTitle("���� ����â�̴� ������");
        fr_level.setLocation(750, 450);
        fr_level.setResizable(false);
        Container cont_level = fr_level.getContentPane();
        cont_level.setLayout(new GridLayout(1, 3));
        JButton button1 = new JButton("��");
        button1.setBackground(Color.CYAN);
        button1.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent arg0) {
              fr_level.dispose();
              fr1.setVisible(true);
           }
        });
        JButton button2 = new JButton("��");
        button2.setBackground(Color.ORANGE);
        button2.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent arg0) {
              fr_level.dispose();
              fr2.setVisible(true);
           }
        });
        JButton button3 = new JButton("��");
        button3.setBackground(Color.MAGENTA);
        button3.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent arg0) {
              fr_level.dispose();
              fr3.setVisible(true);          
           }
        });
        cont_level.setPreferredSize(new Dimension(500, 100));
        cont_level.add(button1);
        cont_level.add(button2);
        cont_level.add(button3);
        fr_level.pack();
//------------------------------------------------------------------------------------------------------
        JFrame fr_start = new JFrame();//����ȭ���̴�. ���ӽ��۹�ư,���ӹ����ư,���������ư�� ����.
        fr_start.setTitle("����â�̴� ������");
        fr_start.setLocation(800, 400);
        fr_start.setResizable(false);
        Container cont_start = fr_start.getContentPane();
        cont_start.setLayout(new GridLayout(4, 1));
        JButton btn_start = new JButton("���� ����");
        btn_start.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent arg0) {
              fr_start.dispose();
              fr_level.setVisible(true);
           }
        });
        JButton btn_helper = new JButton("���� ���(�ʵ�!)");
        btn_helper.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent arg0) {
        	   fr_helper.setVisible(true);
           }
        });
        JButton btn_maker = new JButton("������");
        btn_maker.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent arg0) {
        	   fr_maker.setVisible(true);
           }
        });
        
        JButton btn_close = new JButton("���� ����");
        btn_close.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent arg0) {
              System.exit(0);
           }
        });
        cont_start.setPreferredSize(new Dimension(400, 200));
        cont_start.add(btn_start);
        cont_start.add(btn_helper);
        cont_start.add(btn_maker);
        cont_start.add(btn_close);
        
        fr_start.pack();
        fr_start.setVisible(true);
//------------------------------------------------------------------------------------------------------
        JFrame fr_end1 = new JFrame();//������(��)�� ���� ä���� �� �ߴ� â�̴�.
        fr_end1.setTitle("���� �����̱���! �Ϳ�!");
        fr_end1.setSize(new Dimension(500,400));
        fr_end1.setLocation(750, 300);
        //fr_text.setResizable(false);
        Container cont_end1 = fr_end1.getContentPane();
        cont_end1.setLayout(new GridLayout(2,1)); 
        JLabel prompt11 = new JLabel("�������ϴ�!",JLabel.CENTER);
        cont_end1.add(prompt11);
//------------------------------------------------------------------------------------------------------   
        JFrame fr_end2 = new JFrame();//������(��)�� ���� ä���� �� �ߴ� â�̴�. 
        fr_end2.setTitle("���� �����̱���! �Ϳ�!");
        fr_end2.setSize(new Dimension(500,400));
        fr_end2.setLocation(750, 300);
        //fr_text.setResizable(false);
        Container cont_end2 = fr_end2.getContentPane();
        cont_end2.setLayout(new GridLayout(2,1));
        JLabel prompt12 = new JLabel("�������ϴ�!",JLabel.CENTER);
        cont_end2.add(prompt12);
//------------------------------------------------------------------------------------------------------  
        JFrame fr_end3 = new JFrame();//������(��)�� ���� ä���� �� �ߴ� â�̴�.
        fr_end3.setTitle("�ϸ� �����̱���! �Ϳ�!");
        fr_end3.setSize(new Dimension(500,400));
        fr_end3.setLocation(750, 300);
        //fr_text.setResizable(false);
        Container cont_end3 = fr_end3.getContentPane();
        cont_end3.setLayout(new GridLayout(2,1));
        JLabel prompt13 = new JLabel("�������ϴ�!",JLabel.CENTER);
        cont_end3.add(prompt13);
//------------------------------------------------------------------------------------------------------
        String [][] solution = create_board.createboard();//String [][] ������ �������� solution�� ������ �Ը� puzzle�� �����.
        
        String [][] puzzle1 = copy_board.copyboard(solution);
        puzzle1 = make_holes.makeholes(puzzle1,45);
        int [] holeset1 = make_holeset.get_holeset(puzzle1, 45);
        
        String [][] puzzle2 = copy_board.copyboard(solution);
        puzzle2 = make_holes.makeholes(puzzle2,36);
        int [] holeset2 = make_holeset.get_holeset(puzzle2, 36);
        
        String [][] puzzle3 = copy_board.copyboard(solution);
        puzzle3 = make_holes.makeholes(puzzle3,27);
        int [] holeset3 = make_holeset.get_holeset(puzzle3, 27);
        
 //----------------------------------------------------------------------------------       
        btnset1 = new JButton[81];//������ ���� 81���� ��ư�� ��� ��ư �����̴�.
        btnset2 = new JButton[81];
        btnset3 = new JButton[81];
//------------------------------------------------------------------------------------------------        
        for (int i = 0; i < 9; i++) {//btnset1�� puzzle1�� ��ư 81���� �ִ´�.
           for (int j = 0; j < 9; j++) {
              btnset1[9*i+j]=new JButton(puzzle1[i][j]);
              btnset1[9*i+j].setFont(new Font("���",Font.ITALIC,29));
              
           }
        }    
//--------------------------------------------------------------     
        for (int i = 0; i < 9; i++) {//btnset2�� puzzle2�� ��ư 81���� �ִ´�.
           for (int j = 0; j < 9; j++) {
              btnset2[9*i+j]=new JButton(puzzle2[i][j]);
              btnset2[9*i+j].setFont(new Font("���",Font.ITALIC,29));
           }
        }
//--------------------------------------------------------------    
        for (int i = 0; i < 9; i++) {//btnset3�� puzzle3�� ��ư 81���� �ִ´�.
           for (int j = 0; j < 9; j++) {
              btnset3[9*i+j]=new JButton(puzzle3[i][j]);
              btnset3[9*i+j].setFont(new Font("���",Font.ITALIC,29));
           }
        }  
//---------------------------------------------------------------------------------------------------
        for(int i=0; i<81;i++) {//������(��)�� �Ʒ��ٿ� ��ư�̳� �ؽ�Ʈ�ʵ带 �ִ´�.
             cont1.add(btnset1[i]);
        }
        loci1 = new JPanel();
        jlloci1 = new JLabel("�������Է�(1~9)  : ");
        i1  = new JTextField(1);
        loci1.add(jlloci1);
        loci1.add(i1);
        cont1.add(loci1);
        
        locj1 = new JPanel();
        jllocj1 = new JLabel("�������Է�(1~9) : ");
        j1 = new JTextField(1);
        locj1.add(jllocj1);
        locj1.add(j1);
        cont1.add(locj1);
        
        locsol1 = new JPanel();
        jlsol1 = new JLabel("�����Է�(1~9) : ");
        sol1 = new JTextField(1);
        locsol1.add(jlsol1);
        locsol1.add(sol1);
        cont1.add(locsol1);
        JButton save1 = new JButton("����");
        cont1.add(save1);  
        save1.addActionListener(new ActionListener()//�ؽ�Ʈ�� ���� ���� �ְ� �� ��ư�� ���� �Է��� ���� �´ِ� �ִ´�.
        {
        	public void actionPerformed(ActionEvent e)
            {
          	 String ssol = sol1.getText();
               int row,col;
               try {
              	 row = Integer.parseInt(i1.getText())-1;
                   col = Integer.parseInt(j1.getText())-1;
                   if (find.find_int(holeset1, 9*row+col)) {
                  	 if (solution[row][col].equals(ssol)) {
                  		 btnset1[9*row+col].setText(ssol);
                  		 save1.setText("�Ϳ�!");
                  	 }
                  	 else
                  		 save1.setText("Ʋ����!");
                   }
                   else
                  	 save1.setText("�Ϳ�!");
               }
               catch (NumberFormatException e1) {
              	 save1.setText("�߸��� �Է�!");
               }
               if (buttoncheck.all_check(btnset1)) { 	
              	 fr1.dispose();
              	 fr_end1.setVisible(true);
               }      
            }
        });
        cont1.setPreferredSize(new Dimension(1000, 1000));
//---------------------------------------------------------------------------------------------------        
        for(int i=0; i<81;i++) {//������(��)�� �Ʒ��ٿ� ��ư�̳� �ؽ�Ʈ�ʵ带 �ִ´�.
             cont2.add(btnset2[i]);
        }
        loci2 = new JPanel();
        jlloci2 = new JLabel("�������Է�(1~9)  : ");
        i2  = new JTextField(1);
        loci2.add(jlloci2);
        loci2.add(i2);
        cont2.add(loci2);
        
        locj2 = new JPanel();
        jllocj2 = new JLabel("�������Է�(1~9) : ");
        j2 = new JTextField(1);
        locj2.add(jllocj2);
        locj2.add(j2);
        cont2.add(locj2);
        
        locsol2 = new JPanel();
        jlsol2 = new JLabel("�����Է�(1~9) : ");
        sol2 = new JTextField(1);
        locsol2.add(jlsol2);
        locsol2.add(sol2);
        cont2.add(locsol2);
        JButton save2 = new JButton("����");
        cont2.add(save2);
            
        save2.addActionListener(new ActionListener()//�ؽ�Ʈ�� ���� ���� �ְ� �� ��ư�� ���� �Է��� ���� �´ِ� �ִ´�.
        {
        	public void actionPerformed(ActionEvent e)
            {
          	 String ssol = sol2.getText();
               int row,col;
               try {
              	 row = Integer.parseInt(i2.getText())-1;
                 col = Integer.parseInt(j2.getText())-1;
                 if (find.find_int(holeset2, 9*row+col)) {
                	 if (solution[row][col].equals(ssol)) {
                  		 btnset2[9*row+col].setText(ssol);
                  		 save2.setText("�Ϳ�!");
                  	 }
                  	 else
                  		 save2.setText("Ʋ����!");
                   }
                   else
                  	 save2.setText("�Ϳ�!");
               }
               catch (NumberFormatException e2) {
              	 save2.setText("�߸��� �Է�!");
               }
               if (buttoncheck.all_check(btnset2)) { 	
              	 fr2.dispose();
              	 fr_end2.setVisible(true);
               }      
            }
        });
        cont2.setPreferredSize(new Dimension(1000, 1000));
//----------------------------------------------------------------------------------------------------
        for(int i=0; i<81;i++) {//������(��)�� �Ʒ��ٿ� ��ư�̳� �ؽ�Ʈ�ʵ带 �ִ´�.
           cont3.add(btnset3[i]);
       }
       loci3 = new JPanel();
       jlloci3 = new JLabel("�������Է�(1~9)  : ");
       i3  = new JTextField(1);
       loci3.add(jlloci3);
       loci3.add(i3);
       cont3.add(loci3);
       
       locj3 = new JPanel();
       jllocj3 = new JLabel("�������Է�(1~9) : ");
       j3 = new JTextField(1);
       locj3.add(jllocj3);
       locj3.add(j3);
       cont3.add(locj3);
       
       locsol3 = new JPanel();
       jlsol3 = new JLabel("���� �Է�(1~9) : ");
       sol3 = new JTextField(1);
       locsol3.add(jlsol3);
       locsol3.add(sol3);
       cont3.add(locsol3);
       JButton save3 = new JButton("����");
       cont3.add(save3);
         
       save3.addActionListener(new ActionListener()//�ؽ�Ʈ�� ���� ���� �ְ� �� ��ư�� ���� �Է��� ���� �´ِ� �ִ´�.
       {
          public void actionPerformed(ActionEvent e)
          {
        	 String ssol = sol3.getText();
             int row,col;
             try {
            	 row = Integer.parseInt(i3.getText())-1;
                 col = Integer.parseInt(j3.getText())-1;
                 if (find.find_int(holeset3, 9*row+col)) {
                	 if (solution[row][col].equals(ssol)) {
                		 btnset3[9*row+col].setText(ssol);
                		 save3.setText("�Ϳ�!");
                	 }
                	 else
                		 save3.setText("Ʋ����!");
                 }
                 else
                	 save3.setText("�Ϳ�!");
             }
             catch (NumberFormatException e3) {
            	 save3.setText("�߸��� �Է�!");
             }
             if (buttoncheck.all_check(btnset3)) { 	
            	 fr3.dispose();
            	 fr_end3.setVisible(true);
             }      
          }
       });
       cont3.setPreferredSize(new Dimension(1000, 1000));
       fr1.pack();
       fr2.pack();
       fr3.pack();
       System.out.println("������! ��������� �� Ǯ�ٰ� ���� �� ������ ����.");
       show_board.showboard(solution);
     }
}