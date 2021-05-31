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

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml._types.DatafeedTimingStats
public final class DatafeedTimingStats implements ToJsonp {
	private final Number bucketCount;

	private final Number exponentialAverageSearchTimePerHourMs;

	private final String jobId;

	private final Number searchCount;

	private final Number totalSearchTimeMs;

	// ---------------------------------------------------------------------------------------------

	protected DatafeedTimingStats(Builder builder) {

		this.bucketCount = Objects.requireNonNull(builder.bucketCount, "bucket_count");
		this.exponentialAverageSearchTimePerHourMs = Objects.requireNonNull(
				builder.exponentialAverageSearchTimePerHourMs, "exponential_average_search_time_per_hour_ms");
		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.searchCount = Objects.requireNonNull(builder.searchCount, "search_count");
		this.totalSearchTimeMs = Objects.requireNonNull(builder.totalSearchTimeMs, "total_search_time_ms");

	}

	/**
	 * API name: {@code bucket_count}
	 */
	public Number bucketCount() {
		return this.bucketCount;
	}

	/**
	 * API name: {@code exponential_average_search_time_per_hour_ms}
	 */
	public Number exponentialAverageSearchTimePerHourMs() {
		return this.exponentialAverageSearchTimePerHourMs;
	}

	/**
	 * API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
	}

	/**
	 * API name: {@code search_count}
	 */
	public Number searchCount() {
		return this.searchCount;
	}

	/**
	 * API name: {@code total_search_time_ms}
	 */
	public Number totalSearchTimeMs() {
		return this.totalSearchTimeMs;
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

		generator.writeKey("bucket_count");
		generator.write(this.bucketCount.doubleValue());

		generator.writeKey("exponential_average_search_time_per_hour_ms");
		generator.write(this.exponentialAverageSearchTimePerHourMs.doubleValue());

		generator.writeKey("job_id");
		generator.write(this.jobId);

		generator.writeKey("search_count");
		generator.write(this.searchCount.doubleValue());

		generator.writeKey("total_search_time_ms");
		generator.write(this.totalSearchTimeMs.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DatafeedTimingStats}.
	 */
	public static class Builder implements ObjectBuilder<DatafeedTimingStats> {
		private Number bucketCount;

		private Number exponentialAverageSearchTimePerHourMs;

		private String jobId;

		private Number searchCount;

		private Number totalSearchTimeMs;

		/**
		 * API name: {@code bucket_count}
		 */
		public Builder bucketCount(Number value) {
			this.bucketCount = value;
			return this;
		}

		/**
		 * API name: {@code exponential_average_search_time_per_hour_ms}
		 */
		public Builder exponentialAverageSearchTimePerHourMs(Number value) {
			this.exponentialAverageSearchTimePerHourMs = value;
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
		 * API name: {@code search_count}
		 */
		public Builder searchCount(Number value) {
			this.searchCount = value;
			return this;
		}

		/**
		 * API name: {@code total_search_time_ms}
		 */
		public Builder totalSearchTimeMs(Number value) {
			this.totalSearchTimeMs = value;
			return this;
		}

		/**
		 * Builds a {@link DatafeedTimingStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DatafeedTimingStats build() {

			return new DatafeedTimingStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for DatafeedTimingStats
	 */
	public static final JsonpValueParser<DatafeedTimingStats> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, DatafeedTimingStats::setupDatafeedTimingStatsParser);

	protected static void setupDatafeedTimingStatsParser(DelegatingJsonpValueParser<DatafeedTimingStats.Builder> op) {

		op.add(Builder::bucketCount, JsonpValueParser.numberParser(), "bucket_count");
		op.add(Builder::exponentialAverageSearchTimePerHourMs, JsonpValueParser.numberParser(),
				"exponential_average_search_time_per_hour_ms");
		op.add(Builder::jobId, JsonpValueParser.stringParser(), "job_id");
		op.add(Builder::searchCount, JsonpValueParser.numberParser(), "search_count");
		op.add(Builder::totalSearchTimeMs, JsonpValueParser.numberParser(), "total_search_time_ms");

	}

}
