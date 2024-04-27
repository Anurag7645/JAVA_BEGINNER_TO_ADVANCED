import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.util.Date;

class CollegeAttendanceSystem extends JFrame {
    JTabbedPane tabbedPane;

    public CollegeAttendanceSystem() {
        tabbedPane = new JTabbedPane();

        JPanel registrationPanel = new RegistrationPanel();
        JPanel teacherLoginPanel = new TeacherLoginPanel();
        JPanel studentLoginPanel = new StudentLoginPanel();

        tabbedPane.addTab("Registration", registrationPanel);
        tabbedPane.addTab("Teacher Login", teacherLoginPanel);
        tabbedPane.addTab("Student Login", studentLoginPanel);

        add(tabbedPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                CollegeAttendanceSystem frame = new CollegeAttendanceSystem();
                frame.setTitle("College Attendance System");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(800, 800);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
        
    }
}

class RegistrationPanel extends JPanel {
    JLabel headingLabel;
    JButton addTeacherButton, addStudentButton;

    public RegistrationPanel() {
        setLayout(new GridBagLayout());

        headingLabel = new JLabel("College Attendance System");
        headingLabel.setFont(new Font("Arial", Font.BOLD, 24));
        GridBagConstraints gbcHeading = new GridBagConstraints();
        gbcHeading.gridx = 0;
        gbcHeading.gridy = 0;
        gbcHeading.gridwidth = 2;
        gbcHeading.insets = new Insets(10, 0, 10, 0);
        add(headingLabel, gbcHeading);

        addTeacherButton = new JButton("Add New Teacher");
        addStudentButton = new JButton("Add New Student");

        GridBagConstraints gbcAddTeacherButton = new GridBagConstraints();
        gbcAddTeacherButton.gridx = 0;
        gbcAddTeacherButton.gridy = 1;
        gbcAddTeacherButton.insets = new Insets(10, 0, 10, 10);
        add(addTeacherButton, gbcAddTeacherButton);

        GridBagConstraints gbcAddStudentButton = new GridBagConstraints();
        gbcAddStudentButton.gridx = 1;
        gbcAddStudentButton.gridy = 1;
        gbcAddStudentButton.insets = new Insets(10, 10, 10, 0);
        add(addStudentButton, gbcAddStudentButton);

        addTeacherButton.setPreferredSize(new Dimension(150, 30));
        addStudentButton.setPreferredSize(new Dimension(150, 30));

        addTeacherButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Show dialog to add new teacher
                String teacherName = JOptionPane.showInputDialog(RegistrationPanel.this, "Enter Teacher Name:");
                if (teacherName != null && teacherName.length() > 0) {
                    // Proceed with adding new teacher
                    String subject = JOptionPane.showInputDialog(RegistrationPanel.this, "Enter Subject:");
                    if (subject != null && subject.length() > 0) {
                        // Proceed with adding new teacher
                        String password = JOptionPane.showInputDialog(RegistrationPanel.this, "Enter Password:");
                        if (password != null && password.length() > 0) {
                            // Add teacher to the system
                            try {
                                BufferedWriter writer = new BufferedWriter(new FileWriter("teachers.csv", true));
                                writer.write(teacherName + "," + subject + "," + password + "\n");
                                writer.close();
                                JOptionPane.showMessageDialog(RegistrationPanel.this, "Teacher added successfully!");
                            } catch (IOException ex) {
                                ex.printStackTrace();
                                JOptionPane.showMessageDialog(RegistrationPanel.this, "Failed to add teacher!");
                            }
                        }
                    }
                }
            }
        });

        addStudentButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Show dialog to add new student
                String studentName = JOptionPane.showInputDialog(RegistrationPanel.this, "Enter Student Name:");
                if (studentName != null && studentName.length() > 0) {
                    // Proceed with adding new student
                    int registrationNumber = generateUniqueRegistrationNumber();
                    // Add student to the system
                    try {
                        BufferedWriter writer = new BufferedWriter(new FileWriter("students.csv", true));
                        writer.write(registrationNumber + "," + studentName + "\n");
                        writer.close();
                        JOptionPane.showMessageDialog(RegistrationPanel.this, "Student added successfully!\nRegistration Number: " + registrationNumber);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(RegistrationPanel.this, "Failed to add student!");
                    }
                }
            }
        });
    }

    private int generateUniqueRegistrationNumber() {
        // Generate a random number for simplicity
        return (int) (Math.random() * 1000) + 1000;
    }
}

class TeacherLoginPanel extends JPanel {
    JLabel nameLabel, passwordLabel;
    JTextField nameField;
    JPasswordField passwordField;
    JButton loginButton;

    public TeacherLoginPanel() {
        setLayout(new GridBagLayout());

        nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10); // Add some padding

        add(nameLabel, gbc);
        gbc.gridy++;
        add(passwordLabel, gbc);
        gbc.gridy++;

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        nameField.setPreferredSize(new Dimension(200, 25)); // Set preferred size
        add(nameField, gbc);
        gbc.gridy++;
        passwordField.setPreferredSize(new Dimension(200, 25)); // Set preferred size
        add(passwordField, gbc);
        gbc.gridy++;

        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.NONE;
        add(loginButton, gbc);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String password = String.valueOf(passwordField.getPassword());

