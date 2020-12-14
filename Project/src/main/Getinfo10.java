package main;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Getinfo10 extends LoginFrame{

	JPanel d = new JPanel();
    JLabel name = new JLabel("이름");
    JLabel grade = new JLabel("학년");
    JLabel room = new JLabel("반");
    JLabel num = new JLabel("번호");
    
    
    JLabel note = new JLabel("노트북 사용 여부");
    
    JRadioButton yes = new JRadioButton("사용");
    JRadioButton no = new JRadioButton("미사용");
    
    JButton cancel= new JButton("취소");
    JButton reserve = new JButton("예약");
    
   void Getinfo(int i, int j) {
        add(name);
        add(grade);
        add(room);
        add(num);
        
        add(aname);
        add(agrade);
        add(aroom);
        add(anum);
        
        name.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        name.setBounds(40,10,40,40);
        grade.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        grade.setBounds(40,50,40,40);
        room.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        room.setBounds(40,90,40,40);
        num.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        num.setBounds(40,130,40,40);
        aname.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        aname.setBounds(120,10,200,30);
        agrade.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        agrade.setBounds(120,50,200,30);
        aroom.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        aroom.setBounds(120,90,200,30);
        anum.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        anum.setBounds(120,130,200,30);
        

        add(reserve);
        add(cancel);

        
        note.setBounds(150,180,200,40);
        note.setFont(new Font("나눔고딕", Font.BOLD, 15));
        add(note);
        yes.setBounds(100,220,100,40);
        yes.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        add(yes);
        no.setBounds(220,220,100,40);
        no.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        add(no);
        cancel.setBounds(220,300,100,50);
        cancel.setFont(f);
        reserve.setBounds(105,300,100,50);
        reserve.setFont(f);
        
        add(d);
        setSize(450,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("예약 확인");
        setVisible(true);
        
        reserve.setCursor(new Cursor(Cursor.HAND_CURSOR));
        reserve.addMouseListener(new MouseAdapter() {
           @Override
           public void mousePressed(MouseEvent e) {               
              try {
           	  female = female - 1;
           	  snum[i][j] = 1;
                 BufferedWriter date = new BufferedWriter(new FileWriter("1204.txt",true));
                 date.write(aname.getText()+"/");
                 date.write(agrade.getText()+"/");
                 date.write(aroom.getText()+"/");
                 date.write(anum.getText()+"/");
                 if(yes.isSelected())
                    date.write("노트북 대여 O\r\n");
                 if(no.isSelected())
                    date.write("노트북 대여 X\r\n");
                 date.close();
                 JOptionPane.showMessageDialog(null, "예약 완료되었습니다.");
                 dispose();
                 lf.dispose();
                 contentPane1.setVisible(false);
                 contentPane1.removeAll();
                 contentPane1.revalidate();
                 contentPane1.repaint();
                 contentPane1.setVisible(true);
                 lf.ReserveFrame();
              }catch (Exception ex) {
                 JOptionPane.showMessageDialog(null, "예약 실패하셨습니다.");
              }   
           }
        });
        
        cancel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cancel.addMouseListener(new MouseAdapter() {
           @Override
           public void mousePressed(MouseEvent e) {                   
              JOptionPane.showMessageDialog(null, "예약 취소되었습니다.");
              dispose();      
           }         
        });

    }
	
	

	void Getinfo1(int i, int j) {
		add(name);
		add(grade);
		add(room);
		add(num);
   
		add(aname);
		add(agrade);
		add(aroom);
		add(anum);
   
		name.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		name.setBounds(40,10,40,40);
		grade.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		grade.setBounds(40,50,40,40);
		room.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		room.setBounds(40,90,40,40);
		num.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		num.setBounds(40,130,40,40);
		aname.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		aname.setBounds(120,10,200,30);
		agrade.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		agrade.setBounds(120,50,200,30);
		aroom.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		aroom.setBounds(120,90,200,30);
		anum.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		anum.setBounds(120,130,200,30);
   

		add(reserve);
		add(cancel);

   
		note.setBounds(150,180,200,40);
		note.setFont(new Font("나눔고딕", Font.BOLD, 15));
		add(note);
		yes.setBounds(100,220,100,40);
		yes.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		add(yes);
		no.setBounds(220,220,100,40);
		no.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		add(no);
		cancel.setBounds(220,300,100,50);
		cancel.setFont(f);
		reserve.setBounds(105,300,100,50);
		reserve.setFont(f);
   
		add(d);
		setSize(450,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("예약 확인");
		setVisible(true);
   
		reserve.setCursor(new Cursor(Cursor.HAND_CURSOR));
		reserve.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {               
				try {
					male_f = male_f - 1;
					snum[i][j] = 1;
					BufferedWriter date = new BufferedWriter(new FileWriter("1204.txt",true));
					date.write(aname.getText()+"/");
					date.write(agrade.getText()+"/");
					date.write(aroom.getText()+"/");
					date.write(anum.getText()+"/");
					if(yes.isSelected())
						date.write("노트북 대여 O\r\n");
					if(no.isSelected())
						date.write("노트북 대여 X\r\n");
					date.close();
					JOptionPane.showMessageDialog(null, "예약 완료되었습니다.");
					lf.dispose();
					ReserveFrame();
				}catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "예약 실패하셨습니다.");
				}   
			}
		});
   
		cancel.setCursor(new Cursor(Cursor.HAND_CURSOR));
		cancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {                   
				JOptionPane.showMessageDialog(null, "예약 취소되었습니다.");
				dispose();      
			}         
		});
	}
	
	void Getinfo2(int i, int j) {
		add(name);
		add(grade);
		add(room);
		add(num);

		add(aname);
		add(agrade);
		add(aroom);
		add(anum);

		name.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		name.setBounds(40,10,40,40);
		grade.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		grade.setBounds(40,50,40,40);
		room.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		room.setBounds(40,90,40,40);
		num.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		num.setBounds(40,130,40,40);
		aname.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		aname.setBounds(120,10,200,30);
		agrade.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		agrade.setBounds(120,50,200,30);
		aroom.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		aroom.setBounds(120,90,200,30);
		anum.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		anum.setBounds(120,130,200,30);


		add(reserve);
		add(cancel);


		note.setBounds(150,180,200,40);
		note.setFont(new Font("나눔고딕", Font.BOLD, 15));
		add(note);
		yes.setBounds(100,220,100,40);
		yes.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		add(yes);
		no.setBounds(220,220,100,40);
		no.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		add(no);
		cancel.setBounds(220,300,100,50);
		cancel.setFont(f);
		reserve.setBounds(105,300,100,50);
		reserve.setFont(f);

		add(d);
		setSize(450,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("예약 확인");
		setVisible(true);

		reserve.setCursor(new Cursor(Cursor.HAND_CURSOR));
		reserve.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {               
				try {
					male_s = male_s - 1;
					snum[i][j] = 1;
					BufferedWriter date = new BufferedWriter(new FileWriter("1204.txt",true));
					date.write(aname.getText()+"/");
					date.write(agrade.getText()+"/");
					date.write(aroom.getText()+"/");
					date.write(anum.getText()+"/");
					if(yes.isSelected())
						date.write("노트북 대여 O\r\n");
					if(no.isSelected())
						date.write("노트북 대여 X\r\n");
					date.close();
					JOptionPane.showMessageDialog(null, "예약 완료되었습니다.");
					dispose();
					ReserveFrame();
				}catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "예약 실패하셨습니다.");
				}   
			}
		});

		cancel.setCursor(new Cursor(Cursor.HAND_CURSOR));
		cancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {                   
				JOptionPane.showMessageDialog(null, "예약 취소되었습니다.");
				dispose();      
			}         
		});
		}


	void Getinfo3(int i, int j) {
		add(name);
		add(grade);
		add(room);
		add(num);

		add(aname);
		add(agrade);
		add(aroom);
		add(anum);

		name.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		name.setBounds(40,10,40,40);
		grade.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		grade.setBounds(40,50,40,40);
		room.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		room.setBounds(40,90,40,40);
		num.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		num.setBounds(40,130,40,40);
		aname.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		aname.setBounds(120,10,200,30);
		agrade.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		agrade.setBounds(120,50,200,30);
		aroom.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		aroom.setBounds(120,90,200,30);
		anum.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		anum.setBounds(120,130,200,30);
		

		add(reserve);
		add(cancel);


		note.setBounds(150,180,200,40);
		note.setFont(new Font("나눔고딕", Font.BOLD, 15));
		add(note);
		yes.setBounds(100,220,100,40);
		yes.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		add(yes);
		no.setBounds(220,220,100,40);
		no.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		add(no);
		cancel.setBounds(220,300,100,50);
		cancel.setFont(f);
		reserve.setBounds(105,300,100,50);
		reserve.setFont(f);
		
		add(d);
		setSize(450,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("예약 확인");
		setVisible(true);
		
		reserve.setCursor(new Cursor(Cursor.HAND_CURSOR));
		reserve.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {               
				try {
					male_t = male_t - 1;
					BufferedWriter date = new BufferedWriter(new FileWriter("1204.txt",true));
					date.write(aname.getText()+"/");
					date.write(agrade.getText()+"/");
					date.write(aroom.getText()+"/");
					date.write(anum.getText()+"/");
					if(yes.isSelected())
						date.write("노트북 대여 O\r\n");
					if(no.isSelected())
						date.write("노트북 대여 X\r\n");
					date.close();
					JOptionPane.showMessageDialog(null, "예약 완료되었습니다.");
					dispose();
					ReserveFrame();
				}catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "예약 실패하셨습니다.");
				}   
			}
		});

		cancel.setCursor(new Cursor(Cursor.HAND_CURSOR));
		cancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {                   
				JOptionPane.showMessageDialog(null, "예약 취소되었습니다.");
				dispose();      
			}   	      
		});
	}
	
	void Getinfo4(int i, int j) {
			add(name);
	         add(grade);
	         add(room);
	         add(num);
	         
	         add(aname);
	         add(agrade);
	         add(aroom);
	         add(anum);
	         
	         name.setFont(new Font("나눔고딕", Font.PLAIN, 15));
	         name.setBounds(40,10,40,40);
	         grade.setFont(new Font("나눔고딕", Font.PLAIN, 15));
	         grade.setBounds(40,50,40,40);
	         room.setFont(new Font("나눔고딕", Font.PLAIN, 15));
	         room.setBounds(40,90,40,40);
	         num.setFont(new Font("나눔고딕", Font.PLAIN, 15));
	         num.setBounds(40,130,40,40);
	         aname.setFont(new Font("나눔고딕", Font.PLAIN, 15));
	         aname.setBounds(120,10,200,30);
	         agrade.setFont(new Font("나눔고딕", Font.PLAIN, 15));
	         agrade.setBounds(120,50,200,30);
	         aroom.setFont(new Font("나눔고딕", Font.PLAIN, 15));
	         aroom.setBounds(120,90,200,30);
	         anum.setFont(new Font("나눔고딕", Font.PLAIN, 15));
	         anum.setBounds(120,130,200,30);
	         

	         add(reserve);
	         add(cancel);

	         
	         note.setBounds(150,180,200,40);
	         note.setFont(new Font("나눔고딕", Font.BOLD, 15));
	         add(note);
	         yes.setBounds(100,220,100,40);
	         yes.setFont(new Font("나눔고딕", Font.PLAIN, 15));
	         add(yes);
	         no.setBounds(220,220,100,40);
	         no.setFont(new Font("나눔고딕", Font.PLAIN, 15));
	         add(no);
	         cancel.setBounds(220,300,100,50);
	         cancel.setFont(f);
	         reserve.setBounds(105,300,100,50);
	         reserve.setFont(f);
	         
	         add(d);
	         setSize(450,450);
	         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	         setTitle("예약 확인");
	         setVisible(true);
	         
	         reserve.setCursor(new Cursor(Cursor.HAND_CURSOR));
	         reserve.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mousePressed(MouseEvent e) {               
	               try {
	            	  All = All - 1;
	            	  snum[i][j] = 1;
	                  BufferedWriter date = new BufferedWriter(new FileWriter("1204.txt",true));
	                  date.write(aname.getText()+"/");
	                  date.write(agrade.getText()+"/");
	                  date.write(aroom.getText()+"/");
	                  date.write(anum.getText()+"/");
	                  if(yes.isSelected())
	                     date.write("노트북 대여 O\r\n");
	                  if(no.isSelected())
	                     date.write("노트북 대여 X\r\n");
	                  date.close();
	                  JOptionPane.showMessageDialog(null, "예약 완료되었습니다.");
	                  dispose();
	                  ReserveFrame();
	               }catch (Exception ex) {
	                  JOptionPane.showMessageDialog(null, "예약 실패하셨습니다.");
	               }   
	            }
	         });
	         
	         cancel.setCursor(new Cursor(Cursor.HAND_CURSOR));
	         cancel.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mousePressed(MouseEvent e) {                   
	               JOptionPane.showMessageDialog(null, "예약 취소되었습니다.");
	               dispose();      
	            }         
	         });
		
	}
}