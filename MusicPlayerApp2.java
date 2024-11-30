package muzikcalar;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MusicPlayerApp2 extends JFrame {
    private MusicPlayer player = new MusicPlayer();
    private JLabel currentSongLabel;
    private JTextField sarkiAdiField;
    private JTextField dosyaYoluField;

    public MusicPlayerApp2() {
        setTitle("Müzik Çalar Ödevi");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Üst Panel - Çalan şarkı bilgisi ve kontrol butonları
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());

        JButton prevButton = new JButton("Önceki");
        JButton playButton = new JButton("Çal");
        JButton stopButton = new JButton("Durdur");
        JButton nextButton = new JButton("Sonraki");
        JButton resetButton = new JButton("Başa Sar");

        currentSongLabel = new JLabel("Çalan Şarkı: ");
        topPanel.add(prevButton);
        topPanel.add(playButton);
        topPanel.add(stopButton);
        topPanel.add(nextButton);
        topPanel.add(resetButton);
        topPanel.add(currentSongLabel);

        // Alt Panel - Şarkı ekleme alanı
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout());

        sarkiAdiField = new JTextField(10);
        dosyaYoluField = new JTextField(10);
        JButton addSongButton = new JButton("Şarkı Ekle");

        bottomPanel.add(new JLabel("Şarkı Adı:"));
        bottomPanel.add(sarkiAdiField);
        bottomPanel.add(new JLabel("Dosya Yolu:"));
        bottomPanel.add(dosyaYoluField);
        bottomPanel.add(addSongButton);

        add(topPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        // Butonlara işlev ekleme
        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentSongLabel.setText(player.oncekiSarki());
            }
        });

        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentSongLabel.setText(player.mevcutSarkiyiOynat());
            }
        });

        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentSongLabel.setText("Çalan Şarkı: Durduruldu");
            }
        });

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentSongLabel.setText(player.sonrakiSarki());
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentSongLabel.setText(player.listeninBasinaAl());
            }
        });

        addSongButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sarkiAdi = sarkiAdiField.getText();
                String dosyaYolu = dosyaYoluField.getText();
                if (!sarkiAdi.isEmpty() && !dosyaYolu.isEmpty()) {
                    player.sarkiEkle(sarkiAdi, dosyaYolu);
                    JOptionPane.showMessageDialog(null, "Şarkı eklendi: " + sarkiAdi);
                    sarkiAdiField.setText("");
                    dosyaYoluField.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Lütfen tüm alanları doldurun!");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MusicPlayerApp2().setVisible(true);
            }
        });
    }
}

