package com.consistency.remote;

import cn.hutool.json.JSONUtil;
import com.consistency.common.CommonRes;
import com.consistency.remote.message.FollowerToLeaderHeartbeatRequest;
import com.consistency.remote.message.FollowerToLeaderHeartbeatResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * leader节点提供的接口
 *
 * @author xiayang
 **/
@Slf4j
@RestController
@RequestMapping("/leader")
public class LeaderController {

    @PostMapping("/heartbeat")
    public CommonRes<?> followerHeartbeat(@RequestBody FollowerToLeaderHeartbeatRequest followerToLeaderHeartbeatRequest) {
        log.info("leader收到心跳请求 {}", JSONUtil.toJsonStr(followerToLeaderHeartbeatRequest));

        return CommonRes.success(createFollowerHeartbeatResponse());
    }

    private FollowerToLeaderHeartbeatResponse createFollowerHeartbeatResponse() {
        return FollowerToLeaderHeartbeatResponse
                .builder()
                .success(true)
                .replyTimestamp(System.currentTimeMillis())
                .build();
    }


}
