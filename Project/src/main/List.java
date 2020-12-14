
package main;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;



public class List extends function{
    //자습실

    @Override 
    public void List_FeMale() {
 
        JLabel FeMale = new JLabel(""); //여자 자습실 사진
        FeMale.setIcon(new ImageIcon("src\\images\\asiana.jpg"));
        FeMale.setBounds(34, 42, 219, 100); 
        LoginFrame.contentPane1.add(FeMale);
        LoginFrame.contentPane1.setBackground(new Color(255, 250, 250));
 
        
        JLabel name = new JLabel("전학년 여자 자습실"); 
        name.setFont(new Font("나눔고딕", Font.BOLD, 20)); 
        name.setBounds(291, 43, 400, 20);                
        LoginFrame.contentPane1.add(name);
 
        //자습실을 분리하는 상자/버튼을 활용함
        JButton box = new JButton(); 
        box.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { } 
        });
 
        JButton reserve = new JButton("예약하기");
        reserve.setFont(new Font("나눔고딕", Font.PLAIN, 30));
        reserve.setBounds(889, 42, 345, 90); 
        LoginFrame.contentPane1.add(reserve);
 
        JLabel Full = new JLabel("총 좌석 : 20"); 
        Full.setFont(new Font("나눔고딕", Font.BOLD, 20)); 
        Full.setBounds(291, 75, 175, 20);
        LoginFrame.contentPane1.add(Full);
 
        JLabel Left = new JLabel("잔여 좌석 : "+female); 
        Left.setFont(new Font("나눔고딕", Font.BOLD, 20)); 
        Left.setBounds(291, 108, 271, 20);
        LoginFrame.contentPane1.add(Left);
 
        box.setForeground(Color.WHITE); 
        box.setEnabled(false); 
        box.setBackground(new Color(220, 220, 220));
        box.setBorderPainted(false); 
        box.setBounds(14, 32, 1234, 110); 
        LoginFrame.contentPane1.add(box);
 
        //예약하기 버튼을 눌렀을 때 이벤트
        reserve.setCursor(new Cursor(Cursor.HAND_CURSOR));
        reserve.addMouseListener(new MouseAdapter() {
            @Override 
            public void mousePressed(MouseEvent e) { 
                LoginFrame.contentPane1.removeAll();
                LoginFrame.contentPane1.revalidate();
                LoginFrame.contentPane1.repaint();
                rs.roomflight();
            }
        });
    }


   @Override
   public void List_FirstMale() {
       
        JLabel FirstMale = new JLabel(""); //남자 자습실 사진
        FirstMale.setIcon(new ImageIcon(""));
        FirstMale.setBounds(34, 170, 219, 100); 
        LoginFrame.contentPane1.add(FirstMale);
        LoginFrame.contentPane1.setBackground(new Color(255, 250, 250));
 
        
        JLabel name1 = new JLabel("1학년 남자 자습실"); 
        name1.setFont(new Font("나눔고딕", Font.BOLD, 20)); 
        name1.setBounds(291, 171, 400, 20);                
        LoginFrame.contentPane1.add(name1);
 
        //자습실을 분리하는 상자/버튼을 활용함
        JButton box = new JButton(); 
        box.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { } 
        });
 
        JButton reserve1 = new JButton("예약하기");
        reserve1.setFont(new Font("나눔고딕", Font.PLAIN, 30));
        reserve1.setBounds(889, 170, 345, 90); 
        LoginFrame.contentPane1.add(reserve1);
 
        JLabel Full1 = new JLabel("총 좌석 : 20"); 
        Full1.setFont(new Font("나눔고딕", Font.BOLD, 20)); 
        Full1.setBounds(291, 203, 175, 20);
        LoginFrame.contentPane1.add(Full1);
 
        JLabel Left1 = new JLabel("잔여 좌석 : "+male_f); 
        Left1.setFont(new Font("나눔고딕", Font.BOLD, 20)); 
        Left1.setBounds(291, 236, 271, 20);
        LoginFrame.contentPane1.add(Left1);
 
        box.setForeground(Color.WHITE); 
        box.setEnabled(false); 
        box.setBackground(new Color(220, 220, 220));
        box.setBorderPainted(false); 
        box.setBounds(14, 160, 1234, 110); 
        LoginFrame.contentPane1.add(box);
 
        //예약하기 버튼을 눌렀을 때 이벤트
        reserve1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        reserve1.addMouseListener(new MouseAdapter() {
            @Override 
            public void mousePressed(MouseEvent e) { 
                LoginFrame.contentPane1.removeAll();
                LoginFrame.contentPane1.revalidate();
                LoginFrame.contentPane1.repaint();
                RoomStruct Buy = new RoomStruct();
                Buy.roomflight1();
            }
        });
      
   }

   @Override
   public void List_SecondMale() {
        JLabel SecondMale = new JLabel(""); //남자 자습실 사진
        SecondMale.setIcon(new ImageIcon(""));
        SecondMale.setBounds(34, 298, 219, 100); 
        LoginFrame.contentPane1.add(SecondMale);
        LoginFrame.contentPane1.setBackground(new Color(255, 250, 250));
 
        
        JLabel name2 = new JLabel("2학년 남자 자습실"); 
        name2.setFont(new Font("나눔고딕", Font.BOLD, 20)); 
        name2.setBounds(291, 299, 400, 20);                
        LoginFrame.contentPane1.add(name2);
 
        //자습실을 분리하는 상자/버튼을 활용함
        JButton box2 = new JButton(); 
        box2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { } 
        });
 
        JButton reserve2 = new JButton("예약하기");
        reserve2.setFont(new Font("나눔고딕", Font.PLAIN, 30));
        reserve2.setBounds(889, 298, 345, 90); 
        LoginFrame.contentPane1.add(reserve2);
 
        JLabel Full2 = new JLabel("총 좌석 : 20"); 
        Full2.setFont(new Font("나눔고딕", Font.BOLD, 20)); 
        Full2.setBounds(291, 331, 175, 20);
        LoginFrame.contentPane1.add(Full2);
 
        JLabel Left2 = new JLabel("잔여 좌석 : "+male_s); 
        Left2.setFont(new Font("나눔고딕", Font.BOLD, 20)); 
        Left2.setBounds(291, 364, 271, 20);
        LoginFrame.contentPane1.add(Left2);
 
        box2.setForeground(Color.WHITE); 
        box2.setEnabled(false); 
        box2.setBackground(new Color(220, 220, 220));
        box2.setBorderPainted(false); 
        box2.setBounds(14, 288, 1234, 110); 
        LoginFrame.contentPane1.add(box2);
 
        //예약하기 버튼을 눌렀을 때 이벤트
        reserve2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        reserve2.addMouseListener(new MouseAdapter() {
            @Override 
            public void mousePressed(MouseEvent e) { 
                LoginFrame.contentPane1.removeAll();
                LoginFrame.contentPane1.revalidate();
                LoginFrame.contentPane1.repaint();
                RoomStruct Buy = new RoomStruct();
                Buy.roomflight2();
            }
        });
   }

   @Override
   public void List_ThirdMale() {
        JLabel ThirdMale = new JLabel(""); //남자 자습실 사진
        ThirdMale.setIcon(new ImageIcon(""));
        ThirdMale.setBounds(34, 426, 219, 100); 
        LoginFrame.contentPane1.add(ThirdMale);
        LoginFrame.contentPane1.setBackground(new Color(255, 250, 250));
 
        
        JLabel name3 = new JLabel("3학년 남자 자습실"); 
        name3.setFont(new Font("나눔고딕", Font.BOLD, 20)); 
        name3.setBounds(291, 427, 400, 20);                
        LoginFrame.contentPane1.add(name3);
 
        //자습실을 분리하는 상자/버튼을 활용함
        JButton box3 = new JButton(); 
        box3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { } 
        });
 
        JButton reserve3 = new JButton("예약하기");
        reserve3.setFont(new Font("나눔고딕", Font.PLAIN, 30));
        reserve3.setBounds(889, 426, 345, 90); 
        LoginFrame.contentPane1.add(reserve3);
 
        JLabel Full3 = new JLabel("총 좌석 : 20"); 
        Full3.setFont(new Font("나눔고딕", Font.BOLD, 20)); 
        Full3.setBounds(291, 459, 175, 20);
        LoginFrame.contentPane1.add(Full3);
 
        JLabel Left3 = new JLabel("잔여 좌석 : "+male_t); 
        Left3.setFont(new Font("나눔고딕", Font.BOLD, 20)); 
        Left3.setBounds(291, 492, 271, 20);
        LoginFrame.contentPane1.add(Left3);
 
        box3.setForeground(Color.WHITE); 
        box3.setEnabled(false); 
        box3.setBackground(new Color(220, 220, 220));
        box3.setBorderPainted(false); 
        box3.setBounds(14, 416, 1234, 110); 
        LoginFrame.contentPane1.add(box3);
 
        //예약하기 버튼을 눌렀을 때 이벤트
        reserve3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        reserve3.addMouseListener(new MouseAdapter() {
            @Override 
            public void mousePressed(MouseEvent e) { 
                LoginFrame.contentPane1.removeAll();
                LoginFrame.contentPane1.revalidate();
                LoginFrame.contentPane1.repaint();
                RoomStruct Buy = new RoomStruct();
                Buy.roomflight3();
            }
        });
   }

   @Override
   public void List_All() {
        JLabel All = new JLabel(""); //남자 자습실 사진
        All.setIcon(new ImageIcon(""));
        All.setBounds(34, 554, 219, 100); 
        LoginFrame.contentPane1.add(All);
        LoginFrame.contentPane1.setBackground(new Color(255, 250, 250));
 
        
        JLabel name4 = new JLabel("전학년 자습실"); 
        name4.setFont(new Font("나눔고딕", Font.BOLD, 20)); 
        name4.setBounds(291, 555, 400, 20);                
        LoginFrame.contentPane1.add(name4);
 
        //자습실을 분리하는 상자/버튼을 활용함
        JButton box4 = new JButton(); 
        box4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { } 
        });
 
        JButton reserve4 = new JButton("예약하기");
        reserve4.setFont(new Font("나눔고딕", Font.PLAIN, 30));
        reserve4.setBounds(889, 554, 345, 90); 
        LoginFrame.contentPane1.add(reserve4);
 
        JLabel Full2 = new JLabel("총 좌석 : 20"); 
        Full2.setFont(new Font("나눔고딕", Font.BOLD, 20)); 
        Full2.setBounds(291, 587, 175, 20);
        LoginFrame.contentPane1.add(Full2);
 
        JLabel Left4 = new JLabel("잔여 좌석 : "+male_s); 
        Left4.setFont(new Font("나눔고딕", Font.BOLD, 20)); 
        Left4.setBounds(291, 620, 271, 20);
        LoginFrame.contentPane1.add(Left4);
 
        box4.setForeground(Color.WHITE); 
        box4.setEnabled(false); 
        box4.setBackground(new Color(220, 220, 220));
        box4.setBorderPainted(false); 
        box4.setBounds(14, 544, 1234, 110); 
        LoginFrame.contentPane1.add(box4);
 
        //예약하기 버튼을 눌렀을 때 이벤트
        reserve4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        reserve4.addMouseListener(new MouseAdapter() {
            @Override 
            public void mousePressed(MouseEvent e) { 
                LoginFrame.contentPane1.removeAll();
                LoginFrame.contentPane1.revalidate();
                LoginFrame.contentPane1.repaint();
                RoomStruct Buy = new RoomStruct();
                Buy.roomflight4();
            }
        });
      
   }     
}