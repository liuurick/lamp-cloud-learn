package top.tangyh.lamp.common.cache.common;


import top.tangyh.basic.cache.model.CacheKey;
import top.tangyh.basic.cache.model.CacheKeyBuilder;
import top.tangyh.lamp.common.cache.CacheKeyDefinition;

/**
 * εζ° KEY
 * {tenant}:TOTAL_LOGIN_PV -> long
 * <p>
 * #c_login_log
 *
 * @author zuihou
 * @date 2020/9/20 6:45 δΈε
 */
public class TotalLoginPvCacheKeyBuilder implements CacheKeyBuilder {
    public static CacheKey build() {
        return new TotalLoginPvCacheKeyBuilder().key();
    }

    @Override
    public String getPrefix() {
        return CacheKeyDefinition.TOTAL_LOGIN_PV;
    }
}
