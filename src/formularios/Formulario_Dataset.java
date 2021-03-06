/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import estruturas.Exemplo;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author rafael
 */
public class Formulario_Dataset extends javax.swing.JInternalFrame {

    
    private static String eixoX;
    private static String eixoY;
    private static ArrayList<Exemplo> base;
    private static double maxValor;
    private static double minValor;
    private static XYSeriesCollection dataset;
    
    public Formulario_Dataset() {
        eixoX = "";
        eixoY = "";
        
        initComponents();
        
        this.setVisible(true);
    }
    
    public static XYSeriesCollection getDataset(){
        return dataset;
    }
    
    public static ArrayList<Exemplo> getBase(){
        return base;
    }

    public static double getMaxValor(){
        return maxValor;
    }
    
    public static double getMinValor(){
        return minValor;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tCaminho = new javax.swing.JTextField();
        bCarregar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tDados = new javax.swing.JTable();

        setIconifiable(true);
        setTitle("Base de Dados");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Base"));

        jLabel1.setText("Caminho:");

        bCarregar.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        bCarregar.setText("Carregar");
        bCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCarregarActionPerformed(evt);
            }
        });

        jButton1.setText("Procurar...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tCaminho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(bCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bCarregar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        tDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "X", "Y"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tDados);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCarregarActionPerformed
        maxValor = Double.MIN_VALUE * -1;
        minValor = Double.MAX_VALUE;    
        
        Formulario_Resultados.getTResultados().setText("");
        
        try{
            //Lendo dataset do arquivo
            BufferedReader arq = new BufferedReader(new FileReader(tCaminho.getText()));
            
            String linha = "";
            
            linha = arq.readLine();
            String[] partes = linha.split(";");
            eixoX = partes[0];
            eixoY = partes[1];
            base = new ArrayList<Exemplo>();
            
            while( (linha = arq.readLine()) != null){
                partes = linha.split(";");
                if(partes.length > 1){
                    base.add(new Exemplo(Double.parseDouble(partes[0]), Double.parseDouble(partes[1])));
                }
            }
            
            arq.close();
            
            //Jogando as informações para a tabela
            DefaultTableModel modeloTabela = new DefaultTableModel();
            modeloTabela.addColumn(eixoX);
            modeloTabela.addColumn(eixoY);
            for(Exemplo ex : base){
                Double[] dados = new Double[2];
                dados[0] = ex.getValorAtributo();
                dados[1] = ex.getValorSaida();
                modeloTabela.addRow(dados);
                if(ex.getValorAtributo() > maxValor){
                    maxValor = ex.getValorAtributo();
                }
                if(ex.getValorAtributo() < minValor){
                    minValor = ex.getValorAtributo();
                }
            }
            tDados.setModel(modeloTabela);
            
            //Plotando o Grafico
            plotarDados(base,"Gráfico",eixoX,eixoY);
        }catch(Exception e){
            System.out.println("Erro ao ler base de dados");
        }
        
    }//GEN-LAST:event_bCarregarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        JFileChooser abrir = new JFileChooser();
        abrir.setFileSelectionMode(JFileChooser.FILES_ONLY);
        abrir.setDialogTitle("Carregar Base");
        abrir.setDialogType(JFileChooser.OPEN_DIALOG);
        abrir.setFileFilter(new FileNameExtensionFilter("Comma-separated values (*.csv)", "csv"));
        abrir.showSaveDialog(null);

        File config = abrir.getSelectedFile();
        if(config == null){
            return;
        }
        String fileName = config.toString();
        tCaminho.setText(fileName);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public void plotarDados(ArrayList<Exemplo> exemplos, String base, String eixoX, String eixoY){
        dataset = new XYSeriesCollection();
         
        XYSeries series1 = new XYSeries("Exemplos Treinamento");
        for(Exemplo ex : exemplos){
            series1.add(ex.getValorAtributo(), ex.getValorSaida());
        }
        

        dataset.addSeries(series1);
         
         
        // Create chart
        JFreeChart chart = ChartFactory.createScatterPlot(
            base, 
            eixoX, eixoY, dataset);


        //Changes background color
        XYPlot plot = (XYPlot)chart.getPlot();
        plot.setBackgroundPaint(new Color(255,228,196));


        // Create Panel
        ChartPanel chartPanel = new ChartPanel(chart);
        
        //chartPanel.setPreferredSize(pGraphic.getSize());
        //chartPanel.setPreferredSize(new Dimension(pGraphic.getSize().width - 15,pGraphic.getSize().height - 14));
        //Formulario_Principal.getFormGraficos().removeAll();
        Formulario_Principal.getFormGraficos().setContentPane(chartPanel);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCarregar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tCaminho;
    private javax.swing.JTable tDados;
    // End of variables declaration//GEN-END:variables
}
