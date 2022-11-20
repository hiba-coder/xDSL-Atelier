package abstractsyntax.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import productionlinesystem.abstractsyntax.ProductionLineModel
import productionlinesystem.abstractsyntax.ProductionLineElement
import productionlinesystem.abstractsyntax.Container
import productionlinesystem.abstractsyntax.Machine
import productionlinesystem.abstractsyntax.Conveyor
import productionlinesystem.abstractsyntax.Tray
import productionlinesystem.abstractsyntax.Assembler
import productionlinesystem.abstractsyntax.Generator
import productionlinesystem.abstractsyntax.GenHandle
import productionlinesystem.abstractsyntax.GenHead

import static extension abstractsyntax.aspects.ProductionLineModelAspect.*
import static extension abstractsyntax.aspects.ProductionLineElementAspect.*
import static extension abstractsyntax.aspects.ContainerAspect.*
import static extension abstractsyntax.aspects.MachineAspect.*
import static extension abstractsyntax.aspects.ConveyorAspect.*
import static extension abstractsyntax.aspects.TrayAspect.*
import static extension abstractsyntax.aspects.AssemblerAspect.*
import static extension abstractsyntax.aspects.GeneratorAspect.*
import static extension abstractsyntax.aspects.GenHandleAspect.*
import static extension abstractsyntax.aspects.GenHeadAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod
import productionlinesystem.abstractsyntax.AbstractsyntaxFactory
import productionlinesystem.abstractsyntax.runtimestate.runtimestateFactory
import org.eclipse.emf.common.util.EList
import productionlinesystem.abstractsyntax.runtimestate.ContainerState
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import org.eclipse.emf.ecore.util.EObjectContainmentEList
import java.util.ArrayList
import productionlinesystem.abstractsyntax.impl.ContainerImpl
import productionlinesystem.abstractsyntax.Part
import productionlinesystem.abstractsyntax.Handle
import productionlinesystem.abstractsyntax.Head

@Aspect(className=ProductionLineModel)
class ProductionLineModelAspect {
	@InitializeModel
	@Step
	def void initialize(EList<String> args){
		println("start initialisation...\n\n")
		_self.simulationstate = runtimestateFactory.eINSTANCE.createSimulationState
		for (container : _self.elements.filter[e|e instanceof Container]) {
			val containerState = runtimestateFactory.eINSTANCE.createContainerState
			containerState.setProductionlineelement(container)
			(containerState.productionlineelement as Container).currentParts = new EObjectContainmentEList<Part>(Part,container as ContainerImpl,88)
			
			
			_self.simulationstate.elementsState.add(containerState)
		}
		
		for(machine: _self.elements.filter[e|e instanceof Machine]){
				(machine as Machine).start()
		}
		println("\n\n")
		println("end initialisation")
		return
		
	}
	@Main
	@Step
	def void main(){
		println("Starting the execution\n\n")
		
		
		
		while (_self.elements.filter[e|e instanceof Container].exists[c|(c as Container).currentParts.size() !== 0] ){
			for(machine: _self.elements.filter[e|e instanceof Machine]){
				(machine as Machine).start()
			}
			
			
			for (container : _self.elements.filter[e|e instanceof Conveyor]) {
				if((container as Container).currentParts.size() !== 0){
					(container as Conveyor).moveAlong()
				}
			}
		}
			
			
			
			
		println("\n\n")	
		println("Ending the execution")
	}
	
		
	
		
	

}

@Aspect(className=ProductionLineElement)
abstract class ProductionLineElementAspect {
	@Step
	def void work(){}

}

@Aspect(className=Container)
abstract class ContainerAspect extends ProductionLineElementAspect {
	public EObjectContainmentEList<Part> currentParts
	@Step
	def void moveAlong(){}
	
	
}

@Aspect(className=Machine)
abstract class MachineAspect extends ProductionLineElementAspect {
	@Step
	def void start(){}
}

@Aspect(className=Conveyor)
class ConveyorAspect extends ContainerAspect {
	@Step
	@ReplaceAspectMethod 
	@OverrideAspectMethod
	def void moveAlong(){
		if(_self.tray !== null && !_self.currentParts.isEmpty()){
			println("I am in the Conveyor name '"+_self.name+"', i work to transmit the current part to the Tray")
			_self.tray.currentParts.add(_self.currentParts.remove(0))
		}
		else{
			if(!_self.currentParts.isEmpty())
			{
				//println("/**********************************/")
				println("I am in the Conveyor name '"+_self.name+"'")
				println("End of the line")
				println("/**********************************/")
				println("\n\n\n")
				_self.currentParts.remove(0)
			
			}
		}
	}
}

@Aspect(className=Tray)
class TrayAspect extends ContainerAspect {

}

@Aspect(className=Assembler)
class AssemblerAspect extends MachineAspect {
	@Step
	@OverrideAspectMethod
	@ReplaceAspectMethod
	def void start(){
		if(_self.in.currentParts.exists[p|p instanceof Head ] && _self.in.currentParts.exists[p|p instanceof Handle ]){
		println("I am in the Assembler machine name '"+_self.name+"'")
		var anHandle=_self.in.currentParts.filter[e|e instanceof Handle].get(0)
		var aHead=_self.in.currentParts.filter[e|e instanceof Head].get(0)
		
		_self.in.currentParts.remove(anHandle)
		_self.in.currentParts.remove(aHead)
		
		var aHammer = AbstractsyntaxFactory.eINSTANCE.createHammer
		_self.out.currentParts.add(aHammer)
		return
		}
	}
}

@Aspect(className=Generator)
abstract class GeneratorAspect extends MachineAspect {

}

@Aspect(className=GenHandle)
class GenHandleAspect extends GeneratorAspect {
	
	@Step
	@OverrideAspectMethod
	@ReplaceAspectMethod
	def void start(){
		println("I am in the Generator of the  Handle name '"+_self.name+"'")
		var aHandle=AbstractsyntaxFactory.eINSTANCE.createHandle
		_self.out.currentParts.add(aHandle)
		return 
	}

}

@Aspect(className=GenHead)
class GenHeadAspect extends GeneratorAspect {
	@Step
	@OverrideAspectMethod
	@ReplaceAspectMethod
	def void start(){
		println("I am in the Generator of the  Head name '"+_self.name+"'")
		var aHead=AbstractsyntaxFactory.eINSTANCE.createHead
		_self.out.currentParts.add(aHead)
				
		
		return 
	}
}



