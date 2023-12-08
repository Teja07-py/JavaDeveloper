import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Wordcount extends JFrame {

    private JTextArea textArea;
    private JLabel wordCountLabel;
    private JLabel charCountLabel;
    private JLabel paragraphCountLabel;

    public Wordcount() {
        initializeUI();
    }

    private void initializeUI() {
	

        setTitle("#WordCount");
        setSize(400, 300);
	setForeground(Color.orange);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
       
        charCountLabel = new JLabel("Characters: 0");
	 wordCountLabel = new JLabel("Words: 0");
        paragraphCountLabel = new JLabel("Paragraphs: 0");

        JButton countButton = new JButton("Count");
		countButton.setForeground(Color.black);

        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countWords();
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(new JScrollPane(textArea), BorderLayout.CENTER);

        JPanel infoPanel = new JPanel();
        infoPanel.add(wordCountLabel);
        infoPanel.add(charCountLabel);
        infoPanel.add(paragraphCountLabel);

        panel.add(infoPanel, BorderLayout.SOUTH);
        panel.add(countButton, BorderLayout.NORTH);

        setMode();

        add(panel);
    }

    private void countWords() {
        String text = textArea.getText();

        int wordCount = text.split("\\s+").length;
        int charCount = text.length();
        int paragraphCount = text.split("\\n+").length;

        wordCountLabel.setText("Words: " + wordCount);
        charCountLabel.setText("Characters: " + charCount);
        paragraphCountLabel.setText("Paragraphs: " + paragraphCount);
    }

    private void setMode() {
        
        textArea.setBackground(Color.darkGray);
        textArea.setForeground(Color.green);
        wordCountLabel.setForeground(Color.red);
        charCountLabel.setForeground(Color.darkGray);
        paragraphCountLabel.setForeground(Color.blue);

        getContentPane().setBackground(Color.darkGray);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Wordcount().setVisible(true);
            }
        });
    }
}
