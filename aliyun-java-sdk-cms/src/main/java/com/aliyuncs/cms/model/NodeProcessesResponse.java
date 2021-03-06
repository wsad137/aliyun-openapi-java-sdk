/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cms.model;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.NodeProcessesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version
 */
public class NodeProcessesResponse extends AcsResponse {

	private Integer errorCode;

	private String errorMessage;

	private Boolean success;

	private String requestId;

	private List<NodeProcess> nodeProcesses;

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<NodeProcess> getNodeProcesses() {
		return this.nodeProcesses;
	}

	public void setNodeProcesses(List<NodeProcess> nodeProcesses) {
		this.nodeProcesses = nodeProcesses;
	}

	public static class NodeProcess {

		private Long id;

		private String name;

		private String instanceId;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		@Override
		public String toString() {
			return "NodeProcess [id=" + id + ", name=" + name + ", instanceId=" + instanceId + "]";
		}

	}

	@Override
	public NodeProcessesResponse getInstance(UnmarshallerContext context) {
		return NodeProcessesResponseUnmarshaller.unmarshall(this, context);
	}
}
