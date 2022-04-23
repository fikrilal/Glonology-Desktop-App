package com.kelompoka3.chart;

import com.kelompoka3.chart.blankchart.BlankPlotChart;
import com.kelompoka3.chart.blankchart.BlankPlotChatRender;
import com.kelompoka3.chart.blankchart.SeriesSize;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

public class Chart extends javax.swing.JPanel {

    private List<ModelLabel> labels = new ArrayList<>();
    private List<ModelChart> model = new ArrayList<>();
    private final int seriesSize=6;
    private final int seriesSpace=6;

    public Chart() {
        initComponents();
        chart.setBlankPlotChatRender(new BlankPlotChatRender() {
            @Override
            public String getLabelText(int index) {
                return model.get(index).getLabel();
            }

            @Override
            public void renderSeries(BlankPlotChart chart, Graphics2D g2, SeriesSize size, int index) {
              double totalSeriesWidth=(seriesSize*labels.size()) + (seriesSpace*(labels.size()-1));      
              
              double x = (size.getWidth() - totalSeriesWidth) / 2;
              for (int i = 0; i < labels.size(); i++) {
                    ModelLabel label = labels.get(i);
                    g2.setColor(label.getColor());
                    double seriesValues = chart.getSeriesValuesOf(model.get(index).getValues()[i], size.getHeight());
                    g2.fillRect((int) (size.getX() + x), (int) (size.getY() + size.getHeight() - seriesValues), seriesSize, (int) seriesValues);
                    x += seriesSpace + seriesSize;
                }
              
//              g2.drawRect((int) size.getX(), (int) size.getY(), (int) size.getWidth(), (int) size.getHeight()); UNTUK TEST GRAFIK
              
            }
        });
    }

    public void addLabel(String name, Color color) {
        ModelLabel data = new ModelLabel(name, color);
        labels.add(data);
        panelLabel.add(new LabelItem(data));
        panelLabel.repaint();
        panelLabel.revalidate();
    }
    
    public void addData(ModelChart data) {
        model.add(data);
        chart.setLabelCount(model.size());
        double max = data.getMaxValues();
        if (max > chart.getMaxValues()) {
            chart.setMaxValues(max);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chart = new com.kelompoka3.chart.blankchart.BlankPlotChart();
        panelLabel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        panelLabel.setOpaque(false);
        panelLabel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 16, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(panelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.kelompoka3.chart.blankchart.BlankPlotChart chart;
    private javax.swing.JPanel panelLabel;
    // End of variables declaration//GEN-END:variables
}
