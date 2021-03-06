/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.aliyuncvc.transform.v20190919;

import com.aliyuncs.aliyuncvc.model.v20190919.QueryUserEvaluationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryUserEvaluationResponseUnmarshaller {

	public static QueryUserEvaluationResponse unmarshall(QueryUserEvaluationResponse queryUserEvaluationResponse, UnmarshallerContext _ctx) {
		
		queryUserEvaluationResponse.setRequestId(_ctx.stringValue("QueryUserEvaluationResponse.RequestId"));
		queryUserEvaluationResponse.setUserEvaluation(_ctx.stringValue("QueryUserEvaluationResponse.UserEvaluation"));
		queryUserEvaluationResponse.setErrorCode(_ctx.integerValue("QueryUserEvaluationResponse.ErrorCode"));
		queryUserEvaluationResponse.setMessage(_ctx.stringValue("QueryUserEvaluationResponse.Message"));
		queryUserEvaluationResponse.setSuccess(_ctx.booleanValue("QueryUserEvaluationResponse.Success"));
	 
	 	return queryUserEvaluationResponse;
	}
}