                if (!name.equals("") && !password.equals("")) {
                    // Check teacher credentials from CSV file
                    boolean loggedIn = checkTeacherCredentials(name, password);
                    if (loggedIn) {
                        // Show teacher's attendance marking panel
                        TeacherAttendancePanel attendancePanel = new TeacherAttendancePanel(name);
                        JOptionPane.showMessageDialog(TeacherLoginPanel.this, attendancePanel);
                    } else {
                        JOptionPane.showMessageDialog(TeacherLoginPanel.this, "Invalid credentials!");
                    }
                } else {
                    JOptionPane.showMessageDialog(TeacherLoginPanel.this, "Please fill in all fields!");
                }
            }
        });
    }

    private boolean checkTeacherCredentials(String name, String password) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("teachers.csv"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3 && data[0].trim().equalsIgnoreCase(name) && data[2].trim().equals(password)) {
                    reader.close();
                    return true;
                }
            }
            reader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}

class TeacherAttendancePanel extends JPanel {
    JLabel nameLabel;
    JComboBox studentComboBox;
    JComboBox subjectComboBox;
    JSpinner dateSpinner;
    JCheckBox presentCheckBox;
    JButton saveButton;

    public TeacherAttendancePanel(String teacherName) {
        setLayout(new GridLayout(5, 2));

        nameLabel = new JLabel("Teacher: " + teacherName);
        studentComboBox = new JComboBox();
        subjectComboBox = new JComboBox(new String[]{"Java", "DAA", "CO", "DBE"});
        dateSpinner = new JSpinner(new SpinnerDateModel());
        presentCheckBox = new JCheckBox("Present");
        saveButton = new JButton("Save Attendance");

        add(nameLabel);
        add(studentComboBox);
        add(new JLabel("Subject:"));
        add(subjectComboBox);
        add(new JLabel("Date:"));
        add(dateSpinner);
        add(new JLabel());
        add(presentCheckBox);
        add(new JLabel());
        add(saveButton);

        loadStudentNames();

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String teacherName = nameLabel.getText().substring("Teacher: ".length());
                String subject = (String) subjectComboBox.getSelectedItem(); 
                String studentName = (String) studentComboBox.getSelectedItem(); 
                String registrationNumber = getRegistrationNumber(studentName);
                Date date = (Date) dateSpinner.getValue();
                boolean present = presentCheckBox.isSelected();

                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter("attendance.csv", true));
                    writer.write(teacherName + "," + subject + "," + studentName + "," + registrationNumber + "," + date + "," + present + "\n");
                    writer.close();
                    JOptionPane.showMessageDialog(TeacherAttendancePanel.this, "Attendance saved successfully!");
                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(TeacherAttendancePanel.this, "Failed to save attendance!");
                }
            }
        });
    }

    private void loadStudentNames() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("students.csv"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 2) {
                    studentComboBox.addItem(data[1].trim());
                }
            }
            reader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private String getRegistrationNumber(String studentName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("students.csv"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 2 && data[1].trim().equals(studentName)) {
                    reader.close();
                    return data[0].trim();
                }
            }
            reader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    

}

class StudentLoginPanel extends JPanel {
    JLabel nameLabel, registerLabel;
    JTextField nameField, registerField;
    JButton loginButton;

    public StudentLoginPanel() {
        setLayout(new GridBagLayout());

        nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        registerLabel = new JLabel("Registration Number:");
        registerField = new JTextField();
        loginButton = new JButton("Login");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10); // Add some padding

        add(nameLabel, gbc);
        gbc.gridy++;
        add(registerLabel, gbc);
        gbc.gridy++;

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        nameField.setPreferredSize(new Dimension(200, 25)); // Set preferred size
        add(nameField, gbc);
        gbc.gridy++;
        registerField.setPreferredSize(new Dimension(200, 25)); // Set preferred size
        add(registerField, gbc);
        gbc.gridy++;

        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.NONE;
        add(loginButton, gbc);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String registrationNumber = registerField.getText();

                if (!name.equals("") && !registrationNumber.equals("")) {
                    boolean loggedIn = checkStudentCredentials(name, registrationNumber);
                    if (loggedIn) {
                        double attendancePercentage = calculateAttendancePercentage(name);
                        JOptionPane.showMessageDialog(StudentLoginPanel.this, "Attendance Percentage: " + attendancePercentage + "%");
                    } else {
                        JOptionPane.showMessageDialog(StudentLoginPanel.this, "Invalid credentials!");
                    }
                } else {
                    JOptionPane.showMessageDialog(StudentLoginPanel.this, "Please fill in all fields!");
                }
            }
        });
    }

    private boolean checkStudentCredentials(String name, String registrationNumber) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("students.csv"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 2 && data[0].trim().equals(registrationNumber) && data[1].trim().equalsIgnoreCase(name)) {
                    reader.close();
                    return true;
                }
            }
            reader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    private double calculateAttendancePercentage(String name) {
        int totalClasses = 0;
        int attendedClasses = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("attendance.csv"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 6 && data[2].trim().equalsIgnoreCase(name)) {
                    totalClasses++;
                    if (Boolean.parseBoolean(data[5].trim())) {
                        attendedClasses++;
                    }
                }
            }
            reader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return totalClasses == 0 ? 0 : (double) attendedClasses / totalClasses * 100;
    }

}

class College {
    public static void main(String[] args) {
        CollegeSystemFrame frame = new CollegeSystemFrame();
        frame.setTitle("College Attendance System");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
    }
}

class CollegeSystemFrame extends JFrame {
    JTabbedPane tabbedPane;

    public CollegeSystemFrame() {
        tabbedPane = new JTabbedPane();

        JPanel teacherAttendancePanel = new TeacherAttendancePanel("Sample Teacher");
        JPanel studentLoginPanel = new StudentLoginPanel();

        tabbedPane.addTab("Teacher Attendance", teacherAttendancePanel);
        tabbedPane.addTab("Student Login", studentLoginPanel);

        add(tabbedPane);
    }
}