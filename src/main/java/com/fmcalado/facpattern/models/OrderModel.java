package com.fmcalado.facpattern.models;

/**
 * Windows button implementation.
 */
public class OrderModel implements Model {
    int id;

    public OrderModel(int id){
        this.id = id;
    }

    @Override
    public void printID() {
        System.out.println(getID());
    }

    public int getID() {
        return this.id;
    }

    @Override
    public boolean saveToDatabase() {
        //TODO Get every prop from class, and insert it to database
        return false;
    }

//    JPanel panel = new JPanel();
//    JFrame frame = new JFrame();
//    JButton button;
//    public void printID() {
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        JLabel label = new JLabel("Hello World!");
//        label.setOpaque(true);
//        label.setBackground(new Color(235, 233, 126));
//        label.setFont(new Font("Dialog", Font.BOLD, 44));
//        label.setHorizontalAlignment(SwingConstants.CENTER);
//        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
//        frame.getContentPane().add(panel);
//        panel.add(label);
//        getID();
//        panel.add(button);
//
//        frame.setSize(320, 200);
//        frame.setVisible(true);
//        getID();
//    }


}
