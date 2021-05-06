
package Telas;

public class JfMenuSec extends javax.swing.JFrame {

    public JfMenuSec() {
        initComponents();
        setExtendedState(JfMenuSec.MAXIMIZED_BOTH); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        JmConta = new javax.swing.JMenu();
        JmiConta = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        JmiSair = new javax.swing.JMenuItem();
        JmUbs = new javax.swing.JMenu();
        JmProdutos = new javax.swing.JMenu();
        JmSobre = new javax.swing.JMenu();
        JmiAjuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Visualizador de UBS");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 846, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
        );

        JmConta.setText("Conta");

        JmiConta.setText("Visualizar Conta");
        JmConta.add(JmiConta);
        JmConta.add(jSeparator1);

        JmiSair.setText("Sair");
        JmConta.add(JmiSair);

        jMenuBar1.add(JmConta);

        JmUbs.setText("Gerenciar UBS");
        jMenuBar1.add(JmUbs);

        JmProdutos.setText("Gerenciar Produtos");
        jMenuBar1.add(JmProdutos);

        JmSobre.setText("Sobre");

        JmiAjuda.setText("Ajuda");
        JmSobre.add(JmiAjuda);

        jMenuBar1.add(JmSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jDesktopPane1))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
      

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfMenuSec().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JmConta;
    private javax.swing.JMenu JmProdutos;
    private javax.swing.JMenu JmSobre;
    private javax.swing.JMenu JmUbs;
    private javax.swing.JMenuItem JmiAjuda;
    private javax.swing.JMenuItem JmiConta;
    private javax.swing.JMenuItem JmiSair;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
