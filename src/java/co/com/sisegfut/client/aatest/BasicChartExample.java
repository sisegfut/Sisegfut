/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sisegfut.client.aatest;

import com.extjs.gxt.charts.client.Chart;
import com.extjs.gxt.charts.client.event.ChartEvent;
import com.extjs.gxt.charts.client.event.ChartListener;
import com.extjs.gxt.charts.client.model.ChartModel;
import com.extjs.gxt.charts.client.model.Legend;
import com.extjs.gxt.charts.client.model.Legend.Position;
import com.extjs.gxt.charts.client.model.charts.PieChart;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.Info;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.layout.FitLayout;
import com.extjs.gxt.ui.client.widget.layout.MarginData;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.Window;

/**
 *
 * @author fhurtado
 */
public class BasicChartExample extends LayoutContainer {  
  
  
  private ChartListener listener = new ChartListener() {  
      
    public void chartClick(ChartEvent ce) {  
      Info.display("Chart Clicked", "You selected {0}.", "" + ce.getValue());  
    }  
  };  
  
      public static boolean isExplorer() {
        String test = Window.Location.getPath();
        if (test.indexOf("pages") != -1) {
            return false;
        }
        return true;
    }
    
  @Override  
  protected void onRender(Element parent, int index) {  
    super.onRender(parent, index);  
    ContentPanel cp = new ContentPanel();  
    cp.setHeading("Pie chart");  
    cp.setFrame(true);  
    cp.setSize(400, 400);  
    cp.setLayout(new FitLayout());  
      
    
//    
    String url = !isExplorer() ? "../../" : "";    
    url += "resources/chart/open-flash-chart.swf"; 
      
    final Chart chart = new Chart(url);  
    chart.setBorders(true);  
    chart.setChartModel(getPieChartData());  
      
    cp.add(chart);      
  
    add(cp, new MarginData(20));  
  }  
  
  private ChartModel getPieChartData() {  
    ChartModel cm = new ChartModel("Sales by Region",  
        "font-size: 14px; font-family: Verdana; text-align: center;");  
    cm.setBackgroundColour("#fffff5");  
    Legend lg = new Legend(Position.RIGHT, true);  
    lg.setPadding(10);  
    cm.setLegend(lg);  
      
    PieChart pie = new PieChart();  
    pie.setAlpha(0.5f);  
    pie.setNoLabels(true);  
    pie.setTooltip("#label# $#val#M<br>#percent#");  
    pie.setColours("#ff0000", "#00aa00", "#0000ff", "#ff9900", "#ff00ff");  
    pie.addSlices(new PieChart.Slice(100, "AU","Australia"));  
    pie.addSlices(new PieChart.Slice(200, "US", "USA"));  
    pie.addSlices(new PieChart.Slice(150, "JP", "Japan"));  
    pie.addSlices(new PieChart.Slice(120, "DE", "Germany"));  
    pie.addSlices(new PieChart.Slice(60, "UK", "United Kingdom"));  
    pie.addChartListener(listener);  
  
    cm.addChartConfig(pie);  
    return cm;  
  }  
}  
