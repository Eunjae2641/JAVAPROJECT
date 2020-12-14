package main;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class RoomStruct extends LoginFrame {
	public Getinfo10 g = new Getinfo10();

	public void roomflight() {
		// 좌석 버튼
		JLabel lblNewLabel = new JLabel("여학생 자습실 예약");
		lblNewLabel.setBounds(500, 0, 500, 56);
		LoginFrame.contentPane1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 37));

		JButton button_1 = new JButton("좌석");
		button_1.setBackground(Color.LIGHT_GRAY);
		button_1.setBounds(90, 140, 127, 103);
		LoginFrame.contentPane1.add(button_1);

		JButton button_2 = new JButton("좌석");
		button_2.setBackground(Color.LIGHT_GRAY);
		button_2.setBounds(332, 140, 127, 103);
		LoginFrame.contentPane1.add(button_2);

		JButton button_3 = new JButton("좌석");
		button_3.setBackground(Color.LIGHT_GRAY);
		button_3.setBounds(574, 140, 127, 103);
		LoginFrame.contentPane1.add(button_3);

		JButton button_4 = new JButton("좌석");
		button_4.setBackground(Color.LIGHT_GRAY);
		button_4.setBounds(816, 140, 127, 103);
		LoginFrame.contentPane1.add(button_4);

		JButton button_5 = new JButton("좌석");
		button_5.setBackground(Color.LIGHT_GRAY);
		button_5.setBounds(1058, 140, 127, 103);
		LoginFrame.contentPane1.add(button_5);
		
		JButton button_6 = new JButton("좌석");
		button_6.setBackground(Color.LIGHT_GRAY);
		button_6.setBounds(90, 400, 127, 103);
		LoginFrame.contentPane1.add(button_6);

		JButton button_7 = new JButton("좌석");
		button_7.setBackground(Color.LIGHT_GRAY);
		button_7.setBounds(332, 400, 127, 103);
		LoginFrame.contentPane1.add(button_7);

		JButton button_8 = new JButton("좌석");
		button_8.setBackground(Color.LIGHT_GRAY);
		button_8.setBounds(574, 400, 127, 103);
		LoginFrame.contentPane1.add(button_8);

		JButton button_9 = new JButton("좌석");
		button_9.setBackground(Color.LIGHT_GRAY);
		button_9.setBounds(816, 400, 127, 103);
		LoginFrame.contentPane1.add(button_9);

		JButton button_10 = new JButton("좌석");
		button_10.setBackground(Color.LIGHT_GRAY);
		button_10.setBounds(1058, 400, 127, 103);
		LoginFrame.contentPane1.add(button_10);

