import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class RegistrationForm extends JFrame implements ActionListener{
    JTextField nameT;
    JLabel name;
    JPasswordField pass;
    JLabel pass1;
    JTextField email;
    JLabel email1;
    JTextField nameT2;
    JLabel name2;
    JTextField gender;
    JLabel gender1;
    JTextField city;
    JLabel city1;
    JTextField country;
    JLabel country1;
    JTextField phone;
    JLabel phone1;
    JButton sumbit;
    JButton clear;
    JCheckBox checkBox;
    JRadioButton male;
    JRadioButton female;
    ButtonGroup group;

    RegistrationForm(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 900);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.PINK);


        name = new JLabel("Name:");
        name.setBounds(150, 300, 50, 35);

        nameT = new JTextField();
        nameT.setBounds(210, 300, 150, 30);

        pass1 = new JLabel("Password:");
        pass1.setBounds(120, 350, 100, 35);

        pass = new JPasswordField();
        pass.setBounds(210, 350, 150, 30);

        email1 = new JLabel("Email:");
        email1.setBounds(150, 400, 50, 35);

        email = new JTextField();
        // email.setText("zohabhussainsathio@gmail.com");
        email.setBounds(210, 400, 150, 30);

        gender1 = new JLabel("Gender:");
        gender1.setBounds(150, 450, 50, 35);

//        gender = new JTextField();
//        //gender.setBounds(210, 450, 150, 30);

        city1 = new JLabel("City:");
        city1.setBounds(150, 500, 50, 35);

        String[]city ={"HYDERABAD","KARACHI","ISLAMABAD","OTHERS"};
        JComboBox comboBox =  new JComboBox(city);
        comboBox.setBounds(200, 500, 150, 35);

        country1 = new JLabel("Country:");
        country1.setBounds(150, 550, 50, 35);

        String[]country = {"PAKISTAN","INDIA","AFGHANISTAN","OTHERS"};
        JComboBox comboBox1 =  new JComboBox(country);
        comboBox1.setBounds(210, 550, 150, 30);


        phone1 = new JLabel("Phone No:");
        phone1.setBounds(150, 600, 90, 35);

        phone = new JTextField();
        phone.setBounds(210, 600, 150, 30);

        sumbit = new JButton("Sumbit");
        sumbit.setBounds(120, 750, 80, 35);

        clear = new JButton("Clear");
        clear.setBounds(220, 750, 70, 35);

        checkBox = new JCheckBox();
        checkBox.setText("Terms & Conditions.");
        checkBox.setBounds(180, 650, 150, 50);


        male = new JRadioButton("Male");
        male.setBounds(210, 450, 70, 30);

        female = new JRadioButton("Female");
        female.setBounds(280, 450, 70, 30);

        group = new ButtonGroup();

        group.add(male);
        group.add(female);
        sumbit.addActionListener(this);
        clear.addActionListener(this);


        //DEBUGGING PART

        //String nameq = email.getText();
        //System.out.println(nameq);
        //System.out.println(nameq.contains("gmail"));
        //System.out.println(group.getSelection());
        //String numbers = phone.getText();
        //System.out.println(numbers);
        //System.out.println(checkBox.isSelected());




        this.add(name);
        this.add(nameT);
        this.add(pass1);
        this.add(pass);
        this.add(email1);
        this.add(email);
        this.add(gender1);
        this.add(city1);
        this.add(comboBox);
        this.add(country1);
        this.add(comboBox1);
        this.add(phone1);
        this.add(phone);
        this.add(sumbit);
        this.add(clear);
        this.add(checkBox);
        this.add(male);
        this.add(female);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==sumbit){
            String nameq = email.getText();
            String number = phone.getText();
            String[] numbers = {"a", "b", "c"};
            if(nameT.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Enter name first!");
            else if(pass.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Enter your password!");
            else if(!nameq.contains("@gmail.com"))
                JOptionPane.showMessageDialog(null, "Please enter correct email!");
            else if(group.getSelection()== null)
                JOptionPane.showMessageDialog(null, "Select your Gender!");
            else if(number.contains("a")|| number.contains("b") || number.contains("c")|| number.contains("d")
                    || number.contains("e")|| number.contains("f") || number.contains("g")|| number.contains("h")
                    || number.contains("i")|| number.contains("j") || number.contains("k")|| number.contains("l") || number.contains("m")|| number.contains("n")
                    || number.contains("o")|| number.contains("p") || number.contains("q")|| number.contains("r")
                    || number.contains("s")|| number.contains("t") || number.contains("u")|| number.contains("v") || number.contains("w")|| number.contains("x")
                    || number.contains("y")|| number.contains("z") || number.contains("A")|| number.contains("B")
                    || number.contains("C")|| number.contains("D") || number.contains("E")|| number.contains("F") || number.contains("G")|| number.contains("H")
                    || number.contains("I")|| number.contains("J") || number.contains("K")|| number.contains("L")
                    || number.contains("M")|| number.contains("N") || number.contains("O")|| number.contains("P") || number.contains("Q")|| number.contains("R")
                    || number.contains("S")|| number.contains("T") || number.contains("U")|| number.contains("V")
                    || number.contains("W")|| number.contains("X") || number.contains("Y")|| number.contains("Z") || number.contains("@")|| number.contains("#")
                    || number.contains("!")|| number.contains("$") || number.contains("%")|| number.contains("&")
                    || number.contains("*")|| number.contains("+"))
                JOptionPane.showMessageDialog(null, "Invalid number!");
            else if(checkBox.isSelected()== false)
                JOptionPane.showMessageDialog(null, "Please accept Terms & Conditions");
            else
                JOptionPane.showMessageDialog(null, "Success");

        }
        else if(ae.getSource()==clear){
            nameT.setText("");
            pass.setText("");
            email.setText("");
            city.setText("");
            country.setText("");
            phone.setText("");
            group.clearSelection();
            checkBox.setSelected(false);

        }
    }

}


