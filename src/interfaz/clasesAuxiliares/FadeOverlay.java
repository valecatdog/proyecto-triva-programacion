package interfaz.clasesAuxiliares;

import javax.swing.*;
import java.awt.*;

public class FadeOverlay extends JComponent {
    private float alpha = 1f; // empieza totalmente negro

    public FadeOverlay() {
        setOpaque(false);
    }

    public void startFadeOut(int durationMs) {
        long start = System.currentTimeMillis();

        Timer timer = new Timer(16, e -> {
            float progress = (System.currentTimeMillis() - start) / (float) durationMs;

            if (progress > 1f) progress = 1f;

            alpha = 1f - progress;
            repaint();

            if (progress >= 1f) {
                ((Timer)e.getSource()).stop();
                setVisible(false); // se oculta de verdad
            }
        });

        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();

        g2.setComposite(AlphaComposite.getInstance(
                AlphaComposite.SRC_OVER, alpha
        ));

        g2.setColor(Color.BLACK);
        g2.fillRect(0, 0, getWidth(), getHeight());
        g2.dispose();
    }
}