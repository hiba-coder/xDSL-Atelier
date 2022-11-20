package abstractsyntax.runtimestate.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import productionlinesystem.abstractsyntax.runtimestate.ContainerState;

@Aspect(className = ContainerState.class)
@SuppressWarnings("all")
public class ContainerStateAspect extends ProductionLineElementStateAspect {
}
