/**
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
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.raft.server.protocol;

public class RequestVoteReply extends RaftServerReply {
  private final boolean shouldShutdown;

  public RequestVoteReply(String requestorId, String replierId,
      long term, boolean success, boolean shouldShutdown) {
    super(requestorId, replierId, term, success);
    this.shouldShutdown = shouldShutdown;
  }

  public boolean shouldShutdown() {
    return this.shouldShutdown;
  }

  @Override
  public String toString() {
    return super.toString() + ", shouldShutdown=" + shouldShutdown;
  }
}
