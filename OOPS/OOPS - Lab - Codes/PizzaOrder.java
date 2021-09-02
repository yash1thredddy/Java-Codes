import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

/**
 * Creates a form that allows someone to order a pizza.
 * This version displays Swing components that are organized
 * reasonably but does not do anything with the
 * user input.
 *
 * @author Barbara Lerner
 * @version February 3, 2010
 *
 */
public class PizzaOrder {
	/**
	 * Creates the panel that holds the buttons to place or cancel the order
	 * @return the button panel
	 */
	private JPanel createButtonPanel() {
		JPanel buttonPanel = new JPanel();
		buttonPanel.add (new JButton("Place order"));
		buttonPanel.add (new JButton("Cancel order"));
		return buttonPanel;
	}

	/**
	 * Creates the panel with the temperature slider
	 * @return the temperature panel
	 */
	private JPanel createTemperaturePanel() {
		JPanel temperaturePanel = new JPanel();
		temperaturePanel.add (new JLabel ("Temperature"));
		temperaturePanel.add (new JSlider());
		return temperaturePanel;
	}

	/**
	 * Creates the menu of toppings
	 * @return the menu of toppings
	 */
	private JComboBox createToppingsMenu() {
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Pepperoni");
		comboBox.addItem("Mushrooms");
		comboBox.addItem("Anchovies");
		return comboBox;
	}

	/**
	 * Creates the panel where the name of the person placing the order is entered.
	 * @return the name panel
	 */
	private JPanel createNamePanel() {
		JPanel namePanel = new JPanel();
		namePanel.add (new JLabel("Name:  "));
		namePanel.add (new JTextField(15));
		return namePanel;
	}

	/**
	 * Creates the panel to select delivery
	 * @return the delivery panel
	 */
	private JPanel createDeliveryPanel() {
		JPanel deliveryPanel = new JPanel();
		deliveryPanel.add (new JCheckBox());
		deliveryPanel.add (new JLabel("Delivery"));
		return deliveryPanel;
	}

	/**
	 * A program to display a pizza order form.
	 * @param args None expected.
	 */
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("Pizza Order");

		// Create the panel that will display the image and text
		PizzaOrder order = new PizzaOrder();
		Container contentPane = f.getContentPane();

		// Delivery
		JPanel deliveryPanel = order.createDeliveryPanel();
		contentPane.add (deliveryPanel, BorderLayout.NORTH);

		// Person ordering
		JPanel namePanel = order.createNamePanel();
		contentPane.add(namePanel, BorderLayout.SOUTH);

		// Toppings
		JComboBox comboBox = order.createToppingsMenu();
		contentPane.add(comboBox, BorderLayout.CENTER);

		// Temperature
		JPanel temperaturePanel = order.createTemperaturePanel();
		contentPane.add(temperaturePanel, BorderLayout.WEST);

		// Order and cancel buttons
		JPanel buttonPanel = order.createButtonPanel();
		contentPane.add(buttonPanel, BorderLayout.EAST);

		// Make the window the minimum size that displays all
		// components.
		f.pack();

		// Display the window.
		f.setVisible(true);

	}

}
