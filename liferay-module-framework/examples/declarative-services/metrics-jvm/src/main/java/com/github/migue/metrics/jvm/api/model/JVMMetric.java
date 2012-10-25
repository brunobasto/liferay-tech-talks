package com.github.migue.metrics.jvm.api.model;

import com.github.migue.metrics.api.model.Metric;


/**
 * Domain model representing the JVM metrics of our system.
 * 
 * @author migue
 * 
 */
public class JVMMetric extends Metric {

	@Override
	public String name() {
		return "[JVM-Metric]";
	}

	public String toString() {
		StringBuffer sb = new StringBuffer(4);
		
		sb.append("Metric: " + name() + "\n");
		sb.append("Current time: " + System.currentTimeMillis() + "\n");
		sb.append("Max memory: " +  Runtime.getRuntime().maxMemory() + "\n");
		sb.append(
			"Available processors: " +  
				Runtime.getRuntime().availableProcessors() + "\n");

		return sb.toString();
	}
}
