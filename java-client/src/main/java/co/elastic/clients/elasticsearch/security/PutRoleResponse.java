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

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.put_role.Response
public final class PutRoleResponse implements ToJsonp {
	private final CreatedStatus role;

	// ---------------------------------------------------------------------------------------------

	protected PutRoleResponse(Builder builder) {

		this.role = Objects.requireNonNull(builder.role, "role");

	}

	/**
	 * API name: {@code role}
	 */
	public CreatedStatus role() {
		return this.role;
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

		generator.writeKey("role");
		this.role.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutRoleResponse}.
	 */
	public static class Builder implements ObjectBuilder<PutRoleResponse> {
		private CreatedStatus role;

		/**
		 * API name: {@code role}
		 */
		public Builder role(CreatedStatus value) {
			this.role = value;
			return this;
		}

		/**
		 * API name: {@code role}
		 */
		public Builder role(Function<CreatedStatus.Builder, ObjectBuilder<CreatedStatus>> fn) {
			return this.role(fn.apply(new CreatedStatus.Builder()).build());
		}

		/**
		 * Builds a {@link PutRoleResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutRoleResponse build() {

			return new PutRoleResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for PutRoleResponse
	 */
	public static final JsonpValueParser<PutRoleResponse> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, PutRoleResponse::setupPutRoleResponseParser);

	protected static void setupPutRoleResponseParser(DelegatingJsonpValueParser<PutRoleResponse.Builder> op) {

		op.add(Builder::role, CreatedStatus.JSONP_PARSER, "role");

	}

}
