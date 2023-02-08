package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);

    }

    @Override
    public void start(Stage stage) throws Exception {
        // create the x and y axes that the chart is going to use
        NumberAxis xAxis = new NumberAxis(2006, 2018, 2);
        NumberAxis yAxis = new NumberAxis(0, 100, 10);

        // set the titles for the axes
        xAxis.setLabel("Year");
        yAxis.setLabel("Rranking");

        // create the line chart. The values of the chart are given as numbers
        // and it uses the axes we created earlier
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai ranking");

        // create the data set that is going to be added to the line chart
        XYChart.Series rkpData = new XYChart.Series();
        rkpData.setName("UOH");
        // and single points into the data set
        rkpData.getData().add(new XYChart.Data(2007, 73));
        rkpData.getData().add(new XYChart.Data(2008, 68));
        rkpData.getData().add(new XYChart.Data(2009, 72));
        rkpData.getData().add(new XYChart.Data(2010, 72));
        rkpData.getData().add(new XYChart.Data(2011, 74));
        rkpData.getData().add(new XYChart.Data(2012, 73));
        rkpData.getData().add(new XYChart.Data(2013, 76));
        rkpData.getData().add(new XYChart.Data(2014, 73));
        rkpData.getData().add(new XYChart.Data(2015, 67));
        rkpData.getData().add(new XYChart.Data(2016, 56));
        rkpData.getData().add(new XYChart.Data(2017, 56));

        // add the data set to the line chart
        lineChart.getData().add(rkpData);


        // display the line chart
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }

}
