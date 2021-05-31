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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml.delete_calendar_job.Request
public final class DeleteCalendarJobRequest extends RequestBase {
	private final String calendarId;

	private final String jobId;

	// ---------------------------------------------------------------------------------------------

	protected DeleteCalendarJobRequest(Builder builder) {

		this.calendarId = Objects.requireNonNull(builder.calendarId, "calendar_id");
		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");

	}

	/**
	 * API name: {@code calendar_id}
	 */
	public String calendarId() {
		return this.calendarId;
	}

	/**
	 * API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteCalendarJobRequest}.
	 */
	public static class Builder implements ObjectBuilder<DeleteCalendarJobRequest> {
		private String calendarId;

		private String jobId;

		/**
		 * API name: {@code calendar_id}
		 */
		public Builder calendarId(String value) {
			this.calendarId = value;
			return this;
		}

		/**
		 * API name: {@code job_id}
		 */
		public Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * Builds a {@link DeleteCalendarJobRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteCalendarJobRequest build() {

			return new DeleteCalendarJobRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.delete_calendar_job}".
	 */
	public static final Endpoint<DeleteCalendarJobRequest, DeleteCalendarJobResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> "DELETE",

			// Request path
			request -> {
				StringBuilder buf = new StringBuilder();
				buf.append("/_ml");
				buf.append("/calendars");
				buf.append("/");
				buf.append(request.calendarId);
				buf.append("/jobs");
				buf.append("/");
				buf.append(request.jobId);
				return buf.toString();

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), false, DeleteCalendarJobResponse.JSONP_PARSER);
}
