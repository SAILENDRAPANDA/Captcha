package com.utill;

import net.rcarz.jiraclient.BasicCredentials;
import net.rcarz.jiraclient.JiraClient;
import net.rcarz.jiraclient.JiraException;
import net.rcarz.jiraclient.Component.FluentCreate;
import net.rcarz.jiraclient.Field;
import net.rcarz.jiraclient.Issue;

public class JiraServiceProvider {

	public JiraClient jira;
	public String project;
	
	public JiraServiceProvider(String jiraurl,String username , String password, String project) {
		
		BasicCredentials cred=new BasicCredentials(username, password);
		jira=new JiraClient(jiraurl, cred);
		this.project=project;
		
	}
	
	public void createJiraTicket(String issueType ,String summary , String des, String reporterName) {
		try {
			net.rcarz.jiraclient.Issue.FluentCreate fl=jira.createIssue(project, issueType);
		fl.field(Field.SUMMARY,summary);
		fl.field(Field.DESCRIPTION,des);
		
		Issue newIssue=fl.execute();
		System.out.println("new issue created "+newIssue);
		
		
		} catch (JiraException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
