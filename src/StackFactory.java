public class StackFactory {
    static convertidor a2 = new convertidor();
    public void opc(int opc1){
        String ruta = "C:\\Users\\luisy\\OneDrive\\Escritorio\\a.txt";
        switch (opc1){
            case 1:
                InfixToPostfixConverter inf = new InfixToPostfixConverter("linkedlist");
                ruta = a2.readAndRemoveSpaces(ruta);
                ruta = inf.convertToPostfix(ruta);
                System.out.println(ruta);
        }
    }
}
