package com.mycompany.ventana;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ventana {
    public static void main(String[] args) {
        // Crear el marco (ventana)
        JFrame ventana = new JFrame("Formulario de Persona");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 400);

        // Crear el panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8, 2, 10, 10)); // 8 filas, 2 columnas, con espacio entre componentes

        // Etiquetas (JLabel)
        JLabel labelNombre = new JLabel("Nombre:");
        JLabel labelApellido = new JLabel("Apellido:");
        JLabel labelEdad = new JLabel("Edad:");
        JLabel labelSexo = new JLabel("Sexo:");
        JLabel labelFechaNacimiento = new JLabel("Fecha de Nacimiento:");
        JLabel labelTelefono = new JLabel("Teléfono:");
        JLabel labelCorreo = new JLabel("Correo:");

        // Campos de texto (JTextField)
        JTextField campoNombre = new JTextField();
        JTextField campoApellido = new JTextField();
        JTextField campoEdad = new JTextField();
        JTextField campoTelefono = new JTextField();
        JTextField campoCorreo = new JTextField();

        // ComboBox para el sexo
        String[] opcionesSexo = {"Masculino", "Femenino", "Otro"};
        JComboBox<String> comboSexo = new JComboBox<>(opcionesSexo);

        // JDateChooser para la fecha de nacimiento
        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setDateFormatString("dd MMM yyyy"); // Formato de la fecha

        // Botón para enviar los datos
        JButton botonEnviar = new JButton("Enviar");

        // Acción del botón
        botonEnviar.addActionListener(e -> {
            // Obtener la fecha seleccionada
            Date fechaSeleccionada = dateChooser.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
            String fechaFormateada = sdf.format(fechaSeleccionada);

            // Mostrar los datos (puedes hacer otras acciones aquí)
            System.out.println("Nombre: " + campoNombre.getText());
            System.out.println("Apellido: " + campoApellido.getText());
            System.out.println("Edad: " + campoEdad.getText());
            System.out.println("Sexo: " + comboSexo.getSelectedItem());
            System.out.println("Fecha de Nacimiento: " + fechaFormateada);
            System.out.println("Teléfono: " + campoTelefono.getText());
            System.out.println("Correo: " + campoCorreo.getText());
        });

        // Añadir componentes al panel
        panel.add(labelNombre);
        panel.add(campoNombre);
        panel.add(labelApellido);
        panel.add(campoApellido);
        panel.add(labelEdad);
        panel.add(campoEdad);
        panel.add(labelSexo);
        panel.add(comboSexo);
        panel.add(labelFechaNacimiento);
        panel.add(dateChooser); // Aquí se usa JDateChooser
        panel.add(labelTelefono);
        panel.add(campoTelefono);
        panel.add(labelCorreo);
        panel.add(campoCorreo);
        panel.add(new JLabel()); // Espacio vacío para alinear el botón
        panel.add(botonEnviar);

        // Añadir el panel a la ventana
        ventana.add(panel);

        // Mostrar la ventana
        ventana.setVisible(true);
    }
}
