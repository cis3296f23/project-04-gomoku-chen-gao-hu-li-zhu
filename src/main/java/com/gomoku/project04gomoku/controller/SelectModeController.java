/**
 * 专门用来控制模式选择的controller。有返回，切换页面等功能
 */

package com.gomoku.project04gomoku.controller;

import com.gomoku.project04gomoku.GomokuStart;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;


public class SelectModeController {
    FXMLLoader fxmlLoader;
    @FXML
    private Button GoBackMain;
    @FXML
    private Button Multiple;
    @FXML
    private Button MultipleBack;

    /**
     * 用来返回到二级菜单
     * @param event
     * @throws IOException
     */
    public void GoBackToSelectMode(ActionEvent event) throws  IOException
    {
        try {
            fxmlLoader = new FXMLLoader(GomokuStart.class.getResource("view/SelectMode.fxml"));
            Scene root = new Scene(fxmlLoader.load(), 800, 600);


            Stage stage = (Stage) MultipleBack.getScene().getWindow();


            stage.setScene(root);
            stage.show();

        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * 用来返回到主菜单
     * @param event
     * @throws IOException
     */
    public void GoBackToMain(ActionEvent event) throws IOException
    {
        try {
           fxmlLoader = new FXMLLoader(GomokuStart.class.getResource("view/menu.fxml"));
            Scene root = new Scene(fxmlLoader.load(), 800, 600);


            Stage stage = (Stage) GoBackMain.getScene().getWindow();


            stage.setScene(root);
            stage.show();

        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * 用来进入三级菜单（多人游戏选项）
     * @param event
     * @throws IOException
     */
    public void GoToMultiplePlayer(ActionEvent event) throws IOException
    {
        try {
            fxmlLoader = new FXMLLoader(GomokuStart.class.getResource("view/MultiplePlayer.fxml"));
            Scene root = new Scene(fxmlLoader.load(), 800, 600);


            Stage stage = (Stage) Multiple.getScene().getWindow();


            stage.setScene(root);
            stage.show();

        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
