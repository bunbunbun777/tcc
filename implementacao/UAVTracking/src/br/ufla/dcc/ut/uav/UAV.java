package br.ufla.dcc.ut.uav;

import br.ufla.dcc.grubix.simulator.event.Finalize;
import br.ufla.dcc.grubix.simulator.event.StartSimulation;
import br.ufla.dcc.ut.node.GenericApplicationLayer;
import br.ufla.dcc.ut.statistics.Statistics;
import br.ufla.dcc.ut.uav.wuc.LayPheromoneWakeUpCall;

public class UAV extends GenericApplicationLayer {

	public static boolean isWarned = false;
	
	public void processEvent(StartSimulation start){
		LayPheromoneWakeUpCall wuc = new LayPheromoneWakeUpCall(this.getSender(),100 * Math.random());
		this.sendEventSelf(wuc);
	}
	
	public void processEvent(Finalize finalize) {	
		Statistics.Generate();
	}
}
