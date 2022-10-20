package org.example.SpEL.evaluation;

import lombok.Data;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

@Data
public class Run {

    String name;
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression("'negocios'");
        String result = (String) exp.getValue();
        System.out.println(result);

        exp = parser.parseExpression("'Strig'.bytes");
        byte[] resut = (byte[]) exp.getValue();
        System.out.println(resut);

        //uso de metodos
        exp = parser.parseExpression("'negocios'.concat('12')");
        result = (String) exp.getValue();
        System.out.println(result);

        //recuperar propiedad frente a un objeto
        Run objet = new Run();
        objet.name = "custom";
        exp = parser.parseExpression("name");
        result = (String)exp.getValue(objet);
        System.out.println(result);
    }
}
