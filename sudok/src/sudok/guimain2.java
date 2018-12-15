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
        JFrame fr1 = new JFrame();//스도쿠(상)이 들어가는 프레임
        fr1.setTitle("후후후...풀어보시지!");
        fr1.setLocation(500, 0);
        fr1.setResizable(false);
        Container cont1 = fr1.getContentPane();
        cont1.setLayout(new GridLayout(10, 9));
//------------------------------------------------------------------------------------------------------ 
        JFrame fr2 = new JFrame();//스도쿠(중)이 들어가는 프레임
        fr2.setTitle("후후후...풀어보시지!");
        fr2.setLocation(500, 0);
        fr2.setResizable(false);
        Container cont2 = fr2.getContentPane();
        cont2.setLayout(new GridLayout(10, 9));
//------------------------------------------------------------------------------------------------------
        JFrame fr3 = new JFrame();//스도쿠(하)가 들어가는 프레임
        fr3.setTitle("후후후...풀어보시지!");
        fr3.setLocation(500, 0);
        fr3.setResizable(false);
        Container cont3 = fr3.getContentPane();
        cont3.setLayout(new GridLayout(10, 9));    
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------
        JFrame fr_helper = new JFrame();//도움화면이 들어가는 프레임
        fr_helper.setTitle("게임 방법");
        fr_helper.setSize(1000,700);
        fr_helper.setLocation(500, 200);
        fr_helper.setResizable(false);
        Container cont_helper = fr_helper.getContentPane();
        cont_helper.setLayout(new GridLayout(11, 1)); 
        JLabel helper = new JLabel("아래의 세개의 빈칸 중 첫번째 빈칸에는 가로 줄을 의미하고, 두번째 빈칸에는 세로 줄을 의미한다.",JLabel.CENTER);
        JLabel helper1 = new JLabel("그리고 세 번째 빈칸에는 i번째 가로와 j번째 세로 빈칸에 원하는 숫자를 넣는다.",JLabel.CENTER);
        JLabel helper2 = new JLabel("난이도 상은 45개의 빈칸이 주어진다.",JLabel.CENTER);
        JLabel helper3 = new JLabel("난이도 중은 36개의 빈칸이 주어진다.",JLabel.CENTER);
        JLabel helper4 = new JLabel("난이도 하는 27개의 빈칸이 주어진다.",JLabel.CENTER);
        JLabel helper5 = new JLabel("행여나 풀기 힘들수도 있으니 비밀을 하나 알려주겠다. 스도쿠 판이 켜지면 콘솔을 확인해보자. 깜짝 놀랄것이다.",JLabel.CENTER);
        JLabel helper6 = new JLabel("빈칸을 채우거나  빈칸이 아닌 좌표를 입력하면 버튼의 글자가 바뀐다. 두 경우는 칸이 채워지는지 아닌지로 구분해야 한다.",JLabel.CENTER);
        JLabel helper7 = new JLabel("잘못된 입력이나 틀린 입력도 버튼이 친절하게 알려준다.",JLabel.CENTER);
        
        JLabel helper8 = new JLabel("스도쿠 판의 버튼은 마음껏 눌러도 된다. 차피 아무 일도 안 일어난다.",JLabel.CENTER);


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
        JFrame fr_maker = new JFrame();//도움화면이 들어가는 프레임
        fr_maker.setTitle("제작진");
        fr_maker.setSize(1000,700);
        fr_maker.setLocation(500, 200);
        fr_maker.setResizable(false);
        Container cont_maker = fr_maker.getContentPane();
        cont_maker.setLayout(new GridLayout(15, 1)); 
        JLabel maker = new JLabel("Developer",JLabel.CENTER);
        maker.setForeground(Color.RED);
        JLabel maker1 = new JLabel("소프트웨어학부 2018044420 김영민",JLabel.CENTER);
        
        JLabel maker2 = new JLabel("소프트웨어학부 2018044857 이강영",JLabel.CENTER);
        JLabel maker3 = new JLabel("Git Hub",JLabel.CENTER);
        JLabel maker4 = new JLabel("주소 : https://github.com/gang7994/sudokgame.git",JLabel.CENTER);
        maker3.setForeground(Color.RED);
        cont_maker.add(maker);
        cont_maker.add(maker1);
        cont_maker.add(maker2);
        cont_maker.add(maker3);
        cont_maker.add(maker4);
