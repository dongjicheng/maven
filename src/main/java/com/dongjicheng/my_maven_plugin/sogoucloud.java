package com.dongjicheng.my_maven_plugin;

import java.util.List;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.plugins.annotations.LifecyclePhase;

@Mojo(name="sogoucloud",defaultPhase= LifecyclePhase.PACKAGE)
public class sogoucloud extends AbstractMojo{
	
	@Parameter
	private String msg;
	
	@Parameter
	private List<String> options;
	
	@Parameter
	private String args;
	
	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		System.out.println("hello sogoucloud:" + msg);
		System.out.println("hello sogoucloud:" + options);
		System.out.println("hello sogoucloud:" + args);
	}
}
