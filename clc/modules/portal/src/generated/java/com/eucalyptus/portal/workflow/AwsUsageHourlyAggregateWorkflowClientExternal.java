/*
 * This code was generated by AWS Flow Framework Annotation Processor.
 * Refer to Amazon Simple Workflow Service documentation at http://aws.amazon.com/documentation/swf 
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
 package com.eucalyptus.portal.workflow;

import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClientExternal;

/**
 * Generated from {@link com.eucalyptus.portal.workflow.AwsUsageHourlyAggregateWorkflow}. 
 * Used to start workflow executions or send signals from outside of the scope of a workflow.
 * Created through {@link AwsUsageHourlyAggregateWorkflowClientExternalFactory#getClient}.
 * <p>
 * When starting child workflow from a parent workflow use {@link AwsUsageHourlyAggregateWorkflowClient} instead.
 */
public interface AwsUsageHourlyAggregateWorkflowClientExternal extends WorkflowClientExternal
{

    /**
     * Generated from {@link com.eucalyptus.portal.workflow.AwsUsageHourlyAggregateWorkflow#aggregateHourly}
     */
    void aggregateHourly();

    /**
     * Generated from {@link com.eucalyptus.portal.workflow.AwsUsageHourlyAggregateWorkflow#aggregateHourly}
     */
    void aggregateHourly(StartWorkflowOptions optionsOverride);

    /**
     * Generated from {@link com.eucalyptus.portal.workflow.AwsUsageHourlyAggregateWorkflow#getState}
     */
    com.eucalyptus.portal.workflow.BillingWorkflowState getState() ;
}