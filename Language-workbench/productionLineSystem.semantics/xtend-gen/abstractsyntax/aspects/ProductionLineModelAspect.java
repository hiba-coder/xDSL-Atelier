package abstractsyntax.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import productionlinesystem.abstractsyntax.Container;
import productionlinesystem.abstractsyntax.Conveyor;
import productionlinesystem.abstractsyntax.Machine;
import productionlinesystem.abstractsyntax.Part;
import productionlinesystem.abstractsyntax.ProductionLineElement;
import productionlinesystem.abstractsyntax.ProductionLineModel;
import productionlinesystem.abstractsyntax.impl.ContainerImpl;
import productionlinesystem.abstractsyntax.runtimestate.ContainerState;
import productionlinesystem.abstractsyntax.runtimestate.runtimestateFactory;

@Aspect(className = ProductionLineModel.class)
@SuppressWarnings("all")
public class ProductionLineModelAspect {
  @InitializeModel
  @Step
  public static void initialize(final ProductionLineModel _self, final EList<String> args) {
    final abstractsyntax.aspects.ProductionLineModelAspectProductionLineModelAspectProperties _self_ = abstractsyntax.aspects.ProductionLineModelAspectProductionLineModelAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void initialize(EList<String>)
    if (_self instanceof productionlinesystem.abstractsyntax.ProductionLineModel){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			abstractsyntax.aspects.ProductionLineModelAspect._privk3_initialize(_self_, (productionlinesystem.abstractsyntax.ProductionLineModel)_self,args);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {args}, command, "ProductionLineModel", "initialize");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  @Main
  @Step
  public static void main(final ProductionLineModel _self) {
    final abstractsyntax.aspects.ProductionLineModelAspectProductionLineModelAspectProperties _self_ = abstractsyntax.aspects.ProductionLineModelAspectProductionLineModelAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void main()
    if (_self instanceof productionlinesystem.abstractsyntax.ProductionLineModel){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			abstractsyntax.aspects.ProductionLineModelAspect._privk3_main(_self_, (productionlinesystem.abstractsyntax.ProductionLineModel)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "ProductionLineModel", "main");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_initialize(final ProductionLineModelAspectProductionLineModelAspectProperties _self_, final ProductionLineModel _self, final EList<String> args) {
    InputOutput.<String>println("start initialisation...\n\n");
    _self.setSimulationstate(runtimestateFactory.eINSTANCE.createSimulationState());
    final Function1<ProductionLineElement, Boolean> _function = (ProductionLineElement e) -> {
      return Boolean.valueOf((e instanceof Container));
    };
    Iterable<ProductionLineElement> _filter = IterableExtensions.<ProductionLineElement>filter(_self.getElements(), _function);
    for (final ProductionLineElement container : _filter) {
      {
        final ContainerState containerState = runtimestateFactory.eINSTANCE.createContainerState();
        containerState.setProductionlineelement(container);
        ProductionLineElement _productionlineelement = containerState.getProductionlineelement();
        EObjectContainmentEList<Part> _eObjectContainmentEList = new EObjectContainmentEList<Part>(Part.class, ((ContainerImpl) container), 88);
        ContainerAspect.currentParts(((Container) _productionlineelement), _eObjectContainmentEList);
        _self.getSimulationstate().getElementsState().add(containerState);
      }
    }
    final Function1<ProductionLineElement, Boolean> _function_1 = (ProductionLineElement e) -> {
      return Boolean.valueOf((e instanceof Machine));
    };
    Iterable<ProductionLineElement> _filter_1 = IterableExtensions.<ProductionLineElement>filter(_self.getElements(), _function_1);
    for (final ProductionLineElement machine : _filter_1) {
      MachineAspect.start(((Machine) machine));
    }
    InputOutput.<String>println("\n\n");
    InputOutput.<String>println("end initialisation");
    return;
  }
  
  protected static void _privk3_main(final ProductionLineModelAspectProductionLineModelAspectProperties _self_, final ProductionLineModel _self) {
    InputOutput.<String>println("Starting the execution\n\n");
    while (IterableExtensions.<ProductionLineElement>exists(IterableExtensions.<ProductionLineElement>filter(_self.getElements(), ((Function1<ProductionLineElement, Boolean>) (ProductionLineElement e) -> {
      return Boolean.valueOf((e instanceof Container));
    })), ((Function1<ProductionLineElement, Boolean>) (ProductionLineElement c) -> {
      int _size = ContainerAspect.currentParts(((Container) c)).size();
      return Boolean.valueOf((_size != 0));
    }))) {
      {
        final Function1<ProductionLineElement, Boolean> _function = (ProductionLineElement e) -> {
          return Boolean.valueOf((e instanceof Machine));
        };
        Iterable<ProductionLineElement> _filter = IterableExtensions.<ProductionLineElement>filter(_self.getElements(), _function);
        for (final ProductionLineElement machine : _filter) {
          MachineAspect.start(((Machine) machine));
        }
        final Function1<ProductionLineElement, Boolean> _function_1 = (ProductionLineElement e) -> {
          return Boolean.valueOf((e instanceof Conveyor));
        };
        Iterable<ProductionLineElement> _filter_1 = IterableExtensions.<ProductionLineElement>filter(_self.getElements(), _function_1);
        for (final ProductionLineElement container : _filter_1) {
          int _size = ContainerAspect.currentParts(((Container) container)).size();
          boolean _tripleNotEquals = (_size != 0);
          if (_tripleNotEquals) {
            ConveyorAspect.moveAlong(((Conveyor) container));
          }
        }
      }
    }
    InputOutput.<String>println("\n\n");
    InputOutput.<String>println("Ending the execution");
  }
}
