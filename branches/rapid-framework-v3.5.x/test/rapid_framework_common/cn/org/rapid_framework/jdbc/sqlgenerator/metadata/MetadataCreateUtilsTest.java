package cn.org.rapid_framework.jdbc.sqlgenerator.metadata;

import java.sql.Ref;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;


public class MetadataCreateUtilsTest {
    @Test
    public void test() {
        Assert.assertTrue(MetadataCreateUtils.isNativeJavaType(int.class));
        Assert.assertTrue(MetadataCreateUtils.isNativeJavaType(Integer.class));
        Assert.assertTrue(MetadataCreateUtils.isNativeJavaType(Date.class));
        Assert.assertTrue(MetadataCreateUtils.isNativeJavaType(Ref.class));
        Assert.assertFalse(MetadataCreateUtils.isNativeJavaType(null));
        Assert.assertFalse(MetadataCreateUtils.isNativeJavaType(AAA.class));
        Assert.assertFalse(MetadataCreateUtils.isNativeJavaType(new Integer[]{}.getClass()));
        Assert.assertFalse(MetadataCreateUtils.isNativeJavaType(new int[]{}.getClass()));
        System.out.println(new Integer[]{}.getClass().getName());
    }
    
    private static class AAA {}
}