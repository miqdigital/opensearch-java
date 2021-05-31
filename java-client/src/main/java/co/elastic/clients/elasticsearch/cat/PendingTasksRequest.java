/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Collections;

// typedef: cat.pending_tasks.Request
public final class PendingTasksRequest extends CatRequestBase {
	protected PendingTasksRequest() {
	}

	/**
	 * Singleton instance for {@link PendingTasksRequest}.
	 */
	public static final PendingTasksRequest INSTANCE = new PendingTasksRequest();

	public static final JsonpValueParser<PendingTasksRequest> JSONP_PARSER = JsonpValueParser
			.fixedValue(PendingTasksRequest.INSTANCE);

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.pending_tasks}".
	 */
	public static final Endpoint<PendingTasksRequest, PendingTasksResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> "GET",

			// Request path
			request -> {
				StringBuilder buf = new StringBuilder();
				buf.append("/_cat");
				buf.append("/pending_tasks");
				return buf.toString();

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), false, PendingTasksResponse.JSONP_PARSER);
}