//------------------------------------------------------------------------------------------------------
        JFrame fr_level = new JFrame();//레벨 선택창이 들어가는 프레임
        fr_level.setTitle("레벨 선택창이다 데수웅");
        fr_level.setLocation(750, 450);
        fr_level.setResizable(false);
        Container cont_level = fr_level.getContentPane();
        cont_level.setLayout(new GridLayout(1, 3));
        JButton button1 = new JButton("상");
        button1.setBackground(Color.CYAN);
        button1.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent arg0) {
              fr_level.dispose();
              fr1.setVisible(true);
           }
        });
        JButton button2 = new JButton("중");
        button2.setBackground(Color.ORANGE);
        button2.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent arg0) {
              fr_level.dispose();
              fr2.setVisible(true);
           }
        });
        JButton button3 = new JButton("하");
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
        JFrame fr_start = new JFrame();//시작화면이다. 게임시작버튼,게임방법버튼,게임종료버튼이 들어간다.
        fr_start.setTitle("시작창이다 데수웅");
        fr_start.setLocation(800, 400);
        fr_start.setResizable(false);
        Container cont_start = fr_start.getContentPane();
        cont_start.setLayout(new GridLayout(4, 1));
        JButton btn_start = new JButton("게임 시작");
        btn_start.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent arg0) {
              fr_start.dispose();
              fr_level.setVisible(true);
           }
        });
        JButton btn_helper = new JButton("게임 방법(필독!)");
        btn_helper.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent arg0) {
        	   fr_helper.setVisible(true);
           }
        });
        JButton btn_maker = new JButton("제작진");
        btn_maker.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent arg0) {
        	   fr_maker.setVisible(true);
           }
        });
        
        JButton btn_close = new JButton("게임 종료");
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
        JFrame fr_end1 = new JFrame();//스도쿠(상)를 전부 채웠을 때 뜨는 창이다.
        fr_end1.setTitle("상을 끝내셨군요! 와우!");
        fr_end1.setSize(new Dimension(500,400));
        fr_end1.setLocation(750, 300);
        //fr_text.setResizable(false);
        Container cont_end1 = fr_end1.getContentPane();
        cont_end1.setLayout(new GridLayout(2,1)); 
        JLabel prompt11 = new JLabel("끝났습니다!",JLabel.CENTER);
        cont_end1.add(prompt11);
//------------------------------------------------------------------------------------------------------   
        JFrame fr_end2 = new JFrame();//스도쿠(중)를 전부 채웠을 때 뜨는 창이다. 
        fr_end2.setTitle("중을 끝내셨군요! 와우!");
        fr_end2.setSize(new Dimension(500,400));
        fr_end2.setLocation(750, 300);
        //fr_text.setResizable(false);
        Container cont_end2 = fr_end2.getContentPane();
        cont_end2.setLayout(new GridLayout(2,1));
        JLabel prompt12 = new JLabel("끝났습니다!",JLabel.CENTER);
        cont_end2.add(prompt12);
//------------------------------------------------------------------------------------------------------  
        JFrame fr_end3 = new JFrame();//스도쿠(하)를 전부 채웠을 때 뜨는 창이다.
        fr_end3.setTitle("하를 끝내셨군요! 와우!");
        fr_end3.setSize(new Dimension(500,400));
        fr_end3.setLocation(750, 300);
        //fr_text.setResizable(false);
        Container cont_end3 = fr_end3.getContentPane();
        cont_end3.setLayout(new GridLayout(2,1));
        JLabel prompt13 = new JLabel("끝났습니다!",JLabel.CENTER);
        cont_end3.add(prompt13);
//------------------------------------------------------------------------------------------------------
        String [][] solution = create_board.createboard();//String [][] 형태의 정답판인 solution과 구멍이 뚤린 puzzle을 만든다.
        
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
        btnset1 = new JButton[81];//스도쿠에 들어가는 81개의 버튼이 담길 버튼 집합이다.
        btnset2 = new JButton[81];
        btnset3 = new JButton[81];
//------------------------------------------------------------------------------------------------        
        for (int i = 0; i < 9; i++) {//btnset1에 puzzle1의 버튼 81개를 넣는다.
           for (int j = 0; j < 9; j++) {
              btnset1[9*i+j]=new JButton(puzzle1[i][j]);
              btnset1[9*i+j].setFont(new Font("고딕",Font.ITALIC,29));
              
           }
        }    
//--------------------------------------------------------------     
        for (int i = 0; i < 9; i++) {//btnset2에 puzzle2의 버튼 81개를 넣는다.
           for (int j = 0; j < 9; j++) {
              btnset2[9*i+j]=new JButton(puzzle2[i][j]);
              btnset2[9*i+j].setFont(new Font("고딕",Font.ITALIC,29));
           }
        }
//--------------------------------------------------------------    
        for (int i = 0; i < 9; i++) {//btnset3에 puzzle3의 버튼 81개를 넣는다.
           for (int j = 0; j < 9; j++) {
              btnset3[9*i+j]=new JButton(puzzle3[i][j]);
              btnset3[9*i+j].setFont(new Font("고딕",Font.ITALIC,29));
           }
        }  
