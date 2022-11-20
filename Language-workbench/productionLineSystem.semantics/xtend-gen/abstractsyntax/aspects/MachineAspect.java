package abstractsyntax.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import productionlinesystem.abstractsyntax.Machine;

@Aspect(className = Machine.class)
@SuppressWarnings("all")
public abstract class MachineAspect extends ProductionLineElementAspect {
  @Step
  public static void start(final Machine _self) {
    final abstractsyntax.aspects.MachineAspectMachineAspectProperties _self_ = abstractsyntax.aspects.MachineAspectMachineAspectContext.getSelf(_self);
    	// BeginInjectInto abstractsyntax.aspects.MachineAspect#void start() from abstractsyntax.aspects.AssemblerAspect
    		if (_self instanceof productionlinesystem.abstractsyntax.Assembler){
    			abstractsyntax.aspects.AssemblerAspect.start((productionlinesystem.abstractsyntax.Assembler)_self);
    		} else
    		// EndInjectInto abstractsyntax.aspects.MachineAspect#void start() from abstractsyntax.aspects.AssemblerAspect
    	// BeginInjectInto abstractsyntax.aspects.MachineAspect#void start() from abstractsyntax.aspects.GenHandleAspect
    		if (_self instanceof productionlinesystem.abstractsyntax.GenHandle){
    			abstractsyntax.aspects.GenHandleAspect.start((productionlinesystem.abstractsyntax.GenHandle)_self);
    		} else
    		// EndInjectInto abstractsyntax.aspects.MachineAspect#void start() from abstractsyntax.aspects.GenHandleAspect
    	// BeginInjectInto abstractsyntax.aspects.MachineAspect#void start() from abstractsyntax.aspects.GenHeadAspect
    		if (_self instanceof productionlinesystem.abstractsyntax.GenHead){
    			abstractsyntax.aspects.GenHeadAspect.start((productionlinesystem.abstractsyntax.GenHead)_self);
    		} else
    		// EndInjectInto abstractsyntax.aspects.MachineAspect#void start() from abstractsyntax.aspects.GenHeadAspect
    // #DispatchPointCut_before# void start()
    if (_self instanceof productionlinesystem.abstractsyntax.Machine){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			abstractsyntax.aspects.MachineAspect._privk3_start(_self_, (productionlinesystem.abstractsyntax.Machine)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Machine", "start");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_start(final MachineAspectMachineAspectProperties _self_, final Machine _self) {
  }
}
