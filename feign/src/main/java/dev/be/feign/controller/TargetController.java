package dev.be.feign.controller;


import dev.be.feign.feign.common.dto.BaseResponseInfo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/target_server")
public class TargetController {

    @GetMapping("/get")
    public BaseResponseInfo get(@RequestHeader("CustomHeaderName") String header,
                                @RequestParam("name") String name,
                                @RequestParam("age") Long age) {
        return BaseResponseInfo.builder().
                header(header).
                name(name + "from target server").
                age(age).
                build();
    }


    @PostMapping("/post")
    public BaseResponseInfo post(@RequestHeader("CustomHeaderName") String header,
                                @RequestBody BaseResponseInfo baseResponseInfo){
        return BaseResponseInfo.builder()
                .header(header)
                .name(baseResponseInfo.getName() + "from target server")
                .age(baseResponseInfo.getAge())
                .build();
    }
}
