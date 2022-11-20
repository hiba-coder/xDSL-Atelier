package abstractsyntax.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import productionlinesystem.abstractsyntax.Generator;

@Aspect(className = Generator.class)
@SuppressWarnings("all")
public abstract class GeneratorAspect extends MachineAspect {
}
