package org.example.AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Designadores de punto de corte PCD
 *
 * execution: Para unir puntos de ejecución de métodos coincidentes. Este es el designador de corte de punto principal que se usa cuando se trabaja con Spring AOP.
 * within: limita la coincidencia para unir puntos dentro de ciertos tipos (la ejecución de un método declarado dentro de un tipo de coincidencia cuando se usa Spring AOP).
 * this: Limita la coincidencia con los puntos de unión (la ejecución de métodos cuando se usa Spring AOP) donde la referencia del bean (proxy Spring AOP) es una instancia del tipo dado.
 * target: Limita la coincidencia con los puntos de unión (la ejecución de métodos cuando se usa Spring AOP) donde el objeto de destino (objeto de aplicación que se envía por proxy) es una instancia del tipo dado.
 * args: Limita la coincidencia con los puntos de unión (la ejecución de métodos cuando se usa Spring AOP) donde los argumentos son instancias de los tipos dados.
 * bean. Este PCD le permite limitar la coincidencia de puntos de unión a un bean Spring con nombre en particular o a un conjunto de beans Spring con nombre (cuando se usan comodines)
 * @target: limita la coincidencia con los puntos de unión (la ejecución de métodos cuando se usa Spring AOP) donde la clase del objeto en ejecución tiene una anotación del tipo dado.
 * @args: Limita la coincidencia con los puntos de unión (la ejecución de métodos cuando se usa Spring AOP) donde el tipo de tiempo de ejecución de los argumentos reales pasados ​​tiene anotaciones de los tipos dados.
 * @within: limita la coincidencia para unir puntos dentro de tipos que tienen la anotación dada (la ejecución de métodos declarados en tipos con la anotación dada cuando se usa Spring AOP).
 * @annotation: limita la coincidencia con los puntos de unión donde el asunto del punto de unión (el método que se ejecuta en Spring AOP) tiene la anotación dada.
 */
@Aspect @Component
public class MyCustomPointCuts {

    /**
     * execution(modifiers-pattern? ret-type-pattern declaring-type-pattern?name-pattern(param-pattern) throws-pattern?)
     * todas las partes excepto el tipo de retorno, el nombre y parametros son opcionales
     */

    /**
     * Los designadores clasificados seleccionan un tipo particular de punto de unión:
     * execution
     * Los designadores de alcance seleccionan un grupo de puntos de unión de interés (probablemente de muchos tipos):
     * within
     *
     * Los designadores contextuales coinciden (y, opcionalmente, se vinculan) en función del contexto:
     * this, target y @annotation
     *
     * Un pointcut bien escrito debe incluir al menos los dos primeros tipos (clasificados y de alcance).
     * Puede incluir los designadores contextuales para que coincidan según el contexto del punto de unión o
     * vincular ese contexto para usarlo en el consejo.
     */

    @Pointcut("execution(* transfer(..))") // Expresion de punto de corte
    private void anyOldTransfer() {} //Firma de punto de corte

    @Pointcut("execution(public * *(..))")
    public void anyPublicOperation() {}

    @Pointcut("within(org.example.AOP.service.*)")
    private void inService() {}

    @Pointcut("anyPublicOperation() && inService()")
    public void tradingOperation() {}

    /**
     * A join point is in the web layer if the method is defined
     * in a type in the com.xyz.myapp.web package or any sub-package
     * under that.
     */
    @Pointcut("within(org.example.AOP..*)")
    public void inAOPpackage() {}

    /**
     * A join point is in the service layer if the method is defined
     * in a type in the com.xyz.myapp.service package or any sub-package
     * under that.
     */
    @Pointcut("within(com.xyz.myapp.service..*)")
    public void inServiceLayer() {}

    /**
     * A join point is in the data access layer if the method is defined
     * in a type in the com.xyz.myapp.dao package or any sub-package
     * under that.
     */
    @Pointcut("within(com.xyz.myapp.dao..*)")
    public void inDataAccessLayer() {}

    /**
     * A business service is the execution of any method defined on a service
     * interface. This definition assumes that interfaces are placed in the
     * "service" package, and that implementation types are in sub-packages.
     *
     * If you group service interfaces by functional area (for example,
     * in packages com.xyz.myapp.abc.service and com.xyz.myapp.def.service) then
     * the pointcut expression "execution(* com.xyz.myapp..service.*.*(..))"
     * could be used instead.
     *
     * Alternatively, you can write the expression using the 'bean'
     * PCD, like so "bean(*Service)". (This assumes that you have
     * named your Spring service beans in a consistent fashion.)
     */
    @Pointcut("execution(* com.xyz.myapp..service.*.*(..))")
    public void businessService() {}

    /**
     * A data access operation is the execution of any method defined on a
     * dao interface. This definition assumes that interfaces are placed in the
     * "dao" package, and that implementation types are in sub-packages.
     */
    @Pointcut("execution(* com.xyz.myapp.dao.*.*(..))")
    public void dataAccessOperation() {}
}
