package cn.likaihz.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Li Kai
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdUnitDistrictRequest {

    private List<UnitDistrict> unitDistricts;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UnitDistrict {

        private Long unitId;
        private String province;
        private String city;
    }
}
