package main;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;
import javax.swing.border.*;

public class LoginFrame extends JFrame {

	public int female = 20;
	public int male_f = 20;
	public int male_s = 20;
	public int male_t = 20;
	public int All = 20;

	static int snum[][] = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

	TextField aname = new TextField();
	TextField aid = new TextField();
	TextField apass = new TextField();
	TextField agrade = new TextField();
	TextField aroom = new TextField();
	TextField anum = new TextField();

	Font f = new Font("나눔고딕", Font.BOLD, 20);

	private static final long serialVersionUID = 1L;
	public static JPanel contentPane = new JPanel();// 버튼이나 라벨이 들어갈 화면을 만듬
	public static JPanel contentPane1 = new JPanel();// 버튼이나 라벨이 들어갈 화면을 만듬
	static LoginFrame lf = new LoginFrame();
	static RoomStruct rs = new RoomStruct();
	static List li = new List();
//   private Image background = new ImageIcon(Main.class.getResource("../image/JAVA.png")).getImage();

	public static final int SCREEN_WIDTH = 1280;
	public static final int SCREEN_HEIGHT = 720;

	public static void main(String[] args) {
		lf.LoginFrame();
	}

	public void LoginFrame() {

		setTitle("기숙사 자리 예약");

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JButton startbtn = new JButton("로그인 / 회원가입");// 예매버튼을 만듬
		startbtn.setFont(new Font("나눔고딕", Font.PLAIN, 36));
		startbtn.setBounds(480, 360, 320, 80);
		contentPane.add(startbtn);

		JLabel label = new JLabel("GSM 기숙사 자습 좌석 예약");// 제목을 만듬
		label.setForeground(Color.WHITE);
		label.setFont(new Font("나눔고딕", Font.PLAIN, 50));
		label.setBounds(340, 142, 600, 80);
		contentPane.add(label);

		JLabel background = new JLabel("");// 배경화면 설정
		background.setIcon(new ImageIcon("D:\\JAVAPROJECT\\Project\\src\\main\\JAVA.png"));
		background.setSize(1280, 720);
		background.setBounds(0, 0, 1280, 720);
		contentPane.add(background);

		setVisible(true);

		startbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		startbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Login s = new Login();
			}
		});

	}

	public void ReserveFrame() {
	
		List li = new List();
		setTitle("기숙사 자리 예약");

		setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(170, 100, SCREEN_WIDTH, SCREEN_HEIGHT);

		contentPane1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane1);
		contentPane1.setLayout(null);
		setLocationRelativeTo(null);

		JButton startbtn1 = new JButton("좌석 예약하기");// 예매버튼을 만듬
		startbtn1.setFont(new Font("나눔고딕", Font.PLAIN, 36));
		startbtn1.setBounds(500, 450, 300, 80);
		contentPane1.add(startbtn1);

		JLabel label = new JLabel("GSM 기숙사 자습 좌석 예약");// 제목을 만듬
		label.setForeground(Color.WHITE);
		label.setFont(new Font("나눔고딕", Font.PLAIN, 50));
		label.setBounds(340, 142, 600, 80);
		contentPane1.add(label);

		JLabel background = new JLabel("");// 배경화면 설정
		background.setIcon(new ImageIcon("D:\\JAVAPROJECT\\Project\\src\\main\\JAVA.png"));
		background.setSize(1280, 720);
		background.setBounds(0, 0, 1280, 720);
		contentPane1.add(background);

		setVisible(true);

		startbtn1.setCursor(new Cursor(Cursor.HAND_CURSOR));// 버튼 위에 마우스 포인터를 올리면 커서 모양을 손으로 바꿈
		startbtn1.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
			@Override
			public void mousePressed(MouseEvent e) {
				contentPane1.removeAll();// 모든 컴포넌트를 지움
				contentPane1.revalidate();
				contentPane1.repaint();// 다시 그려줌

				li.List_FeMale();
				li.List_FirstMale();
				li.List_SecondMale();
				li.List_ThirdMale();
				li.List_All();

			}
		});
	}
}
