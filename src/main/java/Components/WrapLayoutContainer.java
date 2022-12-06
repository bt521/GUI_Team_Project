/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Components;

import javax.swing.JPanel;
import third_party.WrapLayout;

/**
 *
 * @author twene
 */
public class WrapLayoutContainer extends JPanel {

    // JPanel that sets its layout manager to the custom wrapLayout
    public WrapLayoutContainer() {
        this.setLayout(new WrapLayout());
    }

}
