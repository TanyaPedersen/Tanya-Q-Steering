import java.io.IOException;

import agents.*;
import env.*;
import experiments.*;


public class MORL_Glue_Driver
{

	public static void main(String[] args) 
	{
				
	    //launch MORLGlue
		//local path must be changed in Call_MORL_Glue.java before use
		//Call_MORL_Glue.runMorlGlue();
		
		
	   // launch agent in its own thread
		new Thread(){
	          public void run(){
	            System.out.println("Started agent thread");
	            //WSteeringTabularNonEpisodic.main(null);
	            QSteeringTabularNonEpisodic.main(null);
	            //WSteeringTabularEpisodic.main(null);
	            //QSteeringTabularEpisodic.main(null);
	            //WSAgent.main(null);
	            //WSNoveltyAgent.main(null);
	            //QLearningAgentRichard.main(null);
	            //UserControlledAgent.main(null);
	            //TLO_Agent.main(null);
	            //TLO_EOVF_Agent.main(null);
	          }
	        }.start();
 	   // launch environment in its own thread
		new Thread(){
	          public void run(){
	            System.out.println("Started envt thread");
	            //DeepSeaTreasureEnv.main(null);
	            //DeepSeaTreasureMixed.main(null);
	            //LinkedRings.main(null);
	            NonRecurrentRings.main(null);
	            //MOMountainCarDiscretised.main(null);
	            //ResourceGatheringEpisodic.main(null);
	            //BonusWorld.main(null);
	            //SpaceExploration.main(null);
	          }
	        }.start();
 	   // launch experiment in its own thread
		new Thread(){
	          public void run(){
	            System.out.println("Started experiment thread");
	            //DebuggingExperiment.main(null);
	            //ExplorationExperiment.main(null);
	            //HypervolumeExperiment.main(null);
	            SteeringExperiment.main(null);
	            //SteeringExperimentWithTargetChange.main(null);
	            //TLOExplorationExperiment.main(null);
	          }
	        }.start();
	        

	        
	}

}