//---------------------------------------------------------------------------------------------------
        for(int i=0; i<81;i++) {//스도쿠(상)에 아랫줄에 버튼이나 텍스트필드를 넣는다.
             cont1.add(btnset1[i]);
        }
        loci1 = new JPanel();
        jlloci1 = new JLabel("가로줄입력(1~9)  : ");
        i1  = new JTextField(1);
        loci1.add(jlloci1);
        loci1.add(i1);
        cont1.add(loci1);
        
        locj1 = new JPanel();
        jllocj1 = new JLabel("세로줄입력(1~9) : ");
        j1 = new JTextField(1);
        locj1.add(jllocj1);
        locj1.add(j1);
        cont1.add(locj1);
        
        locsol1 = new JPanel();
        jlsol1 = new JLabel("정답입력(1~9) : ");
        sol1 = new JTextField(1);
        locsol1.add(jlsol1);
        locsol1.add(sol1);
        cont1.add(locsol1);
        JButton save1 = new JButton("제출");
        cont1.add(save1);  
        save1.addActionListener(new ActionListener()//텍스트에 열과 행을 넣고 빈 버튼에 내가 입력한 수가 맞다먄 넣는다.
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
                  		 save1.setText("와우!");
                  	 }
                  	 else
                  		 save1.setText("틀렸음!");
                   }
                   else
                  	 save1.setText("와우!");
               }
               catch (NumberFormatException e1) {
              	 save1.setText("잘못된 입력!");
               }
               if (buttoncheck.all_check(btnset1)) { 	
              	 fr1.dispose();
              	 fr_end1.setVisible(true);
               }      
            }
        });
        cont1.setPreferredSize(new Dimension(1000, 1000));
//---------------------------------------------------------------------------------------------------        
        for(int i=0; i<81;i++) {//스도쿠(중)에 아랫줄에 버튼이나 텍스트필드를 넣는다.
             cont2.add(btnset2[i]);
        }
        loci2 = new JPanel();
        jlloci2 = new JLabel("가로줄입력(1~9)  : ");
        i2  = new JTextField(1);
        loci2.add(jlloci2);
        loci2.add(i2);
        cont2.add(loci2);
        
        locj2 = new JPanel();
        jllocj2 = new JLabel("세로줄입력(1~9) : ");
        j2 = new JTextField(1);
        locj2.add(jllocj2);
        locj2.add(j2);
        cont2.add(locj2);
        
        locsol2 = new JPanel();
        jlsol2 = new JLabel("정답입력(1~9) : ");
        sol2 = new JTextField(1);
        locsol2.add(jlsol2);
        locsol2.add(sol2);
        cont2.add(locsol2);
        JButton save2 = new JButton("제출");
        cont2.add(save2);
            
        save2.addActionListener(new ActionListener()//텍스트에 열과 행을 넣고 빈 버튼에 내가 입력한 수가 맞다먄 넣는다.
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
                  		 save2.setText("와우!");
                  	 }
                  	 else
                  		 save2.setText("틀렸음!");
                   }
                   else
                  	 save2.setText("와우!");
               }
               catch (NumberFormatException e2) {
              	 save2.setText("잘못된 입력!");
               }
               if (buttoncheck.all_check(btnset2)) { 	
              	 fr2.dispose();
              	 fr_end2.setVisible(true);
               }      
            }
        });
        cont2.setPreferredSize(new Dimension(1000, 1000));
//----------------------------------------------------------------------------------------------------
        for(int i=0; i<81;i++) {//스도쿠(하)에 아랫줄에 버튼이나 텍스트필드를 넣는다.
           cont3.add(btnset3[i]);
       }
       loci3 = new JPanel();
       jlloci3 = new JLabel("가로줄입력(1~9)  : ");
       i3  = new JTextField(1);
       loci3.add(jlloci3);
       loci3.add(i3);
       cont3.add(loci3);
       
       locj3 = new JPanel();
       jllocj3 = new JLabel("세로줄입력(1~9) : ");
       j3 = new JTextField(1);
       locj3.add(jllocj3);
       locj3.add(j3);
       cont3.add(locj3);
       
       locsol3 = new JPanel();
       jlsol3 = new JLabel("정답 입력(1~9) : ");
       sol3 = new JTextField(1);
       locsol3.add(jlsol3);
       locsol3.add(sol3);
       cont3.add(locsol3);
       JButton save3 = new JButton("제출");
       cont3.add(save3);
         
       save3.addActionListener(new ActionListener()//텍스트에 열과 행을 넣고 빈 버튼에 내가 입력한 수가 맞다먄 넣는다.
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
                		 save3.setText("와우!");
                	 }
                	 else
                		 save3.setText("틀렸음!");
                 }
                 else
                	 save3.setText("와우!");
             }
             catch (NumberFormatException e3) {
            	 save3.setText("잘못된 입력!");
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
       System.out.println("정답판! 양심적으로 좀 풀다가 막힐 때 보도록 하자.");
       show_board.showboard(solution);
     }
}