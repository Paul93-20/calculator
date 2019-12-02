import javax.swing.*;
//Создаем окно приложения
public class MainApp extends JFrame {
    public MainApp(){
        //указываем размер окна
        setBounds(100, 100, 300, 400);
        //указываем название окна
        setTitle("Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //добавляем панель для размещения кнопок
        add(new JPanelCalc());
        //показываем окно калькулятора
        setVisible(true);
    }
}
