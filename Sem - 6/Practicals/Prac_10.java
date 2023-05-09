import java.awt.*;
import java.awt.event.*;

public class Prac_10  extends Frame implements ActionListener{

    Label lbl1 = new Label("Item Clicked.");
    MenuBar mb = new MenuBar();
    Menu file = new Menu("File");
    Menu edit = new Menu("Edit");
    Menu view = new Menu("View");
    Menu format = new Menu("Format");
    Menu help = new Menu("Help");
    Menu zoom = new Menu("Zoom");
    CheckboxMenuItem ch1 = new CheckboxMenuItem("Status bar");
    

    Prac_10(){

        lbl1.setAlignment(Label.CENTER);
        lbl1.setVisible(true);
        add(lbl1);

        MenuItem[] fileMenuItems = {
            new MenuItem("New"),
            new MenuItem("New Window"),
            new MenuItem("Open"),
            new MenuItem("Save"),
            new MenuItem("Save as"),
            new MenuItem("Page setup"),
            new MenuItem("Print"),
            new MenuItem("Exit")};
        MenuItem[] EditMenuItems = {
            new MenuItem("Undo"),
            new MenuItem("Cut"),
            new MenuItem("Copy"),
            new MenuItem("Paste"),
            new MenuItem("Delete"),
            new MenuItem("Search with Bing"),
            new MenuItem("Find"),
            new MenuItem("Find Next"),
            new MenuItem("Find Previous"),
            new MenuItem("Replace"),
            new MenuItem("Go To"),
            new MenuItem("Select All"),
            new MenuItem("Time/Date")        
        };
        MenuItem[] Formatmenuitems= {
            new MenuItem("Word wrap"),
            new MenuItem("Font")
        };       
        MenuItem[] Helpmenuitems= {
            new MenuItem("View help"),
            new MenuItem("Send Feedback"),
            new MenuItem("About Notepad")
        };
        MenuItem[] Zoommenuitems={new MenuItem("Zoom in"), new MenuItem("Zoom out")};
        for(MenuItem item : Zoommenuitems){
            zoom.add(item);
            item.addActionListener(this);
        }
        for(MenuItem item : fileMenuItems){
            file.add(item);
            item.addActionListener(this);
        }
        for(MenuItem item : EditMenuItems){
            edit.add(item);
            item.addActionListener(this);
        }
        for(MenuItem item : Formatmenuitems){
            format.add(item);
            item.addActionListener(this);
        }
        for(MenuItem item : Helpmenuitems){
            help.add(item);
            item.addActionListener(this);
        }
        view.add(zoom);
        view.add(ch1);
        Menu[] menus = {file,edit,view,format,help};
        for(Menu m1 : menus){mb.add(m1);}
        setMenuBar(mb);
        setSize(500,500);
        setVisible(true);        
        setLayout(null);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });


    }
    public static void main(String args[]) {
        new Prac_10();
    }

    public void actionPerformed(ActionEvent e){
        lbl1.setText(((MenuItem) e.getSource()).getLabel());    
    }
}