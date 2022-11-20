package abstractsyntax.runtimestate.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import productionlinesystem.abstractsyntax.runtimestate.SimulationState
import productionlinesystem.abstractsyntax.runtimestate.ProductionLineElementState
import productionlinesystem.abstractsyntax.runtimestate.ContainerState


import static extension abstractsyntax.runtimestate.aspects.SimulationStateAspect.*
import static extension abstractsyntax.runtimestate.aspects.ProductionLineElementStateAspect.*
import static extension abstractsyntax.runtimestate.aspects.ContainerStateAspect.*


@Aspect(className=SimulationState)
class SimulationStateAspect {

}

@Aspect(className=ProductionLineElementState)
class ProductionLineElementStateAspect {

}

@Aspect(className=ContainerState)
class ContainerStateAspect extends ProductionLineElementStateAspect {

}





