/*
Copyright 2008-2010 Gephi
Authors : Mathieu Bastian <mathieu.bastian@gephi.org>
Website : http://www.gephi.org

This file is part of Gephi.

DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.

Copyright 2011 Gephi Consortium. All rights reserved.

The contents of this file are subject to the terms of either the GNU
General Public License Version 3 only ("GPL") or the Common
Development and Distribution License("CDDL") (collectively, the
"License"). You may not use this file except in compliance with the
License. You can obtain a copy of the License at
http://gephi.org/about/legal/license-notice/
or /cddl-1.0.txt and /gpl-3.0.txt. See the License for the
specific language governing permissions and limitations under the
License.  When distributing the software, include this License Header
Notice in each file and include the License files at
/cddl-1.0.txt and /gpl-3.0.txt. If applicable, add the following below the
License Header, with the fields enclosed by brackets [] replaced by
your own identifying information:
"Portions Copyrighted [year] [name of copyright owner]"

If you wish your version of this file to be governed by only the CDDL
or only the GPL Version 3, indicate your decision by adding
"[Contributor] elects to include this software in this distribution
under the [CDDL or GPL Version 3] license." If you do not indicate a
single choice of license, a recipient has the option to distribute
your version of this file under either the CDDL, the GPL Version 3 or
to extend the choice of license to its licensees as provided above.
However, if you add GPL Version 3 code and therefore, elected the GPL
Version 3 license, then the option applies only if the new code is
made subject to such option by the copyright holder.

Contributor(s):

Portions Copyrighted 2011 Gephi Consortium.
 */
package org.gephi.visualization.options;

import com.connectina.swing.fontchooser.JFontChooser;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.gephi.ui.utils.ColorUtils;
import org.gephi.ui.utils.FontUtils;
import org.gephi.visualization.apiimpl.VizConfig;
import org.openide.util.NbPreferences;
import org.openide.windows.WindowManager;

final class DefaultPanel extends javax.swing.JPanel {

    private final DefaultOptionsPanelController controller;
    //Settings
    private Font nodeFont;
    private Font edgeFont;