/////////////////////중략////////////////////////////////

		// 좌석 버튼 클릭시 이벤트
		button_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button_1.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
			@Override
			public void mousePressed(MouseEvent e) {
				if(snum[0][0] == 0) {
					g.Getinfo(0, 0);
					female = female -1;
				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				button_1.setBackground(Color.yellow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (snum[0][0] == 0) {
					button_1.setBackground(Color.lightGray);
				} else
					button_1.setBackground(Color.blue);
			}
		});

		button_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button_2.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
			@Override
			public void mousePressed(MouseEvent e) {
				if(snum[0][1] == 0) {
					g.Getinfo(0, 1);
					female = female-1;
				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				button_2.setBackground(Color.yellow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (snum[0][1] == 0)
					button_2.setBackground(Color.LIGHT_GRAY);
				else
					button_2.setBackground(Color.blue);
			}
		});

		button_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button_3.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
			@Override
			public void mousePressed(MouseEvent e) {
				if(snum[0][2] == 0) {
					g.Getinfo(0, 2);
					female = female-1;
				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				button_3.setBackground(Color.yellow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (snum[0][2] == 0)
					button_3.setBackground(Color.LIGHT_GRAY);
				else
					button_3.setBackground(Color.blue);
			}
		});

		button_4.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
			@Override
			public void mousePressed(MouseEvent e) {
				if(snum[0][3] == 0) {
					g.Getinfo(0, 3);
					female = female-1;
				}			}

			@Override
			public void mouseEntered(MouseEvent e) {
				button_4.setBackground(Color.yellow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (snum[0][3] == 0)
					button_4.setBackground(Color.LIGHT_GRAY);
				else
					button_4.setBackground(Color.blue);
			}
		});
		
		button_5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button_5.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
			@Override
			public void mousePressed(MouseEvent e) {
				if(snum[0][4] == 0) {
					g.Getinfo(0, 4);
				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				button_5.setBackground(Color.yellow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (snum[0][4] == 0) {
					button_5.setBackground(Color.lightGray);
				} else
					button_5.setBackground(Color.blue);
			}
		});

		button_6.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button_6.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
			@Override
			public void mousePressed(MouseEvent e) {
				if(snum[0][5] == 0) {
					g.Getinfo(0, 5);
					female = female-1;
				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				button_6.setBackground(Color.yellow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (snum[0][5] == 0)
					button_6.setBackground(Color.LIGHT_GRAY);
				else
					button_6.setBackground(Color.blue);
			}
		});

		button_7.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button_7.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
			@Override
			public void mousePressed(MouseEvent e) {
				if(snum[0][6] == 0) {
					g.Getinfo(0, 6);
					female = female-1;
				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				button_7.setBackground(Color.yellow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (snum[0][6] == 0)
					button_7.setBackground(Color.LIGHT_GRAY);
				else
					button_7.setBackground(Color.blue);
			}
		});

		button_8.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button_8.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
			@Override
			public void mousePressed(MouseEvent e) {
				if(snum[0][7] == 0) {
					g.Getinfo(0, 7);
					female = female-1;
				}			}

			@Override
			public void mouseEntered(MouseEvent e) {
				button_8.setBackground(Color.yellow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (snum[0][7] == 0)
					button_8.setBackground(Color.LIGHT_GRAY);
				else
					button_8.setBackground(Color.blue);
			}
		});
		
		button_9.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button_9.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
			@Override
			public void mousePressed(MouseEvent e) {
				if(snum[0][8] == 0) {
					g.Getinfo(0, 8);
					female = female-1;
				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				button_9.setBackground(Color.yellow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (snum[0][8] == 0)
					button_9.setBackground(Color.LIGHT_GRAY);
				else
					button_9.setBackground(Color.blue);
			}
		});

		button_10.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button_10.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
			@Override
			public void mousePressed(MouseEvent e) {
				if(snum[0][9] == 0) {
					g.Getinfo(0, 9);
					female = female-1;
				}			}

			@Override
			public void mouseEntered(MouseEvent e) {
				button_10.setBackground(Color.yellow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (snum[0][9] == 0)
					button_10.setBackground(Color.LIGHT_GRAY);
				else
					button_10.setBackground(Color.blue);
			}
		});
		
		for (int j = 0; j < 10; j++) {
			if (snum[0][0] == 0) {
				button_1.setBackground(Color.lightGray);
			} else
				button_1.setBackground(Color.blue);
		}
	}

	public void roomflight1() {
		// 좌석 버튼
		JLabel lblNewLabel = new JLabel("1학년 남자 자습실 예약");
		lblNewLabel.setBounds(500, 0, 500, 56);
		LoginFrame.contentPane1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 37));

		JButton button_1 = new JButton("좌석");
		button_1.setBackground(Color.LIGHT_GRAY);
		button_1.setBounds(14, 140, 127, 103);
		LoginFrame.contentPane1.add(button_1);

		JButton button_2 = new JButton("좌석");
		button_2.setBackground(Color.LIGHT_GRAY);
		button_2.setBounds(200, 140, 127, 103);
		LoginFrame.contentPane1.add(button_2);

		JButton button_3 = new JButton("좌석");
		button_3.setBackground(Color.LIGHT_GRAY);
		button_3.setBounds(383, 140, 127, 103);
		LoginFrame.contentPane1.add(button_3);

		JButton button_4 = new JButton("좌석");
		button_4.setBackground(Color.LIGHT_GRAY);
		button_4.setBounds(575, 140, 127, 103);
		LoginFrame.contentPane1.add(button_4);

		JButton button_5 = new JButton("좌석");
		button_5.setBackground(Color.LIGHT_GRAY);
		button_5.setBounds(764, 140, 127, 103);
		LoginFrame.contentPane1.add(button_5);

