import javax.swing.*;
class gui{
    public static void main(String args[]){
        JFrame frame = new JFrame("Alura Challenge");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,400);
        JButton button1 = new JButton("Press");
        frame.getContentPane().add(button1);
        frame.setVisible(true);

        new MyDropdownMenu();


    }

    public static class MyDropdownMenu extends JFrame {
        public MyDropdownMenu() {
            // Create an array of items to be displayed in the dropdown menu
            String[] items = {"Conversion de monedas", "COnversion de temperatura"};

            // Create a new JComboBox with the items array as its argument
            JComboBox<String> dropdown = new JComboBox<>(items);

            // Add the dropdown to the JFrame
            add(dropdown);

            // Set the size of the JFrame and make it visible
            setSize(300, 200);
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}
}