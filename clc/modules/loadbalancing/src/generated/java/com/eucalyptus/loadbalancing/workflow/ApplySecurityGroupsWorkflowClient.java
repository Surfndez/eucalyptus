/*
 * This code was generated by AWS Flow Framework Annotation Processor.
 * Refer to Amazon Simple Workflow Service documentation at http://aws.amazon.com/documentation/swf 
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
 package com.eucalyptus.loadbalancing.workflow;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClient;

/**
 * Generated from {@link com.eucalyptus.loadbalancing.workflow.ApplySecurityGroupsWorkflow}. 
 * Used to invoke child workflows asynchronously from parent workflow code.
 * Created through {@link ApplySecurityGroupsWorkflowClientFactory#getClient}.
 * <p>
 * When running outside of the scope of a workflow use {@link ApplySecurityGroupsWorkflowClientExternal} instead.
 */
public interface ApplySecurityGroupsWorkflowClient extends WorkflowClient
{

    /**
     * Generated from {@link com.eucalyptus.loadbalancing.workflow.ApplySecurityGroupsWorkflow#applySecurityGroups}
     */
    Promise<Void> applySecurityGroups(String accountId, String loadbalancer, java.util.Map<java.lang.String,java.lang.String> groupIdToNameMap);

    /**
     * Generated from {@link com.eucalyptus.loadbalancing.workflow.ApplySecurityGroupsWorkflow#applySecurityGroups}
     */
    Promise<Void> applySecurityGroups(String accountId, String loadbalancer, java.util.Map<java.lang.String,java.lang.String> groupIdToNameMap, Promise<?>... waitFor);

    /**
     * Generated from {@link com.eucalyptus.loadbalancing.workflow.ApplySecurityGroupsWorkflow#applySecurityGroups}
     */
    Promise<Void> applySecurityGroups(String accountId, String loadbalancer, java.util.Map<java.lang.String,java.lang.String> groupIdToNameMap, StartWorkflowOptions optionsOverride, Promise<?>... waitFor);

    /**
     * Generated from {@link com.eucalyptus.loadbalancing.workflow.ApplySecurityGroupsWorkflow#applySecurityGroups}
     */
    Promise<Void> applySecurityGroups(Promise<String> accountId, Promise<String> loadbalancer, Promise<java.util.Map<java.lang.String,java.lang.String>> groupIdToNameMap);

    /**
     * Generated from {@link com.eucalyptus.loadbalancing.workflow.ApplySecurityGroupsWorkflow#applySecurityGroups}
     */
    Promise<Void> applySecurityGroups(Promise<String> accountId, Promise<String> loadbalancer, Promise<java.util.Map<java.lang.String,java.lang.String>> groupIdToNameMap, Promise<?>... waitFor);

    /**
     * Generated from {@link com.eucalyptus.loadbalancing.workflow.ApplySecurityGroupsWorkflow#applySecurityGroups}
     */
    Promise<Void> applySecurityGroups(Promise<String> accountId, Promise<String> loadbalancer, Promise<java.util.Map<java.lang.String,java.lang.String>> groupIdToNameMap, StartWorkflowOptions optionsOverride, Promise<?>... waitFor);

}