/////////////////////중략////////////////////////////////

		// 좌석 버튼 클릭시 이벤트
		button_1.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
			@Override
			public void mousePressed(MouseEvent e) {
				g.Getinfo1(1, 0);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				button_1.setBackground(Color.yellow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (snum[1][0] == 0)
					button_1.setBackground(Color.LIGHT_GRAY);
				else
					button_1.setBackground(Color.blue);
			}
		});

		button_2.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
			@Override
			public void mousePressed(MouseEvent e) {
				g.Getinfo1(1, 1);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				button_2.setBackground(Color.yellow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (snum[1][1] == 0)
					button_2.setBackground(Color.LIGHT_GRAY);
				else
					button_2.setBackground(Color.blue);
			}
		});

		button_3.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
			@Override
			public void mousePressed(MouseEvent e) {
				g.Getinfo1(1, 2);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				button_3.setBackground(Color.yellow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (snum[1][2] == 0)
					button_3.setBackground(Color.LIGHT_GRAY);
				else
					button_3.setBackground(Color.blue);
			}
		});

		button_4.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
			@Override
			public void mousePressed(MouseEvent e) {
				g.Getinfo1(1, 3);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				button_4.setBackground(Color.yellow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (snum[1][3] == 0)
					button_4.setBackground(Color.LIGHT_GRAY);
				else
					button_4.setBackground(Color.blue);
			}
		});
	}

	public void roomflight2() {
		// 좌석 버튼
		JLabel lblNewLabel = new JLabel("2학년 남자 자습실 예약");
		lblNewLabel.setBounds(500, 0, 500, 56);
		LoginFrame.contentPane1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 37));

		JButton button_1 = new JButton("좌석");
		button_1.setBackground(Color.LIGHT_GRAY);
		button_1.setBounds(14, 140, 127, 103);
		LoginFrame.contentPane1.add(button_1);

		JButton button_2 = new JButton("좌석");
		button_2.setBackground(Color.LIGHT_GRAY);
		button_2.setBounds(200, 140, 127, 103);
		LoginFrame.contentPane1.add(button_2);

		JButton button_3 = new JButton("좌석");
		button_3.setBackground(Color.LIGHT_GRAY);
		button_3.setBounds(383, 140, 127, 103);
		LoginFrame.contentPane1.add(button_3);

		JButton button_4 = new JButton("좌석");
		button_4.setBackground(Color.LIGHT_GRAY);
		button_4.setBounds(575, 140, 127, 103);
		LoginFrame.contentPane1.add(button_4);

		JButton button_5 = new JButton("좌석");
		button_5.setBackground(Color.LIGHT_GRAY);
		button_5.setBounds(764, 140, 127, 103);
		LoginFrame.contentPane1.add(button_5);

		// 좌석 버튼 클릭시 이벤트
		button_1.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
			@Override
			public void mousePressed(MouseEvent e) {
				g.Getinfo2(2, 0);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				button_1.setBackground(Color.yellow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (snum[2][0] == 0)
					button_1.setBackground(Color.LIGHT_GRAY);
				else
					button_1.setBackground(Color.blue);
			}
		});

		button_2.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
			@Override
			public void mousePressed(MouseEvent e) {
				g.Getinfo2(2, 1);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				button_2.setBackground(Color.yellow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (snum[2][1] == 0)
					button_2.setBackground(Color.LIGHT_GRAY);
				else
					button_2.setBackground(Color.blue);
			}
		});

		button_3.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
			@Override
			public void mousePressed(MouseEvent e) {
				g.Getinfo2(2, 2);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				button_3.setBackground(Color.yellow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (snum[2][2] == 0)
					button_3.setBackground(Color.LIGHT_GRAY);
				else
					button_3.setBackground(Color.blue);
			}
		});

		button_4.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
			@Override
			public void mousePressed(MouseEvent e) {
				g.Getinfo2(2, 3);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				button_4.setBackground(Color.yellow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (snum[2][3] == 0)
					button_4.setBackground(Color.LIGHT_GRAY);
				else
					button_4.setBackground(Color.blue);
			}
		});
	}

	public void roomflight3() {
		// 좌석 버튼
		JLabel lblNewLabel = new JLabel("3학년 남자 자습실 예약");
		lblNewLabel.setBounds(500, 0, 500, 56);
		LoginFrame.contentPane1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 37));

		JButton button_1 = new JButton("좌석");
		button_1.setBackground(Color.LIGHT_GRAY);
		button_1.setBounds(14, 140, 127, 103);
		LoginFrame.contentPane1.add(button_1);

		JButton button_2 = new JButton("좌석");
		button_2.setBackground(Color.LIGHT_GRAY);
		button_2.setBounds(200, 140, 127, 103);
		LoginFrame.contentPane1.add(button_2);

		JButton button_3 = new JButton("좌석");
		button_3.setBackground(Color.LIGHT_GRAY);
		button_3.setBounds(383, 140, 127, 103);
		LoginFrame.contentPane1.add(button_3);

		JButton button_4 = new JButton("좌석");
		button_4.setBackground(Color.LIGHT_GRAY);
		button_4.setBounds(575, 140, 127, 103);
		LoginFrame.contentPane1.add(button_4);

		JButton button_5 = new JButton("좌석");
		button_5.setBackground(Color.LIGHT_GRAY);
		button_5.setBounds(764, 140, 127, 103);
		LoginFrame.contentPane1.add(button_5);

		// 좌석 버튼 클릭시 이벤트
		button_1.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
			@Override
			public void mousePressed(MouseEvent e) {
				g.Getinfo3(3, 0);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				button_1.setBackground(Color.yellow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (snum[3][0] == 0)
					button_1.setBackground(Color.LIGHT_GRAY);
				else
					button_1.setBackground(Color.blue);
			}
		});

		button_2.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
			@Override
			public void mousePressed(MouseEvent e) {
				g.Getinfo3(3, 1);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				button_2.setBackground(Color.yellow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (snum[3][1] == 0)
					button_2.setBackground(Color.LIGHT_GRAY);
				else
					button_2.setBackground(Color.blue);
			}
		});

		button_3.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
			@Override
			public void mousePressed(MouseEvent e) {
				g.Getinfo3(3, 2);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				button_3.setBackground(Color.yellow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (snum[3][2] == 0)
					button_3.setBackground(Color.LIGHT_GRAY);
				else
					button_3.setBackground(Color.blue);
			}
		});

		button_4.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
			@Override
			public void mousePressed(MouseEvent e) {
				g.Getinfo3(3, 3);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				button_4.setBackground(Color.yellow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (snum[3][3] == 0)
					button_4.setBackground(Color.LIGHT_GRAY);
				else
					button_4.setBackground(Color.blue);
			}
		});
	}

	public void roomflight4() {
		// 좌석 버튼
		JLabel lblNewLabel = new JLabel("전체 자습실 예약");
		lblNewLabel.setBounds(500, 0, 500, 56);
		LoginFrame.contentPane1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 37));

		JButton button_1 = new JButton("좌석");
		button_1.setBackground(Color.LIGHT_GRAY);
		button_1.setBounds(14, 140, 127, 103);
		LoginFrame.contentPane1.add(button_1);

		JButton button_2 = new JButton("좌석");
		button_2.setBackground(Color.LIGHT_GRAY);
		button_2.setBounds(200, 140, 127, 103);
		LoginFrame.contentPane1.add(button_2);

		JButton button_3 = new JButton("좌석");
		button_3.setBackground(Color.LIGHT_GRAY);
		button_3.setBounds(383, 140, 127, 103);
		LoginFrame.contentPane1.add(button_3);

		JButton button_4 = new JButton("좌석");
		button_4.setBackground(Color.LIGHT_GRAY);
		button_4.setBounds(575, 140, 127, 103);
		LoginFrame.contentPane1.add(button_4);

		JButton button_5 = new JButton("좌석");
		button_5.setBackground(Color.LIGHT_GRAY);
		button_5.setBounds(764, 140, 127, 103);
		LoginFrame.contentPane1.add(button_5);

