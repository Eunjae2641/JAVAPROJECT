
package main;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Login extends LoginFrame {
	JPanel p = new JPanel();
	
	Login() {
		p.setLayout(null);
		
		JLabel id = new JLabel("아이디");
		JLabel pass = new JLabel("비밀번호");

		p.add(id);
		p.add(pass);

		TextField aid = new TextField();
		p.add(aid);
		TextField apass = new TextField();
		p.add(apass);

		apass.setEchoChar('*');

		JButton login = new JButton("로그인");
		p.add(login);
		JButton sign = new JButton("회원가입");
		p.add(sign);

		id.setBounds(40, 100, 80, 40);
		id.setFont(f);
		pass.setBounds(40, 200, 100, 40);
		pass.setFont(f);
		aid.setBounds(150, 100, 200, 30);
		aid.setFont(f);
		apass.setBounds(150, 200, 200, 30);
		apass.setFont(f);
		login.setBounds(230, 330, 100, 50);
		login.setFont(f);
		sign.setBounds(80, 330, 120, 50);
		sign.setFont(f);

		add(p);
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("로그인/회원가입");
		setVisible(true);
		sign.setCursor(new Cursor(Cursor.HAND_CURSOR));
		sign.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				p.setVisible(false);
				p.removeAll();
				p.revalidate();
				p.repaint();
				p.setVisible(true);
				Sign();
				
			}
		});
		login.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				try {
					String a;
					String[] array;
					BufferedReader bos = new BufferedReader(new FileReader("회원명단.txt"));
					while ((a = bos.readLine()) != null) {
						array = a.split("/");
						if (aid.getText().equals(array[1]) && apass.getText().equals(array[2])) {
							JOptionPane.showMessageDialog(null, "로그인 되었습니다.");
							dispose();
							bos.close();
							lf.ReserveFrame();
						}
					}
					JOptionPane.showMessageDialog(null, "아이디 혹은 비밀번호가 올바르지 않습니다.");
					aid.setText("");
					apass.setText("");
				} catch (IOException E10) {
					E10.printStackTrace();
				}
			}
		});
	}

	public void Sign() {
		JLabel name = new JLabel("이름");
		JLabel id = new JLabel("아이디");
		JLabel pass = new JLabel("비밀번호");
		JLabel grade = new JLabel("학년");
		JLabel room = new JLabel("반");
		JLabel num = new JLabel("번호");

		add(name);
		add(id);
		add(pass);
		add(grade);
		add(room);
		add(num);

		add(aname);
		add(aid);
		add(apass);
		add(agrade);
		add(aroom);
		add(anum);

		apass.setEchoChar('*');

		JButton save = new JButton("가입");
		JButton cancel = new JButton("취소");

		add(save);
		add(cancel);

		name.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		name.setBounds(40, 10, 40, 40);
		id.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		id.setBounds(40, 50, 60, 40);
		pass.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		pass.setBounds(40, 90, 60, 40);
		grade.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		grade.setBounds(40, 130, 40, 40);
		room.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		room.setBounds(40, 170, 40, 40);
		num.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		num.setBounds(40, 210, 40, 40);
		aname.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		aname.setBounds(120, 10, 200, 30);
		aid.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		aid.setBounds(120, 50, 200, 30);
		apass.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		apass.setBounds(120, 90, 200, 30);
		agrade.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		agrade.setBounds(120, 130, 200, 30);
		aroom.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		aroom.setBounds(120, 170, 200, 30);
		anum.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		anum.setBounds(120, 210, 200, 30);

		save.setBounds(220, 330, 100, 50);
		save.setFont(new Font("나눔고딕", Font.BOLD, 20));
		cancel.setBounds(105, 330, 100, 50);
		cancel.setFont(new Font("나눔고딕", Font.BOLD, 20));

		add(p);
		setSize(500, 500);
		setTitle("회원가입");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent T) {
				try {
					BufferedWriter bos = new BufferedWriter(new FileWriter("회원명단.txt", true));
					bos.write(aname.getText() + "/");
					bos.write(aid.getText() + "/");
					bos.write(apass.getText() + "/");
					bos.write(agrade.getText() + "/");
					bos.write(aroom.getText() + "/");
					bos.write(anum.getText() + "\r\n");
					bos.close();
					JOptionPane.showMessageDialog(null, "회원가입을 축하합니다!");
					dispose();
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "회원가입에 실패하였습니다.");
				}
			}
		});

		cancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent T) {
				JOptionPane.showMessageDialog(null, "회원가입을 취소하셨습니다.");
				dispose();
			}
		});
	}
}
