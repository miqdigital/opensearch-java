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
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml.flush_job.Request
public final class FlushJobRequest extends RequestBase implements ToJsonp {
	private final String jobId;

	@Nullable
	private final String skipTime;

	@Nullable
	private final String advanceTime;

	@Nullable
	private final Boolean calcInterim;

	@Nullable
	private final String end;

	@Nullable
	private final String start;

	// ---------------------------------------------------------------------------------------------

	protected FlushJobRequest(Builder builder) {

		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.skipTime = builder.skipTime;
		this.advanceTime = builder.advanceTime;
		this.calcInterim = builder.calcInterim;
		this.end = builder.end;
		this.start = builder.start;

	}

	/**
	 * API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
	}

	/**
	 * API name: {@code skip_time}
	 */
	@Nullable
	public String skipTime() {
		return this.skipTime;
	}

	/**
	 * API name: {@code advance_time}
	 */
	@Nullable
	public String advanceTime() {
		return this.advanceTime;
	}

	/**
	 * API name: {@code calc_interim}
	 */
	@Nullable
	public Boolean calcInterim() {
		return this.calcInterim;
	}

	/**
	 * API name: {@code end}
	 */
	@Nullable
	public String end() {
		return this.end;
	}

	/**
	 * API name: {@code start}
	 */
	@Nullable
	public String start() {
		return this.start;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.advanceTime != null) {

			generator.writeKey("advance_time");
			generator.write(this.advanceTime);

		}
		if (this.calcInterim != null) {

			generator.writeKey("calc_interim");
			generator.write(this.calcInterim);

		}
		if (this.end != null) {

			generator.writeKey("end");
			generator.write(this.end);

		}
		if (this.start != null) {

			generator.writeKey("start");
			generator.write(this.start);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FlushJobRequest}.
	 */
	public static class Builder implements ObjectBuilder<FlushJobRequest> {
		private String jobId;

		@Nullable
		private String skipTime;

		@Nullable
		private String advanceTime;

		@Nullable
		private Boolean calcInterim;

		@Nullable
		private String end;

		@Nullable
		private String start;

		/**
		 * API name: {@code job_id}
		 */
		public Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * API name: {@code skip_time}
		 */
		public Builder skipTime(@Nullable String value) {
			this.skipTime = value;
			return this;
		}

		/**
		 * API name: {@code advance_time}
		 */
		public Builder advanceTime(@Nullable String value) {
			this.advanceTime = value;
			return this;
		}

		/**
		 * API name: {@code calc_interim}
		 */
		public Builder calcInterim(@Nullable Boolean value) {
			this.calcInterim = value;
			return this;
		}

		/**
		 * API name: {@code end}
		 */
		public Builder end(@Nullable String value) {
			this.end = value;
			return this;
		}

		/**
		 * API name: {@code start}
		 */
		public Builder start(@Nullable String value) {
			this.start = value;
			return this;
		}

		/**
		 * Builds a {@link FlushJobRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FlushJobRequest build() {

			return new FlushJobRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for FlushJobRequest
	 */
	public static final JsonpValueParser<FlushJobRequest> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, FlushJobRequest::setupFlushJobRequestParser);

	protected static void setupFlushJobRequestParser(DelegatingJsonpValueParser<FlushJobRequest.Builder> op) {

		op.add(Builder::advanceTime, JsonpValueParser.stringParser(), "advance_time");
		op.add(Builder::calcInterim, JsonpValueParser.booleanParser(), "calc_interim");
		op.add(Builder::end, JsonpValueParser.stringParser(), "end");
		op.add(Builder::start, JsonpValueParser.stringParser(), "start");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.flush_job}".
	 */
	public static final Endpoint<FlushJobRequest, FlushJobResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> "POST",

			// Request path
			request -> {
				StringBuilder buf = new StringBuilder();
				buf.append("/_ml");
				buf.append("/anomaly_detectors");
				buf.append("/");
				buf.append(request.jobId);
				buf.append("/_flush");
				return buf.toString();

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.skipTime != null) {
					params.put("skip_time", request.skipTime);
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, FlushJobResponse.JSONP_PARSER);
}
