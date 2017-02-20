package com.baidu.tts.aop.ttslistener;

import android.text.TextUtils;
import com.baidu.tts.aop.AInterceptor;
import com.baidu.tts.aop.AInterceptorHandler;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.m.h;
import com.baidu.tts.m.i;
import java.lang.reflect.Method;
import java.util.List;

public class ProgressCorrectInterceptor extends AInterceptor
{
  protected Object a(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    paramObject = (h)paramArrayOfObject[0];
    int j;
    int k;
    if (paramObject != null)
    {
      paramMethod = paramObject.e().b();
      if (!TextUtils.isEmpty(paramMethod))
      {
        j = paramMethod.length();
        k = paramObject.c();
        if (k <= j)
          break label109;
      }
    }
    label109: for (int i = k - j; ; i = 0)
    {
      LoggerProxy.d("ProgressCorrectInterceptor", "prefixLength=" + j + "--progress=" + k);
      paramObject = (h)paramObject.y();
      paramObject.c(i);
      paramArrayOfObject[0] = paramObject;
      return AInterceptorHandler.DEFAULT;
    }
  }

  protected void a()
  {
    this.a.add("onSynthesizeDataArrived");
    this.a.add("onPlayProgressUpdate");
  }
}

/* Location:           C:\Users\Administrator\Desktop\狼王\classes.jar
 * Qualified Name:     com.baidu.tts.aop.ttslistener.ProgressCorrectInterceptor
 * JD-Core Version:    0.6.0
 */