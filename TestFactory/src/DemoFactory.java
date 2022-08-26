import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class DemoFactory extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	DrinkFactory drinkFactory = new DrinkFactory();
	Drink drink1;
	private JTextField data1;
	private JTextField data2;
	private JTextField data3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoFactory frame = new DemoFactory();
					frame.setVisible(true);
				} catch (Exception e) {
		0			e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DemoFactory() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 663, 437);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(210, 105, 30));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Quản Lý Quy Trình");
		lblNewLabel.setForeground(new Color(47, 79, 79));
		lblNewLabel.setBounds(223, 11, 233, 33);
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 24));
		contentPane.add(lblNewLabel);
		
		JButton tstt = new JButton("TSTT");
		tstt.setFont(new Font("Tahoma", Font.BOLD, 11));
		tstt.setBackground(new Color(160, 82, 45));
		tstt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		tstt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drink1 = drinkFactory.getDrink("Truyền Thống");
				data1.setText(drink1.nguyenlieu());
				data2.setText(drink1.quytrinh());
				data3.setText(drink1.ketqua());
			}
		});
		tstt.setBounds(29, 59, 113, 52);
		contentPane.add(tstt);
		
		JButton hkong = new JButton("TS HongKong");
		hkong.setFont(new Font("Tahoma", Font.BOLD, 11));
		hkong.setBackground(new Color(160, 82, 45));
		hkong.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				drink1 = drinkFactory.getDrink("HongKong");
				data1.setText(drink1.nguyenlieu());
				data2.setText(drink1.quytrinh());
				data3.setText(drink1.ketqua());
			}
		});
		hkong.setBounds(276, 59, 113, 52);
		contentPane.add(hkong);
		
		JButton tslai = new JButton("TS Lài");
		tslai.setFont(new Font("Tahoma", Font.BOLD, 11));
		tslai.setBackground(new Color(160, 82, 45));
		tslai.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				drink1 = drinkFactory.getDrink("Lài");
				data1.setText(drink1.nguyenlieu());
				data2.setText(drink1.quytrinh());
				data3.setText(drink1.ketqua());
			}
		});
		tslai.setBounds(503, 59, 113, 52);
		contentPane.add(tslai);
		
		JButton dtam = new JButton("Trà Dâu Tằm");
		dtam.setFont(new Font("Tahoma", Font.BOLD, 11));
		dtam.setBackground(new Color(160, 82, 45));
		dtam.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		dtam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drink1 = drinkFactory.getDrink("Dâu tằm");
				data1.setText(drink1.nguyenlieu());
				data2.setText(drink1.quytrinh());
				data3.setText(drink1.ketqua());
			}
		});
		dtam.setBounds(160, 140, 113, 52);
		contentPane.add(dtam);
		
		JButton tvai = new JButton("Trà Vải");
		tvai.setFont(new Font("Tahoma", Font.BOLD, 11));
		tvai.setBackground(new Color(160, 82, 45));
		tvai.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				drink1 = drinkFactory.getDrink("Trà Vải");
				data1.setText(drink1.nguyenlieu());
				data2.setText(drink1.quytrinh());
				data3.setText(drink1.ketqua());
			}
		});
		tvai.setBounds(399, 140, 113, 52);
		contentPane.add(tvai);
		
		data1 = new JTextField();
		data1.setHorizontalAlignment(SwingConstants.LEFT);
		data1.setBounds(103, 220, 534, 46);
		contentPane.add(data1);
		data1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nguyên liệu:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(10, 235, 83, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Thực thi:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(10, 287, 83, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Kết quả:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(10, 353, 83, 14);
		contentPane.add(lblNewLabel_3);
		
		data2 = new JTextField();
		data2.setHorizontalAlignment(SwingConstants.LEFT);
		data2.setColumns(10);
		data2.setBounds(103, 277, 534, 46);
		contentPane.add(data2);
		
		data3 = new JTextField();
		data3.setHorizontalAlignment(SwingConstants.LEFT);
		data3.setColumns(10);
		data3.setBounds(103, 338, 534, 46);
		contentPane.add(data3);
	}

}