/////////////////////중략////////////////////////////////

		// 좌석 버튼 클릭시 이벤트
		button_1.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
			@Override
			public void mousePressed(MouseEvent e) {
				g.Getinfo4(4, 0);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				button_1.setBackground(Color.yellow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (snum[4][0] == 0)
					button_1.setBackground(Color.LIGHT_GRAY);
				else
					button_1.setBackground(Color.blue);
			}
		});

		button_2.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
			@Override
			public void mousePressed(MouseEvent e) {
				g.Getinfo4(4, 1);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				button_2.setBackground(Color.yellow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (snum[4][1] == 0)
					button_2.setBackground(Color.LIGHT_GRAY);
				else
					button_2.setBackground(Color.blue);
			}
		});

		button_3.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
			@Override
			public void mousePressed(MouseEvent e) {
				g.Getinfo4(4, 2);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				button_3.setBackground(Color.yellow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (snum[4][2] == 0)
					button_3.setBackground(Color.LIGHT_GRAY);
				else
					button_3.setBackground(Color.blue);
			}
		});

		button_4.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
			@Override
			public void mousePressed(MouseEvent e) {
				g.Getinfo4(4, 3);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				button_4.setBackground(Color.yellow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (snum[4][3] == 0)
					button_4.setBackground(Color.LIGHT_GRAY);
				else
					button_4.setBackground(Color.blue);
			}
		});

		button_5.addMouseListener(new MouseAdapter() {// 마우스 클릭 이벤트
			@Override
			public void mousePressed(MouseEvent e) {
				g.Getinfo4(4, 4);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				button_5.setBackground(Color.yellow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (snum[4][4] == 0)
					button_5.setBackground(Color.LIGHT_GRAY);
				else
					button_5.setBackground(Color.blue);
			}
		});
	}
}
