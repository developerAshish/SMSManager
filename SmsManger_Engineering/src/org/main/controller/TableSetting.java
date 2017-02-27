package org.main.controller;

import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class TableSetting {

    public static void setTable(JTable table) {
        TableColumnModel model = table.getColumnModel();
        int columnCount = model.getColumnCount();
        for (int index = 0; index < columnCount; index++) {
            TableColumn column = model.getColumn(index);
            table.setRowHeight(30);
            table.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
            column.sizeWidthToFit();
            String columnHeader = getCloumnHeader(index, table);
            if (columnHeader.equals("#")) {
                column.setMaxWidth(50);
                column.setPreferredWidth(50);

            }
            if (columnHeader.equals("NAME")) {
                column.setMaxWidth(155);
                column.setPreferredWidth(155);
            }
            if (columnHeader.equals("Contact")) {
                column.setMaxWidth(150);
                column.setPreferredWidth(150);
            }
            if (columnHeader.equals("Email_ID")) {
                column.setMaxWidth(200);
                column.setPreferredWidth(200);
            }
            
        }
    }

    private static String getCloumnHeader(int index, JTable table) {
        return table.getColumnName(index);
    }
}
