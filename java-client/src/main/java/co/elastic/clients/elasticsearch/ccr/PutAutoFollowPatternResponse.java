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

package co.elastic.clients.elasticsearch.ccr;

import co.elastic.clients.elasticsearch._types.AcknowledgedResponseBase;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;

// typedef: ccr.put_auto_follow_pattern.Response
public final class PutAutoFollowPatternResponse extends AcknowledgedResponseBase {
	// ---------------------------------------------------------------------------------------------

	protected PutAutoFollowPatternResponse(Builder builder) {
		super(builder);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutAutoFollowPatternResponse}.
	 */
	public static class Builder extends AcknowledgedResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutAutoFollowPatternResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutAutoFollowPatternResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutAutoFollowPatternResponse build() {

			return new PutAutoFollowPatternResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for PutAutoFollowPatternResponse
	 */
	public static final JsonpValueParser<PutAutoFollowPatternResponse> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, PutAutoFollowPatternResponse::setupPutAutoFollowPatternResponseParser);

	protected static void setupPutAutoFollowPatternResponseParser(
			DelegatingJsonpValueParser<PutAutoFollowPatternResponse.Builder> op) {
		AcknowledgedResponseBase.setupAcknowledgedResponseBaseParser(op);

	}

}
