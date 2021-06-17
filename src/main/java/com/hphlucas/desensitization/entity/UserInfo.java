package com.hphlucas.desensitization.entity;

import com.hphlucas.desensitization.annotation.Sensitive;
import com.hphlucas.desensitization.enums.SensitiveTypeEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInfo {

    @Sensitive(type = SensitiveTypeEnum.NAME)
    private String name;

    @Sensitive(type = SensitiveTypeEnum.ID_NUM)
    private String idNum;

    @Sensitive(type = SensitiveTypeEnum.PHONE_NUM)
    private String phone;

    @Sensitive(type = SensitiveTypeEnum.CUSTOMER, prefixNoMaskLen = 3, suffixNoMaskLen = 2, symbol = "#")
    private String address;

    @Sensitive(prefixNoMaskLen = 1, suffixNoMaskLen = 2, symbol = "*")
    private String password;
}
