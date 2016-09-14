package com.novus.dater.presentation;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import com.novus.dater.business.DaterData;
import com.novus.dater.business.OrderRecords;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

public class DaterResult extends JFrame {

	private JPanel contentPane;


	// Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DaterResult frame = new DaterResult();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Create the frame.
	public DaterResult() {
		
		// Load CSV file
		DaterData daterData = new DaterData();
		daterData.loadDataFromFile("/Users/RegalBlack/Documents/workspace/CapitaDatingApp-Current_branch/src/DaterDater4.csv");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblYourPerfectMatch = new JLabel("Your Perfect Match!");
		lblYourPerfectMatch.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		lblYourPerfectMatch.setBounds(240, 24, 235, 59);
		contentPane.add(lblYourPerfectMatch);
		
		JTextArea textAreaMatch = new JTextArea(10, 20);
		JScrollPane scroll = new JScrollPane (textAreaMatch, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		textAreaMatch.setEditable(false);
		textAreaMatch.setLineWrap(true);
		scroll.setBounds(31, 102, 641, 278);
	    contentPane.add(scroll);
			
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.setBounds(41, 393, 117, 29);
		contentPane.add(btnPrevious);
				
        ActionListener actLisPreBtn = new ActionListener() {//add actionlistner to listen for change
            @Override
            public void actionPerformed(ActionEvent e) {
            	DaterMatch.main(null);
            }
        };
        
        btnPrevious.addActionListener(actLisPreBtn);
    
        
		
		String[] matchIDs = OrderRecords.orderRecords(daterData.getRecords()); 
		
		String result = "";
		int i = 1;
		for(String s : matchIDs){
          
			System.out.println(" ------------------ Match number " + i +" ----------------\n");
			result += " ------------------ Match number " + i +" ----------------\n";
			int idAsInt = Integer.parseInt(s) -1;
        	System.out.println(daterData.getRecordNumber(idAsInt));
        	result += daterData.getRecordNumber(idAsInt);
        	i++;
		}
		
		textAreaMatch.setText(result);
	}
}
