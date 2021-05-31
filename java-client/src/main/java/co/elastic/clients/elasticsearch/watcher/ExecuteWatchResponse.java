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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.elasticsearch.watcher.execute_watch.WatchRecord;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher.execute_watch.Response
public final class ExecuteWatchResponse implements ToJsonp {
	private final String _id;

	private final WatchRecord watchRecord;

	// ---------------------------------------------------------------------------------------------

	protected ExecuteWatchResponse(Builder builder) {

		this._id = Objects.requireNonNull(builder._id, "_id");
		this.watchRecord = Objects.requireNonNull(builder.watchRecord, "watch_record");

	}

	/**
	 * API name: {@code _id}
	 */
	public String _id() {
		return this._id;
	}

	/**
	 * API name: {@code watch_record}
	 */
	public WatchRecord watchRecord() {
		return this.watchRecord;
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

		generator.writeKey("_id");
		generator.write(this._id);

		generator.writeKey("watch_record");
		this.watchRecord.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExecuteWatchResponse}.
	 */
	public static class Builder implements ObjectBuilder<ExecuteWatchResponse> {
		private String _id;

		private WatchRecord watchRecord;

		/**
		 * API name: {@code _id}
		 */
		public Builder _id(String value) {
			this._id = value;
			return this;
		}

		/**
		 * API name: {@code watch_record}
		 */
		public Builder watchRecord(WatchRecord value) {
			this.watchRecord = value;
			return this;
		}

		/**
		 * API name: {@code watch_record}
		 */
		public Builder watchRecord(Function<WatchRecord.Builder, ObjectBuilder<WatchRecord>> fn) {
			return this.watchRecord(fn.apply(new WatchRecord.Builder()).build());
		}

		/**
		 * Builds a {@link ExecuteWatchResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExecuteWatchResponse build() {

			return new ExecuteWatchResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for ExecuteWatchResponse
	 */
	public static final JsonpValueParser<ExecuteWatchResponse> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, ExecuteWatchResponse::setupExecuteWatchResponseParser);

	protected static void setupExecuteWatchResponseParser(DelegatingJsonpValueParser<ExecuteWatchResponse.Builder> op) {

		op.add(Builder::_id, JsonpValueParser.stringParser(), "_id");
		op.add(Builder::watchRecord, WatchRecord.JSONP_PARSER, "watch_record");

	}

}