    DefaultPanel(DefaultOptionsPanelController controller) {
        this.controller = controller;
        initComponents();
        nodeFontButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Font font = JFontChooser.showDialog(WindowManager.getDefault().getMainWindow(), nodeFont);
                if (font != null) {
                    nodeFont = font;
                    nodeFontButton.setText(nodeFont.getFontName() + ", " + nodeFont.getSize());
                }
            }
        });
        edgeFontButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Font font = JFontChooser.showDialog(WindowManager.getDefault().getMainWindow(), edgeFont);
                if (font != null) {
                    edgeFont = font;
                    edgeFontButton.setText(edgeFont.getFontName() + ", " + edgeFont.getSize());
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleDesign = new org.jdesktop.swingx.JXTitledSeparator();
        titleLabel = new org.jdesktop.swingx.JXTitledSeparator();
        labelDefaultSettings = new javax.swing.JLabel();
        autoSelectNeighborCheckbox = new javax.swing.JCheckBox();
        highlightCheckbox = new javax.swing.JCheckBox();
        labelColor = new javax.swing.JLabel();
        nodeLabelColorButton = new net.java.dev.colorchooser.ColorChooser();
        labelNodeLabelColor = new javax.swing.JLabel();
        labelEdgeLabelColor = new javax.swing.JLabel();
        edgeLabelColorButton = new net.java.dev.colorchooser.ColorChooser();
        labelFont = new javax.swing.JLabel();
        nodeFontButton = new javax.swing.JButton();
        labelNodeFont = new javax.swing.JLabel();
        labelEdgeFont = new javax.swing.JLabel();
        edgeFontButton = new javax.swing.JButton();
        labelBackground = new javax.swing.JLabel();
        labelBackgroundPanel = new javax.swing.JPanel();
        backgroundColor = new net.java.dev.colorchooser.ColorChooser();
        labelBackgroundColor = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();

        titleDesign.setTitle(org.openide.util.NbBundle.getMessage(DefaultPanel.class, "DefaultPanel.titleDesign.title")); // NOI18N

        titleLabel.setTitle(org.openide.util.NbBundle.getMessage(DefaultPanel.class, "DefaultPanel.titleLabel.title")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(labelDefaultSettings, org.openide.util.NbBundle.getMessage(DefaultPanel.class, "DefaultPanel.labelDefaultSettings.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(autoSelectNeighborCheckbox, org.openide.util.NbBundle.getMessage(DefaultPanel.class, "DefaultPanel.autoSelectNeighborCheckbox.text")); // NOI18N
        autoSelectNeighborCheckbox.setMargin(new java.awt.Insets(2, 0, 2, 2));

        org.openide.awt.Mnemonics.setLocalizedText(highlightCheckbox, org.openide.util.NbBundle.getMessage(DefaultPanel.class, "DefaultPanel.highlightCheckbox.text")); // NOI18N
        highlightCheckbox.setMargin(new java.awt.Insets(2, 0, 2, 2));

        org.openide.awt.Mnemonics.setLocalizedText(labelColor, org.openide.util.NbBundle.getMessage(DefaultPanel.class, "DefaultPanel.labelColor.text")); // NOI18N

        nodeLabelColorButton.setPreferredSize(new java.awt.Dimension(12, 12));

        javax.swing.GroupLayout nodeLabelColorButtonLayout = new javax.swing.GroupLayout(nodeLabelColorButton);
        nodeLabelColorButton.setLayout(nodeLabelColorButtonLayout);
        nodeLabelColorButtonLayout.setHorizontalGroup(
            nodeLabelColorButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        nodeLabelColorButtonLayout.setVerticalGroup(
            nodeLabelColorButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        org.openide.awt.Mnemonics.setLocalizedText(labelNodeLabelColor, org.openide.util.NbBundle.getMessage(DefaultPanel.class, "DefaultPanel.labelNodeLabelColor.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(labelEdgeLabelColor, org.openide.util.NbBundle.getMessage(DefaultPanel.class, "DefaultPanel.labelEdgeLabelColor.text")); // NOI18N

        edgeLabelColorButton.setPreferredSize(new java.awt.Dimension(12, 12));

        javax.swing.GroupLayout edgeLabelColorButtonLayout = new javax.swing.GroupLayout(edgeLabelColorButton);
        edgeLabelColorButton.setLayout(edgeLabelColorButtonLayout);
        edgeLabelColorButtonLayout.setHorizontalGroup(
            edgeLabelColorButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        edgeLabelColorButtonLayout.setVerticalGroup(
            edgeLabelColorButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        org.openide.awt.Mnemonics.setLocalizedText(labelFont, org.openide.util.NbBundle.getMessage(DefaultPanel.class, "DefaultPanel.labelFont.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(nodeFontButton, org.openide.util.NbBundle.getMessage(DefaultPanel.class, "DefaultPanel.nodeFontButton.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(labelNodeFont, org.openide.util.NbBundle.getMessage(DefaultPanel.class, "DefaultPanel.labelNodeFont.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(labelEdgeFont, org.openide.util.NbBundle.getMessage(DefaultPanel.class, "DefaultPanel.labelEdgeFont.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(edgeFontButton, org.openide.util.NbBundle.getMessage(DefaultPanel.class, "DefaultPanel.edgeFontButton.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(labelBackground, org.openide.util.NbBundle.getMessage(DefaultPanel.class, "DefaultPanel.labelBackground.text")); // NOI18N

        labelBackgroundPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 3, 5));

        backgroundColor.setPreferredSize(new java.awt.Dimension(12, 12));

        javax.swing.GroupLayout backgroundColorLayout = new javax.swing.GroupLayout(backgroundColor);
        backgroundColor.setLayout(backgroundColorLayout);
        backgroundColorLayout.setHorizontalGroup(
            backgroundColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        backgroundColorLayout.setVerticalGroup(
            backgroundColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        labelBackgroundPanel.add(backgroundColor);

        labelBackgroundColor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        org.openide.awt.Mnemonics.setLocalizedText(labelBackgroundColor, org.openide.util.NbBundle.getMessage(DefaultPanel.class, "DefaultPanel.labelBackgroundColor.text")); // NOI18N
        labelBackgroundColor.setMaximumSize(new java.awt.Dimension(141, 15));
        labelBackgroundColor.setMinimumSize(new java.awt.Dimension(141, 15));
        labelBackgroundColor.setPreferredSize(new java.awt.Dimension(141, 14));
        labelBackgroundPanel.add(labelBackgroundColor);

        org.openide.awt.Mnemonics.setLocalizedText(resetButton, org.openide.util.NbBundle.getMessage(DefaultPanel.class, "DefaultPanel.resetButton.text")); // NOI18N
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleDesign, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                    .addComponent(resetButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelBackground)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelBackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(9, 9, 9))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelDefaultSettings)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(autoSelectNeighborCheckbox)
                                            .addComponent(highlightCheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(labelFont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labelColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(65, 65, 65)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(nodeFontButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(labelNodeFont))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(edgeLabelColorButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(labelEdgeLabelColor))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(nodeLabelColorButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(labelNodeLabelColor))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(edgeFontButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(labelEdgeFont)))))
                                .addGap(2, 2, 2)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleDesign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autoSelectNeighborCheckbox)
                    .addComponent(labelDefaultSettings))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(highlightCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelBackground)
                    .addComponent(labelBackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelColor)
                        .addGap(34, 34, 34)
                        .addComponent(labelFont))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nodeLabelColorButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNodeLabelColor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(edgeLabelColorButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEdgeLabelColor))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nodeFontButton)
                            .addComponent(labelNodeFont))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edgeFontButton)
                            .addComponent(labelEdgeFont))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(resetButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed

        NbPreferences.forModule(VizConfig.class).remove(VizConfig.HIGHLIGHT);
        NbPreferences.forModule(VizConfig.class).remove(VizConfig.NEIGHBOUR_SELECT);
        NbPreferences.forModule(VizConfig.class).remove(VizConfig.BACKGROUND_COLOR);
        NbPreferences.forModule(VizConfig.class).remove(VizConfig.NODE_LABEL_COLOR);
        NbPreferences.forModule(VizConfig.class).remove(VizConfig.EDGE_LABEL_COLOR);
        NbPreferences.forModule(VizConfig.class).remove(VizConfig.NODE_LABEL_FONT);
        NbPreferences.forModule(VizConfig.class).remove(VizConfig.EDGE_LABEL_FONT);
        load();
    }//GEN-LAST:event_resetButtonActionPerformed

    void load() {
        //Default design settings
        highlightCheckbox.setSelected(NbPreferences.forModule(VizConfig.class).getBoolean(VizConfig.HIGHLIGHT, VizConfig.DEFAULT_HIGHLIGHT));
        autoSelectNeighborCheckbox.setSelected(NbPreferences.forModule(VizConfig.class).getBoolean(VizConfig.NEIGHBOUR_SELECT, VizConfig.DEFAULT_NEIGHBOUR_SELECT));
        backgroundColor.setColor(ColorUtils.decode(NbPreferences.forModule(VizConfig.class).get(VizConfig.BACKGROUND_COLOR, ColorUtils.encode(VizConfig.DEFAULT_BACKGROUND_COLOR))));

        //Label settings
        nodeLabelColorButton.setColor(ColorUtils.decode(NbPreferences.forModule(VizConfig.class).get(VizConfig.NODE_LABEL_COLOR, ColorUtils.encode(VizConfig.DEFAULT_NODE_LABEL_COLOR))));
        edgeLabelColorButton.setColor(ColorUtils.decode(NbPreferences.forModule(VizConfig.class).get(VizConfig.EDGE_LABEL_COLOR, ColorUtils.encode(VizConfig.DEFAULT_EDGE_LABEL_COLOR))));
        nodeFont = Font.decode(NbPreferences.forModule(VizConfig.class).get(VizConfig.NODE_LABEL_FONT, FontUtils.encode(VizConfig.DEFAULT_NODE_LABEL_FONT)));
        nodeFontButton.setText(nodeFont.getFontName() + ", " + nodeFont.getSize());
        edgeFont = Font.decode(NbPreferences.forModule(VizConfig.class).get(VizConfig.EDGE_LABEL_FONT, FontUtils.encode(VizConfig.DEFAULT_EDGE_LABEL_FONT)));
        edgeFontButton.setText(edgeFont.getFontName() + ", " + edgeFont.getSize());
    }

    void store() {
        //Default design settings
        NbPreferences.forModule(VizConfig.class).putBoolean(VizConfig.HIGHLIGHT, highlightCheckbox.isSelected());
        NbPreferences.forModule(VizConfig.class).putBoolean(VizConfig.NEIGHBOUR_SELECT, autoSelectNeighborCheckbox.isSelected());
        NbPreferences.forModule(VizConfig.class).put(VizConfig.BACKGROUND_COLOR, ColorUtils.encode(backgroundColor.getColor()));

        //Label settings
        NbPreferences.forModule(VizConfig.class).put(VizConfig.NODE_LABEL_COLOR, ColorUtils.encode(nodeLabelColorButton.getColor()));
        NbPreferences.forModule(VizConfig.class).put(VizConfig.EDGE_LABEL_COLOR, ColorUtils.encode(edgeLabelColorButton.getColor()));
        NbPreferences.forModule(VizConfig.class).put(VizConfig.NODE_LABEL_FONT, FontUtils.encode(nodeFont));
        NbPreferences.forModule(VizConfig.class).put(VizConfig.EDGE_LABEL_FONT, FontUtils.encode(edgeFont));
    }

    boolean valid() {
        // TODO check whether form is consistent and complete
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox autoSelectNeighborCheckbox;
    private net.java.dev.colorchooser.ColorChooser backgroundColor;
    private javax.swing.JButton edgeFontButton;
    private net.java.dev.colorchooser.ColorChooser edgeLabelColorButton;
    private javax.swing.JCheckBox highlightCheckbox;
    private javax.swing.JLabel labelBackground;
    private javax.swing.JLabel labelBackgroundColor;
    private javax.swing.JPanel labelBackgroundPanel;
    private javax.swing.JLabel labelColor;
    private javax.swing.JLabel labelDefaultSettings;
    private javax.swing.JLabel labelEdgeFont;
    private javax.swing.JLabel labelEdgeLabelColor;
    private javax.swing.JLabel labelFont;
    private javax.swing.JLabel labelNodeFont;
    private javax.swing.JLabel labelNodeLabelColor;
    private javax.swing.JButton nodeFontButton;
    private net.java.dev.colorchooser.ColorChooser nodeLabelColorButton;
    private javax.swing.JButton resetButton;
    private org.jdesktop.swingx.JXTitledSeparator titleDesign;
    private org.jdesktop.swingx.JXTitledSeparator titleLabel;
    // End of variables declaration//GEN-END:variables
}
