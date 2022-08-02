import java.util;

public class Programa{

public static void main (String[] args){
    String Parentesissi="Esto esta bien () ()";
    String Parentesisno="Esto esta mal (()((())())";
    System.out.println(new App().Programa(Parentesissi));
    System.out.println(Parentesisno);
}

public String Programa (String palabra){

    String respuesta;
    Stack pila= new stack(); int i = 0;
    while (i<palabra.length())
    {

        char index=palabra.chartAt(i);

        if(index=='(')
        {
            pila.push('(');
        }       


        else 

        if (index==')'&& pila.size()==1)

        {
            pila.remove(0);
        }


        if(pila.empy()){pila.pop();
        
        }

        i++;    
    }

    if(pila.size()>=1){
        respuesta= "No esta bien los parentesis";
    }else{
        respuesta= "Están bien los parentesis";
    }
    return respuesta;
}
}




